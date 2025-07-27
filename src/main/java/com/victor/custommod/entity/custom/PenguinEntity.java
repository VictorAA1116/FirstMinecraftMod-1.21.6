package com.victor.custommod.entity.custom;

import com.victor.custommod.entity.ModEntities;
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
    private int idleAnimationTimeout = 0;

    BlockPos travelPos;
    boolean landBound;

    public PenguinEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.setPathfindingPenalty(PathNodeType.WATER, 4.0F);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new BreatheAirGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0D));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, SalmonEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, CodEntity.class, true));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, TropicalFishEntity.class, true));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add(3, new TemptGoal(this, 1.2D, (stack) -> stack.isIn(ModTags.Items.PENGUIN_FOODS), false));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 2.0D, true));
        this.goalSelector.add(5, new FollowParentGoal(this,1.1D));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 1.0D, 100));
        this.goalSelector.add(7, new WanderInWaterGoal(this, 1.2D));
        this.goalSelector.add(7, new MoveIntoWaterGoal(this));
        this.goalSelector.add(7, new SwimAroundGoal(this, 2.0D, 100));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));
        this.goalSelector.add(9, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 15)
                .add(EntityAttributes.MOVEMENT_SPEED, 1)
                .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 5)
                .add(EntityAttributes.ATTACK_DAMAGE, 5.0)
                .add(EntityAttributes.STEP_HEIGHT, 1.0)
                .add(EntityAttributes.TEMPT_RANGE, 15);
    }

    private void setupAnimationStates() {
        BlockPos below = this.getBlockPos().down();
        BlockState blockState = this.getWorld().getBlockState(below);

        boolean isOnIce = blockState.isOf(Blocks.ICE) || blockState.isOf(Blocks.PACKED_ICE) || blockState.isOf(Blocks.BLUE_ICE);
        boolean isSwimming = this.isTouchingWater();
        boolean isWalking = !isOnIce && this.isOnGround() && this.getVelocity().horizontalLengthSquared() > 1.0E-6;
        boolean shouldIdle = this.isOnGround() && this.getVelocity().horizontalLengthSquared() >= 0 && !isSwimming && !isOnIce && !isWalking;

        if (isSwimming || isOnIce) {
            if (!this.swimAnimationState.isRunning()){
                this.swimAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.walkAnimationState.stop();
        }

        if (isWalking) {
            if (!this.walkAnimationState.isRunning()) {
                this.walkAnimationState.start(this.age);
            }
            this.idleAnimationState.stop();
            this.swimAnimationState.stop();
        }

        if (shouldIdle) {
            if (!this.idleAnimationState.isRunning() && this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = 200;
                this.idleAnimationState.start(this.age);
            } else {
                --this.idleAnimationTimeout;
            }
            this.walkAnimationState.stop();
            this.swimAnimationState.stop();
        }
        if (!shouldIdle && idleAnimationState.isRunning()) {
            idleAnimationState.stop();
            idleAnimationTimeout = 0;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }

        this.setAir(this.getMaxAir());
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.isTouchingWater()) {
            this.updateVelocity(0.02F, movementInput);
            this.move(MovementType.SELF, this.getVelocity());
            this.setVelocity(this.getVelocity().multiply(0.8));

            this.setPitch((float) (-this.getVelocity().y * 75.0));
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
    protected @Nullable SoundEvent getAmbientSound() {
        return super.getAmbientSound();
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
        private static final int field_30385 = 1200;
        private final PenguinEntity penguin;

        WanderInWaterGoal(PenguinEntity penguin, double speed) {
            super(penguin, penguin.isBaby() ? (double)2.0F : speed, 24);
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
