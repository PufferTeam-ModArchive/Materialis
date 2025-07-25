package net.pufferlab.materialis.events;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CraftingHandler {

    @SubscribeEvent
    public void handleCrafting(PlayerEvent.ItemCraftedEvent event) {
        if (Utils.containsOreDict(event.crafting.getItem(), "logWood")) {
            for (int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
                ItemStack item = event.craftMatrix.getStackInSlot(i);
                if (item != null && Utils.containsOreDict(item, "toolAxe")
                    && item.getItemDamage() < item.getMaxDamage()) {
                    ItemStack modifiedAxe = item.copy();
                    modifiedAxe.setItemDamage(modifiedAxe.getItemDamage() + 1);
                    modifiedAxe.stackSize += modifiedAxe.stackSize;

                    event.craftMatrix.setInventorySlotContents(i, modifiedAxe);
                }
            }
        }
    }
}
