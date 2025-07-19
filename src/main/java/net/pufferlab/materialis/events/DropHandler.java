package net.pufferlab.materialis.events;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent;
import net.pufferlab.materialis.Registry;
import net.pufferlab.materialis.recipes.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ganymedes01.etfuturum.ModBlocks;

public class DropHandler {

    @SubscribeEvent
    public void harvestDropsEvent(BlockEvent.HarvestDropsEvent event) {
        Block block = event.block;
        int meta = event.blockMetadata;
        if ((block == Blocks.iron_ore) || (block == ModBlocks.DEEPSLATE_IRON_ORE.get())) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("etfuturum:raw_ore:1:1"));
        } else if ((block == Blocks.gold_ore) || (block == ModBlocks.DEEPSLATE_GOLD_ORE.get())) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("etfuturum:raw_ore:2:1"));
        } else if ((block == Registry.ore && meta == 0) || (block == ModBlocks.DEEPSLATE_COPPER_ORE.get())) {
            event.drops.clear();
            event.drops.add(ModItems.getItem("etfuturum:raw_ore:0:1"));
        } else
            if ((block == Registry.ore && meta == 1) || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 1)) {
                event.drops.clear();
                event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:1:1"));
            } else if ((block == Registry.ore && meta == 2)
                || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 2)) {
                    event.drops.clear();
                    event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:2:1"));
                } else if ((block == Registry.ore && meta == 3)
                    || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 3)) {
                        event.drops.clear();
                        event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:3:1"));
                    } else if ((block == Registry.ore && meta == 4)
                        || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 4)) {
                            event.drops.clear();
                            event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:4:1"));
                        } else if ((block == Registry.ore && meta == 5)
                            || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 5)) {
                                event.drops.clear();
                                event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:5:1"));
                            } else if ((block == Registry.ore && meta == 7)
                                || (block == ModBlocks.MODDED_DEEPSLATE_ORE.get() && meta == 0)) {
                                    event.drops.clear();
                                    event.drops.add(ModItems.getItem("etfuturum:modded_raw_ore:0:1"));
                                }
    }
}
