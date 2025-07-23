package net.pufferlab.materialis.recipes;

import java.util.*;

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
        ArrayList<IRecipe> recipes = (ArrayList<IRecipe>) CraftingManager.getInstance()
            .getRecipeList();
        recipes.removeIf(r -> {
            ItemStack rCopy = r.getRecipeOutput();
            if (rCopy == null) {
                return false;
            }
            if (rCopy.getItem() == null) {
                return true;
            }
            if (rCopy.stackTagCompound != null) {
                rCopy = rCopy.copy();
                rCopy.stackTagCompound = null;
            }
            for (ItemStack i : toRemove) {
                if (Utils.containsStack(rCopy, i)) {
                    return true;
                }
            }
            return false;
        });
    }

    @Deprecated
    public static void removeRecipe(ItemStack toRemove) {
        ArrayList<IRecipe> recipes = (ArrayList<IRecipe>) CraftingManager.getInstance()
            .getRecipeList();
        for (int scan = 0; scan < recipes.size(); scan++) {
            ItemStack rCopy = recipes.get(scan)
                .getRecipeOutput();
            if (Utils.containsStack(rCopy, toRemove)) {
                recipes.remove(scan);
            }
        } ;
    }

    public static void addShapedRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, recipe));
    }

    public static void addShapelessRecipe(ItemStack output, Object... recipe) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(output, recipe));
    }

    public static void removeFurnaceSmelting(ArrayList<ItemStack> toRemove) {
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting()
            .getSmeltingList();
        recipes.entrySet()
            .removeIf(r -> {
                ItemStack rCopy = r.getValue();
                for (ItemStack i : toRemove) {
                    if (Utils.containsStack(rCopy, i)) {
                        return true;
                    }
                }
                return false;
            });
    }

    @Deprecated
    public static void removeFurnaceSmelting(ItemStack resultItem) {
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting()
            .getSmeltingList();
        for (Iterator<Map.Entry<ItemStack, ItemStack>> entries = recipes.entrySet()
            .iterator(); entries.hasNext();) {
            Map.Entry<ItemStack, ItemStack> entry = entries.next();
            ItemStack result = entry.getValue();
            if (Utils.containsStack(result, resultItem)) {
                entries.remove();
            }
        }
    }

    public static void addFurnaceSmelting(ItemStack output, ItemStack input, float xp) {
        GameRegistry.addSmelting(input, output, xp);
    }

    public static void addSlabRecipe(ItemStack slab, ItemStack block) {
        addShapedRecipe(slab, "PPP", 'P', block);
    }

    public static void addStairsRecipe(ItemStack stairs, ItemStack block) {
        addShapedRecipe(stairs, "P  ", "PP ", "PPP", 'P', block);
    }

    public static void addWallRecipe(ItemStack wall, ItemStack block) {
        addShapedRecipe(wall, "PPP", "PPP", 'P', block);
    }
}
