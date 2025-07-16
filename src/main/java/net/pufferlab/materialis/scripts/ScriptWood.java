package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.scripts.ItemList.*;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.recipes.ModItems;

public class ScriptWood implements IScript {

    public void run() {
        for (int i = 0; i < Constants.woodTypes.length; i++) {
            addSpecialWoodRecipes(Constants.woodTypes[i]);
        }

        for (int i = 0; i < Constants.bopWoodTypes.length; i++) {
            addSpecialWoodRecipes(Constants.bopWoodTypes[i]);
        }
    }

    public void addSpecialWoodRecipes(String wood) {
        ItemStack lumber = ModItems.get("TConstruct", wood + "_lumber", 0, 1);
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
    }
}
