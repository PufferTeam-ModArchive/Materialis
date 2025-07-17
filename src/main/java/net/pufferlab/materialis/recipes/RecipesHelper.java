package net.pufferlab.materialis.recipes;

import java.util.ArrayList;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesHelper {

    public static void removeRecipe(ArrayList<ItemStack> toRemove) {
        final ArrayList<IRecipe> recipes = (ArrayList<IRecipe>) CraftingManager.getInstance()
            .getRecipeList();
        recipes.removeIf(r -> {
            ItemStack rCopy = r.getRecipeOutput();
            if (rCopy == null) {
                return false;
            }
            if (rCopy.getItem() == null) {
                return true;
            }
            if (Utils.containsStack(rCopy, toRemove)) {
                return true;
            }
            return false;
        });
    }

    public static void addShapedRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, recipe));
    }

    public static void addShapelessRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(output, recipe));
    }

    public static boolean removeFurnaceSmelting(ItemStack aInput) {
        final Map<ItemStack, ItemStack> furnaceRecipe = FurnaceRecipes.smelting()
            .getSmeltingList();
        if (aInput != null) {
            for (ItemStack tInput : furnaceRecipe.keySet()) {
                if (Utils.isStackValid(tInput) && Utils.areStacksEqual(aInput, tInput, true)) {
                    furnaceRecipe.remove(tInput);
                    return true;
                }
            }
        }
        return false;
    }
}
