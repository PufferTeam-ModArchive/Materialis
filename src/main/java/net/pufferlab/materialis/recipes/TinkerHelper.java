package net.pufferlab.materialis.recipes;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.Smeltery;

public class TinkerHelper {

    public static void addTableCastingRecipe(ItemStack output, FluidStack metal, ItemStack cast, boolean consume,
        int delay) {
        TConstructRegistry.getTableCasting()
            .addCastingRecipe(output, metal, cast, consume, delay);
    }

    public static void addTableCastingRecipe(ItemStack output, FluidStack metal, boolean consume, int delay) {
        TConstructRegistry.getTableCasting()
            .addCastingRecipe(output, metal, (ItemStack) null, consume, delay);
    }

    public static void addBasinTableRecipe(ItemStack output, FluidStack metal, int delay) {
        TConstructRegistry.getBasinCasting()
            .addCastingRecipe(output, metal, delay);
    }

    public static void addMeltingRecipe(FluidStack output, ItemStack input, int temperature, ItemStack stack) {
        Smeltery.addMelting(
            input,
            ((ItemBlock) stack.getItem()).field_150939_a,
            stack.getItemDamage(),
            temperature,
            output);
    }

    public static void removeAllMeltingRecipes() {
        Smeltery.getSmeltingList()
            .clear();
    }

    public static void removeAllCastingRecipes() {
        TConstructRegistry.getBasinCasting()
            .getCastingRecipes()
            .clear();
        TConstructRegistry.getTableCasting()
            .getCastingRecipes()
            .clear();
    }

}
