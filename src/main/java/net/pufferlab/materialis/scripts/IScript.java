package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Materialis;
import net.pufferlab.materialis.recipes.OreDictHelper;
import net.pufferlab.materialis.recipes.RecipesHelper;

public interface IScript {

    default void removeRecipe(ArrayList<ItemStack> toRemove) {
        try {
            RecipesHelper.removeRecipe(toRemove);
        } catch (Exception e) {
            Materialis.LOG.error("RemoveRecipe went wrong:");
            e.printStackTrace();
        }
    }

    default void removeOreDict(ItemStack toRemove, String oreDict) {
        try {
            OreDictHelper.removeOreDict(toRemove, oreDict);
        } catch (Exception e) {
            Materialis.LOG.error("RemoveOreDict went wrong:");
            e.printStackTrace();
        }
    }

    default void removeAllOreDict(ItemStack toRemove) {
        try {
            OreDictHelper.removeAllOreDict(toRemove);
        } catch (Exception e) {
            Materialis.LOG.error("RemoveAllOreDict went wrong:");
            e.printStackTrace();
        }
    }

    default void addOreDict(ItemStack toAdd, String oreDict) {
        try {
            OreDictHelper.addOreDict(toAdd, oreDict);
        } catch (Exception e) {
            Materialis.LOG.error("AddOreDict went wrong:");
            e.printStackTrace();
        }
    }

    default void addShapedRecipe(ItemStack aOutput, Object... inputs) {
        try {
            RecipesHelper.addShapedRecipe(aOutput, inputs);
        } catch (Exception e) {
            Materialis.LOG.error("ShapedRecipe went wrong:");
            e.printStackTrace();
        }
    }

    default void addShapelessRecipe(ItemStack aOutput, Object... inputs) {
        try {
            RecipesHelper.addShapelessRecipe(aOutput, inputs);
        } catch (Exception e) {
            Materialis.LOG.error("ShapelessRecipe went wrong:");
            e.printStackTrace();
        }
    }

    default void addSlabRecipe(ItemStack aOutput, ItemStack input) {
        try {
            RecipesHelper.addSlabRecipe(aOutput, input);
        } catch (Exception e) {
            Materialis.LOG.error("ShapedRecipe for Slab went wrong:");
            e.printStackTrace();
        }
    }

    default void addStairsRecipe(ItemStack aOutput, ItemStack input) {
        try {
            RecipesHelper.addStairsRecipe(aOutput, input);
        } catch (Exception e) {
            Materialis.LOG.error("ShapedRecipe for Stairs went wrong:");
            e.printStackTrace();
        }
    }
}
