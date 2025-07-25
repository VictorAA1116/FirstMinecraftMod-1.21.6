package com.victor.custommod;

import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.entity.client.CapybaraModel;
import com.victor.custommod.entity.client.CapybaraRenderer;
import com.victor.custommod.entity.client.PenguinModel;
import com.victor.custommod.entity.client.PenguinRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CustomModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CapybaraModel.CAPYBARA, CapybaraModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CAPYBARA, CapybaraRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(PenguinModel.PENGUIN, PenguinModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PENGUIN, PenguinRenderer::new);
    }
}
