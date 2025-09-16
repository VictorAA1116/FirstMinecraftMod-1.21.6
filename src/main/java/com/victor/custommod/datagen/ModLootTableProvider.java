package com.victor.custommod.datagen;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.entity.ModEntities;
import com.victor.custommod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CALCITE_SLAB, slabDrops(ModBlocks.CALCITE_SLAB));
        addDrop(ModBlocks.CALCITE_STAIRS);
        addDrop(ModBlocks.CALCITE_WALL);
        addDrop(ModBlocks.CALCITE_BUTTON);
        addDrop(ModBlocks.CALCITE_PRESSURE_PLATE);

        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.POLISHED_CALCITE_SLAB, slabDrops(ModBlocks.POLISHED_CALCITE_SLAB));
        addDrop(ModBlocks.POLISHED_CALCITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CALCITE_WALL);

        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_BRICK_SLAB, slabDrops(ModBlocks.CALCITE_BRICK_SLAB));
        addDrop(ModBlocks.CALCITE_BRICK_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICK_WALL);

        addDrop(ModBlocks.AMETHYST_SLAB, slabDrops(ModBlocks.AMETHYST_SLAB));
        addDrop(ModBlocks.AMETHYST_STAIRS);

        addDrop(ModBlocks.SMOOTH_BASALT_SLAB, slabDrops(ModBlocks.SMOOTH_BASALT_SLAB));
        addDrop(ModBlocks.SMOOTH_BASALT_STAIRS);

        addDrop(ModBlocks.STONE_WALL);

        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

        addDrop(ModBlocks.PACKED_MUD_STAIRS);
        addDrop(ModBlocks.PACKED_MUD_WALL);
        addDrop(ModBlocks.PACKED_MUD_SLAB, slabDrops(ModBlocks.PACKED_MUD_SLAB));

        addDrop(ModBlocks.SMOOTH_SANDSTONE_WALL);
        addDrop(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        addDrop(ModBlocks.PURPUR_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);

        addDrop(ModBlocks.NETHERRACK_STAIRS);
        addDrop(ModBlocks.NETHERRACK_SLAB, slabDrops(ModBlocks.NETHERRACK_SLAB));
        addDrop(ModBlocks.NETHERRACK_WALL);

        addDrop(ModBlocks.END_STONE_STAIRS);
        addDrop(ModBlocks.END_STONE_SLAB, slabDrops(ModBlocks.END_STONE_SLAB));
        addDrop(ModBlocks.END_STONE_WALL);

        addDrop(ModBlocks.POLISHED_END_STONE);
        addDrop(ModBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_END_STONE_SLAB, slabDrops(ModBlocks.POLISHED_END_STONE_SLAB));
        addDrop(ModBlocks.POLISHED_END_STONE_WALL);

        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);

        addDrop(ModBlocks.QUARTZ_WALL);
        addDrop(ModBlocks.SMOOTH_QUARTZ_WALL);
        addDrop(ModBlocks.SMOOTH_BASALT_WALL);

        addDrop(ModBlocks.QUARTZ_BRICK_SLAB, slabDrops(ModBlocks.QUARTZ_BRICK_SLAB));
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(ModBlocks.QUARTZ_BRICK_WALL);

        addDrop(ModBlocks.GOLD_TRAPDOOR);
        addDrop(ModBlocks.GOLD_DOOR, doorDrops(ModBlocks.GOLD_DOOR));

        addDrop(ModBlocks.CUT_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_SANDSTONE_WALL);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_STAIRS);
        addDrop(ModBlocks.CUT_RED_SANDSTONE_WALL);

        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);

        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_WALL);

        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_WALL);

        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_WALL);

        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_WALL);

        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_WALL);

        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_WALL);

        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);

        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_WALL);

        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_WALL);

        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_WALL);

        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_WALL);

        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_WALL);

        addDrop(ModBlocks.TERRACOTTA_SLAB, slabDrops(ModBlocks.TERRACOTTA_SLAB));
        addDrop(ModBlocks.TERRACOTTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_WALL);

        addDrop(ModBlocks.WHITE_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

        addDrop(ModBlocks.GRAY_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLACK_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_TERRACOTTA_WALL);

        addDrop(ModBlocks.RED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_TERRACOTTA_WALL);

        addDrop(ModBlocks.ORANGE_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_WALL);

        addDrop(ModBlocks.YELLOW_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIME_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_TERRACOTTA_WALL);

        addDrop(ModBlocks.GREEN_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLUE_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_TERRACOTTA_WALL);

        addDrop(ModBlocks.PURPLE_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_WALL);

        addDrop(ModBlocks.MAGENTA_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_WALL);

        addDrop(ModBlocks.PINK_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_TERRACOTTA_WALL);

        addDrop(ModBlocks.BROWN_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_TERRACOTTA_WALL);

        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.RED_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.RED_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIME_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.PINK_GLAZED_TERRACOTTA_WALL);

        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, slabDrops(ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB));
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS);
        addDrop(ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL);
    }

    /*
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
    */
}
