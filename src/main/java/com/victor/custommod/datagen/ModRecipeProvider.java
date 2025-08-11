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
                createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.POLISHED_CALCITE_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_CALCITE))
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.ofItem(ModBlocks.CALCITE_BRICKS))
                        .criterion(hasItem(ModBlocks.CALCITE_BRICKS), conditionsFromItem(ModBlocks.CALCITE_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.AMETHYST_STAIRS, Ingredient.ofItem(Blocks.AMETHYST_BLOCK))
                        .criterion(hasItem(Blocks.AMETHYST_BLOCK), conditionsFromItem(Blocks.AMETHYST_BLOCK))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItem(Blocks.SMOOTH_BASALT))
                        .criterion(hasItem(Blocks.SMOOTH_BASALT), conditionsFromItem(Blocks.SMOOTH_BASALT))
                        .offerTo(exporter);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);

                createButtonRecipe(ModBlocks.CALCITE_BUTTON, Ingredient.ofItem(Blocks.CALCITE))
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.CALCITE_PRESSURE_PLATE, Blocks.CALCITE);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.POLISHED_CALCITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.POLISHED_CALCITE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.POLISHED_CALCITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.CALCITE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_STAIRS, ModBlocks.CALCITE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT, 2);


                createShaped(RecipeCategory.MISC, ModBlocks.POLISHED_CALCITE, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', net.minecraft.block.Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModBlocks.CALCITE_BRICKS, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(exporter);

                // createShapeless();
            }
        };
    }

    @Override
    public String getName() {
        return "CustomMod Recipes";
    }
}
