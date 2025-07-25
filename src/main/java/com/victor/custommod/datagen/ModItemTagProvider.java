package com.victor.custommod.datagen;

import com.victor.custommod.item.ModItems;
import com.victor.custommod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
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

        valueLookupBuilder(ModTags.Items.CAPYBARA_FOODS)
                .add(Items.SHORT_GRASS)
                .add(Items.KELP)
                .add(Items.SEAGRASS);

        valueLookupBuilder(ModTags.Items.PENGUIN_FOODS)
                .add(Items.COD)
                .add(Items.SALMON)
                .add(Items.TROPICAL_FISH);
    }
}
