package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.recipes.ModItems;
import net.pufferlab.materialis.recipes.RecipesHelper;
import net.pufferlab.materialis.recipes.TCHelper;

public class ScriptRemove implements IScript {

    ArrayList<ItemStack> remove = new ArrayList<ItemStack>();

    public static final String[] itemsToRemove = new String[] { "minecraft:fence:0:*", "minecraft:fence_gate:0:*",
        "minecraft:wooden_door:0:*", "minecraft:trapdoor:0:*", "minecraft:sign:0:*" };

    public static final String[] itemsToRemoveAndHide = new String[] { "minecraft:wooden_sword:*:*",
        "minecraft:wooden_shovel:*:*", "minecraft:wooden_pickaxe:*:*", "minecraft:wooden_axe:*:*",
        "minecraft:wooden_hoe:*:*", "minecraft:stone_sword:*:*", "minecraft:stone_shovel:*:*",
        "minecraft:stone_pickaxe:*:*", "minecraft:stone_axe:*:*", "minecraft:stone_hoe:*:*",
        "BiblioCraft:BiblioPaneler:0", "BiblioCraft:BiblioPaneler:1", "BiblioCraft:BiblioPaneler:2",
        "BiblioCraft:BiblioPaneler:3", "BiblioCraft:BiblioPaneler:4", "BiblioCraft:BiblioPaneler:5",
        "BiblioCraft:item.SlottedBook:0:*", "VillageNames:sea_lantern:0:*", "VillageNames:prismarine:0:*",
        "VillageNames:prismarine:1:*", "VillageNames:prismarine:2:*", "VillageNames:prismarine_crystals:0:*",
        "VillageNames:prismarine_shard:0:*", "WitchingGadgets:WG_MetalDevice:0:*",
        "WitchingGadgets:WG_MetalDevice:1:*", };

    public static final String[] metalItemsToRemoveAndHide = new String[] { "netherlicious:Nugget:0:*",
        "etfuturum:nugget_iron:0:*", "Mekanism:Dust:0:*", "Mekanism:Dust:1:*", "Mekanism:Dust:2:*", "Mekanism:Dust:3:*",
        "Mekanism:Dust:4:*", "Mekanism:Dust:5:*", "Mekanism:Dust:6:*", "Mekanism:OtherDust:0:*",
        "Mekanism:OtherDust:1:*", "Mekanism:BasicBlock:2:*", "Mekanism:BasicBlock:4:*", "Mekanism:Ingot:0:*",
        "Mekanism:Ingot:1:*", "Mekanism:Ingot:2:*", "Mekanism:Ingot:3:*", "Mekanism:Ingot:4:*", "Mekanism:Ingot:5:*",
        "Mekanism:Ingot:6:*", "Mekanism:Ingot:7:*", "Mekanism:OreBlock:1", "Mekanism:OreBlock:2",
        "Mekanism:DeepslateOreBlock:1", "Mekanism:DeepslateOreBlock:2" };

    public static final String[] thaumcraftItemsToRemoveAndHide = new String[] { "WitchingGadgets:item.WG_Kama:*:*",
        "Thaumcraft:GolemBell:*:*", "ThaumicHorizons:boatGreatwood:*:*", "ThaumicHorizons:boatThaumium:*:*",
        "ThaumicTinkerer:fireEarth:*:*", "ThaumicTinkerer:fireFire:*:*", "ThaumicTinkerer:fireOrder:*:*",
        "ThaumicTinkerer:fireWater:*:*", "ThaumicTinkerer:fireChaos:*:*", "ThaumicTinkerer:fireAir:*:*",
        "ThaumicTinkerer:enchanter:*:*", "ThaumicExploration:blankSeal:*:*", "ThaumicExploration:chestSeal:*:*",
        "ThaumicExploration:chestSealLinked:*:*", "ThaumicExploration:jarSeal:*:*",
        "ThaumicExploration:boundChest:*:*" };

    public void init() {
        for (String s : itemsToRemove) {
            remove.add(ModItems.getItem(s));
        }

        for (String s : itemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
        }

        for (String s : metalItemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
        }

        for (String s : thaumcraftItemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
        }

        for (int i = 0; i < Constants.woodTypes.length; i++) {
            removeBibliocraftWoodRecipes(Constants.woodTypes[i]);
        }

        for (int i = 0; i < Constants.bopWoodTypes.length; i++) {
            removeBibliocraftWoodRecipes(Constants.bopWoodTypes[i]);
        }

        // Remove at the end
        removeRecipe(remove);
    }

    public void postInit() {
        // Remove at the end
        removeRecipe(remove);

        for (String s : metalItemsToRemoveAndHide) {
            RecipesHelper.removeFurnaceSmelting(ModItems.getItem(s));
        }

        for (String s : thaumcraftItemsToRemoveAndHide) {
            TCHelper.removeArcaneRecipe(ModItems.getItem(s));
            TCHelper.removeCrucibleRecipe(ModItems.getItem(s));
        }
    }

    public void removeBibliocraftWoodRecipes(String wood) {
        for (int i = 0; i < ModItems.BiblioBlocks.length; i++) {
            remove.add(ModItems.getModItem("bibliocraft", ModItems.BiblioBlocks[i], wood, 1));
        }
        for (int i = 0; i < ModItems.BiblioItems.length; i++) {
            remove.add(ModItems.getModItem("bibliocraft", ModItems.BiblioItems[i], wood, 1));
        }
    }
}
