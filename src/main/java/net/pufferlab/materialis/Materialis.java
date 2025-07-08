package net.pufferlab.materialis;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.pufferlab.materialis.blocks.BlockMaterial;
import net.pufferlab.materialis.blocks.BlockSlabMaterial;
import net.pufferlab.materialis.itemblocks.ItemBlockMaterial;
import net.pufferlab.materialis.itemblocks.ItemBlockSlabMaterial;
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

    public static Block cobblestone;
    public static Block cobblestone_slab_double;
    public static Block cobblestone_slab;
    public static Block storage;
    public static Block ore;
    public static Item ingot;
    public static Item nugget;
    public static Item dust;
    public static Item gear;
    public static Item plate;
    public static Item gem;
    public static Item cast;

    public static final Block.SoundType soundTypePiston = new Block.SoundType("stone", 1.0F, 1.0F);
    public static final Block.SoundType soundTypeMetal = new Block.SoundType("stone", 1.0F, 1.5F);

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items,
    // etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        cobblestone = new BlockMaterial(Material.rock, Constants.rockTypes, "cobblestone", Constants.none, null, null)
            .setHardness(2.0F)
            .setResistance(10.0F)
            .setStepSound(soundTypePiston);
        cobblestone_slab = new BlockSlabMaterial(
            false,
            Materialis.cobblestone_slab,
            Materialis.cobblestone,
            Material.rock,
            Constants.rockTypes,
            "cobblestone_slab",
            Constants.none,
            null,
            null).setHardness(2.0F)
                .setResistance(10.0F)
                .setStepSound(soundTypePiston);
        cobblestone_slab_double = new BlockSlabMaterial(
            true,
            Materialis.cobblestone_slab,
            Materialis.cobblestone,
            Material.rock,
            Constants.rockTypes,
            "cobblestone_slab_double",
            Constants.none,
            null,
            null).setHardness(2.0F)
                .setResistance(10.0F)
                .setStepSound(soundTypePiston);
        ore = new BlockMaterial(
            Material.rock,
            Constants.oreTypes,
            "ore",
            Constants.none,
            Constants.oreTools,
            Constants.oreLevels).setHardness(3.0F)
                .setResistance(5.0F)
                .setStepSound(soundTypePiston);
        storage = new BlockMaterial(
            Material.iron,
            Constants.blockTypes,
            "block",
            Constants.none,
            Constants.blockTools,
            Constants.blockLevels).setHardness(5.0F)
                .setResistance(10.0F)
                .setStepSound(soundTypeMetal);
        gem = new ItemMaterial(Constants.gemTypes, "gem", Constants.none);
        ingot = new ItemMaterial(Constants.metalTypes, "ingot", Constants.ingotBlacklist);
        nugget = new ItemMaterial(Constants.metalTypes, "nugget", Constants.nuggetBlacklist);
        dust = new ItemMaterial(Constants.metalTypes, "dust", Constants.miscBlacklist);
        gear = new ItemMaterial(Constants.metalTypes, "gear", Constants.miscBlacklist);
        plate = new ItemMaterial(Constants.metalTypes, "plate", Constants.miscBlacklist);
        cast = new ItemMaterial(Constants.castTypes, "cast", Constants.none);
        GameRegistry.registerItem(gem, "gem");
        GameRegistry.registerItem(ingot, "ingot");
        GameRegistry.registerItem(nugget, "nugget");
        GameRegistry.registerItem(dust, "dust");
        GameRegistry.registerItem(gear, "gear");
        GameRegistry.registerItem(plate, "plate");
        GameRegistry.registerItem(cast, "cast");
        GameRegistry.registerBlock(cobblestone, ItemBlockMaterial.class, "cobblestone");
        GameRegistry.registerBlock(
            cobblestone_slab,
            ItemBlockSlabMaterial.class,
            "cobblestone_slab",
            Materialis.cobblestone_slab,
            Materialis.cobblestone_slab_double,
            false);
        GameRegistry.registerBlock(
            cobblestone_slab_double,
            ItemBlockSlabMaterial.class,
            "double_cobblestone_slab",
            Materialis.cobblestone_slab,
            Materialis.cobblestone_slab_double,
            true);
        GameRegistry.registerBlock(ore, ItemBlockMaterial.class, "ore");
        GameRegistry.registerBlock(storage, ItemBlockMaterial.class, "block");
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about.
    // Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "ingot", Constants.ingotBlacklist, ingot);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "nugget", Constants.nuggetBlacklist, nugget);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "dust", Constants.miscBlacklist, dust);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "gear", Constants.miscBlacklist, gear);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "plate", Constants.miscBlacklist, plate);
        OreDictionaryRegistry.registerOreDict(Constants.castTypes, "cast", Constants.none, cast);
        OreDictionaryRegistry.registerOreDict(Constants.oreTypes, "ore", Constants.none, ore);
        OreDictionaryRegistry.registerOreDict(Constants.blockTypes, "block", Constants.none, storage);

    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on
    // this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }
}
