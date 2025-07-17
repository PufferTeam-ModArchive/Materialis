package net.pufferlab.materialis.recipes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.pufferlab.materialis.Utils;

public class OreDictHelper {

    private static List<ArrayList<ItemStack>> idToStack;

    @SuppressWarnings("unchecked")
    public static void removeOreDict(ItemStack toRemove, String oreDict) {
        if (idToStack == null) {
            try {
                Field idToStackField = OreDictionary.class.getDeclaredField("idToStack");
                idToStackField.setAccessible(true);
                idToStack = (List<ArrayList<ItemStack>>) idToStackField.get(null);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        idToStack.get(OreDictionary.getOreID(oreDict))
            .removeIf(s -> Utils.areStacksEqual(s, toRemove));
    }

    @SuppressWarnings("unchecked")
    public static void removeAllOreDict(ItemStack toRemove) {
        if (idToStack == null) {
            try {
                Field idToStackField = OreDictionary.class.getDeclaredField("idToStack");
                idToStackField.setAccessible(true);
                idToStack = (List<ArrayList<ItemStack>>) idToStackField.get(null);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        for (int oreDict : OreDictionary.getOreIDs(toRemove)) {
            idToStack.get(oreDict)
                .removeIf(s -> Utils.containsStack(s, toRemove));
        }
    }

    public static void addOreDict(ItemStack toAdd, String oreDict) {
        OreDictionary.registerOre(oreDict, toAdd);
    }

    public static void addOreDict(Item item, String oreDict) {
        OreDictionary.registerOre(oreDict, item);
    }
}
