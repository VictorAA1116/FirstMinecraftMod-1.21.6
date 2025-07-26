package com.victor.custommod.entity.custom;

import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.control.AquaticMoveControl;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.AmphibiousSwimNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.biome.Biome;
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
        this.moveControl = new PenguinMoveControl(this);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new BreatheAirGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0D));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.15D));
        this.goalSelector.add(3, new TemptGoal(this, 2.0D, (stack) -> stack.isIn(ModTags.Items.PENGUIN_FOODS), false));
        this.goalSelector.add(4, new AttackGoal(this));
        this.goalSelector.add(5, new FollowParentGoal(this,1.1D));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 1.0D, 100));
        this.goalSelector.add(7, new WanderInWaterGoal(this, 2.0D));
        this.goalSelector.add(7, new MoveIntoWaterGoal(this));
        this.goalSelector.add(7, new SwimAroundGoal(this, 3.0D, 100));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));
        this.goalSelector.add(9, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 15)
                .add(EntityAttributes.MOVEMENT_SPEED, 1)
                .add(EntityAttributes.FOLLOW_RANGE, 20)
                .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 5)
                .add(EntityAttributes.ATTACK_DAMAGE, 5)
                .add(EntityAttributes.TEMPT_RANGE, 20);
    }

    private void setupAnimationStates() {
        BlockPos below = this.getBlockPos().down();
        BlockState blockState = this.getWorld().getBlockState(below);

        boolean isOnIce = blockState.isOf(Blocks.ICE) || blockState.isOf(Blocks.PACKED_ICE) || blockState.isOf(Blocks.BLUE_ICE);
        boolean isSwimming = this.isTouchingWater();
        boolean isWalking = !isOnIce && this.isOnGround() && this.getVelocity().horizontalLengthSquared() > 1.0E-6;
        boolean shouldIdle = !isWalking && !isSwimming && !isOnIce;

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

    static class PenguinMoveControl extends MoveControl {
        private final PenguinEntity penguin;

        PenguinMoveControl(PenguinEntity penguin) {
            super(penguin);
            this.penguin = penguin;
        }

        private void updateVelocity() {
            if (this.penguin.isInFluid()) {
                this.penguin.setVelocity(this.penguin.getVelocity().add((double)0.0F, 0.005, (double)0.0F));

            } else if (this.penguin.isOnGround()) {
                this.penguin.setMovementSpeed(this.penguin.getMovementSpeed());
            }

        }

        public void tick() {
            this.updateVelocity();
            if (this.state == State.MOVE_TO && !this.penguin.getNavigation().isIdle()) {
                double d = this.targetX - this.penguin.getX();
                double e = this.targetY - this.penguin.getY();
                double f = this.targetZ - this.penguin.getZ();
                double g = Math.sqrt(d * d + e * e + f * f);
                if (g < (double)1.0E-5F) {
                    this.entity.setMovementSpeed(0.0F);
                } else {
                    e /= g;
                    float h = (float)(MathHelper.atan2(f, d) * (double)(180F / (float)Math.PI)) - 90.0F;
                    this.penguin.setYaw(this.wrapDegrees(this.penguin.getYaw(), h, 90.0F));
                    this.penguin.bodyYaw = this.penguin.getYaw();
                    float i = (float)(this.speed * this.penguin.getAttributeValue(EntityAttributes.MOVEMENT_SPEED));
                    this.penguin.setMovementSpeed(MathHelper.lerp(0.125F, this.penguin.getMovementSpeed(), i));
                    this.penguin.setVelocity(this.penguin.getVelocity().add((double)0.0F, (double)this.penguin.getMovementSpeed() * e * 0.1, (double)0.0F));
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

    static class WanderOnLandGoal extends WanderAroundGoal {
        private final PenguinEntity penguin;

        WanderOnLandGoal(PenguinEntity penguin, double speed, int chance) {
            super(penguin, speed, chance);
            this.penguin = penguin;
        }

        public boolean canStart() {
            return !this.mob.isTouchingWater() && !this.penguin.landBound ? super.canStart() : false;
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
                return !this.penguin.landBound && !this.penguin.isTouchingWater() ? super.canStart() : false;
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
