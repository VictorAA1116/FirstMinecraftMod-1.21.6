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

        stonePool.wall(ModBlocks.STONE_WALL);

        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);

        polishedDeepslatePool.pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        packedMudPool.stairs(ModBlocks.PACKED_MUD_STAIRS);
        packedMudPool.slab(ModBlocks.PACKED_MUD_SLAB);
        packedMudPool.wall(ModBlocks.PACKED_MUD_WALL);

        smoothSandstonePool.wall(ModBlocks.SMOOTH_SANDSTONE_WALL);
        smoothRedSandstonePool.wall(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CAPYBARA_SPAWN_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PENGUIN_SPAWN_EGG, Models.GENERATED);
    }
}
