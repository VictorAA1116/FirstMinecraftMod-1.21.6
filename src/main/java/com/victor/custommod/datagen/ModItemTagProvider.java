package com.victor.custommod.datagen;

import com.victor.custommod.item.ModItems;
import com.victor.custommod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.CUSTOM_ITEMS)
                .add(ModItems.TEMPLATE_ITEM)
                .add(ModItems.TEMPLATE_RAW_ORE)
                .add(ModItems.TEMPLATE_FOOD)
                .add(ModItems.TEMPLATE_FUEL);
    }
}
