package com.victor.custommod.world.gen;

import com.victor.custommod.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
    public static void  addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP, BiomeKeys.MANGROVE_SWAMP, BiomeKeys.JUNGLE,
                BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.RIVER, BiomeKeys.SAVANNA),
                SpawnGroup.CREATURE, ModEntities.CAPYBARA, 30, 3, 6);

        SpawnRestriction.register(ModEntities.CAPYBARA, SpawnLocationTypes.UNRESTRICTED, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.STONY_SHORE, BiomeKeys.ICE_SPIKES, BiomeKeys.FROZEN_OCEAN, BiomeKeys.DEEP_FROZEN_OCEAN, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.PENGUIN, 30, 3, 10);

        SpawnRestriction.register(ModEntities.PENGUIN, SpawnLocationTypes.UNRESTRICTED, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
