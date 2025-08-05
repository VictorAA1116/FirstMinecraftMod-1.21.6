package com.victor.custommod.world.gen;

import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.entity.custom.CapybaraEntity;
import com.victor.custommod.entity.custom.PenguinEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {

    public static boolean canPenguinSpawn(EntityType<PenguinEntity> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos blockPos, Random random) {
        BlockState stateBelow = world.getBlockState(blockPos.down());

        if (AnimalEntity.isValidNaturalSpawn(type, world,spawnReason, blockPos, random)) {
            return true;
        }
        if (stateBelow.isOf(Blocks.ICE) || stateBelow.isOf(Blocks.PACKED_ICE) || stateBelow.isOf(Blocks.BLUE_ICE)) {
            return true;
        }
        if (world.getBlockState(blockPos).getBlock() == Blocks.WATER && world.getBlockState(blockPos.up()).isAir()) {
            return true;
        }

        return false;
    }

    public static boolean canCapybaraSpawn(EntityType<CapybaraEntity> type, ServerWorldAccess world, SpawnReason spawnReason, BlockPos blockPos, Random random) {

        if (AnimalEntity.isValidNaturalSpawn(type, world,spawnReason, blockPos, random)) {
            return true;
        }
        if (world.getBlockState(blockPos).getBlock() == Blocks.WATER && world.getBlockState(blockPos.up()).isAir()) {
            return true;
        }

        return false;
    }

    public static void  addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP, BiomeKeys.JUNGLE,
                BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.RIVER, BiomeKeys.SAVANNA),
                SpawnGroup.CREATURE, ModEntities.CAPYBARA, 30, 3, 6);

        SpawnRestriction.register(ModEntities.CAPYBARA, SpawnLocationTypes.UNRESTRICTED, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ModEntitySpawns::canCapybaraSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE, BiomeKeys.ICE_SPIKES, BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.PENGUIN, 50, 3, 10);

        SpawnRestriction.register(ModEntities.PENGUIN, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ModEntitySpawns::canPenguinSpawn);
    }
}
