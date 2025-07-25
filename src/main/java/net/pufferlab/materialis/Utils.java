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

    public static boolean containsExactMatch(Block[] array, Block block) {
        for (Block element : array) {
            if (element == block) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsStack(ItemStack wild, ItemStack check) {
        if (wild == null || check == null) {
            return check == wild;
        }

        if (wild.getItem() == check.getItem() && (wild.getItemDamage() == OreDictionary.WILDCARD_VALUE
            || check.getItemDamage() == OreDictionary.WILDCARD_VALUE
            || wild.getItemDamage() == check.getItemDamage())) {
            return true;
        }
        return false;
    }

    public static boolean isStackValid(ItemStack aStack) {
        return (aStack != null) && aStack.getItem() != null && aStack.stackSize >= 0;
    }

    // From GTUtility may not work
    public static boolean areStacksEqual(ItemStack aStack1, ItemStack aStack2) {
        return areStacksEqual(aStack1, aStack2, false);
    }

    // From GTUtility may not work
    public static boolean areStacksEqual(ItemStack aStack1, ItemStack aStack2, boolean aIgnoreNBT) {
        return aStack1 != null && aStack2 != null
            && aStack1.getItem() == aStack2.getItem()
            && (aStack1.getItemDamage() == aStack2.getItemDamage()
                || aStack1.getItemDamage() == OreDictionary.WILDCARD_VALUE
                || aStack2.getItemDamage() == OreDictionary.WILDCARD_VALUE)
            && (aIgnoreNBT || (((aStack1.getTagCompound() == null) == (aStack2.getTagCompound() == null))
                && (aStack1.getTagCompound() == null || aStack1.getTagCompound()
                    .equals(aStack2.getTagCompound()))));
    }

    public static Block getItemFromArray(String[] array, Block[] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (targetString.equals(array[i])) {
                return blockArray[i];
            }
        }
        return null;
    }

    public static String getItemFromArray(String[] names, Block[] array, int[] meta, Block targetBlock,
        int targetMeta) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetBlock && meta[i] == targetMeta) {
                return names[i];
            }
        }
        return null;
    }

    public static Item getItemFromArray(String[] array, Item[] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetString)) {
                return blockArray[i];
            }
        }
        return null;
    }

    public static String getItemFromArray(String[] array, String[] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetString)) {
                return blockArray[i];
            }
        }
        return null;
    }

    public static String[] getItemFromArray(String[] array, String[][] blockArray, String targetString) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetString)) {
                return blockArray[i];
            }
        }
        return null;
    }

    public static int getItemFromArray(int[] ids, String[] woodType, String wood) {
        for (int i = 0; i < woodType.length; i++) {
            if (woodType[i].equals(wood)) {
                return ids[i];
            }
        }
        return ids[0];
    }

    public static int getItemFromArray(int[] ids, Block[] blockType, Block block) {
        for (int i = 0; i < blockType.length; i++) {
            if (blockType[i] == block) {
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

    public static String getCapitalized(String string) {
        String[] stringArray = string.split("");
        stringArray[0] = stringArray[0].toUpperCase();
        string = String.join("", stringArray);

        return string;
    }

    public static boolean containsOreDict(Item item, String oreDict) {
        ItemStack b = new ItemStack(item);
        for (int id1 : OreDictionary.getOreIDs(b)) {
            if (id1 == OreDictionary.getOreID(oreDict)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsOreDict(Block block, String oreDict) {
        ItemStack b = new ItemStack(Item.getItemFromBlock(block));
        for (int id1 : OreDictionary.getOreIDs(b)) {
            if (id1 == OreDictionary.getOreID(oreDict)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsOreDict(Block block, String[] oreDict) {
        ItemStack b = new ItemStack(Item.getItemFromBlock(block));
        for (int id1 : OreDictionary.getOreIDs(b)) {
            for (String id2 : oreDict) {
                if (id1 == OreDictionary.getOreID(id2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getOreDictInList(Block block, String[] oreDict) {
        ItemStack b = new ItemStack(Item.getItemFromBlock(block));
        for (int id1 : OreDictionary.getOreIDs(b)) {
            for (int i = 0; i < oreDict.length; i++) {
                if (id1 == OreDictionary.getOreID(oreDict[i])) {
                    return oreDict[i];
                }
            }
        }
        return null;
    }

    public static boolean containsOreDict(ItemStack b, String oreDict) {
        for (int id1 : OreDictionary.getOreIDs(b)) {
            if (id1 == OreDictionary.getOreID(oreDict)) {
                return true;
            }
        }
        return false;
    }
}
