package com.victor.custommod.datagen;

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
                .add(ModBlocks.END_STONE_STAIRS)

                .add(ModBlocks.POLISHED_END_STONE)
                .add(ModBlocks.POLISHED_END_STONE_SLAB)
                .add(ModBlocks.POLISHED_END_STONE_STAIRS)

                .add(ModBlocks.QUARTZ_BRICK_SLAB)
                .add(ModBlocks.QUARTZ_BRICK_STAIRS)

                .add(ModBlocks.GOLD_TRAPDOOR)
                .add(ModBlocks.GOLD_DOOR)

                .add(ModBlocks.CUT_SANDSTONE_STAIRS)
                .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS)

                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)

                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)

                .add(ModBlocks.BLACK_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)

                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_STAIRS)

                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)

                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)

                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)

                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)

                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)

                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)

                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)

                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)

                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)

                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)

                .add(ModBlocks.TERRACOTTA_SLAB)
                .add(ModBlocks.TERRACOTTA_STAIRS)

                .add(ModBlocks.WHITE_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)

                .add(ModBlocks.GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLACK_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)

                .add(ModBlocks.RED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_TERRACOTTA_STAIRS)

                .add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)

                .add(ModBlocks.YELLOW_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIME_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)

                .add(ModBlocks.GREEN_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)

                .add(ModBlocks.CYAN_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)

                .add(ModBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)

                .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)

                .add(ModBlocks.PINK_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)

                .add(ModBlocks.BROWN_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE_WALL)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.PACKED_MUD_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.CUT_SANDSTONE_WALL)
                .add(ModBlocks.CUT_RED_SANDSTONE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.END_STONE_WALL)
                .add(ModBlocks.POLISHED_END_STONE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.QUARTZ_BRICK_WALL)

                .add(ModBlocks.WHITE_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ModBlocks.GRAY_CONCRETE_WALL)
                .add(ModBlocks.BLACK_CONCRETE_WALL)
                .add(ModBlocks.RED_CONCRETE_WALL)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)
                .add(ModBlocks.LIME_CONCRETE_WALL)
                .add(ModBlocks.GREEN_CONCRETE_WALL)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ModBlocks.BLUE_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)
                .add(ModBlocks.PINK_CONCRETE_WALL)
                .add(ModBlocks.BROWN_CONCRETE_WALL)

                .add(ModBlocks.TERRACOTTA_WALL)
                .add(ModBlocks.WHITE_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_TERRACOTTA_WALL)
                .add(ModBlocks.RED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_TERRACOTTA_WALL)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL)
        ;

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
                .add(ModBlocks.END_STONE_STAIRS)

                .add(ModBlocks.POLISHED_END_STONE)
                .add(ModBlocks.POLISHED_END_STONE_SLAB)
                .add(ModBlocks.POLISHED_END_STONE_STAIRS)

                .add(ModBlocks.QUARTZ_BRICK_SLAB)
                .add(ModBlocks.QUARTZ_BRICK_STAIRS)

                .add(ModBlocks.GOLD_TRAPDOOR)
                .add(ModBlocks.GOLD_DOOR)

                .add(ModBlocks.CUT_SANDSTONE_STAIRS)
                .add(ModBlocks.CUT_RED_SANDSTONE_STAIRS)

                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)

                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)

                .add(ModBlocks.BLACK_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)

                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_STAIRS)

                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)

                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)

                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)

                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)

                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)

                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)

                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)

                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)

                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)

                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)

                .add(ModBlocks.TERRACOTTA_SLAB)
                .add(ModBlocks.TERRACOTTA_STAIRS)

                .add(ModBlocks.WHITE_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)

                .add(ModBlocks.GRAY_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLACK_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_TERRACOTTA_STAIRS)

                .add(ModBlocks.RED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_TERRACOTTA_STAIRS)

                .add(ModBlocks.ORANGE_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_TERRACOTTA_STAIRS)

                .add(ModBlocks.YELLOW_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIME_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_TERRACOTTA_STAIRS)

                .add(ModBlocks.GREEN_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_TERRACOTTA_STAIRS)

                .add(ModBlocks.CYAN_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLUE_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_TERRACOTTA_STAIRS)

                .add(ModBlocks.PURPLE_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_TERRACOTTA_STAIRS)

                .add(ModBlocks.MAGENTA_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS)

                .add(ModBlocks.PINK_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_TERRACOTTA_STAIRS)

                .add(ModBlocks.BROWN_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_TERRACOTTA_STAIRS)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS)

                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.POLISHED_CALCITE_WALL)
                .add(ModBlocks.CALCITE_BRICK_WALL)
                .add(ModBlocks.STONE_WALL)
                .add(ModBlocks.PACKED_MUD_WALL)
                .add(ModBlocks.SMOOTH_SANDSTONE_WALL)
                .add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL)
                .add(ModBlocks.CUT_SANDSTONE_WALL)
                .add(ModBlocks.CUT_RED_SANDSTONE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.END_STONE_WALL)
                .add(ModBlocks.POLISHED_END_STONE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.QUARTZ_BRICK_WALL)

                .add(ModBlocks.WHITE_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ModBlocks.GRAY_CONCRETE_WALL)
                .add(ModBlocks.BLACK_CONCRETE_WALL)
                .add(ModBlocks.RED_CONCRETE_WALL)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)
                .add(ModBlocks.LIME_CONCRETE_WALL)
                .add(ModBlocks.GREEN_CONCRETE_WALL)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ModBlocks.BLUE_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)
                .add(ModBlocks.PINK_CONCRETE_WALL)
                .add(ModBlocks.BROWN_CONCRETE_WALL)

                .add(ModBlocks.TERRACOTTA_WALL)
                .add(ModBlocks.WHITE_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_TERRACOTTA_WALL)
                .add(ModBlocks.RED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_TERRACOTTA_WALL)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL)
        ;

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
                .add(ModBlocks.CUT_SANDSTONE_WALL)
                .add(ModBlocks.CUT_RED_SANDSTONE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.PRISMARINE_BRICK_WALL)
                .add(ModBlocks.DARK_PRISMARINE_WALL)
                .add(ModBlocks.NETHERRACK_WALL)
                .add(ModBlocks.END_STONE_WALL)
                .add(ModBlocks.POLISHED_END_STONE_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_WALL)
                .add(ModBlocks.POLISHED_DIORITE_WALL)
                .add(ModBlocks.POLISHED_GRANITE_WALL)
                .add(ModBlocks.QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_QUARTZ_WALL)
                .add(ModBlocks.SMOOTH_BASALT_WALL)
                .add(ModBlocks.QUARTZ_BRICK_WALL)

                .add(ModBlocks.WHITE_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL)
                .add(ModBlocks.GRAY_CONCRETE_WALL)
                .add(ModBlocks.BLACK_CONCRETE_WALL)
                .add(ModBlocks.RED_CONCRETE_WALL)
                .add(ModBlocks.ORANGE_CONCRETE_WALL)
                .add(ModBlocks.YELLOW_CONCRETE_WALL)
                .add(ModBlocks.LIME_CONCRETE_WALL)
                .add(ModBlocks.GREEN_CONCRETE_WALL)
                .add(ModBlocks.CYAN_CONCRETE_WALL)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL)
                .add(ModBlocks.BLUE_CONCRETE_WALL)
                .add(ModBlocks.PURPLE_CONCRETE_WALL)
                .add(ModBlocks.MAGENTA_CONCRETE_WALL)
                .add(ModBlocks.PINK_CONCRETE_WALL)
                .add(ModBlocks.BROWN_CONCRETE_WALL)

                .add(ModBlocks.TERRACOTTA_WALL)
                .add(ModBlocks.WHITE_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_TERRACOTTA_WALL)
                .add(ModBlocks.RED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_TERRACOTTA_WALL)

                .add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL)
                .add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL)
        ;
    }
}
