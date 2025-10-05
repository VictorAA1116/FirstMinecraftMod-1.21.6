package com.victor.custommod.item;

import com.victor.custommod.CustomMod;
import com.victor.custommod.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item CAPYBARA_SPAWN_EGG = registerItem("capybara_spawn_egg",
            SpawnEggItem::new, (new Item.Settings().spawnEgg(ModEntities.CAPYBARA)));

    public static final Item PENGUIN_SPAWN_EGG = registerItem("penguin_spawn_egg",
            SpawnEggItem::new, (new Item.Settings().spawnEgg(ModEntities.PENGUIN)));

    private static Item registerItem(String id, Function<Item.Settings, Item> factory, Item.Settings settings)
    {
        return Items.register(id, factory, settings);
                //Registry.register(Registries.ITEM, Identifier.of(CustomMod.MOD_ID, id),
        //                factory.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CustomMod.MOD_ID, id)))));
    }

    public static void registerModItems()
    {
        CustomMod.LOGGER.info("Registering mod items for" + CustomMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries ->
        {
            entries.addAfter(Items.CAMEL_SPAWN_EGG, CAPYBARA_SPAWN_EGG);
            entries.addAfter(Items.PARROT_SPAWN_EGG, PENGUIN_SPAWN_EGG);
        });
    }
}
