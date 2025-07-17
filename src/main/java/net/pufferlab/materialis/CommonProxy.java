package net.pufferlab.materialis;

import net.minecraftforge.common.MinecraftForge;
import net.pufferlab.materialis.events.EventHandler;

import org.lwjgl.opengl.Display;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
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

    public int getArmorIndex(String string) {
        return 0;
    }

    // load "Do your mod setup. Build whatever data structures you care about.
    // Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(EventHandler.class);
    }

    // postInit "Handle interaction with other mods, complete your setup based on
    // this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}

}
