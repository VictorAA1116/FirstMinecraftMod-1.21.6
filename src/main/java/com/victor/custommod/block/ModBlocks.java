package com.victor.custommod.block;

import com.victor.custommod.CustomMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
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

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            properties -> new Block(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(),
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(2f).requiresTool().sounds(BlockSoundGroup.CALCITE)));

    public static final Block POLISHED_CALCITE_BUTTON = registerBlock("polished_calcite_button",
            properties -> new ButtonBlock(BlockSetType.STONE, 20,
                    properties.strength(1f).sounds(BlockSoundGroup.CALCITE).noCollision()));

    public static final Block POLISHED_CALCITE_PRESSURE_PLATE = registerBlock("polished_calcite_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.STONE,
                    properties.mapColor(MapColor.TERRACOTTA_WHITE).strength(1f).sounds(BlockSoundGroup.CALCITE)));

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
                    properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f,4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f,4.2f).requiresTool().sounds(BlockSoundGroup.BASALT)));

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

    public static final Block CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            properties -> new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), properties.mapColor(MapColor.PALE_YELLOW).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_SANDSTONE_TEXTURE = registerBlock("cut_sandstone_texture",
            properties -> new Block(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            properties -> new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), properties.mapColor(MapColor.ORANGE).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_RED_SANDSTONE_TEXTURE = registerBlock("cut_red_sandstone_texture",
            properties -> new Block(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
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

    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            properties -> new Block(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            properties -> new StairsBlock(ModBlocks.POLISHED_END_STONE.getDefaultState(),properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(3.0F, 9.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_TEXTURE = registerBlock("quartz_texture",
            properties -> new Block(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            properties -> new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GOLD_TRAPDOOR = registerBlock("gold_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.GOLD, properties.mapColor(MapColor.GOLD).strength(2F).requiresTool().nonOpaque()
                    .sounds(BlockSoundGroup.METAL).allowsSpawning(Blocks::never)));

    public static final Block GOLD_DOOR = registerBlock("gold_door",
            properties -> new DoorBlock(BlockSetType.GOLD, properties.mapColor(MapColor.GOLD).strength(2F).requiresTool().nonOpaque()
                    .sounds(BlockSoundGroup.METAL).allowsSpawning(Blocks::never)));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            properties -> new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),properties.mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),properties.mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            properties -> new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),properties.mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            properties -> new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            properties -> new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),properties.mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            properties -> new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            properties -> new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),properties.mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),properties.mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            properties -> new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),properties.mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            properties -> new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),properties.mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),properties.mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            properties -> new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            properties -> new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),properties.mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            properties -> new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),properties.mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            properties -> new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),properties.mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            properties -> new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),properties.mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            properties -> new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            properties -> new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            properties -> new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            properties -> new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            properties -> new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            properties -> new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));


    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            properties -> new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(),properties.mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_GLAZED_TERRACOTTA_TEXTURE = registerBlock("white_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block WHITE_GLAZED_TERRACOTTA_STAIRS = registerBlock("white_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.WHITE_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_TEXTURE = registerBlock("light_gray_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_gray_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GRAY_GLAZED_TERRACOTTA_TEXTURE = registerBlock("gray_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_GLAZED_TERRACOTTA_STAIRS = registerBlock("gray_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GRAY_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLACK_GLAZED_TERRACOTTA_TEXTURE = registerBlock("black_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_GLAZED_TERRACOTTA_STAIRS = registerBlock("black_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLACK_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block RED_GLAZED_TERRACOTTA_TEXTURE = registerBlock("red_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block RED_GLAZED_TERRACOTTA_STAIRS = registerBlock("red_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.RED_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block ORANGE_GLAZED_TERRACOTTA_TEXTURE = registerBlock("orange_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_GLAZED_TERRACOTTA_STAIRS = registerBlock("orange_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.ORANGE_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block YELLOW_GLAZED_TERRACOTTA_TEXTURE = registerBlock("yellow_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_GLAZED_TERRACOTTA_STAIRS = registerBlock("yellow_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.YELLOW_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIME_GLAZED_TERRACOTTA_TEXTURE = registerBlock("lime_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_GLAZED_TERRACOTTA_STAIRS = registerBlock("lime_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIME_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GREEN_GLAZED_TERRACOTTA_TEXTURE = registerBlock("green_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_GLAZED_TERRACOTTA_STAIRS = registerBlock("green_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.GREEN_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block CYAN_GLAZED_TERRACOTTA_TEXTURE = registerBlock("cyan_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_GLAZED_TERRACOTTA_STAIRS = registerBlock("cyan_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.CYAN_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_TEXTURE = registerBlock("light_blue_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("light_blue_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLUE_GLAZED_TERRACOTTA_TEXTURE = registerBlock("blue_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_GLAZED_TERRACOTTA_STAIRS = registerBlock("blue_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BLUE_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PURPLE_GLAZED_TERRACOTTA_TEXTURE = registerBlock("purple_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_GLAZED_TERRACOTTA_STAIRS = registerBlock("purple_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PURPLE_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_TEXTURE = registerBlock("magenta_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_STAIRS = registerBlock("magenta_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.MAGENTA_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PINK_GLAZED_TERRACOTTA_TEXTURE = registerBlock("pink_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_GLAZED_TERRACOTTA_STAIRS = registerBlock("pink_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.PINK_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BROWN_GLAZED_TERRACOTTA_TEXTURE = registerBlock("brown_glazed_terracotta_texture",
            properties -> new Block(properties.mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(0.8F).sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_GLAZED_TERRACOTTA_STAIRS = registerBlock("brown_glazed_terracotta_stairs",
            properties -> new StairsBlock(Blocks.BROWN_GLAZED_TERRACOTTA.getDefaultState(),properties.mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab",
            properties -> new SlabBlock(properties.mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

    public static final Block BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall",
            properties -> new WallBlock(properties.mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.4F).sounds(BlockSoundGroup.STONE).pistonBehavior(PistonBehavior.PUSH_ONLY)));

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
            entries.addAfter(Blocks.CHISELED_TUFF_BRICKS, Blocks.CALCITE);
            entries.addAfter(Blocks.CALCITE, ModBlocks.CALCITE_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_STAIRS, ModBlocks.CALCITE_SLAB);
            entries.addAfter(ModBlocks.CALCITE_SLAB, ModBlocks.CALCITE_WALL);

            entries.addAfter(ModBlocks.CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
            entries.addAfter(ModBlocks.POLISHED_CALCITE, ModBlocks.POLISHED_CALCITE_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE_SLAB);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE_WALL);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE, ModBlocks.POLISHED_CALCITE_BUTTON);

            entries.addAfter(ModBlocks.POLISHED_CALCITE_BUTTON, ModBlocks.CALCITE_BRICKS);
            entries.addAfter(ModBlocks.CALCITE_BRICKS, ModBlocks.CALCITE_BRICK_STAIRS);
            entries.addAfter(ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICK_SLAB);
            entries.addAfter(ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICK_WALL);

            entries.addAfter(Blocks.AMETHYST_BLOCK, ModBlocks.AMETHYST_STAIRS);
            entries.addAfter(ModBlocks.AMETHYST_STAIRS, ModBlocks.AMETHYST_SLAB);

            entries.addAfter(Blocks.SMOOTH_BASALT, ModBlocks.SMOOTH_BASALT_STAIRS);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_STAIRS, ModBlocks.SMOOTH_BASALT_SLAB);
            entries.addAfter(ModBlocks.SMOOTH_BASALT_SLAB, ModBlocks.SMOOTH_BASALT_WALL);

            entries.addAfter(Blocks.STONE_SLAB, ModBlocks.STONE_WALL);
            entries.addAfter(Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_STAIRS);
            entries.addAfter(Blocks.POLISHED_DEEPSLATE_WALL, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
            entries.addAfter(Blocks.PACKED_MUD, ModBlocks.PACKED_MUD_STAIRS);
            entries.addAfter(ModBlocks.PACKED_MUD_STAIRS, ModBlocks.PACKED_MUD_SLAB);
            entries.addAfter(ModBlocks.PACKED_MUD_SLAB, ModBlocks.PACKED_MUD_WALL);

            entries.addAfter(Blocks.SMOOTH_SANDSTONE_SLAB, ModBlocks.SMOOTH_SANDSTONE_WALL);
            entries.addAfter(Blocks.SMOOTH_RED_SANDSTONE_SLAB, ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
            entries.addAfter(Blocks.CUT_SANDSTONE, ModBlocks.CUT_SANDSTONE_STAIRS);
            entries.addAfter(Blocks.CUT_SANDSTONE_SLAB, ModBlocks.CUT_SANDSTONE_WALL);
            entries.addAfter(Blocks.CUT_RED_SANDSTONE, ModBlocks.CUT_RED_SANDSTONE_STAIRS);
            entries.addAfter(Blocks.CUT_RED_SANDSTONE_SLAB, ModBlocks.CUT_RED_SANDSTONE_WALL);

            entries.addAfter(Blocks.PRISMARINE_BRICK_SLAB, ModBlocks.PRISMARINE_BRICK_WALL);
            entries.addAfter(Blocks.DARK_PRISMARINE_SLAB, ModBlocks.DARK_PRISMARINE_WALL);
            entries.addAfter(Blocks.PURPUR_SLAB, ModBlocks.PURPUR_WALL);

            entries.addAfter(Blocks.NETHERRACK, ModBlocks.NETHERRACK_STAIRS);
            entries.addAfter(ModBlocks.NETHERRACK_STAIRS, ModBlocks.NETHERRACK_SLAB);
            entries.addAfter(ModBlocks.NETHERRACK_SLAB, ModBlocks.NETHERRACK_WALL);

            entries.addAfter(Blocks.END_STONE, ModBlocks.END_STONE_STAIRS);
            entries.addAfter(ModBlocks.END_STONE_STAIRS, ModBlocks.END_STONE_SLAB);
            entries.addAfter(ModBlocks.END_STONE_SLAB, ModBlocks.END_STONE_WALL);

            entries.addAfter(ModBlocks.END_STONE_WALL, ModBlocks.POLISHED_END_STONE);
            entries.addAfter(ModBlocks.POLISHED_END_STONE, ModBlocks.POLISHED_END_STONE_STAIRS);
            entries.addAfter(ModBlocks.POLISHED_END_STONE_STAIRS, ModBlocks.POLISHED_END_STONE_SLAB);
            entries.addAfter(ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE_WALL);

            entries.addAfter(Blocks.POLISHED_ANDESITE_SLAB, ModBlocks.POLISHED_ANDESITE_WALL);
            entries.addAfter(Blocks.POLISHED_DIORITE_SLAB, ModBlocks.POLISHED_DIORITE_WALL);
            entries.addAfter(Blocks.POLISHED_GRANITE_SLAB, ModBlocks.POLISHED_GRANITE_WALL);

            entries.addAfter(Blocks.QUARTZ_SLAB, ModBlocks.QUARTZ_WALL);
            entries.addAfter(Blocks.SMOOTH_QUARTZ_SLAB, ModBlocks.SMOOTH_QUARTZ_WALL);

            entries.addAfter(Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS);
            entries.addAfter(ModBlocks.QUARTZ_BRICK_STAIRS, ModBlocks.QUARTZ_BRICK_SLAB);
            entries.addAfter(ModBlocks.QUARTZ_BRICK_SLAB, ModBlocks.QUARTZ_BRICK_WALL);

            entries.addAfter(Blocks.GOLD_BLOCK, ModBlocks.GOLD_DOOR);
            entries.addAfter(ModBlocks.GOLD_DOOR, ModBlocks.GOLD_TRAPDOOR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries ->
        {
            entries.addAfter(Blocks.IRON_DOOR, ModBlocks.GOLD_DOOR);
            entries.addAfter(Blocks.IRON_TRAPDOOR, ModBlocks.GOLD_TRAPDOOR);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries ->
        {
            entries.addAfter(Blocks.WHITE_CONCRETE, ModBlocks.WHITE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.WHITE_CONCRETE_STAIRS, ModBlocks.WHITE_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.WHITE_CONCRETE_SLAB, ModBlocks.WHITE_CONCRETE_WALL);

            entries.addAfter(Blocks.LIGHT_GRAY_CONCRETE, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

            entries.addAfter(Blocks.GRAY_CONCRETE, ModBlocks.GRAY_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.GRAY_CONCRETE_STAIRS, ModBlocks.GRAY_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.GRAY_CONCRETE_SLAB, ModBlocks.GRAY_CONCRETE_WALL);

            entries.addAfter(Blocks.BLACK_CONCRETE, ModBlocks.BLACK_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BLACK_CONCRETE_STAIRS, ModBlocks.BLACK_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.BLACK_CONCRETE_SLAB, ModBlocks.BLACK_CONCRETE_WALL);

            entries.addAfter(Blocks.BROWN_CONCRETE, ModBlocks.BROWN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BROWN_CONCRETE_STAIRS, ModBlocks.BROWN_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.BROWN_CONCRETE_SLAB, ModBlocks.BROWN_CONCRETE_WALL);

            entries.addAfter(Blocks.RED_CONCRETE, ModBlocks.RED_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.RED_CONCRETE_STAIRS, ModBlocks.RED_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.RED_CONCRETE_SLAB, ModBlocks.RED_CONCRETE_WALL);

            entries.addAfter(Blocks.ORANGE_CONCRETE, ModBlocks.ORANGE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.ORANGE_CONCRETE_STAIRS, ModBlocks.ORANGE_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.ORANGE_CONCRETE_SLAB, ModBlocks.ORANGE_CONCRETE_WALL);

            entries.addAfter(Blocks.YELLOW_CONCRETE, ModBlocks.YELLOW_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.YELLOW_CONCRETE_STAIRS, ModBlocks.YELLOW_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.YELLOW_CONCRETE_SLAB, ModBlocks.YELLOW_CONCRETE_WALL);

            entries.addAfter(Blocks.LIME_CONCRETE, ModBlocks.LIME_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIME_CONCRETE_STAIRS, ModBlocks.LIME_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.LIME_CONCRETE_SLAB, ModBlocks.LIME_CONCRETE_WALL);

            entries.addAfter(Blocks.GREEN_CONCRETE, ModBlocks.GREEN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.GREEN_CONCRETE_STAIRS, ModBlocks.GREEN_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.GREEN_CONCRETE_SLAB, ModBlocks.GREEN_CONCRETE_WALL);

            entries.addAfter(Blocks.CYAN_CONCRETE, ModBlocks.CYAN_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.CYAN_CONCRETE_STAIRS, ModBlocks.CYAN_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.CYAN_CONCRETE_SLAB, ModBlocks.CYAN_CONCRETE_WALL);

            entries.addAfter(Blocks.LIGHT_BLUE_CONCRETE, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

            entries.addAfter(Blocks.BLUE_CONCRETE, ModBlocks.BLUE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.BLUE_CONCRETE_STAIRS, ModBlocks.BLUE_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.BLUE_CONCRETE_SLAB, ModBlocks.BLUE_CONCRETE_WALL);

            entries.addAfter(Blocks.PURPLE_CONCRETE, ModBlocks.PURPLE_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.PURPLE_CONCRETE_STAIRS, ModBlocks.PURPLE_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.PURPLE_CONCRETE_SLAB, ModBlocks.PURPLE_CONCRETE_WALL);

            entries.addAfter(Blocks.MAGENTA_CONCRETE, ModBlocks.MAGENTA_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.MAGENTA_CONCRETE_STAIRS, ModBlocks.MAGENTA_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.MAGENTA_CONCRETE_SLAB, ModBlocks.MAGENTA_CONCRETE_WALL);

            entries.addAfter(Blocks.PINK_CONCRETE, ModBlocks.PINK_CONCRETE_STAIRS);
            entries.addAfter(ModBlocks.PINK_CONCRETE_STAIRS, ModBlocks.PINK_CONCRETE_SLAB);
            entries.addAfter(ModBlocks.PINK_CONCRETE_SLAB, ModBlocks.PINK_CONCRETE_WALL);

            entries.addAfter(Blocks.TERRACOTTA, ModBlocks.TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.TERRACOTTA_STAIRS, ModBlocks.TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.TERRACOTTA_SLAB, ModBlocks.TERRACOTTA_WALL);

            entries.addAfter(Blocks.WHITE_TERRACOTTA, ModBlocks.WHITE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.WHITE_TERRACOTTA_STAIRS, ModBlocks.WHITE_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.WHITE_TERRACOTTA_SLAB, ModBlocks.WHITE_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIGHT_GRAY_TERRACOTTA, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

            entries.addAfter(Blocks.GRAY_TERRACOTTA, ModBlocks.GRAY_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GRAY_TERRACOTTA_STAIRS, ModBlocks.GRAY_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.GRAY_TERRACOTTA_SLAB, ModBlocks.GRAY_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BLACK_TERRACOTTA, ModBlocks.BLACK_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLACK_TERRACOTTA_STAIRS, ModBlocks.BLACK_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BLACK_TERRACOTTA_SLAB, ModBlocks.BLACK_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BROWN_TERRACOTTA, ModBlocks.BROWN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BROWN_TERRACOTTA_STAIRS, ModBlocks.BROWN_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BROWN_TERRACOTTA_SLAB, ModBlocks.BROWN_TERRACOTTA_WALL);

            entries.addAfter(Blocks.RED_TERRACOTTA, ModBlocks.RED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.RED_TERRACOTTA_STAIRS, ModBlocks.RED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.RED_TERRACOTTA_SLAB, ModBlocks.RED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.ORANGE_TERRACOTTA, ModBlocks.ORANGE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.ORANGE_TERRACOTTA_STAIRS, ModBlocks.ORANGE_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.ORANGE_TERRACOTTA_SLAB, ModBlocks.ORANGE_TERRACOTTA_WALL);

            entries.addAfter(Blocks.YELLOW_TERRACOTTA, ModBlocks.YELLOW_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.YELLOW_TERRACOTTA_STAIRS, ModBlocks.YELLOW_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.YELLOW_TERRACOTTA_SLAB, ModBlocks.YELLOW_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIME_TERRACOTTA, ModBlocks.LIME_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIME_TERRACOTTA_STAIRS, ModBlocks.LIME_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIME_TERRACOTTA_SLAB, ModBlocks.LIME_TERRACOTTA_WALL);

            entries.addAfter(Blocks.GREEN_TERRACOTTA, ModBlocks.GREEN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GREEN_TERRACOTTA_STAIRS, ModBlocks.GREEN_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.GREEN_TERRACOTTA_SLAB, ModBlocks.GREEN_TERRACOTTA_WALL);

            entries.addAfter(Blocks.CYAN_TERRACOTTA, ModBlocks.CYAN_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.CYAN_TERRACOTTA_STAIRS, ModBlocks.CYAN_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.CYAN_TERRACOTTA_SLAB, ModBlocks.CYAN_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIGHT_BLUE_TERRACOTTA, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BLUE_TERRACOTTA, ModBlocks.BLUE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLUE_TERRACOTTA_STAIRS, ModBlocks.BLUE_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BLUE_TERRACOTTA_SLAB, ModBlocks.BLUE_TERRACOTTA_WALL);

            entries.addAfter(Blocks.PURPLE_TERRACOTTA, ModBlocks.PURPLE_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PURPLE_TERRACOTTA_STAIRS, ModBlocks.PURPLE_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.PURPLE_TERRACOTTA_SLAB, ModBlocks.PURPLE_TERRACOTTA_WALL);

            entries.addAfter(Blocks.MAGENTA_TERRACOTTA, ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.MAGENTA_TERRACOTTA_SLAB, ModBlocks.MAGENTA_TERRACOTTA_WALL);

            entries.addAfter(Blocks.PINK_TERRACOTTA, ModBlocks.PINK_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_STAIRS, ModBlocks.PINK_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.PINK_TERRACOTTA_SLAB, ModBlocks.PINK_TERRACOTTA_WALL);

            entries.addAfter(Blocks.WHITE_GLAZED_TERRACOTTA, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.GRAY_GLAZED_TERRACOTTA, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BLACK_GLAZED_TERRACOTTA, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BROWN_GLAZED_TERRACOTTA, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.RED_GLAZED_TERRACOTTA, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.ORANGE_GLAZED_TERRACOTTA, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.YELLOW_GLAZED_TERRACOTTA, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIME_GLAZED_TERRACOTTA, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.GREEN_GLAZED_TERRACOTTA, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.CYAN_GLAZED_TERRACOTTA, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.BLUE_GLAZED_TERRACOTTA, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.PURPLE_GLAZED_TERRACOTTA, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.MAGENTA_GLAZED_TERRACOTTA, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

            entries.addAfter(Blocks.PINK_GLAZED_TERRACOTTA, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
            entries.addAfter(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
            entries.addAfter(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);
        });
    }
}

