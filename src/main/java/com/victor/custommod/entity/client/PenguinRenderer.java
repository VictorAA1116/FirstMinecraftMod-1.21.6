package com.victor.custommod.entity.client;

import com.victor.custommod.CustomMod;
import com.victor.custommod.entity.custom.PenguinEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.ItemHolderEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PenguinRenderer extends MobEntityRenderer<PenguinEntity, PenguinRenderState, PenguinModel>{

    public PenguinRenderer(EntityRendererFactory.Context context){
        super(context, new PenguinModel(context.getPart(PenguinModel.PENGUIN)), 0.5f);
        this.addFeature(new PenguinHeldItemFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(PenguinRenderState state) {
        return Identifier.of(CustomMod.MOD_ID, "textures/entity/penguin/penguin.png");
    }

    @Override
    public void render( PenguinRenderState state, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(state.baby) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }
        else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(state, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public PenguinRenderState createRenderState() { return new PenguinRenderState(); }

    @Override
    public void updateRenderState(PenguinEntity penguinEntity, PenguinRenderState penguinRenderState, float f) {
        super.updateRenderState(penguinEntity, penguinRenderState, f);
        ItemHolderEntityRenderState.update(penguinEntity, penguinRenderState, this.itemModelResolver);
        penguinRenderState.idleAnimationState.copyFrom(penguinEntity.idleAnimationState);
        penguinRenderState.walkAnimationState.copyFrom(penguinEntity.walkAnimationState);
        penguinRenderState.swimAnimationState.copyFrom(penguinEntity.swimAnimationState);
        penguinRenderState.swimIdleAnimationState.copyFrom(penguinEntity.swimIdleAnimationState);
        penguinRenderState.slideAnimationState.copyFrom(penguinEntity.slideAnimationState);
    }
}
