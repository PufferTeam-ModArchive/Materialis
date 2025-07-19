package net.pufferlab.materialis.events;

import static net.pufferlab.materialis.recipes.ModItems.*;

import net.minecraft.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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
            event.drops.clear();
            event.drops.add(ModItems.getItem(Utils.getItemFromArray(BaseOreBlocksName, BaseRawOreItems, oreName)));
        }
    }
}
