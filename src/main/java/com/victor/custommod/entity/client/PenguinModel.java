package com.victor.custommod.entity.client;

import com.victor.custommod.CustomMod;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class PenguinModel extends EntityModel<PenguinRenderState>{

    public static final EntityModelLayer PENGUIN = new EntityModelLayer(Identifier.of(CustomMod.MOD_ID, "penguin"), "main");

    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart left_wing;
    private final ModelPart right_wing;
    private final ModelPart left_foot;
    private final ModelPart right_foot;
    private final ModelPart tail;

    private final Animation walkAnimation;
    private final Animation idleAnimation;
    private final Animation swimAnimation;

    public PenguinModel(ModelPart root) {
        super(root);
        this.root = root.getChild("root");
        this.body = this.root.getChild("body");
        this.head = this.body.getChild("head");
        this.left_wing = this.body.getChild("left_wing");
        this.right_wing = this.body.getChild("right_wing");
        this.left_foot = this.body.getChild("left_foot");
        this.right_foot = this.body.getChild("right_foot");
        this.tail = this.body.getChild("tail");

        this.idleAnimation = PenguinAnimations.ANIM_PENGUIN_IDLE.createAnimation(root);
        this.walkAnimation = PenguinAnimations.ANIM_PENGUIN_WALK.createAnimation(root);
        this.swimAnimation = PenguinAnimations.ANIM_PENGUIN_SWIM.createAnimation(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.origin(0.0F, 24.0F, 0.0F));

        ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -5.5F, -3.0F, 6.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, -6.5F, 0.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 18).cuboid(-2.5F, -2.55F, -2.45F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
                .uv(25, 0).cuboid(-1.0F, 0.45F, -4.45F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, -7.95F, -0.05F));

        ModelPartData left_wing = body.addChild("left_wing", ModelPartBuilder.create().uv(23, 18).cuboid(0.0F, 0.0F, -1.5F, 1.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.origin(3.0F, -4.0F, 0.0F));

        ModelPartData right_wing = body.addChild("right_wing", ModelPartBuilder.create().uv(23, 18).mirrored().cuboid(-1.0F, 0.0F, -1.5F, 1.0F, 7.0F, 3.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(-3.0F, -4.0F, 0.0F));

        ModelPartData left_foot = body.addChild("left_foot", ModelPartBuilder.create().uv(24, 7).cuboid(-1.5F, 2.0F, -2.0F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.origin(1.5F, 4.4F, 0.0F));

        ModelPartData cube_r1 = left_foot.addChild("cube_r1", ModelPartBuilder.create().uv(25, 5).cuboid(-1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        ModelPartData right_foot = body.addChild("right_foot", ModelPartBuilder.create().uv(24, 7).mirrored().cuboid(-1.5F, 2.0F, -2.0F, 3.0F, 0.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.origin(-1.5F, 4.4F, 0.0F));

        ModelPartData cube_r2 = right_foot.addChild("cube_r2", ModelPartBuilder.create().uv(25, 5).mirrored().cuboid(0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.5F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(22, 11).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 0.0F, 4.0F, new Dilation(0.0F)), ModelTransform.origin(0.0F, 4.5F, 3.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(PenguinRenderState state) {
        super.setAngles(state);
        this.setHeadAngles(state.relativeHeadYaw, state.pitch);

        this.walkAnimation.applyWalking(state.limbSwingAnimationProgress, state.limbSwingAmplitude, 2f, 2.5f);
        this.idleAnimation.apply(state.idleAnimationState, state.age, 1f);
        this.swimAnimation.apply(state.swimAnimationState, state.age, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * (float) (Math.PI / 180.0);
    }
}
