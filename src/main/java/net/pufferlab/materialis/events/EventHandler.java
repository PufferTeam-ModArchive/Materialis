package net.pufferlab.materialis.events;

import static net.minecraftforge.event.entity.player.PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.pufferlab.materialis.Registry;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHandler {

    // prevent wood/rocks from being destroyed by hand & make dirt slower to mine at
    @SubscribeEvent
    public void setBreakSpeed(PlayerEvent.BreakSpeed event) {
        ItemStack heldItem = event.entityPlayer.inventory.getCurrentItem();

        if (Utils.containsOreDict(event.block, "logWood")) {
            if (heldItem == null || !Utils.containsOreDict(heldItem, "toolAxe")) {
                event.setCanceled(true);
            }
        }

        if (event.block.getHarvestTool(event.metadata)
            .equals("shovel")) {
            if (heldItem == null || !Utils.containsOreDict(heldItem, "toolShovel")) {
                event.newSpeed = event.originalSpeed / 2;
            }
        }

    }

    @SubscribeEvent
    public void playerInteractEventHandler(PlayerInteractEvent event) {
        if (event.action == RIGHT_CLICK_BLOCK) {
            ItemStack heldItem = event.entityPlayer.inventory.getCurrentItem();
            if (Utils.containsOreDict(heldItem, "flint")) {
                Block block = event.world.getBlock(event.x, event.y, event.z);
                int blockMeta = event.world.getBlockMetadata(event.x, event.y, event.z);
                if (block.getHarvestTool(blockMeta)
                    .equals("pickaxe")) {
                    int heldItemSlot = event.entityPlayer.inventory.currentItem;
                    ItemStack outputItem = new ItemStack(Registry.misc, 2, 0);
                    // EntityItem entityitem = new EntityItem(event.world, event.x, event.y + 1, event.z, outputItem);
                    // event.world.spawnEntityInWorld(entityitem);
                    event.entityPlayer.inventory.decrStackSize(heldItemSlot, 1);
                    event.entityPlayer.swingItem();
                    event.entityPlayer.playSound("dig.stone", 1.0F, 1.0F);
                    if (!event.entityPlayer.inventory.addItemStackToInventory(outputItem)) {
                        if (!event.world.isRemote) {
                            event.entityPlayer.entityDropItem(outputItem, 0.0F);
                        }
                    } else {
                        event.entityPlayer.inventory.addItemStackToInventory(outputItem);
                    }
                }

            }
        }
    }
}
