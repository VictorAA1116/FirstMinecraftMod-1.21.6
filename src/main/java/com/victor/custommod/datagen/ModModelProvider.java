package com.victor.custommod.datagen;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        BlockStateModelGenerator.BlockTexturePool polishedCalcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CALCITE);
        BlockStateModelGenerator.BlockTexturePool calciteBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CALCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool polishedDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool packedMudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool smoothRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        BlockStateModelGenerator.BlockTexturePool netherrackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERRACK);
        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        BlockStateModelGenerator.BlockTexturePool polishedEndStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_END_STONE);
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool cutSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool cutRedSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CUT_RED_SANDSTONE);

        BlockStateModelGenerator.BlockTexturePool whiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool grayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool redConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool orangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool yellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool limeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool greenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool purpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool magentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool pinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool brownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);

        BlockStateModelGenerator.BlockTexturePool terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool whiteTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightGrayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool grayTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blackTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool redTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orangeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellowTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool limeTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool greenTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyanTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lightBlueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blueTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purpleTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magentaTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pinkTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brownTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);

        BlockStateModelGenerator.BlockTexturePool whiteGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool lightGrayGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool grayGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool blackGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool redGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool orangeGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool yellowGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool limeGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool greenGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool cyanGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool lightBlueGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool blueGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool purpleGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool magentaGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool pinkGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GLAZED_TERRACOTTA_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool brownGlazedTerracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_GLAZED_TERRACOTTA_TEXTURE);

        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.wall(ModBlocks.CALCITE_WALL);

        polishedCalcitePool.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(ModBlocks.POLISHED_CALCITE_WALL);
        polishedCalcitePool.button(ModBlocks.POLISHED_CALCITE_BUTTON);
        polishedCalcitePool.pressurePlate(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE);

        calciteBrickPool.stairs(ModBlocks.CALCITE_BRICK_STAIRS);
        calciteBrickPool.slab(ModBlocks.CALCITE_BRICK_SLAB);
        calciteBrickPool.wall(ModBlocks.CALCITE_BRICK_WALL);

        amethystPool.stairs(ModBlocks.AMETHYST_STAIRS);
        amethystPool.slab(ModBlocks.AMETHYST_SLAB);

        smoothBasaltPool.stairs(ModBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(ModBlocks.SMOOTH_BASALT_SLAB);
        smoothBasaltPool.wall(ModBlocks.SMOOTH_BASALT_WALL);

        stonePool.wall(ModBlocks.STONE_WALL);

        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);

        polishedDeepslatePool.pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        packedMudPool.stairs(ModBlocks.PACKED_MUD_STAIRS);
        packedMudPool.slab(ModBlocks.PACKED_MUD_SLAB);
        packedMudPool.wall(ModBlocks.PACKED_MUD_WALL);

        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        prismarineBrickPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
        purpurPool.wall(ModBlocks.PURPUR_WALL);

        netherrackPool.stairs(ModBlocks.NETHERRACK_STAIRS);
        netherrackPool.slab(ModBlocks.NETHERRACK_SLAB);
        netherrackPool.wall(ModBlocks.NETHERRACK_WALL);

        endStonePool.slab(ModBlocks.END_STONE_SLAB);
        endStonePool.stairs(ModBlocks.END_STONE_STAIRS);
        endStonePool.wall(ModBlocks.END_STONE_WALL);

        polishedEndStonePool.slab(ModBlocks.POLISHED_END_STONE_SLAB);
        polishedEndStonePool.stairs(ModBlocks.POLISHED_END_STONE_STAIRS);
        polishedEndStonePool.wall(ModBlocks.POLISHED_END_STONE_WALL);

        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        quartzPool.wall(ModBlocks.QUARTZ_WALL);

        quartzBrickPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.wall(ModBlocks.QUARTZ_BRICK_WALL);

        blockStateModelGenerator.registerTrapdoor(ModBlocks.GOLD_TRAPDOOR);
        blockStateModelGenerator.registerDoor(ModBlocks.GOLD_DOOR);

        cutSandstonePool.stairs(ModBlocks.CUT_SANDSTONE_STAIRS);
        //cutSandstonePool.wall(ModBlocks.CUT_SANDSTONE_WALL);
        cutRedSandstonePool.stairs(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        //cutRedSandstonePool.wall(ModBlocks.CUT_RED_SANDSTONE_WALL);

        whiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        whiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        whiteConcretePool.wall(ModBlocks.WHITE_CONCRETE_WALL);

        lightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayConcretePool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        grayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        grayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        grayConcretePool.wall(ModBlocks.GRAY_CONCRETE_WALL);

        blackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        blackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        blackConcretePool.wall(ModBlocks.BLACK_CONCRETE_WALL);

        redConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);
        redConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        redConcretePool.wall(ModBlocks.RED_CONCRETE_WALL);

        orangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        orangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orangeConcretePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);

        yellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        yellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellowConcretePool.wall(ModBlocks.YELLOW_CONCRETE_WALL);

        limeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        limeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        limeConcretePool.wall(ModBlocks.LIME_CONCRETE_WALL);

        greenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        greenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        greenConcretePool.wall(ModBlocks.GREEN_CONCRETE_WALL);

        cyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        cyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyanConcretePool.wall(ModBlocks.CYAN_CONCRETE_WALL);

        lightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBlueConcretePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        blueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        blueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        blueConcretePool.wall(ModBlocks.BLUE_CONCRETE_WALL);

        purpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        purpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        purpleConcretePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);

        magentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        magentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaConcretePool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);

        pinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        pinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pinkConcretePool.wall(ModBlocks.PINK_CONCRETE_WALL);

        brownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        brownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        brownConcretePool.wall(ModBlocks.BROWN_CONCRETE_WALL);

        terracottaPool.slab(ModBlocks.TERRACOTTA_SLAB);
        terracottaPool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        terracottaPool.wall(ModBlocks.TERRACOTTA_WALL);

        whiteTerracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);
        whiteTerracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        whiteTerracottaPool.wall(ModBlocks.WHITE_TERRACOTTA_WALL);

        lightGrayTerracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        lightGrayTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        lightGrayTerracottaPool.wall(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        grayTerracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);
        grayTerracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        grayTerracottaPool.wall(ModBlocks.GRAY_TERRACOTTA_WALL);

        blackTerracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);
        blackTerracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        blackTerracottaPool.wall(ModBlocks.BLACK_TERRACOTTA_WALL);

        redTerracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);
        redTerracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        redTerracottaPool.wall(ModBlocks.RED_TERRACOTTA_WALL);

        orangeTerracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        orangeTerracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        orangeTerracottaPool.wall(ModBlocks.ORANGE_TERRACOTTA_WALL);

        yellowTerracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        yellowTerracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellowTerracottaPool.wall(ModBlocks.YELLOW_TERRACOTTA_WALL);

        limeTerracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);
        limeTerracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        limeTerracottaPool.wall(ModBlocks.LIME_TERRACOTTA_WALL);

        greenTerracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);
        greenTerracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        greenTerracottaPool.wall(ModBlocks.GREEN_TERRACOTTA_WALL);

        cyanTerracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);
        cyanTerracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        cyanTerracottaPool.wall(ModBlocks.CYAN_TERRACOTTA_WALL);

        lightBlueTerracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        lightBlueTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        lightBlueTerracottaPool.wall(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        blueTerracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);
        blueTerracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        blueTerracottaPool.wall(ModBlocks.BLUE_TERRACOTTA_WALL);

        purpleTerracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        purpleTerracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        purpleTerracottaPool.wall(ModBlocks.PURPLE_TERRACOTTA_WALL);

        magentaTerracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        magentaTerracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magentaTerracottaPool.wall(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        pinkTerracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);
        pinkTerracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        pinkTerracottaPool.wall(ModBlocks.PINK_TERRACOTTA_WALL);

        brownTerracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);
        brownTerracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        brownTerracottaPool.wall(ModBlocks.BROWN_TERRACOTTA_WALL);

        whiteGlazedTerracottaPool.slab(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
        whiteGlazedTerracottaPool.stairs(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        whiteGlazedTerracottaPool.wall(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

        lightGrayGlazedTerracottaPool.slab(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
        lightGrayGlazedTerracottaPool.stairs(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        lightGrayGlazedTerracottaPool.wall(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

        grayGlazedTerracottaPool.slab(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
        grayGlazedTerracottaPool.stairs(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        grayGlazedTerracottaPool.wall(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

        blackGlazedTerracottaPool.slab(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
        blackGlazedTerracottaPool.stairs(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
        blackGlazedTerracottaPool.wall(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

        redGlazedTerracottaPool.slab(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
        redGlazedTerracottaPool.stairs(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        redGlazedTerracottaPool.wall(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

        orangeGlazedTerracottaPool.slab(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
        orangeGlazedTerracottaPool.stairs(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        orangeGlazedTerracottaPool.wall(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

        yellowGlazedTerracottaPool.slab(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
        yellowGlazedTerracottaPool.stairs(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        yellowGlazedTerracottaPool.wall(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

        limeGlazedTerracottaPool.slab(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
        limeGlazedTerracottaPool.stairs(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        limeGlazedTerracottaPool.wall(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

        greenGlazedTerracottaPool.slab(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
        greenGlazedTerracottaPool.stairs(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        greenGlazedTerracottaPool.wall(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

        cyanGlazedTerracottaPool.slab(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
        cyanGlazedTerracottaPool.stairs(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
        cyanGlazedTerracottaPool.wall(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

        lightBlueGlazedTerracottaPool.slab(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
        lightBlueGlazedTerracottaPool.stairs(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        lightBlueGlazedTerracottaPool.wall(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

        blueGlazedTerracottaPool.slab(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
        blueGlazedTerracottaPool.stairs(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        blueGlazedTerracottaPool.wall(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

        purpleGlazedTerracottaPool.slab(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
        purpleGlazedTerracottaPool.stairs(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        purpleGlazedTerracottaPool.wall(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

        magentaGlazedTerracottaPool.slab(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
        magentaGlazedTerracottaPool.stairs(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        magentaGlazedTerracottaPool.wall(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

        pinkGlazedTerracottaPool.slab(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
        pinkGlazedTerracottaPool.stairs(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        pinkGlazedTerracottaPool.wall(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

        brownGlazedTerracottaPool.slab(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
        brownGlazedTerracottaPool.stairs(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        brownGlazedTerracottaPool.wall(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CAPYBARA_SPAWN_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENGUIN_SPAWN_EGG, Models.GENERATED);
    }
}
