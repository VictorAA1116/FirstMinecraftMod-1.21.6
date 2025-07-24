package com.victor.custommod;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.entity.custom.CapybaraEntity;
import com.victor.custommod.item.ModItemGroups;
import com.victor.custommod.item.ModItems;
import com.victor.custommod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMod implements ModInitializer {
	public static final String MOD_ID = "custommod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.CAPYBARA, CapybaraEntity.createAttributes());

		ModWorldGeneration.generateModWorldGen();

		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.TEMPLATE_FUEL, 600);
		});
	}
}