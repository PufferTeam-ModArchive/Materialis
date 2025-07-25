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

    public static void addCrusherRecipe(ItemStack output, ItemStack input, int energy, Object... secondary) {
        CrusherRecipe r = CrusherRecipe.addRecipe(output, input, energy);
        if (secondary != null && secondary.length > 0) {
            r.addToSecondaryOutput(secondary);
        }
    }

    public static void removeAllCrusherRecipes() {
        CrusherRecipe.recipeList.clear();
    }
}
