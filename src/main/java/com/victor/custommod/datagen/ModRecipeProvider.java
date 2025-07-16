package com.victor.custommod.datagen;

import com.victor.custommod.block.ModBlocks;
import com.victor.custommod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                List<ItemConvertible> TEMPLATE_ITEM_SMELTABLES = List.of(ModItems.TEMPLATE_RAW_ORE, ModBlocks.TEMPLATE_STONE_ORE, ModBlocks.TEMPLATE_DEEPSLATE_ORE);

                offerSmelting(TEMPLATE_ITEM_SMELTABLES, RecipeCategory.MISC, ModItems.TEMPLATE_ITEM, 0.25f, 200, "template_item");
                offerBlasting(TEMPLATE_ITEM_SMELTABLES, RecipeCategory.MISC, ModItems.TEMPLATE_ITEM, 0.25f, 100, "template_item");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TEMPLATE_ITEM, RecipeCategory.DECORATIONS, ModBlocks.TEMPLATE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TEMPLATE_RAW_ORE, RecipeCategory.DECORATIONS, ModBlocks.TEMPLATE_RAW_ORE_BLOCK);

                createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);

                createButtonRecipe(ModBlocks.CALCITE_BUTTON, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.CALCITE_PRESSURE_PLATE, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE, 1);

                /*
                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS)
                        .pattern("R  ")
                        .pattern("RR ")
                        .pattern("RRR")
                        .input('R', net.minecraft.block.Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_STAIRS)
                        .pattern("RRR")
                        .input('R', net.minecraft.block.Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                createShapeless();
                */
            }
        };
    }

    @Override
    public String getName() {
        return "CustomMod Recipes";
    }
}
