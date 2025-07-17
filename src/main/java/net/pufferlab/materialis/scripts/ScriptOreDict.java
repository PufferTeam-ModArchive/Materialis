package net.pufferlab.materialis.scripts;

import net.pufferlab.materialis.recipes.ModItems;

public class ScriptOreDict implements IScript {

    public void run() {

        removeOreDict(ModItems.getItem("minecraft:iron_ingot"), "ingotIron");

    }
}
