package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.recipes.*;

public class ScriptRemove implements IScript {

    ArrayList<ItemStack> remove = new ArrayList<ItemStack>();
    ArrayList<ItemStack> removeSmelting = new ArrayList<ItemStack>();
    ArrayList<ItemStack> removeArcane = new ArrayList<ItemStack>();

    public static final String[] itemsToRemove = new String[] { "minecraft:fence:0:*", "minecraft:fence_gate:0:*",
        "minecraft:wooden_door:0:*", "minecraft:trapdoor:0:*", "minecraft:sign:0:*",
        "minecraft:wooden_pressure_plate:0:*", "minecraft:wooden_button:0:*", "minecraft:sand:0:*",
        "minecraft:sandstone:1:*", "minecraft:sandstone:2:*" };

    public static final String[] itemsToRemoveAndHide = new String[] { "minecraft:wooden_sword:*:*",
        "minecraft:wooden_shovel:*:*", "minecraft:wooden_pickaxe:*:*", "minecraft:wooden_axe:*:*",
        "minecraft:wooden_hoe:*:*", "minecraft:stone_sword:*:*", "minecraft:stone_shovel:*:*",
        "minecraft:stone_pickaxe:*:*", "minecraft:stone_axe:*:*", "minecraft:stone_hoe:*:*",
        "BiomesOPlenty:swordMud:*:*", "BiomesOPlenty:shovelMud:*:*", "BiomesOPlenty:pickaxeMud:*:*",
        "BiomesOPlenty:axeMud:*:*", "BiomesOPlenty:hoeMud:*:*", "BiomesOPlenty:scytheMud:*:*",
        "BiomesOPlenty:helmetMud:*:*", "BiomesOPlenty:chestplateMud:*:*", "BiomesOPlenty:leggingsMud:*:*",
        "BiomesOPlenty:bootsMud:*:*", "BiomesOPlenty:scytheWood:*:*", "BiomesOPlenty:scytheStone:*:*",
        "BiomesOPlenty:mudBricks:0:*", "BiomesOPlenty:mudBricksStairs:*:*", "BiomesOPlenty:stoneSingleSlab:0:*",
        "TConstruct:metalPattern:*:*", "TConstruct:clayPattern:*:*", "TConstruct:Smeltery:4:*",
        "TConstruct:Smeltery:5:*", "TConstruct:SmelteryNether:4:*", "TConstruct:SmelteryNether:5:*",
        "BiblioCraft:BiblioPaneler:0", "BiblioCraft:BiblioPaneler:1", "BiblioCraft:BiblioPaneler:2",
        "BiblioCraft:BiblioPaneler:3", "BiblioCraft:BiblioPaneler:4", "BiblioCraft:BiblioPaneler:5",
        "BiblioCraft:item.SlottedBook:0:*", "VillageNames:sea_lantern:0:*", "VillageNames:prismarine:0:*",
        "VillageNames:prismarine:1:*", "VillageNames:prismarine:2:*", "VillageNames:prismarine_crystals:0:*",
        "VillageNames:prismarine_shard:0:*", "WitchingGadgets:WG_MetalDevice:0:*", "WitchingGadgets:WG_MetalDevice:1:*",
        "Thaumcraft:blockWoodenDevice:6:*", "Thaumcraft:blockWoodenDevice:7:*", "Botania:stone:0:*",
        "Botania:stone:1:*", "Botania:stone:2:*", "Botania:stone:3:*", "Botania:stone:4:*", "Botania:stone:3:*",
        "Botania:stone:4:*", "Botania:stone:5:*", "Botania:stone:6:*", "Botania:stone:7:*", "Botania:stone:8:*",
        "Botania:stone:9:*", "Botania:stone:10:*", "Botania:stone:11:*", "Botania:stone:12:*", "Botania:stone:13:*",
        "Botania:stone:14:*", "Botania:stone:15:*", "Botania:stone1Stairs:0:*", "Botania:stone1Slab:0:*",
        "Botania:stone9Stairs:0:*", "Botania:stone0Slab:0:*", "Botania:stone0Wall:1:*", "Botania:stone0Wall:0:*",
        "Botania:stone0Wall:2:*", "Botania:stone0Wall:3:*", "Botania:stone0Stairs:0:*", "Botania:stone0Slab:0:*",
        "Botania:stone2Stairs:0:*", "Botania:stone2Slab:0:*", "Botania:stone3Stairs:0:*", "Botania:stone3Slab:0:*",
        "Botania:stone8Stairs:0:*", "Botania:stone8Slab:0:*", "Botania:stone9Stairs:0:*", "Botania:stone9Slab:0:*",
        "Botania:stone10Stairs:0:*", "Botania:stone10Slab:0:*", "Botania:stone11Stairs:0:*", "Botania:stone11Slab:0:*",
        "Botania:endStoneBrick:0:*", "Botania:endStoneBrick:1:*", "Botania:endStoneBrick:2:*",
        "Botania:endStoneBrick:3:*", "Botania:endStoneBrick0Stairs:*:*", "endStoneBrick2Stairs:*:*",
        "Botania:endStoneBrick0Slab:*:*", "endStoneBrick2Slab:*:*", "ForbiddenMagic:FMResource:2:*",
        "ForbiddenMagic:FMResource:4:*", "etfuturum:copper_ore:0:*", "etfuturum:copper_ingot:0:*",
        "netherlicious:NetherbrickWall:4:*", "netherlicious:NetherbrickWall:6:*", "netherlicious:NetherbrickWall:8:*",
        "netherlicious:NetherbrickWall:10:*", "netherlicious:NetherbrickWall:13:*", "witchery:ingredient:52:*",
        "witchery:ingredient:53:*", "witchery:ingredient:54:*", "witchery:ingredient:152:*",
        "GardenStuff:iron_nugget:0:*", "jaff:iron_nugget:0:*" };

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
        "ThaumicExploration:chestSealLinked:*:*", "ThaumicExploration:jarSeal:*:*", "ThaumicExploration:boundChest:*:*",
        "Thaumcraft:ItemNugget:21:*", "Thaumcraft:ItemNugget:16:*", "Thaumcraft:ItemNugget:31:*",
        "Thaumcraft:ItemNugget:1:*", "Thaumcraft:ItemNugget:17:*", "Thaumcraft:ItemNugget:2:*",
        "Thaumcraft:ItemNugget:18:*", "Thaumcraft:ItemNugget:3:*", "Thaumcraft:ItemNugget:19:*",
        "Thaumcraft:ItemNugget:4:*", "Thaumcraft:ItemNugget:20:*" };

    public void init() {
        for (String s : itemsToRemove) {
            remove.add(ModItems.getItem(s));
        }

        for (String s : itemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
        }

        for (String s : metalItemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
            removeSmelting.add(ModItems.getItem(s));
        }

        for (String s : thaumcraftItemsToRemoveAndHide) {
            remove.add(ModItems.getItem(s));
            removeArcane.add(ModItems.getItem(s));
        }

        for (String s : ModItems.CuttingBlocksFull) {
            if (s != null) {
                remove.add(ModItems.getItem(s + ":*"));
            }
        }

        for (String s : ModItems.CuttingBlocksSlab) {
            if (s != null) {
                remove.add(ModItems.getItem(s + ":*"));
            }
        }

        for (String s : ModItems.CuttingBlocksStairs) {
            if (s != null) {
                remove.add(ModItems.getItem(s + ":*"));
            }
        }

        for (String s : ModItems.CuttingBlocksWall) {
            if (s != null) {
                remove.add(ModItems.getItem(s + ":*"));
            }
        }

        for (String s : Constants.metalTypes) {
            removeMetalRecipes(s);
        }

        for (String s : Constants.woodTypes) {
            removeModernWoodRecipes(s);
            removeBibliocraftWoodRecipes(s);
        }

        for (String s : Constants.bopWoodTypes) {
            removeModernWoodRecipes(s);
            removeBibliocraftWoodRecipes(s);
        }

        for (String s : Constants.thaumcraftWoodTypes) {
            removeModernWoodRecipes(s);
        }

        for (String s : Constants.witcheryWoodTypes) {
            removeModernWoodRecipes(s);
        }

        for (String s : Constants.toolTypes) {
            removeToolRecipes(s);
        }
        removeToolRecipes("diamond");
    }

    public void postInit() {
        RecipesHelper.removeRecipe(remove);
        RecipesHelper.removeFurnaceSmelting(removeSmelting);

        for (ItemStack s : removeArcane) {
            TCHelper.removeArcaneRecipe(s);
            TCHelper.removeCrucibleRecipe(s);
        }

        TinkerHelper.removeAllMeltingRecipes();
        TinkerHelper.removeAllCastingRecipes();

        IEHelper.removeAllPressRecipes();
        IEHelper.removeAllCrusherRecipes();

        MekanismHelper.removeAllCrusherRecipes();
        MekanismHelper.removeAllEnrichmentRecipes();
        MekanismHelper.removeAllSawmillRecipes();
    }

    public void removeMetalRecipes(String metal) {
        for (int i = 0; i < ModItems.BaseMetalItems.length; i++) {
            ItemStack item = ModItems.getModItem("metal", ModItems.BaseMetalItems[i], metal, 1);
            if (item != null) {
                remove.add(item);
                removeSmelting.add(item);
            }
        }
        for (int i = 0; i < ModItems.BaseMetalOreItems.length; i++) {
            ItemStack item = ModItems.getModItem("metal", ModItems.BaseMetalOreItems[i], metal, 1);
            if (item != null) {
                remove.add(item);
                removeSmelting.add(item);
            }
        }
    }

    public void removeBibliocraftWoodRecipes(String wood) {
        for (int i = 0; i < ModItems.BiblioBlocks.length; i++) {
            remove
                .add(ModItems.getModItem("bibliocraft", ModItems.BiblioBlocks[i], wood, OreDictionary.WILDCARD_VALUE));
        }
        for (int i = 0; i < ModItems.BiblioItems.length; i++) {
            remove.add(ModItems.getModItem("bibliocraft", ModItems.BiblioItems[i], wood, OreDictionary.WILDCARD_VALUE));
        }
    }

    public void removeModernWoodRecipes(String wood) {
        remove.add(ModItems.getModItem("base", "planks", wood, OreDictionary.WILDCARD_VALUE));
        remove.add(ModItems.getModItem("base", "stairs", wood, OreDictionary.WILDCARD_VALUE));
        remove.add(ModItems.getModItem("base", "slab", wood, OreDictionary.WILDCARD_VALUE));
    }

    public void removeToolRecipes(String metal) {
        for (String s : ModItems.MetalToolsParts) {
            remove.add(ModItems.getModItem("tool", s, metal, OreDictionary.WILDCARD_VALUE));
        }
        for (String s : ModItems.MetalToolsPartsModded) {
            remove.add(ModItems.getModItem("tool", s, metal, OreDictionary.WILDCARD_VALUE));
        }
    }
}
