package com.victor.custommod.entity.custom;

import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.sound.ModSounds;
import com.victor.custommod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.AmphibiousSwimNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class PenguinEntity extends AnimalEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState swimAnimationState = new AnimationState();
    public final AnimationState walkAnimationState = new AnimationState();
    public final AnimationState swimIdleAnimationState = new AnimationState();
    public final AnimationState slideAnimationState = new AnimationState();

    private boolean isSliding = false;
    private int slidingCooldown = 0;

    BlockPos travelPos;
    boolean landBound;

    public PenguinEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.WATER, 0.0F);
        this.moveControl = new PenguinEntity.PenguinMoveControl(this);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new BreatheAirGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.5D));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, SalmonEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, CodEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, TropicalFishEntity.class, true));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add(3, new TemptGoal(this, 0.7D, (stack) -> stack.isIn(ModTags.Items.PENGUIN_FOODS), false));
        this.goalSelector.add(4, new FollowParentGoal(this,1.2D));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.6D, 100));
        this.goalSelector.add(6, new MoveIntoWaterGoal(this));
        this.goalSelector.add(7, new WanderInWaterGoal(this, 1.1D));
        this.goalSelector.add(7, new SwimAroundGoal(this, 1.1D, 100));
        this.goalSelector.add(8, new MeleeAttackGoal(this, 1.5D, true));
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));
        this.goalSelector.add(9, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 15)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.75)
                .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 5)
                .add(EntityAttributes.ATTACK_DAMAGE, 5.0)
                .add(EntityAttributes.STEP_HEIGHT, 1.0)
                .add(EntityAttributes.TEMPT_RANGE, 15);
    }

    private void setupAnimationStates() {

        if (this.isOnGround() && !this.isTouchingWater()) {
            BlockPos below = this.getBlockPos().down();
            BlockState blockState = this.getWorld().getBlockState(below);

            boolean isOnIce = blockState.isOf(Blocks.ICE) || blockState.isOf(Blocks.PACKED_ICE) || blockState.isOf(Blocks.BLUE_ICE);

            if (isOnIce) {
                if (slidingCooldown <= 0) {
                    this.isSliding = this.random.nextFloat() < 0.3F;
                    this.slidingCooldown = 20 + this.random.nextInt(40);
                } else {
                    slidingCooldown--;
                }
            } else {
                this.isSliding = false;
                this.slidingCooldown = 0;
            }
        } else {
            this.isSliding = false;
            this.slidingCooldown = 0;
        }


        boolean isSwimming = this.isTouchingWater() && this.getVelocity().horizontalLengthSquared() > 0.001;
        boolean isSwimmingIdle = this.isTouchingWater() && this.getVelocity().horizontalLengthSquared() < 0.001;
        boolean isWalking = !isSliding && this.isOnGround() && this.getVelocity().horizontalLengthSquared() > 0.001;
        boolean shouldIdle = !isSliding && this.isOnGround() && this.getVelocity().horizontalLengthSquared() < 0.001;

        if (isSwimming) {
            if (!this.swimAnimationState.isRunning()){
                this.swimAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.walkAnimationState.stop();
            this.swimIdleAnimationState.stop();
            this.slideAnimationState.stop();
        }

        if (isSwimmingIdle) {
            if (!this.swimIdleAnimationState.isRunning()) {
                this.swimIdleAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.walkAnimationState.stop();
            this.swimAnimationState.stop();
            this.slideAnimationState.stop();
        }

        if (this.isSliding) {
            if (!this.slideAnimationState.isRunning()) {
                this.slideAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.walkAnimationState.stop();
            this.swimAnimationState.stop();
            this.swimIdleAnimationState.stop();
        }

        if (isWalking) {
            if (!this.walkAnimationState.isRunning()) {
                this.walkAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.swimAnimationState.stop();
            this.swimIdleAnimationState.stop();
            this.slideAnimationState.stop();
        }

        if (shouldIdle) {
            if (!this.idleAnimationState.isRunning()) {
                this.idleAnimationState.start(this.age);
            }
            this.walkAnimationState.stop();
            this.swimAnimationState.stop();
            this.swimIdleAnimationState.stop();
            this.slideAnimationState.stop();
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
        if (this.isTouchingWater()) {
            Vec3d velocity = this.getVelocity();
            if (velocity.lengthSquared() < 0.01) {
                this.setPitch(MathHelper.lerp(0.1F, this.getPitch(), 0.0F)) ;
            }
        }

        this.setAir(this.getMaxAir());
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.isTouchingWater()) {
            this.updateVelocity(0.01F, movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.8));

            Vec3d velocity = this.getVelocity();
            double horizontalSpeed = Math.sqrt(velocity.x * velocity.y + velocity.z);
            float pitch = (float)(-MathHelper.atan2(velocity.y, horizontalSpeed) * (180F / Math.PI));
            this.setPitch(MathHelper.clamp((float) pitch, 15.0F, 165.0F));
        }
        else {
            super.travel(movementInput);
        }
    }

    @Override
    public boolean tryAttack(ServerWorld world, Entity target) {
        boolean success = super.tryAttack(world, target);
        if (success && target instanceof LivingEntity){
            this.onAttacking(target);
        }
        return success;
    }

    @Override
    public boolean canBreatheInWater() {
        return true;
    }

    @Override
    public int getMaxAir() {
        return 300;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isIn(ModTags.Items.PENGUIN_FOODS);
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
    return ModEntities.PENGUIN.create(world, SpawnReason.BREEDING);
    }

    @Override
    protected void dropLoot(ServerWorld world, DamageSource damageSource, boolean causedByPlayer) {
        super.dropLoot(world, damageSource, causedByPlayer);
    }

    @Override
    protected @Nullable SoundEvent getAmbientSound() {
        return ModSounds.PENGUIN_AMBIENT;
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource source) {
        return super.getHurtSound(source);
    }

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
    }

    protected void playSwimSound(float volume) {
        super.playSwimSound(volume * 1.5F);
    }

    protected SoundEvent getSwimSound() {
        return SoundEvents.ENTITY_GENERIC_SWIM;
    }

    protected EntityNavigation createNavigation(World world) {
        return new PenguinEntity.PenguinSwimNavigation(this, world);
    }

    static class PenguinMoveControl extends MoveControl {
        private final PenguinEntity penguin;

        PenguinMoveControl(PenguinEntity penguin) {
            super(penguin);
            this.penguin = penguin;
        }

        private void updateVelocity() {
            if(!this.penguin.isTouchingWater()) {
                if (this.penguin.isOnGround()) {
                    this.penguin.setMovementSpeed(Math.max(this.penguin.getMovementSpeed() / 2.0F, 0.06F));
                }
            }

        }

        public void tick() {
            this.updateVelocity();
            if (this.state == State.MOVE_TO && !this.penguin.getNavigation().isIdle()) {
                double distX = this.targetX - this.penguin.getX();
                double distY = this.targetY - this.penguin.getY();
                double distZ = this.targetZ - this.penguin.getZ();
                double distance = Math.sqrt(distX * distX + distY * distY + distZ * distZ);

                if (distance < 0.1) {
                    this.penguin.setMovementSpeed(0.0F);
                }
                else {
                    distY /= distance;
                    float targetYaw = (float) (MathHelper.atan2(distZ, distX) * (double) (180F / (float) Math.PI)) - 90.0F;
                    this.penguin.setYaw(this.wrapDegrees(this.penguin.getYaw(), targetYaw, 90.0F));
                    this.penguin.bodyYaw = this.penguin.getYaw();

                    float speed = (float) (this.speed * this.penguin.getAttributeValue(EntityAttributes.MOVEMENT_SPEED));
                    this.penguin.setMovementSpeed(MathHelper.lerp(0.3F, this.penguin.getMovementSpeed(), speed));
                    this.penguin.setVelocity(this.penguin.getVelocity().add((double)0.0F, (double)this.penguin.getMovementSpeed() * distY * 0.1, (double)0.0F));
                }
                if (this.penguin.isTouchingWater()) {
                    Vec3d direction = new Vec3d(distX, distY, distZ).normalize().multiply(0.05);
                    this.penguin.setVelocity(this.penguin.getVelocity().add(direction));
                }

            } else {
                this.penguin.setMovementSpeed(0.0F);
            }
        }
    }

    static class PenguinSwimNavigation extends AmphibiousSwimNavigation {
        PenguinSwimNavigation(PenguinEntity owner, World world) {
            super(owner, world);
        }

        public boolean isValidPosition(BlockPos pos) {
            MobEntity var3 = this.entity;
            if (var3 instanceof PenguinEntity penguinEntity) {
                if (penguinEntity.travelPos != null) {
                    return this.world.getBlockState(pos).isOf(Blocks.WATER);
                }
            }

            return !this.world.getBlockState(pos.down()).isAir();
        }
    }

    static class WanderInWaterGoal extends MoveToTargetPosGoal {
        private final PenguinEntity penguin;

        WanderInWaterGoal(PenguinEntity penguin, double speed) {
            super(penguin, speed, 24);
            this.penguin = penguin;
            this.lowestY = -1;
        }

        public boolean shouldContinue() {
            return !this.penguin.isTouchingWater() && this.tryingTime <= 1200 && this.isTargetPos(this.penguin.getWorld(), this.targetPos);
        }

        public boolean canStart() {
            if (this.penguin.isBaby() && !this.penguin.isTouchingWater()) {
                return super.canStart();
            } else {
                return !this.penguin.landBound && !this.penguin.isTouchingWater() && super.canStart();
            }
        }

        public boolean shouldResetPath() {
            return this.tryingTime % 160 == 0;
        }

        protected boolean isTargetPos(WorldView world, BlockPos pos) {
            return world.getBlockState(pos).isOf(Blocks.WATER);
        }
    }

}
