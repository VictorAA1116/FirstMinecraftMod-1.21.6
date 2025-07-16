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

    public static final ItemGroup TEMPLATE_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(CustomMod.MOD_ID, "template_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEMPLATE_ITEM))
                    .displayName(Text.translatable("itemgroup.custommod.template_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEMPLATE_ITEM);
                        entries.add(ModItems.TEMPLATE_RAW_ORE);
                        entries.add(ModBlocks.TEMPLATE_BLOCK);
                        entries.add(ModBlocks.TEMPLATE_RAW_ORE_BLOCK);
                        entries.add(ModBlocks.TEMPLATE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.TEMPLATE_STONE_ORE);
                    })
                    .build());

    public static void registerItemGroups()
    {
        CustomMod.LOGGER.info("Registering Item Groups for " + CustomMod.MOD_ID);
    }
}

