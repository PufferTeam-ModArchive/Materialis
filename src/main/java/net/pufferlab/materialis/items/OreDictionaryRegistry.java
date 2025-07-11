package net.pufferlab.materialis.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.pufferlab.materialis.Utils;

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

}
