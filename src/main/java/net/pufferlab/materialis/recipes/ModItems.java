package net.pufferlab.materialis.recipes;

import static biomesoplenty.api.content.BOPCBlocks.*;
import static jds.bibliocraft.blocks.BlockLoader.*;
import static jds.bibliocraft.items.ItemLoader.*;
import static jds.bibliowood.bopwood.WoodsLoader.*;
import static net.minecraft.init.Blocks.*;

import java.io.*;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Registry;
import net.pufferlab.materialis.Utils;

import biomesoplenty.api.content.BOPCBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import jds.bibliocraft.blocks.BlockLoader;
import jds.bibliocraft.items.ItemLoader;
import jds.bibliowood.bopwood.WoodsLoader;

public class ModItems {

    public static final String[] BiblioBlocks = new String[] { "bookcase", "potion_shelf", "shelf", "tool_rack",
        "glass_case", "wood_label", "desk", "table", "seat", "map_frame", "fancy_sign", "fancy_workbench",
        "painting_t0", "painting_t1", "painting_t2", "painting_t3", "painting_t4", "fancy_clock" };
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

    public static ItemStack getItem(String mod, String item, int meta, int number) {
        if (GameRegistry.findItem(mod, item) != null) {
            return new ItemStack(GameRegistry.findItem(mod, item), number, meta);
        } else if (GameRegistry.findBlock(mod, item) != null) {
            return new ItemStack(GameRegistry.findBlock(mod, item), number, meta);
        }
        return new ItemStack(Registry.ingot, 1, 1);
    }

    public static ItemStack getItem(String s) {
        String[] array = s.split(":");
        String mod = array[0];
        String item = array[1];
        int meta = 0;
        if (array.length > 2) {
            if (array[2].equals("*")) {
                meta = OreDictionary.WILDCARD_VALUE;
            } else {
                meta = Integer.parseInt(array[2]);
            }
        }
        int number = 1;
        if (array.length > 3) {
            if (array[3].equals("*")) {
                number = OreDictionary.WILDCARD_VALUE;
            } else {
                number = Integer.parseInt(array[3]);
            }
        }

        return getItem(mod, item, meta, number);
    }

    public static String getSpecialMetaString(String[] blocks, String block, String type, int metaCap) {
        int log = Utils.getItemFromArray(blocks, block);
        int logType = (int) Math.floor((log + 1) / (metaCap + 1));

        return type + (logType + 1);
    }

    public static int getSpecialMeta(String[] blocks, String block, int metaCap) {
        int log = Utils.getItemFromArray(blocks, block);

        return log & (metaCap - 1);
    }

    public static ItemStack getModItem(String mod, String name, String wood, int number) {
        boolean isBopWood = Utils.containsExactMatch(Constants.bopWoodTypes, wood);
        boolean isVanillaWood = Utils.containsExactMatch(Constants.woodTypes, wood);
        boolean isOak = wood.equals("oak");

        if (mod.equals("bibliocraft")) {
            if (Utils.containsExactMatch(BiblioBlocks, name)) {
                if (isBopWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioBlocks, BiblioBlocksBOP, name),
                        number,
                        Utils.getItemFromArray(bopWoodTypes_Biblio_IDs, Constants.bopWoodTypes, wood));
                } else if (isVanillaWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioBlocks, BiblioBlocksVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
            if (Utils.containsExactMatch(BiblioItems, name)) {
                if (isBopWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioItems, BiblioItemsBOP, name),
                        number,
                        Utils.getItemFromArray(bopWoodTypes_Biblio_IDs, Constants.bopWoodTypes, wood));
                } else if (isVanillaWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BiblioItems, BiblioItemsVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
        }

        if (mod.equals("base")) {
            if (name.equals("log")) {
                if (isBopWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksBOP,
                            getSpecialMetaString(Constants.bopLogTypes, wood, "log", 4)),
                        number,
                        getSpecialMeta(Constants.bopLogTypes, wood, 4));
                } else if (isVanillaWood) {
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
                if (isBopWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BaseWoodBlocks, BaseWoodBlocksBOP, name),
                        number,
                        Utils.getItemFromArray(Constants.bopPlankTypes, wood));
                } else if (isVanillaWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(BaseWoodBlocks, BaseWoodBlocksVanilla, name),
                        number,
                        Utils.getItemFromArray(Constants.woodTypes, wood));
                }
            }
            if (name.equals("slab")) {
                if (isBopWood) {
                    return new ItemStack(
                        Utils.getItemFromArray(
                            BaseWoodBlocks,
                            BaseWoodBlocksBOP,
                            getSpecialMetaString(Constants.bopWoodTypes, wood, "slab", 8)),
                        number,
                        getSpecialMeta(Constants.bopWoodTypes, wood, 8));
                } else if (isVanillaWood) {
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
                return ModItems.getItem("TConstruct", wood + "_lumber", 0, number);
            }
            if (name.equals("fence")) {
                if (isBopWood) {
                    return ModItems.getItem(
                        "etfuturum",
                        "bop_wood_fence",
                        Utils.getItemFromArray(Constants.bopPlankTypes, wood),
                        number);
                } else if (isVanillaWood) {
                    if (isOak) {
                        return ModItems.getItem("minecraft", "fence", 0, 1);
                    } else {
                        return ModItems.getItem("etfuturum", "fence_" + wood, 0, number);
                    }
                }
            }
            if (name.equals("fence_gate")) {
                if (isBopWood) {
                    return ModItems.getItem("etfuturum", "bop_" + wood + "_fence_gate", 0, number);
                } else if (isVanillaWood) {
                    if (isOak) {
                        return ModItems.getItem("minecraft", "fence_gate", 0, 1);
                    } else {
                        return ModItems.getItem("etfuturum", "fence_gate_" + wood, 0, number);
                    }
                }
            }
            if (name.equals("door")) {
                if (isBopWood) {
                    return ModItems.getItem("etfuturum", "bop_" + wood + "_door", 0, number);
                } else if (isVanillaWood) {
                    if (isOak) {
                        return ModItems.getItem("minecraft", "wooden_door", 0, number);
                    } else {
                        return ModItems.getItem("etfuturum", "door_" + wood, 0, number);
                    }
                }
            }
            if (name.equals("trapdoor")) {
                if (isBopWood) {
                    return ModItems.getItem("etfuturum", "bop_" + wood + "_trapdoor", 0, number);
                } else if (isVanillaWood) {
                    if (isOak) {
                        return ModItems.getItem("minecraft", "trapdoor", 0, number);
                    } else {
                        return ModItems.getItem("etfuturum", "trapdoor_" + wood, 0, number);
                    }
                }
            }
            if (name.equals("sign")) {
                if (isBopWood) {
                    return ModItems.getItem("etfuturum", "bop_" + wood + "_sign", 0, number);
                } else if (isVanillaWood) {
                    if (isOak) {
                        return ModItems.getItem("minecraft", "sign", 0, number);
                    } else {
                        return ModItems.getItem("etfuturum", "item_sign_" + wood, 0, number);
                    }
                }
            }
        }

        return new ItemStack(Registry.ingot, 1, 1);
    }

}
