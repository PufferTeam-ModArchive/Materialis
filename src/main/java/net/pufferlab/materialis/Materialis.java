package net.pufferlab.materialis;

import net.minecraft.item.Item;
import net.pufferlab.materialis.items.ItemMaterial;
import net.pufferlab.materialis.items.OreDictionaryRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Materialis.MODID, version = Tags.VERSION, name = "Materialis", acceptedMinecraftVersions = "[1.7.10]")
public class Materialis {

    public static final String MODID = "materialis";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(
        clientSide = "net.pufferlab.materialis.ClientProxy",
        serverSide = "net.pufferlab.materialis.CommonProxy")
    public static CommonProxy proxy;

    public static Item lumber;
    public static Item lumber_bop;
    public static Item lumber_thaumcraft;
    public static Item ingot;
    public static Item nugget;
    public static Item dust;
    public static Item gear;
    public static Item plate;
    public static Item gem;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        gem = new ItemMaterial(Constants.gemTypes, "gem", Constants.none);
        ingot = new ItemMaterial(Constants.metalTypes, "ingot", Constants.ingotBlacklist);
        nugget = new ItemMaterial(Constants.metalTypes, "nugget", Constants.nuggetBlacklist);
        dust = new ItemMaterial(Constants.metalTypes, "dust", Constants.none);
        gear = new ItemMaterial(Constants.metalTypes, "gear", Constants.none);
        plate = new ItemMaterial(Constants.metalTypes, "plate", Constants.none);
        GameRegistry.registerItem(gem, "gem");
        GameRegistry.registerItem(ingot, "ingot");
        GameRegistry.registerItem(nugget, "nugget");
        GameRegistry.registerItem(dust, "dust");
        GameRegistry.registerItem(gear, "gear");
        GameRegistry.registerItem(plate, "plate");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "ingot", Constants.ingotBlacklist, ingot);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "nugget", Constants.nuggetBlacklist, nugget);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "dust", Constants.none, dust);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "gear", Constants.none, gear);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "plate", Constants.none, plate);

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
