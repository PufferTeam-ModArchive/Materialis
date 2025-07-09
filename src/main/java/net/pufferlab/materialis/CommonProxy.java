package net.pufferlab.materialis;

import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

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
    // hand
    @SubscribeEvent
    public void setBreakSpeed(PlayerEvent.BreakSpeed event) {

        if (Utils.containsOreDict(event.block, "logWood")) {
            if (event.entityPlayer.getCurrentEquippedItem() == null
                || !ForgeHooks.isToolEffective(event.entityPlayer.getCurrentEquippedItem(), event.block, event.metadata)
                || !Utils.containsOreDict(event.entityPlayer.getCurrentEquippedItem(), "toolAxe")) {
                event.setCanceled(true);
            }
        }

        if (event.block.getHarvestTool(event.metadata) == "shovel") {
            if (event.entityPlayer.getCurrentEquippedItem() == null
                || !ForgeHooks.isToolEffective(event.entityPlayer.getCurrentEquippedItem(), event.block, event.metadata)
                || !Utils.containsOreDict(event.entityPlayer.getCurrentEquippedItem(), "toolShovel")) {
                event.newSpeed = event.originalSpeed / 2;
            }
        }

    }
}
