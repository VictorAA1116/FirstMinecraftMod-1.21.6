package com.victor.custommod;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.entity.client.CapybaraModel;
import com.victor.custommod.entity.client.CapybaraRenderer;
import com.victor.custommod.entity.client.PenguinModel;
import com.victor.custommod.entity.client.PenguinRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactories;

public class CustomModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CapybaraModel.CAPYBARA, CapybaraModel::getTexturedModelData);
        EntityRendererFactories.register(ModEntities.CAPYBARA, CapybaraRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(PenguinModel.PENGUIN, PenguinModel::getTexturedModelData);
        EntityRendererFactories.register(ModEntities.PENGUIN, PenguinRenderer::new);

        BlockRenderLayerMap.putBlock(ModBlocks.GOLD_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GOLD_DOOR, BlockRenderLayer.CUTOUT);
    }
}
