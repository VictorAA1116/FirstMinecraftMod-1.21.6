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
                .add(ModBlocks.CALCITE_SLAB)

                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.POLISHED_CALCITE_SLAB)
                .add(ModBlocks.POLISHED_CALCITE_STAIRS)

                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)

                .add(ModBlocks.AMETHYST_SLAB)
                .add(ModBlocks.AMETHYST_STAIRS)

                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)

                .add(ModBlocks.SMOOTH_STONE_STAIRS)
                .add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE)

                .add(ModBlocks.PACKED_MUD_STAIRS)
                .add(ModBlocks.PACKED_MUD_SLAB)

                .add(ModBlocks.NETHERRACK_SLAB)
                .add(ModBlocks.NETHERRACK_STAIRS)

                .add(ModBlocks.END_STONE_SLAB)
                .add(ModBlocks.END_STONE_STAIRS);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_STAIRS)

                .add(ModBlocks.POLISHED_CALCITE)
                .add(ModBlocks.POLISHED_CALCITE_SLAB)
                .add(ModBlocks.POLISHED_CALCITE_STAIRS)

                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)

                .add(ModBlocks.AMETHYST_SLAB)
                .add(ModBlocks.AMETHYST_STAIRS)

                .add(ModBlocks.SMOOTH_BASALT_SLAB)
                .add(ModBlocks.SMOOTH_BASALT_STAIRS)

                .add(ModBlocks.SMOOTH_STONE_STAIRS)

                .add(ModBlocks.NETHERRACK_SLAB)
                .add(ModBlocks.NETHERRACK_STAIRS)

                .add(ModBlocks.END_STONE_SLAB)
                .add(ModBlocks.END_STONE_STAIRS);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        valueLookupBuilder(BlockTags.FENCES);

        valueLookupBuilder(BlockTags.FENCE_GATES);

        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE_WALL)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.PACKED_MUD_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.END_STONE_WALL);
    }
}
