package net.pufferlab.materialis.recipes;

import net.minecraft.item.ItemStack;

import blusunrize.immersiveengineering.api.crafting.ArcFurnaceRecipe;
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

    public static void addArcFurnaceRecipe(ItemStack output, Object input, ItemStack slag, int time, int energyPerTick,
        Object... additives) {
        ArcFurnaceRecipe.addRecipe(output, input, (ItemStack) slag, time, energyPerTick, additives);
    }

    public static void addArcFurnaceRecipe(String recipeType, ItemStack output, Object input, ItemStack slag, int time,
        int energyPerTick, Object... additives) {
        ArcFurnaceRecipe.addRecipe(output, input, (ItemStack) slag, time, energyPerTick, additives)
            .setSpecialRecipeType(recipeType);
    }

    public static void removeAllArcFurnaceRecipes() {
        ArcFurnaceRecipe.recipeList.clear();
    }
}
