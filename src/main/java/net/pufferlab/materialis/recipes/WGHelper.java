package net.pufferlab.materialis.recipes;

import net.minecraft.item.ItemStack;

import witchinggadgets.common.util.recipe.InfernalBlastfurnaceRecipe;

public class WGHelper {

    public static void addInfernalBlastFurnaceRecipe(ItemStack output, Object input, int time, boolean isSpecial) {
        InfernalBlastfurnaceRecipe recipe = new InfernalBlastfurnaceRecipe(output, input, time, isSpecial);
        InfernalBlastfurnaceRecipe.addRecipe(recipe);
    }

    public static void removeAllInfernalBlastFurnaceRecipes() {
        InfernalBlastfurnaceRecipe.recipes.clear();
    }
}
