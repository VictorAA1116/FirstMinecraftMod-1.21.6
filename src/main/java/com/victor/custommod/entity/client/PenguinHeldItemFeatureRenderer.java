package com.victor.custommod.entity.client;


import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class PenguinHeldItemFeatureRenderer extends FeatureRenderer<PenguinRenderState, PenguinModel> {
    public PenguinHeldItemFeatureRenderer(FeatureRendererContext<PenguinRenderState, PenguinModel> context) {
        super(context);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, PenguinRenderState penguinRenderState, float f, float g) {
        ItemRenderState itemRenderState = penguinRenderState.itemRenderState;
        if (!itemRenderState.isEmpty()) {
            boolean isBaby = penguinRenderState.baby;
            matrixStack.push();
            if (isBaby) {
                float h = 0.75F;
                matrixStack.scale(h, h, h);
            }
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(f));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(g));

            if (penguinRenderState.baby) {
                matrixStack.translate(0.06F, 0.26F, -0.5F);
            }  else {
                matrixStack.translate(0.06F, 0.27F, -0.5F);
            }

            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));

            itemRenderState.render(matrixStack, vertexConsumerProvider, i, OverlayTexture.DEFAULT_UV);
            matrixStack.pop();
        }
    }
}
