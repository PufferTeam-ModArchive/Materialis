package net.pufferlab.materialis;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Utils {

    public static boolean containsExactMatch(String[] array, String targetString) {
        for (String element : array) {
            if (element.equals(targetString)) {
                return true;
            }
        }
        return false;
    }

    public static String getOreDictionaryName(String prefix, String suffix) {
        String[] suffixArray = suffix.split("");
        suffixArray[0] = suffixArray[0].toUpperCase();
        suffix = String.join("", suffixArray);

        return prefix + suffix;
    }

    public static boolean containsOreDict(Block block, String oreDict) {
        ItemStack b = new ItemStack(Item.getItemFromBlock(block));
        boolean isWood = false;
        for (int id1 : OreDictionary.getOreIDs(b)) {
            if (id1 == OreDictionary.getOreID(oreDict)) {
                isWood = true;
            }
        }
        return isWood;
    }

    public static boolean containsOreDict(ItemStack b, String oreDict) {
        boolean isWood = false;
        for (int id1 : OreDictionary.getOreIDs(b)) {
            if (id1 == OreDictionary.getOreID(oreDict)) {
                isWood = true;
            }
        }
        return isWood;
    }
}
