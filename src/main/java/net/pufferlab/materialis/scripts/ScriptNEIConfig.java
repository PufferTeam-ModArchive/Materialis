package net.pufferlab.materialis.scripts;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Tags;
import net.pufferlab.materialis.recipes.ModItems;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class ScriptNEIConfig implements IConfigureNEI {

    public ArrayList<ItemStack> hide = new ArrayList<ItemStack>();
    public ArrayList<ItemStack> show = new ArrayList<ItemStack>();

    public static final String[] itemsToHide = new String[] { "materialis:double_cobblestone_slab:*",
        "AWWayofTime:bloodLight:*", "AWWayofTime:spectralContainer:*", "AWWayofTime:blockSchemSaver:*",
        "AWWayofTime:blockMimic:*", "chisel:amber", "BiomesOPlenty:woodenDoubleSlab1:*",
        "BiomesOPlenty:woodenDoubleSlab2:*", "BiomesOPlenty:fruitBop:*", "BiomesOPlenty:stoneDoubleSlab:*",
        "BiblioCraft:BiblioClipboard", "BiblioCraft:BookcaseFilled:*", "Botania:buriedPetals:*", "Botania:manaFlame",
        "Botania:fakeAir", "Botania:gaiaHeadBlock", "Botania:quartzSlabDarkFull:*", "Botania:quartzSlabManaFull:*",
        "Botania:quartzSlabBlazeFull:*", "Botania:quartzSlabLavenderFull:*", "Botania:quartzSlabRedFull:*",
        "Botania:quartzSlabElfFull:*", "Botania:quartzSlabSunnyFull:*", "Botania:livingwood0SlabFull:*",
        "Botania:livingwood1SlabFull:*", "Botania:livingrock0SlabFull:*", "Botania:livingrock1SlabFull:*",
        "Botania:dreamwood0SlabFull:*", "Botania:dreamwood1SlabFull:*", "Botania:reedBlock0SlabFull:*",
        "Botania:thatch0SlabFull:*", "Botania:prismarine0SlabFull:*", "Botania:prismarine1SlabFull:*",
        "Botania:prismarine2SlabFull:*", "Botania:customBrick0SlabFull:*", "Botania:customBrick1SlabFull:*",
        "Botania:customBrick2SlabFull:*", "Botania:customBrick3SlabFull:*", "Botania:dirtPath0SlabFull:*",
        "Botania:endStoneBrick0SlabFull:*", "Botania:endStoneBrick2SlabFull:*", "Botania:shimmerrock0SlabFull:*",
        "Botania:shimmerwoodPlanks0SlabFull:*", "Botania:biomeStoneA0SlabFull:*", "Botania:biomeStoneA1SlabFull:*",
        "Botania:biomeStoneA2SlabFull:*", "Botania:biomeStoneA3SlabFull:*", "Botania:biomeStoneA4SlabFull:*",
        "Botania:biomeStoneA5SlabFull:*", "Botania:biomeStoneA6SlabFull:*", "Botania:biomeStoneA7SlabFull:*",
        "Botania:biomeStoneA8SlabFull:*", "Botania:biomeStoneA9SlabFull:*", "Botania:biomeStoneA10SlabFull:*",
        "Botania:biomeStoneA11SlabFull:*", "Botania:biomeStoneA12SlabFull:*", "Botania:biomeStoneA13SlabFull:*",
        "Botania:biomeStoneA14SlabFull:*", "Botania:biomeStoneA15SlabFull:*", "Botania:biomeStoneB0SlabFull:*",
        "Botania:biomeStoneB1SlabFull:*", "Botania:biomeStoneB2SlabFull:*", "Botania:biomeStoneB3SlabFull:*",
        "Botania:biomeStoneB4SlabFull:*", "Botania:biomeStoneB5SlabFull:*", "Botania:biomeStoneB6SlabFull:*",
        "Botania:biomeStoneB7SlabFull:*", "Botania:stone0SlabFull:*", "Botania:stone1SlabFull:*",
        "Botania:stone2SlabFull:*", "Botania:stone3SlabFull:*", "Botania:stone8SlabFull:*", "Botania:stone9SlabFull:*",
        "Botania:stone10SlabFull:*", "Botania:stone11SlabFull:*", "Botania:pavement0SlabFull:*",
        "Botania:pavement1SlabFull:*", "Botania:pavement2SlabFull:*", "Botania:pavement3SlabFull:*",
        "Botania:pavement4SlabFull:*", "Botania:pavement5SlabFull:*", "Thaumcraft:blockManaPod:*",
        "Thaumcraft:blockArcaneDoor:*", "Thaumcraft:blockMagicBox:*", "Thaumcraft:blockAlchemyFurnace:*",
        "Thaumcraft:blockArcaneFurnace:*", "Thaumcraft:blockWarded:*", "Thaumcraft:blockHole:*",
        "Thaumcraft:blockPortalEldritch:*", "Thaumcraft:blockEldritchNothing", "netherlicious:PlankDoubleSlab:*",
        "netherlicious:BrickDoubleSlab:*", "netherlicious:BrickDoubleSlab2:*", "netherlicious:BasaltDoubleSlab:*",
        "netherlicious:QuartzDoubleSlab:*", "netherlicious:doorcrimson:*", "netherlicious:doorwarped:*",
        "netherlicious:doorfoxfire:*", "netherlicious:netherlicious.crimsonSignStanding:*",
        "netherlicious:netherlicious.crimsonSignWall:*", "netherlicious:netherlicious.warpedSignStanding:*",
        "netherlicious:netherlicious.warpedSignWall:*", "netherlicious:netherlicious.foxfireSignStanding:*",
        "netherlicious:netherlicious.foxfireSignWall:*", "netherlicious:FurnaceBlackstoneLit:*",
        "netherlicious:DevilishMaize:0", "netherlicious:HellderBerryBush:0", "netherlicious:AbyssalOat:0",
        "netherlicious:CrimsonWartCrop:0", "netherlicious:WarpedWartCrop:0", "netherlicious:SoggyWartCrop:0",
        "netherlicious:FullWood:6", "netherlicious:FullWood:7", "netherlicious:ShroomLight:1",
        "netherlicious:Wartblock:4", "WitchingGadgets:WG_CustomAir:*", "ThaumicHorizons:vat:*",
        "ThaumicHorizons:vatSolid:*", "ThaumicHorizons:vatInterior:*", "ThaumicHorizons:light:*",
        "ThaumicHorizons:lightSolar:*", "ThaumicHorizons:cloudTH:*", "ThaumicHorizons:cloudGlowingTH:*",
        "ThaumicHorizons:brainTH:*", "ThaumicHorizons:dustTH:*", "ThaumicHorizons:eyeTH:*", "ThaumicHorizons:boneTH:*",
        "ThaumicHorizons:fleshTH:*", "ThaumicHorizons:spikeTH:*", "ThaumicHorizons:spikeWoodTH:*",
        "ThaumicHorizons:spikeToothTH:*", "ThaumicHorizons:crystalTH:*", "ThaumicHorizons:crystalDeep:*",
        "ThaumicHorizons:leviathanTH:*", "ThaumicHorizons:portalTH:*", "ThaumicHorizons:gatewayTH:*",
        "ThaumicHorizons:infusionCheat:*", "ThaumicHorizons:voidTH", "ThaumicHorizons:dummyVat",
        "ThaumicHorizons:infusionSelfCheat:*", "ThaumicTinkerer:infusedGrainBlock", "ThaumicTinkerer:gaseousLight:*",
        "ThaumicTinkerer:gaseousShadow:*", "ThaumicTinkerer:nitorGas:*", "ThaumicTinkerer:forcefield:*",
        "ThaumicTinkerer:darkQuartzSlabFull:*", "ForbiddenMagic:ArcaneCake:*", "ImmersiveEngineering:hemp:*",
        "ImmersiveEngineering:fakeLight:*", "ImmersiveEngineering:fakeIcon:*",
        "ImmersiveEngineering:woodenDecoration:4", };

    public static final String[] itemsToShow = new String[] { "BiomesOPlenty:woodenSingleSlab2:0",
        "BiomesOPlenty:woodenSingleSlab2:1", "BiomesOPlenty:woodenSingleSlab2:2", "BiomesOPlenty:woodenSingleSlab2:3",
        "BiomesOPlenty:woodenSingleSlab2:4", "BiomesOPlenty:woodenSingleSlab2:5" };

    // All meta ids in ForgeMicroblocks. Not used
    public static final int[] FMPpartsToProcess = new int[] { 1, 2, 4, 257, 258, 260, 513, 514, 516, 769, 770 };

    @Override
    public void loadConfig() {
        API.hideItem("ForgeMicroblock:microblock");

        for (String s : itemsToHide) {
            hide.add(ModItems.getItem(s));
        }

        for (String s : itemsToShow) {
            show.add(ModItems.getItem(s));
        }

        for (String s : ScriptRemove.itemsToRemoveAndHide) {
            hide.add(ModItems.getItem(s));
        }

        for (String s : ScriptRemove.metalItemsToRemoveAndHide) {
            hide.add(ModItems.getItem(s));
        }

        for (String s : ScriptRemove.thaumcraftItemsToRemoveAndHide) {
            hide.add(ModItems.getItem(s));
        }

        // Remove at the end
        for (int i = 0; i < hide.size(); i++) {
            ItemStack check = hide.get(i);
            API.hideItem(check);
        }

        for (int i = 0; i < show.size(); i++) {
            ItemStack check = show.get(i);
            API.addItemListEntry(check);
        }
    }

    @Override
    public String getName() {
        return "Materialis Script NEI Plugin";
    }

    @Override
    public String getVersion() {
        return Tags.VERSION;
    }
}
