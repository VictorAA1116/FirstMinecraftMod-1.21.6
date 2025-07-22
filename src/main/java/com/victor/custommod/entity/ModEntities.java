package com.victor.custommod.entity;

import com.victor.custommod.CustomMod;
import com.victor.custommod.entity.custom.CapybaraEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {

    private static final RegistryKey<EntityType<?>> CAPYBARA_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(CustomMod.MOD_ID, "capybara"));

    public static final EntityType<CapybaraEntity> CAPYBARA = Registry.register(Registries.ENTITY_TYPE,
        Identifier.of(CustomMod.MOD_ID, "capybara"), EntityType.Builder.create(CapybaraEntity::new, SpawnGroup.CREATURE)
                    .dimensions(1f,1f).build(CAPYBARA_KEY));

    public static void registerModEntities () {
        CustomMod.LOGGER.info("Registering Mod Entities for " + CustomMod.MOD_ID);
    }
}
