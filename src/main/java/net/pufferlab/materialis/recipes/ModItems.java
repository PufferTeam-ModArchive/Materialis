package net.pufferlab.materialis.recipes;

import static biomesoplenty.api.content.BOPCBlocks.*;
import static jds.bibliocraft.blocks.BlockLoader.*;
import static jds.bibliocraft.items.ItemLoader.*;
import static jds.bibliowood.bopwood.WoodsLoader.*;
import static net.minecraft.init.Blocks.*;

import java.io.*;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Utils;

import biomesoplenty.api.content.BOPCBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import jds.bibliocraft.blocks.BlockLoader;
import jds.bibliocraft.items.ItemLoader;
import jds.bibliowood.bopwood.WoodsLoader;

public class ModItems {

    public static final String[] BiblioBlocks = new String[] { "bookcase", "potion_shelf", "shelf", "tool_rack",
        "glass_case", "wood_label", "desk", "table", "seat", "map_frame", "fancy_sign", "fancy_workbench",
        "painting_t0", "painting_t1", "painting_t2", "painting_t3", "painting_t4", "clock" };
    public static final Block[] BiblioBlocksVanilla = new Block[] { BlockLoader.bookcase, BlockLoader.potionShelf,
        BlockLoader.genericShelf, BlockLoader.toolRack, BlockLoader.weaponCase, BlockLoader.woodLabel,
        BlockLoader.writingDesk, BlockLoader.table, BlockLoader.seat, BlockLoader.mapFrame, BlockLoader.fancySign,
        BlockLoader.fancyWorkbench, BlockLoader.paintingBorderless, BlockLoader.paintingFlat,
        BlockLoader.paintingSimple, BlockLoader.paintingMiddle, BlockLoader.paintingFancy, BlockLoader.fancyclock };
    public static final Block[] BiblioBlocksBOP = new Block[] { WoodsLoader.bookcase, WoodsLoader.potionShelf,
        WoodsLoader.shelf, WoodsLoader.toolRack, WoodsLoader.glassCase, WoodsLoader.woodLabel, WoodsLoader.desk,
        WoodsLoader.table, WoodsLoader.seat, WoodsLoader.mapFrame, WoodsLoader.fancysign, WoodsLoader.fancyworkbench,
        WoodsLoader.paintingt0, WoodsLoader.paintingt1, WoodsLoader.paintingt2, WoodsLoader.paintingt3,
        WoodsLoader.paintingt4, WoodsLoader.clock };

    public static final String[] BiblioItems = new String[] { "seat_back", "seat_back_2", "seat_back_3",
        "seat_back_4" };
    public static final Item[] BiblioItemsVanilla = new Item[] { ItemLoader.seatBack, ItemLoader.seatBack2,
        ItemLoader.seatBack3, ItemLoader.seatBack4 };
    public static final Item[] BiblioItemsBOP = new Item[] { WoodsLoader.seatBack, WoodsLoader.seatBack2,
        WoodsLoader.seatBack3, WoodsLoader.seatBack4 };

    public static final String[] BaseWoodBlocks = new String[] { "log1", "log2", "log3", "log4", "planks", "slab1",
        "slab2" };
    public static final Block[] BaseWoodBlocksVanilla = new Block[] { Blocks.log, Blocks.log2, null, null,
        Blocks.planks, Blocks.wooden_slab, null };
    public static final Block[] BaseWoodBlocksBOP = new Block[] { BOPCBlocks.logs1, BOPCBlocks.logs2, BOPCBlocks.logs3,
        BOPCBlocks.logs4, BOPCBlocks.planks, BOPCBlocks.woodenSingleSlab1, BOPCBlocks.woodenSingleSlab2 };

    public static final int[] bopWoodTypes_Biblio_IDs = new int[] { 0, 1, 2, 3, 5, 7, 8, 9, 11, 12, 10, 4, 6, 13 };
    public static final int[] bopWoodTypes_Drawer_IDs = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14 };

    public static ItemStack get(String mod, String item, int meta, int number) {
        if (GameRegistry.findItem(mod, item) != null) {
            return new ItemStack(GameRegistry.findItem(mod, item), number, meta);
        } else if (GameRegistry.findBlock(mod, item) != null) {
            return new ItemStack(GameRegistry.findBlock(mod, item), number, meta);
        }
        return new ItemStack(Items.apple, 0, 1);
    }

    public static String getSpecialMetaString(String[] blocks, String block, String type, int metaCap) {
        int log = Utils.getItemFromArray(blocks, block);
        int logType = (int) Math.floor((log + 1) / (metaCap + 1));
        String logTypeString = type + (logType + 1);

        return logTypeString;
    }

    public static int getSpecialMeta(String[] blocks, String block, int metaCap) {
        int log = Utils.getItemFromArray(blocks, block);
        int logID = log & (metaCap - 1);

        return logID;
    }

    public static ItemStack getModItem(String mod, String name, String wood, int number) {
        if (mod.equals("bibliocraft")) {
            if (Utils.containsExactMatch(BiblioBlocks, name)) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioBlocks, BiblioBlocksBOP, name),
                        number,
                        Utils.getItemFromArray(bopWoodTypes_Biblio_IDs, Constants.bopWoodTypes, wood));
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioBlocks, BiblioBlocksVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
            if (Utils.containsExactMatch(BiblioItems, name)) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioItems, BiblioItemsBOP, name),
                        number,
                        Utils.getItemFromArray(bopWoodTypes_Biblio_IDs, Constants.bopWoodTypes, wood));
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioItems, BiblioItemsVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
        }

        if (mod.equals("base")) {
            if (name.equals("log")) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksBOP,
                            getSpecialMetaString(Constants.bopLogTypes, wood, "log", 4)),
                        number,
                        getSpecialMeta(Constants.bopLogTypes, wood, 4));
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksVanilla,
                            getSpecialMetaString(Constants.woodTypes, wood, "log", 4)),
                        number,
                        getSpecialMeta(Constants.woodTypes, wood, 4));
                }
            }
            if (name.equals("planks")) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BaseWoodBlocks, BaseWoodBlocksBOP, name),
                        number,
                        Utils.getItemFromArray(Constants.bopPlankTypes, wood));
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(BaseWoodBlocks, BaseWoodBlocksVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
            if (name.equals("slab")) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksBOP,
                            getSpecialMetaString(Constants.bopWoodTypes, wood, "slab", 8)),
                        number,
                        getSpecialMeta(Constants.bopWoodTypes, wood, 8));
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksVanilla,
                            getSpecialMetaString(Constants.woodTypes, wood, "slab", 8)),
                        number,
                        getSpecialMeta(Constants.woodTypes, wood, 8));
                }
            }
            if (name.equals("lumber")) {
                return ModItems.get("TConstruct", wood + "_lumber", 0, number);
            }
            if (name.equals("sign")) {
                if (Utils.containsExactMatch(Constants.bopWoodTypes, wood)) {
                    return ModItems.get("etfuturum", "bop_" + wood + "_sign", 0, number);
                } else if (Utils.containsExactMatch(Constants.woodTypes, wood)) {
                    return ModItems.get("etfuturum", "item_sign_" + wood, 0, number);
                }
            }
        }

        return new ItemStack(Items.apple, 0, 1);
    }

}
