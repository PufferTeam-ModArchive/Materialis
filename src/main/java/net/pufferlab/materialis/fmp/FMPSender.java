package net.pufferlab.materialis.fmp;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.event.FMLInterModComms;

public class FMPSender {

    public static void registerFMP(Block block) {
        registerFMP(block, 0, 15);
    }

    public static void registerFMP(Block block, int minMeta, int maxMeta) {
        for (int c = minMeta; c <= maxMeta; c++) {
            registerFMP(block, c);
        }
    }

    public static void registerFMP(Block block, int meta) {
        FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", new ItemStack(block, 1, meta));
    }

    public static void registerFMP(ItemStack stack) {
        FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", stack);
    }
}
