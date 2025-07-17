package net.pufferlab.materialis;

import net.pufferlab.materialis.researches.ResearchTabsRegistry;
import net.pufferlab.materialis.scripts.ScriptRegistry;
import net.pufferlab.materialis.scripts.ScriptRemove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

@Mod(modid = Materialis.MODID, version = Tags.VERSION, name = "Materialis", acceptedMinecraftVersions = "[1.7.10]")
public class Materialis {

    public static final String MODID = "materialis";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(
        clientSide = "net.pufferlab.materialis.ClientProxy",
        serverSide = "net.pufferlab.materialis.CommonProxy")
    public static CommonProxy proxy;
    public static Registry registry = new Registry();
    public static OreDictionaryRegistry oreDictRegistry = new OreDictionaryRegistry();
    public static ResearchTabsRegistry researchTabsRegistry = new ResearchTabsRegistry();
    public static ScriptRegistry scriptRegistry = new ScriptRegistry();
    public static ScriptRemove scriptRemove = new ScriptRemove();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        registry.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        oreDictRegistry.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

        researchTabsRegistry.init();
        scriptRemove.run();
    }

    @Mod.EventHandler
    public void completeInit(FMLLoadCompleteEvent event) {
        scriptRegistry.init();
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
