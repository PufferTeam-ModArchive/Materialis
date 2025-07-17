package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptRemove implements IScript {

    ArrayList<ItemStack> remove = new ArrayList<ItemStack>();

    public static final String[] itemsToRemove = new String[] { "minecraft:fence", "minecraft:fence_gate",
        "minecraft:wooden_door", "minecraft:trapdoor", "minecraft:sign" };

    public void run() {
        for (String s : itemsToRemove) {
            remove.add(ModItems.getItem(s));
        }

        for (int i = 0; i < Constants.woodTypes.length; i++) {
            removeSpecialWoodRecipes(Constants.woodTypes[i]);
        }

        for (int i = 0; i < Constants.bopWoodTypes.length; i++) {
            removeSpecialWoodRecipes(Constants.bopWoodTypes[i]);
        }

        // Remove at the end
        removeRecipe(remove);
    }

    public void removeSpecialWoodRecipes(String wood) {
        for (int i = 0; i < ModItems.BiblioBlocks.length; i++) {
            remove.add(ModItems.getModItem("bibliocraft", ModItems.BiblioBlocks[i], wood, 1));
        }
        for (int i = 0; i < ModItems.BiblioItems.length; i++) {
            remove.add(ModItems.getModItem("bibliocraft", ModItems.BiblioItems[i], wood, 1));
        }
    }
}
