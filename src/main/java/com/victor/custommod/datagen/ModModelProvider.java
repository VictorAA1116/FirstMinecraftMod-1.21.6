package com.victor.custommod.datagen;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

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
        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        BlockStateModelGenerator.BlockTexturePool quartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.QUARTZ_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
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

        calcitePool.stairs(ModBlocks.CALCITE_STAIRS);
        calcitePool.slab(ModBlocks.CALCITE_SLAB);
        calcitePool.wall(ModBlocks.CALCITE_WALL);
        calcitePool.button(ModBlocks.CALCITE_BUTTON);
        calcitePool.pressurePlate(ModBlocks.CALCITE_PRESSURE_PLATE);

        polishedCalcitePool.stairs(ModBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalcitePool.slab(ModBlocks.POLISHED_CALCITE_SLAB);
        polishedCalcitePool.wall(ModBlocks.POLISHED_CALCITE_WALL);

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

        polishedDioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        polishedGranitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        smoothQuartzPool.wall(ModBlocks.SMOOTH_QUARTZ_WALL);
        quartzPool.wall(ModBlocks.QUARTZ_WALL);

        quartzBrickPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
        quartzBrickPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.wall(ModBlocks.QUARTZ_BRICK_WALL);

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CAPYBARA_SPAWN_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENGUIN_SPAWN_EGG, Models.GENERATED);
    }
}
