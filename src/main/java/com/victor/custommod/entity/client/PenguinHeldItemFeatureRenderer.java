package com.victor.custommod.entity.client;


import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class PenguinHeldItemFeatureRenderer extends FeatureRenderer<PenguinRenderState, PenguinModel> {
    public PenguinHeldItemFeatureRenderer(FeatureRendererContext<PenguinRenderState, PenguinModel> context) {
        super(context);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, PenguinRenderState penguinRenderState, float y, float x) {
        ItemRenderState itemRenderState = penguinRenderState.itemRenderState;
        if (!itemRenderState.isEmpty()) {
            boolean isSliding = penguinRenderState.slideAnimationState.isRunning() || penguinRenderState.swimIdleAnimationState.isRunning() || penguinRenderState.swimAnimationState.isRunning();
            matrixStack.push();

            ModelPart head = ((PenguinModel)this.getContextModel()).head;

            if (isSliding) {
                matrixStack.translate((head.originX / 16.0F), (head.originY / 16.0F) + 1.8F, (head.originZ / 16.0F) - 0.37F);
            } else {
                matrixStack.translate((head.originX / 16.0F), (head.originY / 16.0F) + 1.1F, (head.originZ / 16.0F));
            }

            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.clamp(y, -30.0f, 30.0f)));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.clamp(x, -25.0f, 45.0f)));

            if (isSliding) {
                matrixStack.translate(0.0F, 0.15F, -0.3F);
            } else {
                matrixStack.translate(0.0F, 0.1F, -0.3F);
            }

            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));

            itemRenderState.render(matrixStack, vertexConsumerProvider, i, OverlayTexture.DEFAULT_UV);
            matrixStack.pop();
        }
    }
}
