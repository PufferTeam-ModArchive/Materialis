package net.pufferlab.materialis;

import java.util.ArrayList;

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

    public static boolean containsWildcard(ItemStack wild, ArrayList<ItemStack> checkList) {
        for (int i = 0; i < checkList.size(); i++) {
            ItemStack check = checkList.get(i);

            if (wild == null || check == null) {
                return check == wild;
            }

            if (wild.getItem() == check.getItem() && (wild.getItemDamage() == OreDictionary.WILDCARD_VALUE
                || wild.getItemDamage() == check.getItemDamage())) {
                return true;
            }
        }

        return false;
    }

    public static boolean equalsWildcard(ItemStack wild, ItemStack check) {
        if (wild == null || check == null) {
            return check == wild;
        }

        return wild.getItem() == check.getItem()
            && (wild.getItemDamage() == OreDictionary.WILDCARD_VALUE || wild.getItemDamage() == check.getItemDamage());
    }

    public static Block getItemFromArray(String[] array, Block[] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetString)) {
                return blockArray[i];
            }
        }
        return blockArray[0];
    }

    public static Item getItemFromArray(String[] array, Item[] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetString)) {
                return blockArray[i];
            }
        }
        return blockArray[0];
    }

    public static int getItemFromArray(int[] ids, String[] woodType, String wood) {
        for (int i = 0; i < woodType.length; i++) {
            if (woodType[i].equals(wood)) {
                return ids[i];
            }
        }
        return ids[0];
    }

    public static int getItemFromArray(String[] woodType, String wood) {
        for (int i = 0; i < woodType.length; i++) {
            if (woodType[i].equals(wood)) {
                return i;
            }
        }
        return 0;
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
