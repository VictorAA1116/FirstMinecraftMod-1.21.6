package com.victor.custommod.item;

import com.victor.custommod.CustomMod;
import com.victor.custommod.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item CAPYBARA_SPAWN_EGG = registerItem("capybara_spawn_egg",
            setting -> new SpawnEggItem(ModEntities.CAPYBARA, setting));

    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg",
            setting -> new SpawnEggItem(ModEntities.PENGUIN, setting));

    private static Item registerItem(String name, Function<Item.Settings, Item> function)
    {
        return Registry.register(Registries.ITEM, Identifier.of(CustomMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomMod.MOD_ID, name)))));
    }

    public static void registerModItems()
    {
        CustomMod.LOGGER.info("Registering mod items for" + CustomMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries ->
        {
            entries.add(CAPYBARA_SPAWN_EGG);
            entries.add(PENGUIN_SPAWN_EGG);
        });
    }
}
