package com.victor.custommod.util;

import com.victor.custommod.CustomMod;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CUSTOM_BLOCKS = createTag("custom_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CustomMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CUSTOM_ITEMS = createTag("custom_items");

        public static final TagKey<Item> CAPYBARA_FOODS = createTag("capybara_foods");

        public static final TagKey<Item> PENGUIN_FOODS = createTag("penguin_foods");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CustomMod.MOD_ID, name));
        }
    }
}
