package com.victor.custommod.entity.client;

import com.victor.custommod.CustomMod;
import com.victor.custommod.entity.custom.CapybaraEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CapybaraRenderer extends MobEntityRenderer<CapybaraEntity, CapybaraRenderState, CapybaraModel> {
    public CapybaraRenderer(EntityRendererFactory.Context context) {
        super(context, new CapybaraModel(context.getPart(CapybaraModel.CAPYBARA)), 0.5f);
    }

    @Override
    public Identifier getTexture(CapybaraRenderState state) {
        return Identifier.of(CustomMod.MOD_ID, "textures/entity/capybara/capybara.png");
    }

    @Override
    public void render(CapybaraRenderState state, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(state.baby) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(state, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public CapybaraRenderState createRenderState() {
        return new CapybaraRenderState();
    }

    @Override
    public void updateRenderState(CapybaraEntity livingEntity, CapybaraRenderState livingEntityRenderState, float f) {
        super.updateRenderState(livingEntity, livingEntityRenderState, f);
        livingEntityRenderState.idleAnimationState.copyFrom(livingEntity.idleAnimationState);
        livingEntityRenderState.sitAnimationState.copyFrom(livingEntity.sitAnimationState);
    }
}
