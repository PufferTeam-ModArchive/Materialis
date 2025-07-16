package net.pufferlab.materialis;

import static net.minecraft.block.Block.soundTypeMetal;
import static net.minecraft.block.Block.soundTypePiston;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.pufferlab.materialis.blocks.BlockMaterial;
import net.pufferlab.materialis.blocks.BlockSlabMaterial;
import net.pufferlab.materialis.blocks.BlockStairsMaterial;
import net.pufferlab.materialis.itemblocks.ItemBlockMaterial;
import net.pufferlab.materialis.itemblocks.ItemBlockSlabMaterial;
import net.pufferlab.materialis.items.ItemMaterial;
import net.pufferlab.materialis.items.ItemMaterialArmor;
import net.pufferlab.materialis.items.ItemMaterialAxe;
import net.pufferlab.materialis.items.ItemMaterialHoe;
import net.pufferlab.materialis.items.ItemMaterialPickaxe;
import net.pufferlab.materialis.items.ItemMaterialShovel;
import net.pufferlab.materialis.items.ItemMaterialSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class Registry {

    public static ToolMaterial toolFlint;
    public static ToolMaterial toolBronze;
    public static ToolMaterial toolSteel;
    public static ArmorMaterial armorBronze;
    public static ArmorMaterial armorSteel;
    public static Block cobblestone;
    public static Block cobblestone_slab_double;
    public static Block cobblestone_slab;
    public static Block andesite_stairs;
    public static Block diorite_stairs;
    public static Block granite_stairs;
    public static Block limestone_stairs;
    public static Block marble_stairs;
    public static Block storage;
    public static Block ore;
    public static Item ingot;
    public static Item nugget;
    public static Item dust;
    public static Item gear;
    public static Item plate;
    public static Item gem;
    public static Item cast;
    public static Item misc;
    public static Item bronze_helmet;
    public static Item bronze_chestplate;
    public static Item bronze_leggings;
    public static Item bronze_boots;
    public static Item steel_helmet;
    public static Item steel_chestplate;
    public static Item steel_leggings;
    public static Item steel_boots;
    public static Item pickaxe_head;
    public static Item axe_head;
    public static Item shovel_head;
    public static Item hoe_head;
    public static Item sword_blade;
    public static Item saw_blade;
    public static Item chisel_head;
    public static Item flint_axe;
    public static Item flint_pickaxe;
    public static Item flint_shovel;
    public static Item flint_sword;
    public static Item bronze_axe;
    public static Item bronze_pickaxe;
    public static Item bronze_shovel;
    public static Item bronze_hoe;
    public static Item bronze_sword;
    public static Item steel_axe;
    public static Item steel_pickaxe;
    public static Item steel_shovel;
    public static Item steel_hoe;
    public static Item steel_sword;

    public void preInit() {
        toolFlint = EnumHelper.addToolMaterial("flint", 0, 100, 2.0F, 0.0F, 15);
        toolBronze = EnumHelper.addToolMaterial("bronze", 1, 200, 5.0F, 1.0F, 10);
        toolSteel = EnumHelper.addToolMaterial("steel", 3, 1500, 8.0F, 3.0F, 10);

        armorBronze = EnumHelper.addArmorMaterial("bronze", 15, new int[] { 2, 5, 4, 1 }, 15);
        armorSteel = EnumHelper.addArmorMaterial("steel", 33, new int[] { 3, 8, 6, 3 }, 10);

        cobblestone = new BlockMaterial(Material.rock, Constants.rockTypes, "cobblestone", Constants.none, null, null)
            .setHardness(2.0F)
            .setResistance(10.0F)
            .setStepSound(soundTypePiston);
        cobblestone_slab = new BlockSlabMaterial(
            false,
            Registry.cobblestone_slab,
            Registry.cobblestone,
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
            Registry.cobblestone_slab,
            Registry.cobblestone,
            Material.rock,
            Constants.rockTypes,
            "cobblestone_slab_double",
            Constants.none,
            null,
            null).setHardness(2.0F)
                .setResistance(10.0F)
                .setStepSound(soundTypePiston);

        andesite_stairs = new BlockStairsMaterial(Registry.cobblestone, 0, "andesite_cobblestone");
        diorite_stairs = new BlockStairsMaterial(Registry.cobblestone, 1, "diorite_cobblestone");
        granite_stairs = new BlockStairsMaterial(Registry.cobblestone, 2, "granite_cobblestone");
        limestone_stairs = new BlockStairsMaterial(Registry.cobblestone, 3, "limestone_cobblestone");
        marble_stairs = new BlockStairsMaterial(Registry.cobblestone, 4, "marble_cobblestone");

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
        misc = new ItemMaterial(Constants.miscItems, "item", Constants.none);
        pickaxe_head = new ItemMaterial(Constants.toolTypes, "pickaxe_head", Constants.none);
        axe_head = new ItemMaterial(Constants.toolTypes, "axe_head", Constants.none);
        shovel_head = new ItemMaterial(Constants.toolTypes, "shovel_head", Constants.none);
        hoe_head = new ItemMaterial(Constants.toolTypes, "hoe_head", Constants.hoeBlacklist);
        sword_blade = new ItemMaterial(Constants.toolTypes, "sword_blade", Constants.none);
        saw_blade = new ItemMaterial(Constants.toolTypes, "saw_blade", Constants.none);
        chisel_head = new ItemMaterial(Constants.toolTypes, "chisel_head", Constants.none);

        bronze_helmet = new ItemMaterialArmor(
            armorBronze,
            "bronze_helmet",
            Materialis.proxy.getArmorIndex("bronze"),
            0);
        bronze_chestplate = new ItemMaterialArmor(
            armorBronze,
            "bronze_chestplate",
            Materialis.proxy.getArmorIndex("bronze"),
            1);
        bronze_leggings = new ItemMaterialArmor(
            armorBronze,
            "bronze_leggings",
            Materialis.proxy.getArmorIndex("bronze"),
            2);
        bronze_boots = new ItemMaterialArmor(armorBronze, "bronze_boots", Materialis.proxy.getArmorIndex("bronze"), 3);

        steel_helmet = new ItemMaterialArmor(armorSteel, "steel_helmet", Materialis.proxy.getArmorIndex("steel"), 0);
        steel_chestplate = new ItemMaterialArmor(
            armorSteel,
            "steel_chestplate",
            Materialis.proxy.getArmorIndex("steel"),
            1);
        steel_leggings = new ItemMaterialArmor(
            armorSteel,
            "steel_leggings",
            Materialis.proxy.getArmorIndex("steel"),
            2);
        steel_boots = new ItemMaterialArmor(armorSteel, "steel_boots", Materialis.proxy.getArmorIndex("steel"), 3);

        flint_axe = new ItemMaterialAxe(toolFlint, "flint_axe");
        flint_pickaxe = new ItemMaterialPickaxe(toolFlint, "flint_pickaxe");
        flint_shovel = new ItemMaterialShovel(toolFlint, "flint_shovel");
        flint_sword = new ItemMaterialSword(toolFlint, "flint_sword");
        bronze_axe = new ItemMaterialAxe(toolBronze, "bronze_axe");
        bronze_pickaxe = new ItemMaterialPickaxe(toolBronze, "bronze_pickaxe");
        bronze_shovel = new ItemMaterialShovel(toolBronze, "bronze_shovel");
        bronze_hoe = new ItemMaterialHoe(toolBronze, "bronze_hoe");
        bronze_sword = new ItemMaterialSword(toolBronze, "bronze_sword");
        steel_axe = new ItemMaterialAxe(toolSteel, "steel_axe");
        steel_pickaxe = new ItemMaterialPickaxe(toolSteel, "steel_pickaxe");
        steel_shovel = new ItemMaterialShovel(toolSteel, "steel_shovel");
        steel_hoe = new ItemMaterialHoe(toolSteel, "steel_hoe");
        steel_sword = new ItemMaterialSword(toolSteel, "steel_sword");

        GameRegistry.registerItem(gem, "gem");
        GameRegistry.registerItem(ingot, "ingot");
        GameRegistry.registerItem(nugget, "nugget");
        GameRegistry.registerItem(dust, "dust");
        GameRegistry.registerItem(gear, "gear");
        GameRegistry.registerItem(plate, "plate");
        GameRegistry.registerItem(cast, "cast");
        GameRegistry.registerItem(misc, "item");
        GameRegistry.registerItem(bronze_helmet, "bronze_helmet");
        GameRegistry.registerItem(bronze_chestplate, "bronze_chestplate");
        GameRegistry.registerItem(bronze_leggings, "bronze_leggings");
        GameRegistry.registerItem(bronze_boots, "bronze_boots");
        GameRegistry.registerItem(steel_helmet, "steel_helmet");
        GameRegistry.registerItem(steel_chestplate, "steel_chestplate");
        GameRegistry.registerItem(steel_leggings, "steel_leggings");
        GameRegistry.registerItem(steel_boots, "steel_boots");
        GameRegistry.registerItem(flint_axe, "flint_axe");
        GameRegistry.registerItem(flint_pickaxe, "flint_pickaxe");
        GameRegistry.registerItem(flint_shovel, "flint_shovel");
        GameRegistry.registerItem(flint_sword, "flint_sword");
        GameRegistry.registerItem(bronze_axe, "bronze_axe");
        GameRegistry.registerItem(bronze_pickaxe, "bronze_pickaxe");
        GameRegistry.registerItem(bronze_shovel, "bronze_shovel");
        GameRegistry.registerItem(bronze_hoe, "bronze_hoe");
        GameRegistry.registerItem(bronze_sword, "bronze_sword");
        GameRegistry.registerItem(steel_axe, "steel_axe");
        GameRegistry.registerItem(steel_pickaxe, "steel_pickaxe");
        GameRegistry.registerItem(steel_shovel, "steel_shovel");
        GameRegistry.registerItem(steel_hoe, "steel_hoe");
        GameRegistry.registerItem(steel_sword, "steel_sword");
        GameRegistry.registerItem(pickaxe_head, "pickaxe_head");
        GameRegistry.registerItem(axe_head, "axe_head");
        GameRegistry.registerItem(shovel_head, "shovel_head");
        GameRegistry.registerItem(hoe_head, "hoe_head");
        GameRegistry.registerItem(sword_blade, "sword_blade");
        GameRegistry.registerItem(saw_blade, "saw_blade");
        GameRegistry.registerItem(chisel_head, "chisel_head");
        GameRegistry.registerBlock(cobblestone, ItemBlockMaterial.class, "cobblestone");
        GameRegistry.registerBlock(
            cobblestone_slab,
            ItemBlockSlabMaterial.class,
            "cobblestone_slab",
            Registry.cobblestone_slab,
            Registry.cobblestone_slab_double,
            false);
        GameRegistry.registerBlock(
            cobblestone_slab_double,
            ItemBlockSlabMaterial.class,
            "double_cobblestone_slab",
            Registry.cobblestone_slab,
            Registry.cobblestone_slab_double,
            true);
        GameRegistry.registerBlock(andesite_stairs, "andesite_cobblestone_stairs");
        GameRegistry.registerBlock(diorite_stairs, "diorite_cobblestone_stairs");
        GameRegistry.registerBlock(granite_stairs, "granite_cobblestone_stairs");
        GameRegistry.registerBlock(limestone_stairs, "limestone_cobblestone_stairs");
        GameRegistry.registerBlock(marble_stairs, "marble_cobblestone_stairs");
        GameRegistry.registerBlock(ore, ItemBlockMaterial.class, "ore");
        GameRegistry.registerBlock(storage, ItemBlockMaterial.class, "block");
    }
}
