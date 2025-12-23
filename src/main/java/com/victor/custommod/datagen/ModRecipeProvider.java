package com.victor.custommod.datagen;

//import com.nimbusds.oauth2.sdk.id.Identifier;
import com.victor.custommod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NotNull RecipeGenerator getRecipeGenerator(RegistryWrapper.@NotNull WrapperLookup wrapperLookup, @NotNull RecipeExporter recipeExporter) {
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
                createStairsRecipe(ModBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItem(Blocks.SMOOTH_STONE))
                        .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PACKED_MUD_STAIRS, Ingredient.ofItem(Blocks.PACKED_MUD))
                        .criterion(hasItem(Blocks.PACKED_MUD), conditionsFromItem(Blocks.PACKED_MUD))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.NETHERRACK_STAIRS, Ingredient.ofItem(Blocks.NETHERRACK))
                        .criterion(hasItem(Blocks.NETHERRACK), conditionsFromItem(Blocks.NETHERRACK))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.END_STONE_STAIRS, Ingredient.ofItem(Blocks.END_STONE))
                        .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.POLISHED_END_STONE_STAIRS, Ingredient.ofItem(ModBlocks.POLISHED_END_STONE))
                        .criterion(hasItem(ModBlocks.POLISHED_END_STONE), conditionsFromItem(ModBlocks.POLISHED_END_STONE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.QUARTZ_BRICK_STAIRS, Ingredient.ofItem(Blocks.QUARTZ_BRICKS))
                        .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItem(Blocks.CUT_SANDSTONE))
                        .criterion(hasItem(Blocks.CUT_SANDSTONE), conditionsFromItem(Blocks.CUT_SANDSTONE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItem(Blocks.CUT_RED_SANDSTONE))
                        .criterion(hasItem(Blocks.CUT_RED_SANDSTONE), conditionsFromItem(Blocks.CUT_RED_SANDSTONE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.WHITE_CONCRETE))
                        .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.GRAY_CONCRETE))
                        .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BLACK_CONCRETE))
                        .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.RED_CONCRETE))
                        .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.ORANGE_CONCRETE))
                        .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.YELLOW_CONCRETE))
                        .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIME_CONCRETE))
                        .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.GREEN_CONCRETE))
                        .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.CYAN_CONCRETE))
                        .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BLUE_CONCRETE))
                        .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.PURPLE_CONCRETE))
                        .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.MAGENTA_CONCRETE))
                        .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.PINK_CONCRETE))
                        .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItem(Blocks.BROWN_CONCRETE))
                        .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.TERRACOTTA))
                        .criterion(hasItem(Blocks.TERRACOTTA), conditionsFromItem(Blocks.TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.WHITE_TERRACOTTA))
                        .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.GRAY_TERRACOTTA))
                        .criterion(hasItem(Blocks.GRAY_TERRACOTTA), conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BLACK_TERRACOTTA))
                        .criterion(hasItem(Blocks.BLACK_TERRACOTTA), conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.RED_TERRACOTTA))
                        .criterion(hasItem(Blocks.RED_TERRACOTTA), conditionsFromItem(Blocks.RED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.ORANGE_TERRACOTTA))
                        .criterion(hasItem(Blocks.ORANGE_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.YELLOW_TERRACOTTA))
                        .criterion(hasItem(Blocks.YELLOW_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIME_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIME_TERRACOTTA), conditionsFromItem(Blocks.LIME_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.GREEN_TERRACOTTA))
                        .criterion(hasItem(Blocks.GREEN_TERRACOTTA), conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.CYAN_TERRACOTTA))
                        .criterion(hasItem(Blocks.CYAN_TERRACOTTA), conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BLUE_TERRACOTTA))
                        .criterion(hasItem(Blocks.BLUE_TERRACOTTA), conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.PURPLE_TERRACOTTA))
                        .criterion(hasItem(Blocks.PURPLE_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.MAGENTA_TERRACOTTA))
                        .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.PINK_TERRACOTTA))
                        .criterion(hasItem(Blocks.PINK_TERRACOTTA), conditionsFromItem(Blocks.PINK_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BROWN_TERRACOTTA))
                        .criterion(hasItem(Blocks.BROWN_TERRACOTTA), conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.WHITE_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.WHITE_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.WHITE_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.GRAY_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.GRAY_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.GRAY_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BLACK_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.BLACK_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.BLACK_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.RED_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.RED_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.RED_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.ORANGE_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.ORANGE_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.ORANGE_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.YELLOW_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.YELLOW_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.YELLOW_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIME_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIME_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.LIME_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.GREEN_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.GREEN_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.GREEN_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.CYAN_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.CYAN_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.CYAN_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BLUE_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.BLUE_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.BLUE_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.PURPLE_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.PURPLE_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.PURPLE_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.MAGENTA_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.MAGENTA_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.MAGENTA_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.PINK_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.PINK_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.PINK_GLAZED_TERRACOTTA))
                        .offerTo(exporter);
                createStairsRecipe(ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Ingredient.ofItem(Blocks.BROWN_GLAZED_TERRACOTTA))
                        .criterion(hasItem(Blocks.BROWN_GLAZED_TERRACOTTA), conditionsFromItem(Blocks.BROWN_GLAZED_TERRACOTTA))
                        .offerTo(exporter);


                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_WALL, ModBlocks.POLISHED_CALCITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, ModBlocks.POLISHED_END_STONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.WHITE_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GRAY_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.BLACK_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.RED_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.ORANGE_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.YELLOW_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.LIME_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GREEN_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.CYAN_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.BLUE_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.PURPLE_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.MAGENTA_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.PINK_GLAZED_TERRACOTTA);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.BROWN_GLAZED_TERRACOTTA);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE_SLAB, ModBlocks.POLISHED_CALCITE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, ModBlocks.POLISHED_END_STONE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);

                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA);

                createButtonRecipe(ModBlocks.POLISHED_CALCITE_BUTTON, Ingredient.ofItem(ModBlocks.POLISHED_CALCITE))
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(exporter);

                offerPressurePlateRecipe(ModBlocks.POLISHED_CALCITE_PRESSURE_PLATE, ModBlocks.POLISHED_CALCITE);
                offerPressurePlateRecipe(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Blocks.POLISHED_DEEPSLATE);

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
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, Blocks.STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERRACK_WALL, Blocks.NETHERRACK, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_STAIRS, Blocks.END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_SLAB, Blocks.END_STONE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.END_STONE_WALL, Blocks.END_STONE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, Blocks.END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_STAIRS, Blocks.END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_SLAB, Blocks.END_STONE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE_WALL, Blocks.END_STONE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, ModBlocks.POLISHED_END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_STAIRS, ModBlocks.POLISHED_END_STONE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_SLAB, ModBlocks.POLISHED_END_STONE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICK_WALL, ModBlocks.POLISHED_END_STONE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_STAIRS, Blocks.WHITE_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_SLAB, Blocks.WHITE_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_GLAZED_TERRACOTTA_WALL, Blocks.WHITE_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_STAIRS, Blocks.GRAY_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_SLAB, Blocks.GRAY_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_GLAZED_TERRACOTTA_WALL, Blocks.GRAY_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_STAIRS, Blocks.BLACK_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_SLAB, Blocks.BLACK_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_GLAZED_TERRACOTTA_WALL, Blocks.BLACK_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_STAIRS, Blocks.RED_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_SLAB, Blocks.RED_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_GLAZED_TERRACOTTA_WALL, Blocks.RED_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_STAIRS, Blocks.ORANGE_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_SLAB, Blocks.ORANGE_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_GLAZED_TERRACOTTA_WALL, Blocks.ORANGE_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_STAIRS, Blocks.YELLOW_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_SLAB, Blocks.YELLOW_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_GLAZED_TERRACOTTA_WALL, Blocks.YELLOW_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_STAIRS, Blocks.LIME_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_SLAB, Blocks.LIME_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_GLAZED_TERRACOTTA_WALL, Blocks.LIME_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_STAIRS, Blocks.GREEN_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_SLAB, Blocks.GREEN_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_GLAZED_TERRACOTTA_WALL, Blocks.GREEN_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_STAIRS, Blocks.CYAN_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_SLAB, Blocks.CYAN_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_GLAZED_TERRACOTTA_WALL, Blocks.CYAN_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_STAIRS, Blocks.BLUE_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_SLAB, Blocks.BLUE_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_GLAZED_TERRACOTTA_WALL, Blocks.BLUE_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_STAIRS, Blocks.PURPLE_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_SLAB, Blocks.PURPLE_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_GLAZED_TERRACOTTA_WALL, Blocks.PURPLE_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_STAIRS, Blocks.MAGENTA_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_SLAB, Blocks.MAGENTA_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_GLAZED_TERRACOTTA_WALL, Blocks.MAGENTA_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_STAIRS, Blocks.PINK_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_SLAB, Blocks.PINK_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GLAZED_TERRACOTTA_WALL, Blocks.PINK_GLAZED_TERRACOTTA, 1);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_STAIRS, Blocks.BROWN_GLAZED_TERRACOTTA, 1);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_SLAB, Blocks.BROWN_GLAZED_TERRACOTTA, 2);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_GLAZED_TERRACOTTA_WALL, Blocks.BROWN_GLAZED_TERRACOTTA, 1);



                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', Blocks.CALCITE)
                        .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', ModBlocks.POLISHED_CALCITE)
                        .criterion(hasItem(ModBlocks.POLISHED_CALCITE), conditionsFromItem(ModBlocks.POLISHED_CALCITE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_END_STONE, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', Blocks.END_STONE)
                        .criterion(hasItem(Blocks.END_STONE), conditionsFromItem(Blocks.END_STONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.END_STONE_BRICKS, 4)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', ModBlocks.POLISHED_END_STONE)
                        .criterion(hasItem(ModBlocks.POLISHED_END_STONE), conditionsFromItem(ModBlocks.POLISHED_END_STONE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.REDSTONE, ModBlocks.GOLD_TRAPDOOR, 1)
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.REDSTONE, ModBlocks.GOLD_DOOR, 3)
                        .pattern("RR")
                        .pattern("RR")
                        .pattern("RR")
                        .input('R', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
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
