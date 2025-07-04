package net.pufferlab.pfmod;

import net.minecraft.item.Item;
import net.pufferlab.pfmod.items.ItemLumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = PFMod.MODID, version = Tags.VERSION, name = "PFMod", acceptedMinecraftVersions = "[1.7.10]")
public class PFMod {

    public static final String MODID = "pfmod";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "net.pufferlab.pfmod.ClientProxy", serverSide = "net.pufferlab.pfmod.CommonProxy")
    public static CommonProxy proxy;

    public static Item lumber;
    public static Item lumber_bop;
    public static Item lumber_thaumcraft;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        lumber = new ItemLumber("vanilla");
        lumber_bop = new ItemLumber("biomesoplenty");
        lumber_thaumcraft = new ItemLumber("thaumcraft");

        GameRegistry.registerItem(lumber, "lumber");
        GameRegistry.registerItem(lumber_bop, "lumber_bop");
        GameRegistry.registerItem(lumber_thaumcraft, "lumber_thaumcraft");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
