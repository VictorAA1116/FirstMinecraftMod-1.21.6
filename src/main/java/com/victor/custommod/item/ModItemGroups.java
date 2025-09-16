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

    public static final ItemGroup MOD_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(CustomMod.MOD_ID, "mod_block_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CALCITE_BRICKS))
                    .displayName(Text.translatable("itemgroup.custommod.mod_block_group"))
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
                        entries.add(ModBlocks.SMOOTH_BASALT_WALL);

                        entries.add(ModBlocks.STONE_WALL);
                        entries.add(ModBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

                        entries.add(ModBlocks.PACKED_MUD_SLAB);
                        entries.add(ModBlocks.PACKED_MUD_STAIRS);
                        entries.add(ModBlocks.PACKED_MUD_WALL);

                        entries.add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(ModBlocks.SMOOTH_SANDSTONE_WALL);

                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.DARK_PRISMARINE_WALL);
                        entries.add(ModBlocks.PRISMARINE_BRICK_WALL);

                        entries.add(ModBlocks.NETHERRACK_SLAB);
                        entries.add(ModBlocks.NETHERRACK_STAIRS);
                        entries.add(ModBlocks.NETHERRACK_WALL);

                        entries.add(ModBlocks.END_STONE_SLAB);
                        entries.add(ModBlocks.END_STONE_STAIRS);
                        entries.add(ModBlocks.END_STONE_WALL);

                        entries.add(ModBlocks.POLISHED_END_STONE);
                        entries.add(ModBlocks.POLISHED_END_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_END_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_END_STONE_WALL);

                        entries.add(ModBlocks.GOLD_TRAPDOOR);
                        entries.add(ModBlocks.GOLD_DOOR);

                        entries.add(ModBlocks.POLISHED_GRANITE_WALL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(ModBlocks.POLISHED_DIORITE_WALL);

                        entries.add(ModBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(ModBlocks.QUARTZ_WALL);

                        entries.add(ModBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(ModBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.QUARTZ_BRICK_WALL);

                        entries.add(ModBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.CUT_RED_SANDSTONE_WALL);

                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_WALL);

                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_WALL);

                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_WALL);

                        entries.add(ModBlocks.RED_CONCRETE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_WALL);

                        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_WALL);

                        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_WALL);

                        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_WALL);

                        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_WALL);

                        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_WALL);

                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

                        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_WALL);

                        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_WALL);

                        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_WALL);

                        entries.add(ModBlocks.PINK_CONCRETE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_WALL);

                        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_WALL);

                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_WALL);

                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_WALL);

                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_WALL);

                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_WALL);

                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_WALL);

                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_WALL);

                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_WALL);

                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_WALL);

                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_WALL);

                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);
                    })
                    .build());

    public static final ItemGroup MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(CustomMod.MOD_ID, "mod_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PENGUIN_SPAWN_EGG))
                    .displayName(Text.translatable("itemgroup.custommod.mod_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CAPYBARA_SPAWN_EGG);
                        entries.add(ModItems.PENGUIN_SPAWN_EGG);
                    }).build());

    public static void registerItemGroups()
    {
        CustomMod.LOGGER.info("Registering Item Groups for " + CustomMod.MOD_ID);
    }
}

