package com.victor.custommod.entity.client;


import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class PenguinHeldItemFeatureRenderer extends FeatureRenderer<PenguinRenderState, PenguinModel> {
    public PenguinHeldItemFeatureRenderer(FeatureRendererContext<PenguinRenderState, PenguinModel> context) {
        super(context);
    }

    @Override
    public void render(MatrixStack matrices, OrderedRenderCommandQueue queue, int light, PenguinRenderState state, float limbAngle, float limbDistance) {
        ItemRenderState itemRenderState = state.itemRenderState;
        if (!itemRenderState.isEmpty()) {
            boolean isSliding = state.slideAnimationState.isRunning() || state.swimIdleAnimationState.isRunning() || state.swimAnimationState.isRunning();
            matrices.push();

            ModelPart head = ((PenguinModel) this.getContextModel()).head;

            if (isSliding) {
                matrices.translate((head.originX / 16.0F), (head.originY / 16.0F) + 1.8F, (head.originZ / 16.0F) - 0.37F);
            } else {
                matrices.translate((head.originX / 16.0F), (head.originY / 16.0F) + 1.1F, (head.originZ / 16.0F));
            }

            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.clamp(limbAngle, -30.0f, 30.0f)));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.clamp(limbDistance, -25.0f, 45.0f)));

            if (isSliding) {
                matrices.translate(0.0F, 0.15F, -0.3F);
            } else {
                matrices.translate(0.0F, 0.1F, -0.3F);
            }

            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));

            itemRenderState.render(matrices, queue, light, OverlayTexture.DEFAULT_UV, 0);
            matrices.pop();
        }
    }
}
