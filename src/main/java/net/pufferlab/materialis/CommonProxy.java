package net.pufferlab.materialis;

import static net.minecraftforge.event.entity.player.PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import org.lwjgl.opengl.Display;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {

    // preInit "Run before anything else. Read your config, create blocks, items,
    // etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());
        if (event.getSide() == Side.CLIENT) {
            Display.setTitle("Thaumcraft: Unseen Realm");
        }

        Materialis.LOG.info(Config.greeting);
        Materialis.LOG.info("I am MyMod at version " + Tags.VERSION);
    }

    // load "Do your mod setup. Build whatever data structures you care about.
    // Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    // postInit "Handle interaction with other mods, complete your setup based on
    // this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}

    // prevent wood/rocks from being destroyed by hand & make dirt slower to mine at
    @SubscribeEvent
    public void setBreakSpeed(PlayerEvent.BreakSpeed event) {
        ItemStack heldItem = event.entityPlayer.inventory.getCurrentItem();

        if (Utils.containsOreDict(event.block, "logWood")) {
            if (heldItem == null || !Utils.containsOreDict(heldItem, "toolAxe")) {
                event.setCanceled(true);
            }
        }

        if (event.block.getHarvestTool(event.metadata) == "shovel") {
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
                if (block.getHarvestTool(blockMeta) == "pickaxe") {
                    int heldItemSlot = event.entityPlayer.inventory.currentItem;
                    ItemStack outputItem = new ItemStack(Materialis.misc, 2, 0);
                    // EntityItem entityitem = new EntityItem(event.world, event.x, event.y + 1, event.z, outputItem);
                    // event.world.spawnEntityInWorld(entityitem);
                    event.entityPlayer.inventory.decrStackSize(heldItemSlot, 1);
                    event.entityPlayer.swingItem();
                    event.entityPlayer.playSound("dig.stone", 1.0F, 1.0F);
                    if (event.entityPlayer.inventory.addItemStackToInventory(outputItem) == false) {
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
