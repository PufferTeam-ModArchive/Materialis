package net.pufferlab.materialis.recipes;

import net.minecraft.item.ItemStack;

import blusunrize.immersiveengineering.api.crafting.CrusherRecipe;
import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;

public class IEHelper {

    public static void addPressRecipe(ItemStack output, ItemStack input, ItemStack mold, int energy) {
        MetalPressRecipe.addRecipe(output, input, mold, energy);
    }

    public static void removeAllPressRecipes() {
        MetalPressRecipe.recipeList.clear();
    }

    public static void addCrusherRecipe(ItemStack output, ItemStack input, int energy) {
        CrusherRecipe.addRecipe(output, input, energy);
    }

    public static void removeAllCrusherRecipes() {
        CrusherRecipe.recipeList.clear();
    }
}
