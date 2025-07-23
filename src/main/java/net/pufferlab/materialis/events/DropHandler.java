package net.pufferlab.materialis.events;

import static net.pufferlab.materialis.recipes.ModItems.*;

import net.minecraft.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

import com.chaosthedude.realistictorches.blocks.BlockTorchLit;
import com.chaosthedude.realistictorches.blocks.BlockTorchSmoldering;
import com.chaosthedude.realistictorches.blocks.BlockTorchUnlit;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import team.chisel.block.BlockCarvable;

public class DropHandler {

    @SubscribeEvent
    public void harvestDropsEvent(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;
        int meta = event.blockMetadata;
        if (Utils.containsExactMatch(BaseOreBlocks, block) || Utils.containsExactMatch(BaseDeepslateOreBlocks, block)) {
            String oreName = Utils.getItemFromArray(BaseOreBlocksName, BaseOreBlocks, BaseOreBlocks_IDs, block, meta);
            if (Utils.containsExactMatch(BaseDeepslateOreBlocks, block)) {
                oreName = Utils
                    .getItemFromArray(BaseOreBlocksName, BaseDeepslateOreBlocks, BaseDeepslateBlocks_IDs, block, meta);
            }
            if (oreName != null) {
                event.drops.clear();
                event.drops.add(ModItems.getItem(Utils.getItemFromArray(BaseOreBlocksName, BaseRawOreItems, oreName)));
            }

        }
        if (block instanceof BlockCarvable) {
            if (Utils.containsOreDict(block, StoneBlocksName)) {
                String oreDict = Utils.getOreDictInList(block, StoneBlocksName);
                if (oreDict != null) {
                    event.drops.clear();
                    event.drops
                        .add(ModItems.getItem(Utils.getItemFromArray(StoneBlocksName, CobblestoneBlocks, oreDict)));
                }
            }
        }
        if (block instanceof BlockTorchLit) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("RealisticTorches:TorchLit:0:1"));
        }
        if (block instanceof BlockTorchSmoldering) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("RealisticTorches:TorchSmoldering:0:1"));
        }
        if (block instanceof BlockTorchUnlit) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("RealisticTorches:TorchUnlit:0:1"));
        }
    }
}
