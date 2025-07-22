package com.victor.custommod.entity.client;

import com.victor.custommod.CustomMod;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class CapybaraModel extends EntityModel<CapybaraRenderState> {

    public static final EntityModelLayer CAPYBARA = new EntityModelLayer(Identifier.of(CustomMod.MOD_ID, "capybara"), "main");

    private final ModelPart root;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart left_ear;
    private final ModelPart right_ear;
    private final ModelPart front_left_leg;
    private final ModelPart front_right_leg;
    private final ModelPart back_left_leg;
    private final ModelPart back_right_leg;

    private final Animation walkAnimation;
    private final Animation idleAnimation;

    public CapybaraModel(ModelPart root) {
        super(root);
        this.root = root.getChild("root");
        this.body = this.root.getChild("body");
        this.head = this.body.getChild("head");
        this.left_ear = this.head.getChild("left_ear");
        this.right_ear = this.head.getChild("right_ear");
        this.front_left_leg = this.body.getChild("front_left_leg");
        this.front_right_leg = this.body.getChild("front_right_leg");
        this.back_left_leg = this.body.getChild("back_left_leg");
        this.back_right_leg = this.body.getChild("back_right_leg");

        this.idleAnimation = CapybaraAnimations.ANIM_CAPYBARA_IDLE.createAnimation(root);
        this.walkAnimation = CapybaraAnimations.ANIM_CAPYBARA_WALK.createAnimation(root);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData body = root.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 18.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -11.0F, -2.0F,0 ,0 ,0));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 29).cuboid(-3.0F, -4.2685F, -1.3612F, 6.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 7.0F, -0.1745F, 0.0F, 0.0F));

        ModelPartData left_ear = head.addChild("left_ear", ModelPartBuilder.create(), ModelTransform.of(-2.0F, -4.2685F, 0.1388F, 0.0F, -0.5236F, 0.0F));

        ModelPartData ear_r1 = left_ear.addChild("ear_r1", ModelPartBuilder.create().uv(38, 30).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.3F, 0.3F, 0.5F, 0.0F, 0.0F, -0.2618F));

        ModelPartData right_ear = head.addChild("right_ear", ModelPartBuilder.create(), ModelTransform.of(2.0F, -4.2685F, 0.1388F, 0.0F, 0.5236F, 0.0F));

        ModelPartData ear_r2 = right_ear.addChild("ear_r2", ModelPartBuilder.create().uv(38, 34).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.3F, 0.3F, 0.5F, 0.0F, 0.0F, 0.2618F));

        ModelPartData front_left_leg = body.addChild("front_left_leg", ModelPartBuilder.create().uv(3, 4).cuboid(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 5.0F, 6.5F,0 ,0 ,0));

        ModelPartData front_right_leg = body.addChild("front_right_leg", ModelPartBuilder.create().uv(3, 4).cuboid(4.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 5.0F, 6.5F,0 ,0 ,0));

        ModelPartData back_left_leg = body.addChild("back_left_leg", ModelPartBuilder.create().uv(40, 4).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 5.0F, -8.0F,0 ,0 ,0));

        ModelPartData back_right_leg = body.addChild("back_right_leg", ModelPartBuilder.create().uv(40, 4).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 5.0F, -8.0F,0 ,0 ,0));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(CapybaraRenderState state) {
        super.setAngles(state);
        this.setHeadAngles(state.relativeHeadYaw, state.pitch);

        this.walkAnimation.applyWalking(state.limbSwingAnimationProgress, state.limbSwingAmplitude, 2f, 2.5f);
        this.idleAnimation.apply(state.idleAnimationState, state.age, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0f, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0f, 25.0f);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }
}
