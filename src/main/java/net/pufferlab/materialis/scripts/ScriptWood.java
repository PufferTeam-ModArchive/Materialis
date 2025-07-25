package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.scripts.ItemList.*;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.MekanismHelper;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptWood implements IScript {

    public void run() {
        for (String s : Constants.woodTypes) {
            addModernWoodRecipes(s);
            addBibliocraftWoodRecipes(s);
        }

        for (String s : Constants.bopWoodTypes) {
            addModernWoodRecipes(s);
            addBibliocraftWoodRecipes(s);
        }

        for (String s : Constants.thaumcraftWoodTypes) {
            addModernWoodRecipes(s);
        }

        for (String s : Constants.witcheryWoodTypes) {
            addModernWoodRecipes(s);
        }
    }

    public void addBibliocraftWoodRecipes(String wood) {
        ItemStack lumber = ModItems.getModItem("base", "lumber", wood, 1);
        ItemStack slab = ModItems.getModItem("base", "slab", wood, 1);
        ItemStack planks = ModItems.getModItem("base", "planks", wood, 1);
        ItemStack sign = ModItems.getModItem("base", "sign", wood, 1);
        ItemStack paintingt0 = ModItems.getModItem("bibliocraft", "painting_t0", wood, 1);
        ItemStack woodlabel = ModItems.getModItem("bibliocraft", "wood_label", wood, 1);
        ItemStack seatback2 = ModItems.getModItem("bibliocraft", "seat_back_2", wood, 1);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "bookcase", wood, 1),
            "BLB",
            "BLB",
            "BLB",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "potion_shelf", wood, 1),
            "LLL",
            "BLB",
            "LLL",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "shelf", wood, 1),
            "BLB",
            "LLL",
            "BLB",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "tool_rack", wood, 1),
            "LBL",
            "OOO",
            "LBL",
            'L',
            lumber,
            'B',
            slab,
            'O',
            "nuggetIron");

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "glass_case", wood, 1),
            "LGL",
            "BWB",
            "LOL",
            'L',
            lumber,
            'B',
            slab,
            'G',
            glass,
            'W',
            wool,
            'O',
            "ingotIron");

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "wood_label", wood, 1),
            " L ",
            "LBL",
            " L ",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "desk", wood, 1),
            "T F",
            "BBB",
            "L L",
            'L',
            lumber,
            'B',
            slab,
            'T',
            torch,
            'F',
            feather);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "table", wood, 1),
            "BBB",
            " L ",
            " L ",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "seat", wood, 1),
            " W ",
            " B ",
            "LLL",
            'L',
            lumber,
            'B',
            slab,
            'W',
            wool);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "map_frame", wood, 1),
            "LLL",
            "LBL",
            "LLL",
            'L',
            lumber,
            'B',
            planks);

        addShapelessRecipe(ModItems.getModItem("bibliocraft", "fancy_sign", wood, 1), sign, woodlabel, paper);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "fancy_workbench", wood, 1),
            "FCO",
            "LAL",
            "BBB",
            'L',
            lumber,
            'B',
            slab,
            'A',
            ModItems.getModItem("bibliocraft", "bookcase", wood, 1),
            'C',
            crafting_table,
            'F',
            feather,
            'O',
            "dyeBlack");

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "painting_t0", wood, 1),
            "LBL",
            "BBB",
            "LBL",
            'L',
            lumber,
            'B',
            slab);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "painting_t1", wood, 1),
            "LLL",
            "LPL",
            "LLL",
            'L',
            lumber,
            'P',
            paintingt0);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "painting_t2", wood, 1),
            "LBL",
            "LPL",
            "LBL",
            'L',
            lumber,
            'B',
            slab,
            'P',
            paintingt0);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "painting_t3", wood, 1),
            "LBL",
            "BPB",
            "LBL",
            'L',
            lumber,
            'B',
            slab,
            'P',
            paintingt0);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "painting_t4", wood, 1),
            "BBB",
            "BPB",
            "BBB",
            'B',
            slab,
            'P',
            paintingt0);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "seat_back", wood, 1),
            " W ",
            " B ",
            "L L",
            'L',
            lumber,
            'B',
            slab,
            'W',
            wool);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "seat_back_2", wood, 1),
            "LWL",
            "LBL",
            "L L",
            'L',
            lumber,
            'B',
            slab,
            'W',
            wool);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "seat_back_3", wood, 1),
            "B",
            "S",
            'B',
            slab,
            'S',
            seatback2);

        addShapedRecipe(ModItems.getModItem("bibliocraft", "seat_back_4", wood, 1), "W", "B", 'B', slab, 'W', wool);

        addShapedRecipe(
            ModItems.getModItem("bibliocraft", "fancy_clock", wood, 1),
            "LPL",
            "LSL",
            "BGB",
            'L',
            lumber,
            'B',
            slab,
            'P',
            clock,
            'S',
            "stickWood",
            'G',
            "ingotGold");
    }

    public void addModernWoodRecipes(String wood) {
        ItemStack lumber = ModItems.getModItem("base", "lumber", wood, 1);
        ItemStack planks = ModItems.getModItem("base", "planks", wood, 1);

        addShapelessRecipe(
            ModItems.getModItem("base", "lumber", wood, 4),
            Utils.getOreDictionaryName("logWood", wood),
            "toolSaw");
        addShapelessRecipe(
            ModItems.getModItem("base", "log_stripped", wood, 1),
            ModItems.getModItem("base", "log", wood, 1),
            "toolAxe");
        addShapelessRecipe(
            ModItems.getModItem("base", "wood_stripped", wood, 1),
            ModItems.getModItem("base", "wood", wood, 1),
            "toolAxe");

        addShapedRecipe(
            ModItems.getModItem("base", "wood", wood, 4),
            "LL",
            "LL",
            'L',
            ModItems.getModItem("base", "log", wood, 1));
        addShapedRecipe(
            ModItems.getModItem("base", "wood_stripped", wood, 4),
            "LL",
            "LL",
            'L',
            ModItems.getModItem("base", "log_stripped", wood, 1));

        addShapedRecipe(
            ModItems.getModItem("base", "thin_log", wood, 8),
            "L",
            "L",
            'L',
            ModItems.getModItem("base", "log", wood, 1));
        addShapelessRecipe(
            ModItems.getModItem("base", "thin_log_stripped", wood, 1),
            ModItems.getModItem("base", "thin_log", wood, 1),
            "toolAxe");
        addShapedRecipe(
            ModItems.getModItem("base", "thin_log_stripped", wood, 8),
            "L",
            "L",
            'L',
            ModItems.getModItem("base", "log_stripped", wood, 1));

        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 8),
            sawdust,
            1,
            ModItems.getModItem("base", "log", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 8),
            sawdust,
            1,
            ModItems.getModItem("base", "log_stripped", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 8),
            sawdust,
            1,
            ModItems.getModItem("base", "wood", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 8),
            sawdust,
            1,
            ModItems.getModItem("base", "wood_stripped", wood, 1));

        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 2),
            ModItems.getModItem("base", "sign", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 4),
            ModItems.getModItem("base", "button", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 8),
            ModItems.getModItem("base", "pressure_plate", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 2),
            ModItems.getModItem("base", "slab", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 3),
            ModItems.getModItem("base", "stairs", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 4),
            ModItems.getModItem("base", "fence", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 4),
            ModItems.getModItem("base", "fence_gate", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 6),
            ModItems.getModItem("base", "door", wood, 1));
        MekanismHelper.addSawmillRecipe(
            ModItems.getModItem("base", "lumber", wood, 3),
            ModItems.getModItem("base", "trapdoor", wood, 1));

        addShapedRecipe(
            ModItems.getModItem("base", "sign", wood, 3),
            "LLL",
            "LLL",
            " S ",
            'L',
            lumber,
            'S',
            "stickWood");

        addShapedRecipe(ModItems.getModItem("base", "button", wood, 1), "P", 'P', planks);

        addShapedRecipe(ModItems.getModItem("base", "pressure_plate", wood, 1), "PP", 'P', planks);

        addShapedRecipe(planks, "LL", "LL", 'L', lumber);

        addSlabRecipe(ModItems.getModItem("base", "slab", wood, 6), planks);

        addShapedRecipe(ModItems.getModItem("base", "slab", wood, 1), "LL", 'L', lumber);

        addShapedRecipe(planks, "L", "L", 'L', ModItems.getModItem("base", "slab", wood, 1));

        addStairsRecipe(ModItems.getModItem("base", "stairs", wood, 8), planks);

        addShapedRecipe(ModItems.getModItem("base", "stairs", wood, 1), "L ", "LL", 'L', lumber);

        addShapedRecipe(
            ModItems.getModItem("base", "planks", wood, 3),
            "LL",
            "LL",
            'L',
            ModItems.getModItem("base", "stairs", wood, 1));

        addShapedRecipe(ModItems.getModItem("base", "fence", wood, 4), "BLB", "BLB", 'L', lumber, 'B', planks);

        addShapedRecipe(ModItems.getModItem("base", "fence_gate", wood, 1), "BLB", "BLB", 'B', lumber, 'L', planks);

        addShapedRecipe(ModItems.getModItem("base", "door", wood, 1), "LL", "LL", "LL", 'L', lumber);

        addShapedRecipe(ModItems.getModItem("base", "trapdoor", wood, 2), "LLL", "LLL", 'L', lumber);

        addShapedRecipe(
            ModItems.getModItem("base", "boat", wood, 1),
            "L L",
            "LLL",
            'L',
            ModItems.getModItem("base", "planks", wood, 1));

        addShapedRecipe(
            ModItems.getModItem("base", "chest_boat", wood, 1),
            "C",
            "L",
            'L',
            ModItems.getModItem("base", "boat", wood, 1),
            'C',
            chest);
    }
}
