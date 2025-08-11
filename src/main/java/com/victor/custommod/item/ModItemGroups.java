package com.victor.custommod.item;

import com.victor.custommod.CustomMod;
import com.victor.custommod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(CustomMod.MOD_ID, "mod_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PENGUIN_SPAWN_EGG))
                    .displayName(Text.translatable("itemgroup.custommod.mod_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CALCITE_STAIRS);
                        entries.add(ModBlocks.CALCITE_SLAB);
                        entries.add(ModBlocks.CALCITE_WALL);
                        entries.add(ModBlocks.CALCITE_PRESSURE_PLATE);
                        entries.add(ModBlocks.CALCITE_BUTTON);

                        entries.add(ModBlocks.POLISHED_CALCITE);
                        entries.add(ModBlocks.POLISHED_CALCITE_STAIRS);
                        entries.add(ModBlocks.POLISHED_CALCITE_SLAB);
                        entries.add(ModBlocks.POLISHED_CALCITE_WALL);

                        entries.add(ModBlocks.CALCITE_BRICKS);
                        entries.add(ModBlocks.CALCITE_BRICK_WALL);
                        entries.add(ModBlocks.CALCITE_BRICK_SLAB);
                        entries.add(ModBlocks.CALCITE_BRICK_STAIRS);

                        entries.add(ModBlocks.AMETHYST_STAIRS);
                        entries.add(ModBlocks.AMETHYST_SLAB);

                        entries.add(ModBlocks.SMOOTH_BASALT_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BASALT_SLAB);

                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

                        entries.add(ModBlocks.PACKED_MUD_SLAB);
                        entries.add(ModBlocks.PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.PACKED_MUD_WALL);

                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);

                        entries.add(ModItems.CAPYBARA_SPAWN_EGG);
                        entries.add(ModItems.PENGUIN_SPAWN_EGG);
                    })
                    .build());

    public static void registerItemGroups()
    {
        CustomMod.LOGGER.info("Registering Item Groups for " + CustomMod.MOD_ID);
    }
}

