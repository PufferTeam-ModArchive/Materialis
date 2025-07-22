package net.pufferlab.materialis.scripts;

import static net.minecraft.block.Block.soundTypeWood;
import static net.pufferlab.materialis.recipes.ModItems.CobblestoneBlocks;
import static net.pufferlab.materialis.recipes.ModItems.StoneBlocksName;

import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

import com.chaosthedude.realistictorches.RealisticTorchesBlocks;

import ganymedes01.etfuturum.ModBlocks;

public class ScriptMisc implements IScript {

    public void run() {
        for (String s : ModItems.StoneBlocksName) {
            addStoneRecipes(s);
        }

        ModBlocks.DEEPSLATE_COPPER_ORE.get()
            .setHarvestLevel("pickaxe", 0);
        RealisticTorchesBlocks.torchLit.setStepSound(soundTypeWood);
        RealisticTorchesBlocks.torchSmoldering.setStepSound(soundTypeWood);
        RealisticTorchesBlocks.torchUnlit.setStepSound(soundTypeWood);
    }

    public void addStoneRecipes(String stone) {
        addFurnaceSmelting(
            ModItems.getItem("chisel:" + stone + ":0:1"),
            ModItems.getItem(Utils.getItemFromArray(StoneBlocksName, CobblestoneBlocks, stone) + ":1"),
            0);
    }
}
