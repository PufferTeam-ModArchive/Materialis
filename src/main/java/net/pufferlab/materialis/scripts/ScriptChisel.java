package net.pufferlab.materialis.scripts;

import java.util.List;

import net.pufferlab.materialis.recipes.ChiselHelper;

import com.cricketcraft.chisel.api.carving.CarvingUtils;

public class ScriptChisel implements IScript {

    public void run() {
        List<String> keys = CarvingUtils.getChiselRegistry()
            .getSortedGroupNames();
        System.out.println("Chisel Groups: " + keys.size());
        for (String key : keys) {
            System.out.println("Chisel Group " + key);
        }

        ChiselHelper.removeAllVariations("cobblestone");
        ChiselHelper.addVariation("cobblestone", "minecraft", "cobblestone", 0, 0);
        for (int i = 1; i < 16; i++) {
            ChiselHelper.addVariation("cobblestone", "chisel", "cobblestone", i, i);
        }

        ChiselHelper.removeAllVariations("nether_brick");
        ChiselHelper.addVariation("nether_brick", "minecraft", "nether_brick", 0, 0);
        ChiselHelper.addVariation("nether_brick", "netherlicious", "Netherbricks", 0, 1);
        ChiselHelper.addVariation("nether_brick", "netherlicious", "Netherbricks", 1, 2);
        for (int i = 0; i < 5; i++) {
            ChiselHelper.addVariation("nether_brick", "netherlicious", "NewNetherbrick1", i, i + 3);
        }
        for (int i = 1; i < 16; i++) {
            ChiselHelper.addVariation("nether_brick", "chisel", "nether_brick", i, i + 99);
        }

        ChiselHelper.addVariation("nether_brick_red", "netherlicious", "Netherbricks", 2, 0);
        ChiselHelper.addVariation("nether_brick_red", "netherlicious", "Netherbricks", 3, 1);
        ChiselHelper.addVariation("nether_brick_red", "netherlicious", "Netherbricks", 4, 2);
        for (int i = 5; i < 10; i++) {
            ChiselHelper.addVariation("nether_brick_red", "netherlicious", "NewNetherbrick1", i, i + 3);
        }

        ChiselHelper.addVariation("nether_brick_blue", "netherlicious", "Netherbricks", 5, 0);
        ChiselHelper.addVariation("nether_brick_blue", "netherlicious", "Netherbricks", 6, 1);
        ChiselHelper.addVariation("nether_brick_blue", "netherlicious", "Netherbricks", 7, 2);
        for (int i = 10; i < 15; i++) {
            ChiselHelper.addVariation("nether_brick_blue", "netherlicious", "NewNetherbrick1", i, i + 3);
        }

        ChiselHelper.addVariation("nether_brick_purple", "netherlicious", "Netherbricks", 8, 0);
        ChiselHelper.addVariation("nether_brick_purple", "netherlicious", "Netherbricks", 9, 1);
        ChiselHelper.addVariation("nether_brick_purple", "netherlicious", "Netherbricks", 10, 2);
        for (int i = 0; i < 5; i++) {
            ChiselHelper.addVariation("nether_brick_purple", "netherlicious", "NewNetherbrick2", i, i + 3);
        }

        for (int i = 5; i < 13; i++) {
            ChiselHelper.addVariation("nether_brick_black", "netherlicious", "NewNetherbrick2", i, i);
        }

        ChiselHelper.removeAllVariations("netherlicious_Basalt");
        ChiselHelper.addVariation("netherlicious_Basalt", "netherlicious", "Basalt", 0, 0);
        ChiselHelper.addVariation("netherlicious_Basalt", "netherlicious", "Basalt", 1, 1);
        for (int i = 0; i < 8; i++) {
            ChiselHelper.addVariation("netherlicious_Basalt", "netherlicious", "BasaltBricks", i, i + 2);
        }

        ChiselHelper.removeAllVariations("netherlicious_Blackstone");
        for (int i = 0; i < 9; i++) {
            if (i != 5) {
                ChiselHelper.addVariation("netherlicious_Blackstone", "netherlicious", "Blackstone", i, i + 2);
            }
        }

        ChiselHelper.removeGroup("netherlicious_NetherCrystal");

        ChiselHelper.removeAllVariations("quartz");
        for (int i = 0; i < 3; i++) {
            ChiselHelper.addVariation("quartz", "minecraft", "quartz_block", i, i);
        }
        for (int i = 0; i < 2; i++) {
            ChiselHelper.addVariation("quartz", "netherlicious", "QuartzBricks", i, i + 3);
        }
        ChiselHelper.addVariation("quartz", "netherlicious", "QuartzPillar", 0, 5);

        for (int i = 2; i < 6; i++) {
            ChiselHelper.addVariation("quartz_void", "netherlicious", "QuartzBricks", i, i - 2);
        }
        ChiselHelper.addVariation("quartz_void", "netherlicious", "QuartzPillar", 1, 4);
        ChiselHelper.addVariation("quartz_void", "netherlicious", "QuartzPillar", 2, 5);

        for (int i = 1; i < 5; i++) {
            ChiselHelper.addVariation("livingwood", "Botania", "livingwood", i, i);
        }

        for (int i = 1; i < 5; i++) {
            ChiselHelper.addVariation("livingrock", "Botania", "livingrock", i, i);
        }

        ChiselHelper.addVariation("searedbrick", "TConstruct", "Smeltery", 2, 0);
        for (int i = 6; i < 12; i++) {
            ChiselHelper.addVariation("searedbrick", "TConstruct", "Smeltery", i, i + 2);
        }

        ChiselHelper.addVariation("searedbrick_nether", "TConstruct", "SmelteryNether", 2, 0);
        for (int i = 6; i < 12; i++) {
            ChiselHelper.addVariation("searedbrick_nether", "TConstruct", "SmelteryNether", i, i + 2);
        }

    }

}
