package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Materialis;

public interface IScript {

    default boolean removeRecipe(ArrayList<ItemStack> toRemove) {
        try {
            net.pufferlab.materialis.recipes.VanillaRecipes.removeRecipe(toRemove);
        } catch (Exception e) {
            Materialis.LOG.error("RemoveRecipe went wrong:");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    default boolean addShapedRecipe(ItemStack aOutput, Object... inputs) {
        try {
            net.pufferlab.materialis.recipes.VanillaRecipes.addShapedRecipe(aOutput, inputs);
        } catch (Exception e) {
            Materialis.LOG.error("ShapedRecipe went wrong:");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    default boolean addShapelessRecipe(ItemStack aOutput, Object... inputs) {
        try {
            net.pufferlab.materialis.recipes.VanillaRecipes.addShapelessRecipe(aOutput, inputs);
        } catch (Exception e) {
            Materialis.LOG.error("ShapedRecipe went wrong:");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
