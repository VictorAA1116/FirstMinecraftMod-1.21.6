package com.victor.custommod.block;

import com.victor.custommod.CustomMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {

    public static final Block TEMPLATE_BLOCK = registerBlock("template_block",
            properties ->new Block(properties.strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block TEMPLATE_RAW_ORE_BLOCK = registerBlock("template_raw_ore_block",
            properties ->new Block(properties.strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block TEMPLATE_STONE_ORE = registerBlock("template_stone_ore",
            properties ->new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    properties.strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block TEMPLATE_DEEPSLATE_ORE = registerBlock("template_deepslate_ore",
            properties ->new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    properties.strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties ->new StairsBlock(ModBlocks.TEMPLATE_BLOCK.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties ->new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties ->new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BUTTON = registerBlock("calcite_button",
            properties ->new ButtonBlock(BlockSetType.STONE, 20,
                    properties.strength(1f).sounds(BlockSoundGroup.CALCITE).noCollision()));

    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            properties ->new PressurePlateBlock(BlockSetType.STONE,
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties ->new Block(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties ->new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties ->new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties ->new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties ->new Block(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties ->new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties ->new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties ->new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            properties ->new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.PURPLE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            properties ->new SlabBlock(properties.mapColor(MapColor.PURPLE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties ->new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.BLACK).strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties ->new SlabBlock(properties.mapColor(MapColor.BLACK).strength(1.25f,4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(CustomMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(CustomMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CustomMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomMod.MOD_ID, name)))));
    }

    public static void registerModBlocks()
    {
        CustomMod.LOGGER.info("Registering Mod Blocks for " + CustomMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
        {
            entries.add(ModBlocks.TEMPLATE_BLOCK);
            entries.add(ModBlocks.TEMPLATE_RAW_ORE_BLOCK);
            entries.add(ModBlocks.TEMPLATE_STONE_ORE);
            entries.add(ModBlocks.TEMPLATE_DEEPSLATE_ORE);

            entries.add(ModBlocks.CALCITE_STAIRS);
            entries.add(ModBlocks.CALCITE_SLAB);
            entries.add(ModBlocks.CALCITE_WALL);
            entries.add(ModBlocks.CALCITE_BUTTON);
            entries.add(ModBlocks.CALCITE_PRESSURE_PLATE);

            entries.add(ModBlocks.POLISHED_CALCITE);
            entries.add(ModBlocks.POLISHED_CALCITE_SLAB);
            entries.add(ModBlocks.POLISHED_CALCITE_STAIRS);
            entries.add(ModBlocks.POLISHED_CALCITE_WALL);

            entries.add(ModBlocks.CALCITE_BRICKS);
            entries.add(ModBlocks.CALCITE_BRICK_SLAB);
            entries.add(ModBlocks.CALCITE_BRICK_STAIRS);
            entries.add(ModBlocks.CALCITE_BRICK_WALL);

            entries.add(ModBlocks.AMETHYST_SLAB);
            entries.add(ModBlocks.AMETHYST_STAIRS);

            entries.add(ModBlocks.SMOOTH_BASALT_SLAB);
            entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
        });
    }
}

