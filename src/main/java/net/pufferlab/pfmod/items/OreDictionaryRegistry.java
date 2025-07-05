package net.pufferlab.pfmod.items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.pufferlab.pfmod.Utils;

public class OreDictionaryRegistry {

    public static void registerOreDict(String[] materials, String type, String[] blacklist, Item item) {

        for (int i = 0; i < materials.length; i++) {
            if(!Utils.containsExactMatch(blacklist, materials[i])) {
                OreDictionary.registerOre(Utils.getOreDictionaryName(type, materials[i]), new ItemStack(item, 1, i));
            }
        }
    }

}
