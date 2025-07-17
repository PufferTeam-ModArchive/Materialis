package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.Registry.*;

import net.minecraft.init.Items;
import net.pufferlab.materialis.Registry;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptOreDict implements IScript {

    public void run() {
        addOreDict(Items.iron_axe, "toolAxe");
        addOreDict(Items.diamond_axe, "toolAxe");
        addOreDict(Items.golden_axe, "toolAxe");

        addOreDict(Registry.bronze_axe, "toolAxe");
        addOreDict(Registry.steel_axe, "toolAxe");
        addOreDict(Registry.flint_axe, "toolAxe");

        for (String s : ScriptRemove.metalItemsToRemoveAndHide) {
            removeAllOreDict(ModItems.getItem(s));
        }

        for (String s : ScriptRemove.itemsToRemoveAndHide) {
            removeAllOreDict(ModItems.getItem(s));
        }
    }
}
