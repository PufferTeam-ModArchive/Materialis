package net.pufferlab.materialis.recipes;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import tconstruct.library.crafting.Smeltery;

public class TinkerHelper {

    public static void addMeltingRecipe(FluidStack output, ItemStack input, int temperature, Block block, int meta) {
        Smeltery.addMelting(input, block, meta, temperature, output);
    }

    public static void removeAllMeltingRecipes() {
        Smeltery.getSmeltingList()
            .clear();
    }
}
