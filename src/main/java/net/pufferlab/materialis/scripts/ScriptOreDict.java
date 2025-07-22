package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.Registry.*;

import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptOreDict implements IScript {

    public static final String[] axes = new String[] { "minecraft:iron_axe", "minecraft:diamond_axe",
        "minecraft:golden_axe", "materialis:flint_axe", "materialis:bronze_axe", "materialis:steel_axe" };

    public static final String[] saws = new String[] { "ForgeMicroblock:sawIron", "ForgeMicroblock:sawDiamond",
        "ForgeMicroblock:sawGold", "ForgeMicroblock:sawFlint", "ForgeMicroblock:sawBronze",
        "ForgeMicroblock:sawSteel", };

    public void run() {
        for (String s : axes) {
            addOreDict(ModItems.getItem(s + ":*:1"), "toolAxe");
        }

        for (String s : saws) {
            addOreDict(ModItems.getItem(s + ":*:1"), "toolSaw");
        }

        for (String s : ModItems.StoneBlocksName) {
            addOreDict(ModItems.getItem("chisel:" + s + ":0:1"), s);
        }

        removeOreDict(ModItems.getItem("BiomesOPlenty:plants:8"), "stickWood");
        removeOreDict(ModItems.getItem("BiomesOPlenty:bamboo:0"), "stickWood");

        removeOreDict(ModItems.getItem("TConstruct:oreBerries:0"), "nuggetIron");
        removeOreDict(ModItems.getItem("TConstruct:oreBerries:1"), "nuggetGold");
        removeOreDict(ModItems.getItem("TConstruct:oreBerries:2"), "nuggetCopper");
        removeOreDict(ModItems.getItem("TConstruct:oreBerries:3"), "nuggetTin");

        for (String s : Constants.woodTypes) {
            tagWood(s);
        }

        for (String s : Constants.bopWoodTypes) {
            tagWood(s);
        }

        for (String s : Constants.thaumcraftWoodTypes) {
            tagWood(s);
        }

        for (String s : ScriptRemove.metalItemsToRemoveAndHide) {
            removeAllOreDict(ModItems.getItem(s));
        }

        for (String s : ScriptRemove.itemsToRemoveAndHide) {
            removeAllOreDict(ModItems.getItem(s));
        }
    }

    public void tagWood(String wood) {
        for (String s : ModItems.BaseWoodLogs) {
            addOreDict(ModItems.getModItem("base", s, wood, 1), "logWood");
            addOreDict(ModItems.getModItem("base", s, wood, 1), Utils.getOreDictionaryName("logWood", wood));
        }
    }
}
