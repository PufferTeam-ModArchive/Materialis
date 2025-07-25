package net.pufferlab.materialis;

import static net.pufferlab.materialis.Registry.*;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegistry {

    public static void registerOreDict(String[] materials, String type, String[] blacklist, Item item) {

        for (int i = 0; i < materials.length; i++) {
            if (!Utils.containsExactMatch(blacklist, materials[i])) {
                OreDictionary.registerOre(Utils.getOreDictionaryName(type, materials[i]), new ItemStack(item, 1, i));
            }
        }
    }

    public static void registerOreDict(String[] materials, String type, String[] blacklist, Block item) {

        for (int i = 0; i < materials.length; i++) {
            if (!Utils.containsExactMatch(blacklist, materials[i])) {
                OreDictionary.registerOre(Utils.getOreDictionaryName(type, materials[i]), new ItemStack(item, 1, i));
            }
        }
    }

    public void init() {
        registerOreDict(Constants.metalTypes, "ingot", Constants.ingotBlacklist, ingot);
        registerOreDict(Constants.metalTypes, "nugget", Constants.nuggetBlacklist, nugget);
        registerOreDict(Constants.metalTypes, "dust", Constants.miscBlacklist, dust);
        registerOreDict(Constants.metalTypes, "gear", Constants.miscBlacklist, gear);
        registerOreDict(Constants.metalTypes, "plate", Constants.miscBlacklist, plate);
        registerOreDict(Constants.moddedMetalTypes, "cluster", Constants.none, cluster);
        registerOreDict(Constants.castTypes, "cast", Constants.none, cast);
        registerOreDict(Constants.oreTypes, "ore", Constants.none, ore);
        registerOreDict(Constants.blockTypes, "block", Constants.none, storage);
        OreDictionary.registerOre("flint", new ItemStack(Items.flint, 1, 0));

        registerOreDict(Constants.toolTypes, "pickaxeHead", Constants.none, pickaxe_head);
        OreDictionary.registerOre("pickaxeHead", new ItemStack(Registry.pickaxe_head, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "axeHead", Constants.none, axe_head);
        OreDictionary.registerOre("axeHead", new ItemStack(Registry.axe_head, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "shovelHead", Constants.none, shovel_head);
        OreDictionary.registerOre("shovelHead", new ItemStack(Registry.shovel_head, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "hoeHead", Constants.hoeBlacklist, hoe_head);
        OreDictionary.registerOre("hoeHead", new ItemStack(Registry.hoe_head, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "swordBlade", Constants.none, sword_blade);
        OreDictionary.registerOre("swordBlade", new ItemStack(Registry.sword_blade, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "sawBlade", Constants.none, saw_blade);
        OreDictionary.registerOre("sawBlade", new ItemStack(Registry.saw_blade, 1, OreDictionary.WILDCARD_VALUE));
        registerOreDict(Constants.toolTypes, "chiselHead", Constants.none, chisel_head);
        OreDictionary.registerOre("chiselHead", new ItemStack(Registry.chisel_head, 1, OreDictionary.WILDCARD_VALUE));
    }

}
