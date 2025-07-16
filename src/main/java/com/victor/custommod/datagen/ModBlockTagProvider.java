package com.victor.custommod.datagen;

import com.victor.custommod.CustomMod;
import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Blocks.CUSTOM_BLOCKS)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_SLAB);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TEMPLATE_STONE_ORE)
                .add(ModBlocks.TEMPLATE_DEEPSLATE_ORE)
                .add(ModBlocks.TEMPLATE_RAW_ORE_BLOCK)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.TEMPLATE_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TEMPLATE_STONE_ORE)
                .add(ModBlocks.TEMPLATE_DEEPSLATE_ORE)
                .add(ModBlocks.TEMPLATE_RAW_ORE_BLOCK)
                .add(ModBlocks.TEMPLATE_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(BlockTags.FENCES);

        valueLookupBuilder(BlockTags.FENCE_GATES);

        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.CALCITE_WALL);
    }
}
