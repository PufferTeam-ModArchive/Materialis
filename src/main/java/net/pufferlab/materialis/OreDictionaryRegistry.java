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
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "ingot", Constants.ingotBlacklist, ingot);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "nugget", Constants.nuggetBlacklist, nugget);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "dust", Constants.miscBlacklist, dust);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "gear", Constants.miscBlacklist, gear);
        OreDictionaryRegistry.registerOreDict(Constants.metalTypes, "plate", Constants.miscBlacklist, plate);
        OreDictionaryRegistry.registerOreDict(Constants.castTypes, "cast", Constants.none, cast);
        OreDictionaryRegistry.registerOreDict(Constants.oreTypes, "ore", Constants.none, ore);
        OreDictionaryRegistry.registerOreDict(Constants.blockTypes, "block", Constants.none, storage);
        OreDictionary.registerOre("flint", new ItemStack(Items.flint, 1, 0));
    }

}
