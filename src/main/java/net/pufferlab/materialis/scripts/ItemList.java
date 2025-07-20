package net.pufferlab.materialis.scripts;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Registry;

import blusunrize.immersiveengineering.common.IEContent;

public class ItemList {

    public static final ItemStack crafting_table = new ItemStack(Blocks.crafting_table, 1, 0);
    public static final ItemStack glass = new ItemStack(Blocks.glass, 1, 0);
    public static final ItemStack wool = new ItemStack(Blocks.wool, 1, 0);
    public static final ItemStack torch = new ItemStack(Blocks.torch, 1, 0);
    public static final ItemStack feather = new ItemStack(Items.feather, 1, 0);
    public static final ItemStack paper = new ItemStack(Items.paper, 1, 0);
    public static final ItemStack clock = new ItemStack(Items.clock, 1, 0);

    public static final ItemStack copperNugget = new ItemStack(Registry.nugget, 1, 2);
    public static final ItemStack tinNugget = new ItemStack(Registry.nugget, 1, 3);
    public static final ItemStack silverNugget = new ItemStack(Registry.nugget, 1, 4);
    public static final ItemStack leadNugget = new ItemStack(Registry.nugget, 1, 5);
    public static final ItemStack nickelNugget = new ItemStack(Registry.nugget, 1, 6);

    public static final ItemStack plateMold = new ItemStack(IEContent.itemMold, 1, 0);
    public static final ItemStack gearMold = new ItemStack(IEContent.itemMold, 1, 1);

}
