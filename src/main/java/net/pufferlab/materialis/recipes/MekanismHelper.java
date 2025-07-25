package net.pufferlab.materialis.recipes;

import net.minecraft.item.ItemStack;

import mekanism.common.recipe.RecipeHandler;

public class MekanismHelper {

    public static void addEnrichmentRecipe(ItemStack output, ItemStack input) {
        RecipeHandler.addEnrichmentChamberRecipe(input, output);
    }

    public static void removeAllEnrichmentRecipes() {
        RecipeHandler.Recipe.ENRICHMENT_CHAMBER.get()
            .clear();
    }

    public static void addCrusherRecipe(ItemStack output, ItemStack input) {
        RecipeHandler.addCrusherRecipe(input, output);
    }

    public static void removeAllCrusherRecipes() {
        RecipeHandler.Recipe.CRUSHER.get()
            .clear();
    }

    public static void addSawmillRecipe(ItemStack output, ItemStack input) {
        RecipeHandler.addPrecisionSawmillRecipe(input, output);
    }

    public static void addSawmillRecipe(ItemStack output, ItemStack secondaryOutput, int chance, ItemStack input) {
        RecipeHandler.addPrecisionSawmillRecipe(input, output, secondaryOutput, chance);
    }

    public static void removeAllSawmillRecipes() {
        RecipeHandler.Recipe.PRECISION_SAWMILL.get()
            .clear();
    }
}
