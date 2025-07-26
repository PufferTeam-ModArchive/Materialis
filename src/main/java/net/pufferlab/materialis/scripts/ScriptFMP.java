package net.pufferlab.materialis.scripts;

import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.fmp.FMPSender;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptFMP {

    public void init() {
        for (String s : Constants.woodTypes) {
            addFMPWood(s);
        }

        for (String s : Constants.bopWoodTypes) {
            addFMPWood(s);
        }

        for (String s : Constants.thaumcraftWoodTypes) {
            addFMPWood(s);
        }

        for (String s : Constants.witcheryWoodTypes) {
            addFMPWood(s);
        }

    }

    public void addFMPWood(String wood) {
        FMPSender.registerFMP(ModItems.getModItem("base", "planks", wood, 1));
    }
}
