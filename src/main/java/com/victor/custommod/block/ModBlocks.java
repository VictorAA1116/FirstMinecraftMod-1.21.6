package com.victor.custommod.block;

import com.victor.custommod.CustomMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
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

    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            properties -> new StairsBlock(Blocks.CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BUTTON = registerBlock("calcite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20,
                    properties.strength(1f).sounds(BlockSoundGroup.CALCITE).noCollision()));

    public static final Block CALCITE_PRESSURE_PLATE = registerBlock("calcite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE,
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.PURPLE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.PURPLE).strength(1.5f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.BLACK).strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.BLACK).strength(1.25f,4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block STONE_WALL = registerBlock("stone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            properties -> new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(),
                    properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_deepslate_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE,
                    properties.mapColor(MapColor.DEEPSLATE_GRAY).strength(1f).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));

    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            properties -> new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), properties.mapColor(MapColor.DIRT_BROWN)
                    .strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));

    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.DIRT_BROWN).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));

    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.DIRT_BROWN).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F,6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F,6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            properties -> new StairsBlock(Blocks.NETHERRACK.getDefaultState(), properties.mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.4F).sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            properties -> new StairsBlock(Blocks.END_STONE.getDefaultState(), properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));


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

            entries.add(ModBlocks.STONE_WALL);
            entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
            entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
            entries.add(ModBlocks.PACKED_MUD_STAIRS);
            entries.add(ModBlocks.PACKED_MUD_SLAB);
            entries.add(ModBlocks.PACKED_MUD_WALL);

            entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);
            entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

            entries.add(ModBlocks.PRISMARINE_BRICK_WALL);
            entries.add(ModBlocks.DARK_PRISMARINE_WALL);
            entries.add(ModBlocks.PURPUR_WALL);

            entries.add(ModBlocks.NETHERRACK_SLAB);
            entries.add(ModBlocks.NETHERRACK_STAIRS);
            entries.add(ModBlocks.NETHERRACK_WALL);

            entries.add(ModBlocks.END_STONE_SLAB);
            entries.add(ModBlocks.END_STONE_WALL);
            entries.add(ModBlocks.END_STONE_STAIRS);

        });
    }
}

