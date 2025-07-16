package net.pufferlab.materialis.recipes;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.common.registry.GameRegistry;

public class VanillaRecipes {

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
            if (Utils.containsWildcard(rCopy, toRemove)) {
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
}
