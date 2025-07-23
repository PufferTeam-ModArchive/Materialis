package net.pufferlab.materialis.scripts;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptCutting implements IScript {

    public void run() {
        for (String s : ModItems.CuttingBlocksFull) {
            String slab = Utils.getItemFromArray(ModItems.CuttingBlocksFull, ModItems.CuttingBlocksSlab, s);
            String stairs = Utils.getItemFromArray(ModItems.CuttingBlocksFull, ModItems.CuttingBlocksStairs, s);
            String wall = Utils.getItemFromArray(ModItems.CuttingBlocksFull, ModItems.CuttingBlocksWall, s);
            addCuttingRecipes(s, slab, stairs, wall);
        }
    }

    public void addCuttingRecipes(String full, String slab, String stairs, String wall) {
        ItemStack fullBlock = ModItems.getItem(full + ":1");

        if (slab != null) {
            ItemStack slabBlock = ModItems.getItem(slab + ":6");
            addSlabRecipe(slabBlock, fullBlock);
            addShapedRecipe(ModItems.getItem(full + ":1"), "L", "L", 'L', ModItems.getItem(slab + ":1"));
        }
        if (stairs != null) {
            ItemStack stairsBlock = ModItems.getItem(stairs + ":8");
            addStairsRecipe(stairsBlock, fullBlock);
            addShapedRecipe(ModItems.getItem(full + ":3"), "LL", "LL", 'L', ModItems.getItem(stairs + ":1"));
        }
        if (wall != null) {
            ItemStack wallBlock = ModItems.getItem(wall + ":6");
            addWallRecipe(wallBlock, fullBlock);
        }
    }
}
