package net.pufferlab.materialis;

import net.minecraftforge.common.MinecraftForge;
import net.pufferlab.materialis.events.DropHandler;
import net.pufferlab.materialis.events.EventHandler;
import net.pufferlab.materialis.researches.ResearchTabsRegistry;
import net.pufferlab.materialis.scripts.ScriptNEIConfig;
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
    public static ScriptNEIConfig scriptNEI = new ScriptNEIConfig();
    public static EventHandler eventHandler = new EventHandler();
    public static DropHandler dropHandler = new DropHandler();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        registry.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(eventHandler);
        MinecraftForge.EVENT_BUS.register(dropHandler);

        oreDictRegistry.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

        researchTabsRegistry.init();
        scriptRemove.init();
        scriptNEI.loadConfig();
    }

    @Mod.EventHandler
    public void completeInit(FMLLoadCompleteEvent event) {
        scriptRemove.postInit();
        scriptRegistry.init();
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
