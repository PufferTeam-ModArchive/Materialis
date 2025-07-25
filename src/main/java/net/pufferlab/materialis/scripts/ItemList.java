package net.pufferlab.materialis.scripts;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Registry;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.ModItems;

import mekanism.common.MekanismItems;

public class ItemList {

    public static final ItemStack chest = new ItemStack(Blocks.chest, 1, 0);
    public static final ItemStack crafting_table = new ItemStack(Blocks.crafting_table, 1, 0);
    public static final ItemStack glass = new ItemStack(Blocks.glass, 1, 0);
    public static final ItemStack wool = new ItemStack(Blocks.wool, 1, 0);
    public static final ItemStack torch = new ItemStack(Blocks.torch, 1, 0);
    public static final ItemStack feather = new ItemStack(Items.feather, 1, 0);
    public static final ItemStack paper = new ItemStack(Items.paper, 1, 0);
    public static final ItemStack clock = new ItemStack(Items.clock, 1, 0);

    public static final ItemStack copperNugget = new ItemStack(
        Registry.nugget,
        1,
        Utils.getItemFromArray(Constants.metalTypes, "copper"));
    public static final ItemStack tinNugget = new ItemStack(
        Registry.nugget,
        1,
        Utils.getItemFromArray(Constants.metalTypes, "tin"));
    public static final ItemStack silverNugget = new ItemStack(
        Registry.nugget,
        1,
        Utils.getItemFromArray(Constants.metalTypes, "silver"));
    public static final ItemStack leadNugget = new ItemStack(
        Registry.nugget,
        1,
        Utils.getItemFromArray(Constants.metalTypes, "lead"));
    public static final ItemStack nickelNugget = new ItemStack(
        Registry.nugget,
        1,
        Utils.getItemFromArray(Constants.metalTypes, "nickel"));
    public static final ItemStack slag = new ItemStack(
        Registry.gem,
        1,
        Utils.getItemFromArray(Constants.gemTypes, "slag"));
    public static final ItemStack richSlag = new ItemStack(
        Registry.gem,
        1,
        Utils.getItemFromArray(Constants.gemTypes, "rich_slag"));

    public static final ItemStack plateCastSteel = ModItems
        .getItem("materialis", "cast_steel", Utils.getItemFromArray(Constants.castTypesAdvanced, "plate"), 1);
    public static final ItemStack gearCastSteel = ModItems
        .getItem("materialis", "cast_steel", Utils.getItemFromArray(Constants.castTypesAdvanced, "gear"), 1);
    public static final ItemStack rodCastSteel = ModItems
        .getItem("materialis", "cast_steel", Utils.getItemFromArray(Constants.castTypesAdvanced, "rod"), 1);

    public static final ItemStack sawdust = new ItemStack(MekanismItems.Sawdust, 1, 0);
}
