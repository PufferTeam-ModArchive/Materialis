package net.pufferlab.materialis.scripts;

import net.pufferlab.materialis.recipes.TCHelper;

public class ScriptAspects {

    public void run() {
        // Torch
        TCHelper.setAspects("RealisticTorches:TorchLit", "lux 1");

        // Thaumcraft
        TCHelper.setEntityAspects("Thaumcraft.Dart", "telum 1");
        TCHelper.setEntityAspects("Thaumcraft.FrostShard", "telum 1, gelum 3, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.ExplosiveOrb", "ignis 4, ira 4, perditio 4, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.ShockOrb", "praecantatio 3, potentia 4");
        TCHelper.setEntityAspects("Thaumcraft.GolemOrb", "praecantatio 3");
        TCHelper.setEntityAspects("Thaumcraft.BottleTaint", "vitreus 1, vitium 16, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.Alumentum", "potentia 3, ignis 3, perditio 1, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.FallingTaint", "vitium 2, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.AspectOrb", "auram 1");
        TCHelper.setEntityAspects("Thaumcraft.PrimalOrb", "praecantatio 4, perditio 6, permutatio 1");
        TCHelper.setEntityAspects("Thaumcraft.PrimalArrow", "praecantatio 1, telum 1");
        TCHelper.setEntityAspects("Thaumcraft.PechBlast", "praecantatio 2, perditio 2, motus 1");
        TCHelper.setEntityAspects("Thaumcraft.EldritchOrb", "praecantatio 3, alienis 3, vacuos 3, motus 1");
        TCHelper.setEntityAspects(
            "Thaumcraft.TravelingTrunk",
            "vacuos 4, metallum 3, spiritus 3, motus 3, arbor 3, iter 2");
        TCHelper.setEntityAspects("Thaumcraft.EldritchOrb", "tenebrae 4, cognitio 3, alienis 3");
        TCHelper.setEntityAspects("Thaumcraft.EldritchCrab", "alienis 4, bestia 3");
        TCHelper.setEntityAspects("Thaumcraft.GolemBobber", "aqua 1, metallum 1");
        TCHelper.setEntityAspects("Thaumcraft.InhabitedZombie", "exanimis 4, bestia 2, tutamen 1");
        TCHelper.setEntityAspects("Thaumcraft.CultistLeader", "tutamen 16, humanus 8, alienis 4, superbia 8, telum 16");
        TCHelper.setEntityAspects(
            "Thaumcraft.CultistPortal",
            "iter 48, alienis 32, vacuos 24, permutatio 12, praecantatio 9");
        TCHelper.setEntityAspects("Thaumcraft.TaintacleGiant", "superbia 24, vitium 48, herba 16, aqua 8, bestia 16");
        TCHelper.setEntityAspects(
            "Thaumcraft.EldritchWarden",
            "alienis 16, praecantatio 32, superbia 48, mortuus 32, exanimis 24");
        TCHelper.setEntityAspects(
            "Thaumcraft.EldritchGolem",
            "alienis 16, superbia 32, machina 48, metallum 32, potentia 32");

        // Botania
        TCHelper.setAspects("Botania:flower:*", "herba 2, lux 4, sensus 1");

        TCHelper.setAspects("Botania:altar:0", "aqua 1, fabrico 2, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:1", "aqua 1, fabrico 2, arbor 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:2", "aqua 1, fabrico 2, herba 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:3", "aer 1, fabrico 2, aqua 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:4", "aqua 1, fabrico 2, perditio 3, tenebrae 1, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:5", "aqua 1, fabrico 2, limus 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:6", "aqua 1, fabrico 2, ignis 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:7", "aqua 1, fabrico 2, gelum 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:altar:8", "aqua 1, fabrico 2, mortuus 1, perditio 3, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:livingrock:0", "herba 2, terra 2");

        TCHelper.setAspects("Botania:livingrock:1", "herba 2, terra 2");

        TCHelper.setAspects("Botania:livingrock:2", "herba 3, terra 2");

        TCHelper.setAspects("Botania:livingrock:3", "herba 2, perditio 1, terra 1");

        TCHelper.setAspects("Botania:livingrock:4", "herba 2, ordo 1, terra 1");

        TCHelper.setAspects("Botania:livingwood:0", "arbor 4, herba 2");

        TCHelper.setAspects("Botania:livingwood:1", "arbor 1, herba 1");

        TCHelper.setAspects("Botania:livingwood:2", "arbor 1, herba 2");

        TCHelper.setAspects("Botania:livingwood:3", "arbor 1, herba 1, ordo 1");

        TCHelper.setAspects("Botania:livingwood:4", "arbor 1, herba 1, praecantatio 1");

        TCHelper.setAspects("Botania:livingwood:5", "arbor 1, herba 1, lux 1");

        TCHelper.setAspects("Botania:specialFlower", "herba 6, ordo 4, permutatio 6, praecantatio 3");

        TCHelper.setAspects("Botania:spreader:0", "aer 3, arbor 6, herba 1, praecantatio 1, volatus 3");

        TCHelper.setAspects("Botania:spreader:1", "aer 3, arbor 6, herba 1, machina 1, praecantatio 1, volatus 3");

        TCHelper.setAspects("Botania:spreader:2", "aer 3, arbor 6, herba 4, praecantatio 1, volatus 5");

        TCHelper.setAspects("Botania:spreader:3", "aer 3, arbor 6, herba 4, praecantatio 1, spiritus 3, volatus 7");

        TCHelper.setAspects("Botania:pool:0", "aqua 2, praecantatio 2, herba 4, terra 4, vacuos 8");

        TCHelper.setAspects("Botania:pool:2", "aqua 1, praecantatio 2, herba 2, terra 3, vacuos 3");

        TCHelper.setAspects("Botania:pool:3", "aqua 2, praecantatio 5, herba 4, sensus 3, terra 4, vacuos 8");

        TCHelper.setAspects("Botania:pool:1", "aqua 2, praecantatio 19, herba 4, terra 4, vacuos 32");

        TCHelper.setAspects("Botania:runeAltar", "aer 3, ordo 2, fabrico 5, praecantatio 4, terra 5");

        TCHelper.setAspects("Botania:unstableBlock", "alienis 3, tempestas 2, sensus 8");

        TCHelper.setAspects("Botania:pylon:0", "cognitio 16, lucrum 3, praecantatio 3, terra 3");

        TCHelper.setAspects("Botania:pylon:1", "alienis 3, lucrum 9, praecantatio 6, ordo 3");

        TCHelper.setAspects("Botania:pylon:2", "alienis 3, cognitio 5, lucrum 12, praecantatio 12, herba 5");

        TCHelper.setAspects("Botania:pistonRelay", "alienis 3, iter 5, machina 4, motus 3, praecantatio 9");

        TCHelper.setAspects("Botania:distributor", "terra 6, motus 4, ordo 3, praecantatio 2");

        TCHelper.setAspects("Botania:manaBeacon", "aer 3, alienis 7, lux 3, sensus 14");

        TCHelper.setAspects("Botania:manaVoid", "tenebrae 3, terra 3, vacuos 12");

        TCHelper.setAspects("Botania:manaDetector", "herba 4, machina 3, ordo 2, potentia 3, terra 4");

        TCHelper.setAspects("Botania:enchanter", "cognitio 3, fabrico 4, praecantatio 6, sensus 4, tenebrae 2");

        TCHelper.setAspects("Botania:turntable", "arbor 3, machina 2, motus 5");

        TCHelper.setAspects("Botania:tinyPlanetBlock", "alienis 3, praecantatio 3, terra 8");

        TCHelper.setAspects(
            "Botania:alchemyCatalyst",
            "herba 3, ignis 3, praecantatio 2, perditio 2, permutatio 3, terra 6");

        TCHelper.setAspects("Botania:openCrate", "arbor 4, ordo 3, vacuos 1");

        TCHelper.setAspects("Botania:openCrate:1", "arbor 6, fabrico 4, machina 2, ordo 3");

        TCHelper.setAspects("Botania:forestEye", "alienis 2, bestia 3, praecantatio 4");

        TCHelper.setAspects("Botania:storage:0", "metallum 27, praecantatio 8");

        TCHelper.setAspects("Botania:storage:1", "alienis 13, lucrum 13, metallum 27, praecantatio 44");

        TCHelper.setAspects("Botania:storage:2", "metallum 27, praecantatio 19, herba 9");

        TCHelper.setAspects("Botania:storage:3", "lucrum 27, praecantatio 27, vitreus 19");

        TCHelper.setAspects("Botania:storage:4", "bestia 13, herba 9, lucrum 13, praecantatio 19");

        TCHelper.setAspects("Botania:forestDrum", "arbor 4, bestia 2, herba 2, perditio 4, sensus 1");

        TCHelper.setAspects("Botania:forestDrum:1", "arbor 4, bestia 4, meto 4, sensus 1");

        TCHelper.setAspects("Botania:forestDrum:2", "arbor 8, bestia 2, herba 2, sensus 1");

        TCHelper.setAspects("Botania:platform:0", "alienis 2, arbor 4, permutatio 2");

        TCHelper.setAspects("Botania:platform:1", "aer 4, arbor 4, herba 4, spiritus 3");

        TCHelper.setAspects("Botania:alfheimPortal", "arbor 4, herba 4, metallum 1");

        TCHelper.setAspects("Botania:dreamwood:0", "arbor 4, herba 4");

        TCHelper.setAspects("Botania:dreamwood:1", "arbor 1, herba 2");

        TCHelper.setAspects("Botania:dreamwood:2", "arbor 1, herba 2");

        TCHelper.setAspects("Botania:dreamwood:3", "arbor 1, herba 2, ordo 1");

        TCHelper.setAspects("Botania:dreamwood:4", "arbor 1, herba 2, praecantatio 1");

        TCHelper.setAspects("Botania:dreamwood:5", "arbor 1, herba 2, lux 1");

        TCHelper.setAspects("Botania:conjurationCatalyst", "alienis 1, herba 2, ignis 3, praecantatio 4, vacuos 2");

        TCHelper.setAspects("Botania:bifrost", "aer 3, terra 1, sensus 2, spiritus 2");

        TCHelper.setAspects("Botania:solidVine", "herba 1, iter 3, victus 1");

        TCHelper.setAspects("Botania:buriedPetals", "herba 3, potentia 2");

        TCHelper.setAspects("Botania:prismarine", "potentia 9, sensus 9, vitreus 9");

        TCHelper.setAspects("Botania:prismarine:1", "potentia 9, sensus 9, terra 1, vitreus 9");

        TCHelper.setAspects("Botania:prismarine:2", "potentia 9, ordo 2, sensus 9, vitreus 9");

        TCHelper.setAspects("Botania:seaLamp", "lux 4, potentia 9, sensus 9, vitreus 9");

        TCHelper.setAspects("Botania:miniIsland:*", "herba 2, lux 2, terra 1");

        TCHelper.setAspects("Botania:tinyPotato", "fames 1, messis 1, terra 1, praecantatio 1");

        TCHelper.setAspects(
            "Botania:spawnerClaw",
            "alienis 3, humanus 5, machina 2, metallum 3, praecantatio 2, potentia 4");

        TCHelper.setAspects("Botania:reedBlock", "aer 9, aqua 9, herba 9");

        TCHelper.setAspects("Botania:thatch", "fames 4, messis 8");

        TCHelper.setAspects("Botania:customBrick:*", "sensus 1, vitreus 1");

        TCHelper.setAspects("Botania:customBrick:0", "ignis 2, terra 2");

        TCHelper.setAspects("Botania:customBrick:1", "terra 2, spiritus 2");

        TCHelper.setAspects("Botania:customBrick:2", "terra 2, gelum 2");

        TCHelper.setAspects("Botania:customBrick:3", "terra 5, ignis 5");

        TCHelper.setAspects("Botania:enderEyeBlock", "alienis 3, machina 3, potentia 2, sensus 4");

        TCHelper.setAspects("Botania:starfield", "alienis 9, praecantatio 3, ordo 3, tenebrae 4");

        TCHelper.setAspects("Botania:rfGenerator", "machina 6, potentia 5, praecantatio 2, permutatio 4");

        TCHelper.setAspects("Botania:elfGlass", "herba 2, vitreus 1");

        TCHelper.setAspects("Botania:brewery", "aer 2, ignis 2, aqua 1, fabrico 3, perditio 2, praecantatio 2");

        TCHelper.setAspects("Botania:manaGlass", "praecantatio 1, vitreus 1");

        TCHelper.setAspects("Botania:terraPlate", "aer 2, aqua 2, ignis 2, terra 2, permutatio 5, praecantatio 2");

        TCHelper.setAspects("Botania:redStringContainer", "aer 4, iter 4, potentia 4, terra 4");

        TCHelper.setAspects("Botania:redStringDispenser", "aer 4, iter 4, potentia 6, terra 4");

        TCHelper.setAspects("Botania:redStringFertilizer", "aer 4, herba 2, iter 4, potentia 4, terra 4");

        TCHelper.setAspects("Botania:redStringComparator", "aer 4, iter 4, potentia 6, terra 4, vitreus 1");

        TCHelper.setAspects("Botania:redStringRelay", "aer 4, iter 4, permutatio 2, potentia 4, terra 4");

        TCHelper.setAspects("Botania:floatingSpecialFlower", "herba 4, lux 2, permutatio 2, terra 2, volatus 3");

        TCHelper.setAspects("Botania:manaFlame:*", "ignis 1, lux 4, sensus 2");

        TCHelper.setAspects("Botania:prism", "permutatio 1, potentia 3, spiritus 2, vitreus 2");

        TCHelper.setAspects("Botania:dirtPath", "terra 1, mortuus 1");

        TCHelper.setAspects("Botania:enchantedSoil", "terra 1, herba 4");

        TCHelper.setAspects("Botania:petalBlock", "herba 7");

        TCHelper.setAspects("Botania:corporeaIndex", "alienis 5, humanus 4, motus 9, ordo 6, tenebrae 4, vacuos 1");

        TCHelper.setAspects("Botania:corporeaFunnel", "motus 2, permutatio 2, praecantatio 1, vacuos 3");

        TCHelper.setAspects("Botania:endStoneBrick", "tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:endStoneBrick:1", "ordo 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:endStoneBrick:2", "alienis 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:endStoneBrick:3", "alienis 1, ordo 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:mushroom:*", "herba 1, lux 1, sensus 1, tenebrae 1");

        TCHelper.setAspects("Botania:pump", "aqua 3, motus 2, terra 3, vacuos 1");

        TCHelper.setAspects("Botania:doubleFlower1:0", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:1", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:2", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:3", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:4", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:5", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:6", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:7", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:8", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:9", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:10", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:11", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:12", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:13", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:14", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:doubleFlower1:15", "herba 4, lux 4, sensus 2");

        TCHelper.setAspects("Botania:blazeBlock", "alienis 13, ignis 27");

        TCHelper
            .setAspects("Botania:corporeaInterceptor", "alienis 6, motus 2, machina 5, ordo 3, potentia 5, vinculum 5");

        TCHelper.setAspects("Botania:corporeaCrystalCube", "alienis 6, motus 4, ordo 4, sensus 4, vitreus 5");

        TCHelper.setAspects("Botania:incensePlate", "arbor 3");

        TCHelper.setAspects("Botania:hourglass", "lucrum 3, metallum 3, machina 4, potentia 4, vitreus 1");

        TCHelper.setAspects("Botania:ghostRail", "iter 1, metallum 1, spiritus 2");

        TCHelper.setAspects("Botania:sparkChanger", "terra 2, machina 2, permutatio 2");

        TCHelper.setAspects("Botania:root:20", "arbor 2, herba 1");

        TCHelper.setAspects("Botania:felPumpkin", "corpus 1, exanimis 2, ignis 3, victus 1");

        TCHelper.setAspects("Botania:cocoon", "bestia 3, permutatio 3");

        TCHelper.setAspects("Botania:lightRelay", "aer 2, iter 5, machina 2, volatus 3");

        TCHelper.setAspects("Botania:lightRelay:1", "aer 2, iter 5, machina 2, potentia 2, volatus 3");

        TCHelper.setAspects("Botania:lightLauncher", "arbor 2, bestia 2, iter 5, machina 2, potentia 2, volatus 3");

        TCHelper.setAspects("Botania:manaBomb", "ignis 25, potentia 32, perditio 41, praecantatio 27");

        TCHelper.setAspects("Botania:cacophoniumBlock", "aer 3, arbor 4, bestia 2, machina 2, sensus 4");

        TCHelper.setAspects("Botania:bellows", "aer 4, arbor 2, bestia 1, motus 2");

        TCHelper.setAspects("Botania:bifrostPerm", "aer 3, terra 2, sensus 2, spiritus 1");

        TCHelper.setAspects("Botania:cellBlock", "herba 5, potentia 6");

        TCHelper.setAspects("Botania:redStringInterceptor", "aer 4, iter 4, potentia 4, terra 4, vinculum 2");

        TCHelper.setAspects("Botania:corporeaRetainer", "alienis 3, machina 3, potentia 3, sensus 4");

        TCHelper.setAspects("Botania:teruTeruBozu", "pannus 3, spiritus 1, tempestas 5, ");

        TCHelper.setAspects("Botania:shimmerrock", "terra 4, sensus 2, spiritus 1");

        TCHelper.setAspects("Botania:shimmerwoodPlanks", "arbor 1, terra 2, sensus 2, spiritus 1");

        TCHelper.setAspects("Botania:avatar", "arbor 3, herba 2, humanus 2, motus 2, spiritus 2");

        TCHelper.setAspects("Botania:altGrass", "terra 1, mortuus 1");

        TCHelper.setAspects("Botania:biomeStoneA:0", "arbor 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:1", "herba 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:2", "aer 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:3", "tenebrae 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:4", "limus 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:5", "ignis 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:6", "gelum 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:7", "mortuus 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneA:8", "arbor 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:9", "herba 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:10", "aer 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:11", "perditio 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:12", "limus 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:13", "ignis 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:14", "gelum 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneA:15", "mortuus 1, perditio 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:0", "arbor 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:1", "herba 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:2", "aer 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:3", "tenebrae 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:4", "limus 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:5", "ignis 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:6", "gelum 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:7", "mortuus 1, terra 2");

        TCHelper.setAspects("Botania:biomeStoneB:8", "arbor 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:9", "herba 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:10", "aer 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:11", "ordo 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:12", "limus 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:13", "ignis 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:14", "gelum 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:biomeStoneB:15", "mortuus 1, ordo 1, terra 1");

        TCHelper.setAspects("Botania:stone:*", "terra 2");

        TCHelper.setAspects("Botania:stone:1", "tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:stone:5", "tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:stone:9", "tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:stone:12", "ordo 1, terra 1");

        TCHelper.setAspects("Botania:stone:13", "ordo 1, tenebrae 1, terra 1");

        TCHelper.setAspects("Botania:stone:14", "ordo 1, terra 1");

        TCHelper.setAspects("Botania:stone:15", "ordo 1, terra 1");

        TCHelper.setAspects("Botania:pavement:0", "ordo 1, perditio 1, terra 2");

        TCHelper.setAspects("Botania:pavement:*", "ordo 1, perditio 1, terra 2");

        TCHelper.setAspects("Botania:quartzTypeDark:1", "potentia 3, tenebrae 3, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeMana:1", "potentia 3, praecantatio 3, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeBlaze:1", "ignis 3, potentia 3, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeLavender:1", "potentia 3, sensus 3, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeRed:1", "potentia 6, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeElf:1", "herba 3, potentia 3, vinculum 3");

        TCHelper.setAspects("Botania:quartzTypeSunny:1", "auram 3, potentia 3, vinculum 3");

        TCHelper.setAspects("Botania:endStoneBrick2Stairs", "alienis 1, terra 1");

        TCHelper.setAspects("Botania:stone0Wall:1", "terra 1");

        TCHelper.setAspects("Botania:lexicon", "cognitio 2, herba 1, pannus 1, sensus 1");

        TCHelper.setAspects("Botania:petal:*", "herba 1, praecantatio 1");

        TCHelper.setAspects("Botania:pestleAndMortar", "arbor 2, perditio 1, vacuos 1");

        TCHelper.setAspects("Botania:twigWand", "arbor 2, herba 1, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:0", "metallum 4, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:1", "alienis 4, praecantatio 4");

        TCHelper.setAspects("Botania:manaResource:2", "lucrum 4, praecantatio 2, vitreus 4");

        TCHelper.setAspects("Botania:manaResource:3", "arbor 4, herba 2");

        TCHelper.setAspects("Botania:manaResource:4", "alienis 2, lucrum 2, metallum 4, praecantatio 8");

        TCHelper.setAspects("Botania:manaResource:5", "alienis 3, lucrum 3, praecantatio 4, spiritus 3");

        TCHelper.setAspects("Botania:manaResource:6", "herba 1, machina 1, potentia 2");

        TCHelper.setAspects("Botania:manaResource:7", "herba 1, metallum 4, praecantatio 3");

        TCHelper.setAspects("Botania:manaResource:8", "alienis 2, herba 1, praecantatio 4");

        TCHelper.setAspects("Botania:manaResource:9", "bestia 2, herba 1, lucrum 2, praecantatio 3, vitreus 4");

        TCHelper.setAspects("Botania:manaResource:10", "potentia 1, vitreus 1, sensus 1");

        TCHelper.setAspects("Botania:manaResource:11", "fabrico 2, herba 1, potentia 1, terra 1");

        TCHelper.setAspects("Botania:manaResource:12", "alienis 2, pannus 1, potentia 4, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:13", "arbor 4, herba 1, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:14", "alienis 9, lucrum 6, metallum 3, praecantatio 14, spiritus 7");

        TCHelper.setAspects("Botania:manaResource:15", "aer 3, alienis 2, vitreus 1");

        TCHelper.setAspects("Botania:manaResource:16", "pannus 1, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:17", "metallum 1");

        TCHelper.setAspects("Botania:manaResource:18", "metallum 1, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:19", "herba 1, metallum 1");

        TCHelper.setAspects("Botania:manaResource:22", "pannus 3, praecantatio 1");

        TCHelper.setAspects("Botania:manaResource:23", "perditio 2, praecantatio 1");

        TCHelper.setAspects("Botania:lens:0", "metallum 4, praecantatio 2, vitreus 1");

        TCHelper.setAspects("Botania:lens:1", "iter 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:2", "metallum 4, potentia 2, praecantatio 2");

        TCHelper.setAspects("Botania:lens:3", "metallum 4, limus 2, praecantatio 2");

        TCHelper.setAspects("Botania:lens:4", "metallum 4, praecantatio 2, ordo 2");

        TCHelper.setAspects("Botania:lens:5", "metallum 4, praecantatio 2, volatus 2");

        TCHelper.setAspects("Botania:lens:6", "metallum 4, praecantatio 2, vinculum 2");

        TCHelper.setAspects("Botania:lens:7", "metallum 4, terra 2, praecantatio 2");

        TCHelper.setAspects("Botania:lens:8", "metallum 4, praecantatio 2, telum 2");

        TCHelper.setAspects("Botania:lens:9", "metallum 4, praecantatio 2, spiritus 2");

        TCHelper.setAspects("Botania:lens:10", "lucrum 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:11", "metallum 4, perditio 2, praecantatio 2");

        TCHelper.setAspects("Botania:lens:12", "motus 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:13", "auram 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:14", "metallum 4, praecantatio 2, sensus 2");

        TCHelper.setAspects("Botania:lens:15", "ignis 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:16", "machina 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:17", "lux 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:18", "alienis 2, metallum 4, praecantatio 2");

        TCHelper.setAspects("Botania:lens:19", "metallum 4, permutatio 2, praecantatio 2");

        TCHelper.setAspects("Botania:lens:20", "metallum 4, praecantatio 3, sensus 1");

        TCHelper.setAspects("Botania:lens:21", "metallum 4, mortuus 2, praecantatio 2");

        TCHelper.setAspects("Botania:rune:0", "aqua 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:1", "ignis 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:2", "praecantatio 2, terra 3");

        TCHelper.setAspects("Botania:rune:3", "aer 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:4", "herba 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:5", "praecantatio 2, terra 2, sensus 1");

        TCHelper.setAspects("Botania:rune:6", "mortuus 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:7", "gelum 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:8", "praecantatio 3, terra 2");

        TCHelper.setAspects("Botania:rune:9", "corpus 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:10", "fames 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:11", "lucrum 1, praecantatio 2, terra 2");

        TCHelper.setAspects("Botania:rune:12", "praecantatio 2, terra 2, vinculum 1");

        TCHelper.setAspects("Botania:rune:13", "praecantatio 2, telum 1, terra 2");

        TCHelper.setAspects("Botania:rune:14", "praecantatio 2, terra 2, venenum 1");

        TCHelper.setAspects("Botania:rune:15", "auram 1, praecantatio 1, terra 2");

        TCHelper.setAspects("Botania:signalFlare", "arbor 1, ignis 1, lux 2, metallum 1");

        TCHelper.setAspects("Botania:manaTablet", "lucrum 1, terra 3, vacuos 3");

        TCHelper.setAspects("Botania:manaGun", "ignis 3, instrumentum 2, perditio 3, praecantatio 1");

        TCHelper.setAspects("Botania:manaCookie", "praecantatio 3, fames 8");

        TCHelper.setAspects("Botania:fertilizer", "herba 2, sensus 3");

        TCHelper.setAspects("Botania:grassSeeds:0", "herba 3, potentia 2");

        TCHelper.setAspects("Botania:grassSeeds:1", "herba 2, potentia 2, mortuus 1");

        TCHelper.setAspects("Botania:grassSeeds:2", "herba 2, potentia 2, tenebrae 1");

        TCHelper.setAspects("Botania:grassSeeds:3", "herba 2, perditio 1, potentia 2");

        TCHelper.setAspects("Botania:grassSeeds:4", "herba 2, potentia 2, messis 1");

        TCHelper.setAspects("Botania:grassSeeds:5", "herba 2, potentia 2, sensus 1");

        TCHelper.setAspects("Botania:grassSeeds:6", "ignis 1, herba 2, potentia 2");

        TCHelper.setAspects("Botania:grassSeeds:7", "herba 2, potentia 3");

        TCHelper.setAspects("Botania:grassSeeds:8", "herba 2, potentia 2, venenum 1");

        TCHelper.setAspects("Botania:dirtRod", "arbor 2, praecantatio 2, terra 5");

        TCHelper.setAspects("Botania:terraformRod", "arbor 2, herba 2, metallum 1, praecantatio 2, terra 9");

        TCHelper.setAspects("Botania:grassHorn:0", "herba 2, perditio 4, sensus 1");

        TCHelper.setAspects("Botania:grassHorn:1", "arbor 2, perditio 4, sensus 1");

        TCHelper.setAspects("Botania:grassHorn:2", "gelum 2, perditio 4, sensus 1");

        TCHelper.setAspects("Botania:manaMirror", "alienis 4, praecantatio 5, metallum 2, vacuos 3");

        TCHelper.setAspects("Botania:manasteelHelm", "metallum 15, praecantatio 15, tutamen 3");

        TCHelper.setAspects("Botania:manasteelHelmReveal", "metallum 15, praecantatio 15, sensus 2, tutamen 3");

        TCHelper.setAspects("Botania:manasteelChest", "metallum 24, praecantatio 24, tutamen 7");

        TCHelper.setAspects("Botania:manasteelLegs", "metallum 21, praecantatio 21, tutamen 6");

        TCHelper.setAspects("Botania:manasteelBoots", "metallum 12, praecantatio 12, tutamen 3");

        TCHelper.setAspects("Botania:manasteelPick", "arbor 3, perfodio 4, metallum 9, praecantatio 12");

        TCHelper.setAspects("Botania:manasteelShovel", "arbor 3, instrumentum 4, metallum 3, praecantatio 6");

        TCHelper.setAspects("Botania:manasteelAxe", "arbor 3, instrumentum 4, metallum 9, praecantatio 12");

        TCHelper.setAspects("Botania:manasteelSword", "arbor 1, metallum 6, praecantatio 7, telum 3");

        TCHelper.setAspects("Botania:manasteelShears", "metallum 6, meto 3, praecantatio 6");

        TCHelper.setAspects(
            "Botania:terrasteelHelm",
            "alienis 4, lucrum 7, metallum 9, praecantatio 20, terra 15, tutamen 8");

        TCHelper.setAspects(
            "Botania:terrasteelHelmReveal",
            "lucrum 7, metallum 9, praecantatio 20, terra 15, tutamen 8, sensus 2");

        TCHelper.setAspects(
            "Botania:terrasteelChest",
            "alienis 9, lucrum 12, metallum 15, praecantatio 40, terra 20, tutamen 18");

        TCHelper.setAspects(
            "Botania:terrasteelLegs",
            "alienis 8, lucrum 11, metallum 13, praecantatio 35, terra 17, tutamen 16");

        TCHelper.setAspects(
            "Botania:terrasteelBoots",
            "alienis 5, lucrum 8, metallum 10, praecantatio 25, terra 15, tutamen 10");

        TCHelper.setAspects("Botania:terraSword", "alienis 3, lucrum 4, metallum 6, praecantatio 10, terra 9, telum 6");

        TCHelper.setAspects("Botania:manaRing", "metallum 5, praecantatio 1, vacuos 3");

        TCHelper.setAspects("Botania:manaRingGreater", "metallum 9, praecantatio 4, vacuos 6");

        TCHelper.setAspects("Botania:travelBelt", "iter 4, pannus 4, praecantatio 2, terra 1");

        TCHelper.setAspects("Botania:knockbackBelt", "limus 4, pannus 4, terra 1, tutamen 2");

        TCHelper.setAspects("Botania:icePendant", "gelum 4, iter 1, pannus 3, praecantatio 2");

        TCHelper.setAspects("Botania:lavaPendant", "aqua 1, auram 1, ignis 4, pannus 3, tutamen 1");

        TCHelper.setAspects("Botania:goldenLaurel", "herba 1, lucrum 3, mortuus 1, sano 4");

        TCHelper.setAspects("Botania:magnetRing", "lucrum 3, metallum 7, praecantatio 4");

        TCHelper.setAspects("Botania:waterRing", "aqua 1, fames 1, iter 4, metallum 3");

        TCHelper.setAspects("Botania:miningRing", "instrumentum 1, metallum 3, perfodio 4, terra 1");

        TCHelper.setAspects("Botania:terraPick", "arbor 3, lucrum 3, metallum 6, perfodio 24, praecantatio 11");

        TCHelper.setAspects("Botania:divaCharm", "auram 1, lucrum 12, permutatio 6, spiritus 4, victus 2");

        TCHelper.setAspects("Botania:flightTiara", "aer 4, alienis 6, spiritus 8, volatus 12");

        TCHelper.setAspects("Botania:enderDagger", "alienis 3, metallum 3, telum 4");

        TCHelper.setAspects("Botania:quartz", "potentia 1, tenebrae 1, vitreus 1");

        TCHelper.setAspects("Botania:quartz:1", "potentia 1, praecantatio 1, vitreus 1");

        TCHelper.setAspects("Botania:quartz:2", "ignis 1, potentia 1, vitreus 1");

        TCHelper.setAspects("Botania:quartz:3", "potentia 1, sensus 1, vitreus 1");

        TCHelper.setAspects("Botania:quartz:4", "potentia 2, vitreus 1");

        TCHelper.setAspects("Botania:quartz:5", "herba 1, potentia 1, vitreus 1");

        TCHelper.setAspects("Botania:quartz:6", "auram 1, potentia 1, vitreus 1");

        TCHelper.setAspects("Botania:waterRod", "arbor 2, aqua 4, praecantatio 2, terra 1");

        TCHelper.setAspects("Botania:elementiumHelm", "herba 3, iter 1, metallum 15, praecantatio 12, tutamen 3");

        TCHelper.setAspects(
            "Botania:elementiumHelmReveal",
            "herba 3, iter 1, metallum 15, praecantatio 12, sensus 2, tutamen 3");

        TCHelper.setAspects("Botania:elementiumChest", "herba 6, iter 1, metallum 24, praecantatio 18, tutamen 7");

        TCHelper.setAspects("Botania:elementiumLegs", "herba 5, iter 1, metallum 21, praecantatio 16, tutamen 6");

        TCHelper.setAspects("Botania:elementiumBoots", "herba 2, iter 1, metallum 12, praecantatio 10, tutamen 3");

        TCHelper.setAspects(
            "Botania:elementiumPick",
            "arbor 3, herba 2, perditio 1, perfodio 4, metallum 9, praecantatio 9");

        TCHelper.setAspects(
            "Botania:elementiumShovel",
            "arbor 3, herba 1, instrumentum 4, metallum 3, praecantatio 4, terra 1");

        TCHelper.setAspects(
            "Botania:elementiumAxe",
            "arbor 3, exanimis 1, herba 2, instrumentum 4, metallum 9, praecantatio 9");

        TCHelper.setAspects("Botania:elementiumSword", "arbor 1, iter 1, herba 2, metallum 6, praecantatio 6, telum 3");

        TCHelper.setAspects("Botania:elementiumShears", "herba 1, metallum 6, meto 3, potentia 1, praecantatio 3");

        TCHelper.setAspects("Botania:openBucket", "herba 2, metallum 9, praecantatio 9, vacuos 17");

        TCHelper
            .setAspects("Botania:spawnerMover", "bestia 4, exanimis 1, iter 4, praecantatio 4, spiritus 6, metallum 4");

        TCHelper.setAspects("Botania:pixieRing", "alienis 2, iter 1, metallum 2, praecantatio 3");

        TCHelper
            .setAspects("Botania:superTravelBelt", "iter 8, metallum 2, pannus 2, praecantatio 2, spiritus 3, terra 2");

        TCHelper.setAspects("Botania:rainbowRod", "aer 3, alienis 2, metallum 5, praecantatio 3, sensus 3, terra 3");

        TCHelper.setAspects("Botania:tornadoRod", "aer 3, volatus 5, arbor 2, terra 1");

        TCHelper.setAspects("Botania:fireRod", "arbor 2, ignis 5, praecantatio 2, terra 1");

        TCHelper.setAspects("Botania:vineBall", "herba 5, iter 3");

        TCHelper.setAspects("Botania:slingshot", "aer 2, arbor 1, motus 3");

        TCHelper.setAspects("Botania:manaBottle", "aqua 3, praecantatio 2, permutatio 8, lucrum 2");

        TCHelper.setAspects("Botania:laputaShard", "aer 3, praecantatio 3, terra 3, vitreus 2, volatus 6");

        TCHelper.setAspects("Botania:laputaShard:4", "aer 5, praecantatio 4, terra 5, vitreus 2, volatus 9");

        TCHelper.setAspects("Botania:laputaShard:9", "aer 7, praecantatio 5, terra 7, vitreus 2, volatus 12");

        TCHelper.setAspects("Botania:laputaShard:14", "aer 9, praecantatio 6, terra 9, vitreus 2, volatus 15");

        TCHelper.setAspects("Botania:laputaShard:19", "aer 11, praecantatio 7, terra 11, vitreus 2, volatus 15");

        TCHelper.setAspects("Botania:virus", "aer 2, bestia 5, exanimis 6, venenum 4");

        TCHelper.setAspects("Botania:virus:1", "exanimis 6, venenum 4, aer 2, bestia 5");

        TCHelper.setAspects("Botania:reachRing", "auram 1, herba 2, lucrum 4");

        TCHelper.setAspects("Botania:skyDirtRod", "arbor 1, praecantatio 2, terra 2, volatus 4");

        TCHelper.setAspects("Botania:itemFinder", "alienis 2, metallum 6, sensus 3, lux 1");

        TCHelper.setAspects("Botania:superLavaPendant", "alienis 6, ignis 9, auram 4, tutamen 9");

        TCHelper.setAspects("Botania:enderHand", "alienis 8, instrumentum 2, praecantatio 2, vacuos 4");

        TCHelper
            .setAspects("Botania:glassPick", "arbor 1, instrumentum 3, lucrum 1, metallum 1, vitreus 3, perfodio 1");

        TCHelper.setAspects("Botania:spark", "ignis 1, vacuos 2");

        TCHelper.setAspects("Botania:sparkUpgrade", "alienis 1, aqua 1, ordo 2, terra 1");

        TCHelper.setAspects("Botania:sparkUpgrade:1", "alienis 1, ignis 1, ordo 2, terra 1");

        TCHelper.setAspects("Botania:sparkUpgrade:2", "alienis 1, ordo 2, terra 2");

        TCHelper.setAspects("Botania:sparkUpgrade:3", "aer 1, alienis 1, ordo 2, terra 1");

        TCHelper.setAspects("Botania:diviningRod", "arbor 3, lux 1, perfodio 1, praecantatio 2, sensus 4");

        TCHelper.setAspects("Botania:gravityRod", "aer 1, arbor 2, bestia 3, volatus 5, herba 1, lucrum 2");

        TCHelper.setAspects("Botania:regenIvy", "herba 3, fabrico 5, praecantatio 2, spiritus 2");

        TCHelper.setAspects("Botania:manaInkwell:*", "praecantatio 2, volatus 1");

        TCHelper.setAspects("Botania:vial", "praecantatio 1, vacuos 1, vitreus 1");

        TCHelper.setAspects("Botania:vial:1", "herba 1, vacuos 1, vitreus 1");

        TCHelper.setAspects("Botania:brewVial", "aqua 4, praecantatio 3, permutatio 3");

        TCHelper.setAspects("Botania:brewFlask", "aqua 6, praecantatio 6, permutatio 5");

        TCHelper.setAspects("Botania:bloodPendant", "spiritus 2, permutatio 7, potentia 4, praecantatio 5");

        TCHelper.setAspects("Botania:missileRod", "spiritus 4, telum 12, lucrum 9, motus 2");

        TCHelper.setAspects("Botania:holyCloak", "lucrum 2, lux 4, pannus 8, spiritus 2, tutamen 10");

        TCHelper.setAspects("Botania:unholyCloak", "lucrum 2, telum 10, tenebrae 4, pannus 8, spiritus 2");

        TCHelper.setAspects("Botania:craftingHalo", "alienis 1, fabrico 4, iter 2, metallum 4, praecantatio 3");

        TCHelper.setAspects("Botania:blackLotus", "herba 3, lucrum 2, praecantatio 8, tenebrae 1");

        TCHelper.setAspects("Botania:blackLotus:1", "herba 3, lucrum 5, praecantatio 20, tenebrae 1");

        TCHelper.setAspects("Botania:monocle", "machina 2, metallum 1, sensus 4");

        TCHelper.setAspects("Botania:clip", "arbor 8, ordo 5");

        TCHelper.setAspects("Botania:cobbleRod", "arbor 3, perditio 1, permutatio 2, terra 5");

        TCHelper.setAspects("Botania:smeltRod", "fabrico 2, ignis 6, terra 1");

        TCHelper.setAspects("Botania:worldSeed", "herba 1, iter 12, victus 2");

        TCHelper.setAspects("Botania:spellCloth", "permutatio 6, praecantatio 4, aqua 1");

        TCHelper.setAspects("Botania:thornChakram", "herba 3, praecantatio 4, telum 6, venenum 1");

        TCHelper.setAspects("Botania:thornChakram:1", "herba 1, ignis 3, praecantatio 3, telum 6");

        TCHelper.setAspects("Botania:overgrowthSeed", "herba 6, victus 2, lucrum 2");

        TCHelper.setAspects("Botania:craftPattern", "arbor 14, fabrico 2, potentia 1");

        TCHelper.setAspects("Botania:craftPattern:1", "arbor 10, fabrico 2, potentia 4");

        TCHelper.setAspects("Botania:craftPattern:2", "arbor 12, fabrico 2, potentia 2");

        TCHelper.setAspects("Botania:craftPattern:3", "arbor 12, fabrico 2, potentia 2");

        TCHelper.setAspects("Botania:craftPattern:4", "arbor 11, fabrico 2, potentia 3");

        TCHelper.setAspects("Botania:craftPattern:5", "arbor 11, fabrico 2, potentia 3");

        TCHelper.setAspects("Botania:craftPattern:6", "arbor 8, fabrico 2, potentia 6");

        TCHelper.setAspects("Botania:craftPattern:7", "arbor 8, fabrico 2, potentia 6");

        TCHelper.setAspects("Botania:craftPattern:8", "arbor 6, fabrico 2, potentia 8");

        TCHelper.setAspects("Botania:ancientWill", "herba 2, mortuus 3, telum 2");

        TCHelper.setAspects("Botania:ancientWill:1", "herba 2, telum 4, victus 1");

        TCHelper.setAspects("Botania:ancientWill:2", "herba 2, sano 3, victus 2");

        TCHelper.setAspects("Botania:ancientWill:3", "herba 2, telum 1, vinculum 4");

        TCHelper.setAspects("Botania:ancientWill:4", "herba 2, perditio 2, telum 3");

        TCHelper.setAspects("Botania:ancientWill:5", "exanimis 3, herba 2, telum 2");

        TCHelper.setAspects("Botania:corporeaSpark", "aer 1, ignis 1, motus 4, praecantatio 2");

        TCHelper.setAspects("Botania:corporeaSpark:1", "aer 1, ignis 1, motus 3, ordo 6, praecantatio 1");

        TCHelper.setAspects("Botania:livingwoodBow", "arbor 1, herba 2, telum 4, volatus 2");

        TCHelper.setAspects("Botania:crystalBow", "herba 2, praecantatio 2, telum 6, volatus 2, vitreus 2");

        TCHelper.setAspects("Botania:cosmetic:*", "herba 1, sensus 4, pannus 3");

        TCHelper.setAspects("Botania:swapRing", "aqua 1, metallum 2, permutatio 4");

        TCHelper.setAspects("Botania:flowerBag", "herba 1, pannus 4, vacuos 4");

        TCHelper.setAspects("Botania:phantomInk", "permutatio 4, sensus 2, vitreus 2");

        TCHelper.setAspects("Botania:poolMinecart", "metallum 6, iter 3, terra 3, vacuos 6");

        TCHelper.setAspects("Botania:pinkinator", "bestia 2, permutatio 3, sensus 4");

        TCHelper.setAspects("Botania:infiniteFruit", "fames 18, lucrum 12, praecantatio 8");

        TCHelper.setAspects("Botania:kingKey", "lucrum 12, telum 18, volatus 8");

        TCHelper.setAspects("Botania:flugelEye", "alienis 8, iter 18, lucrum 12");

        TCHelper.setAspects("Botania:thorRing", "instrumentum 8, lucrum 12, perfodio 18");

        TCHelper.setAspects("Botania:odinRing", "lucrum 12, tutamen 8, victus 18");

        TCHelper.setAspects("Botania:lokiRing", "aer 8, alienis 18, lucrum 12");

        TCHelper.setAspects("Botania:dice", "lucrum 9, mortuus 2, permutatio 12");

        TCHelper.setAspects("Botania:keepIvy", "herba 2, instrumentum 3, limus 4, mortuus 4");

        TCHelper.setAspects("Botania:blackHoleTalisman", "alienis 4, spiritus 4, tenebrae 2, vacuos 32");

        TCHelper.setAspects("Botania:recordGaia1", "aer 4, lucrum 4, sensus 4, spiritus 4");

        TCHelper.setAspects("Botania:recordGaia2", "aer 4, lucrum 4, sensus 4, vacuos 4");

        TCHelper.setAspects("Botania:temperanceStone", "ordo 4, perfodio 3, terra 8, vinculum 2");

        TCHelper.setAspects("Botania:incenseStick", "aer 4, auram 1, ignis 3, sensus 4");

        TCHelper.setAspects("Botania:terraAxe", "metallum 6, perditio 6, praecantatio 3");

        TCHelper.setAspects("Botania:waterBowl", "aqua 4, vacuos 1");

        TCHelper.setAspects("Botania:obedienceStick", "arbor 4, herba 2, ordo 3");

        TCHelper.setAspects("Botania:cacophonium", "bestia 2, sensus 4, metallum 4, lucrum 4");

        TCHelper.setAspects("Botania:slimeBottle", "limus 4, sensus 3, vitreus 2");

        TCHelper.setAspects("Botania:starSword", "alienis 12, lucrum 5, ignis 4, metallum 6, praecantatio 6");

        TCHelper.setAspects("Botania:exchangeRod", "aer 6, ordo 6, perditio 6, terra 6, vinculum 2, praecantatio 3");

        TCHelper.setAspects("Botania:magnetRingGreater", "lucrum 14, metallum 8, praecantatio 5");

        TCHelper.setAspects("Botania:thunderSword", "alienis 4, lucrum 14, metallum 8, telum 7, tempestas 6");

        TCHelper.setAspects("Botania:manaweaveHelm", "aer 4, ignis 7, pannus 15, praecantatio 6, tutamen 4");

        TCHelper.setAspects("Botania:manaweaveLegs", "aqua 7, ignis 4, pannus 18, praecantatio 9, tutamen 6");

        TCHelper.setAspects("Botania:manaweaveChest", "aqua 4, pannus 20, perditio 7, praecantatio 11, tutamen 7");

        TCHelper.setAspects("Botania:manaweaveBoots", "aer 7, pannus 12, perditio 4, praecantatio 4, tutamen 4");

        TCHelper.setAspects(
            "Botania:autocraftingHalo",
            "alienis 1, fabrico 6, iter 2, machina 6, metallum 4, praecantatio 4");

        TCHelper.setAspects("Botania:gaiaHead", "humanus 4, mortuus 8, spiritus 12, tenebrae 4");

        TCHelper.setAspects("Botania:sextant", "arbor 3, ordo 2, praecantatio 3, sensus 7");

        TCHelper.setAspects("Botania:speedUpBelt", "aer 3, herba 6, iter 9, permutatio 4, terra 5");

        TCHelper.setAspects("Botania:baubleBox", "sensus 4, praecantatio 2, metallum 8, vacuos 8");

        // Biomes O' Plenty
        TCHelper.setAspects("BiomesOPlenty:rocks", "perditio 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:rocks:1", "terra 2");

        TCHelper.setAspects("BiomesOPlenty:rocks:2", "perditio 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:rocks:3", "terra 2");

        TCHelper.setAspects("BiomesOPlenty:rocks:4", "perditio 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:rocks:5", "terra 2");

        TCHelper.setAspects("BiomesOPlenty:flesh", "corpus 3");

        TCHelper.setAspects("BiomesOPlenty:plants:4", "herba 1, tenebrae 1");

        TCHelper.setAspects("BiomesOPlenty:plants:6", "herba 2, messis 1");

        TCHelper.setAspects("BiomesOPlenty:plants:13", "herba 1, mortuus 1");

        TCHelper.setAspects("BiomesOPlenty:flowers:11", "herba 2, tenebrae 1");

        TCHelper.setAspects("BiomesOPlenty:flowers:13", "corpus 3");

        TCHelper.setAspects("BiomesOPlenty:flowers2:8", "herba 1, victus 1, sensus 1");

        TCHelper.setAspects("BiomesOPlenty:stoneFormations", "perditio 1");
        TCHelper.setAspects("BiomesOPlenty:stoneFormations:1", "perditio 1");

        TCHelper.setAspects("BiomesOPlenty:mushrooms:4", "herba 2, terra 1");
        TCHelper.setAspects("BiomesOPlenty:mushrooms:5", "herba 2, tenebrae 1");

        TCHelper.setAspects("BiomesOPlenty:ivy", "herba 1");

        TCHelper.setAspects("BiomesOPlenty:treeMoss", "herba 1, tenebrae 1");

        TCHelper.setAspects("BiomesOPlenty:flowerVine", "herba 1, sensus 1");

        TCHelper.setAspects("BiomesOPlenty:wisteria", "herba 2, victus 1");

        TCHelper.setAspects("BiomesOPlenty:foliage:8", "herba 3, victus 2");

        TCHelper.setAspects("BiomesOPlenty:fruitBop:0", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:fruitBop:1", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:fruitBop:2", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:fruitBop:3", "messis 2, fames 1");

        TCHelper.setAspects("BiomesOPlenty:food", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:food:2", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:food:3", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:food:8", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:food:11", "messis 2, fames 1");
        TCHelper.setAspects("BiomesOPlenty:food:12", "messis 2, fames 1");

        TCHelper.setAspects("BiomesOPlenty:fruitBop:4", "herba 2, terra 1");
        TCHelper.setAspects("BiomesOPlenty:misc:13", "herba 2, terra 1");

        TCHelper.setAspects("BiomesOPlenty:turnip", "herba 2, messis 1");

        TCHelper.setAspects("BiomesOPlenty:coral1:11", "herba 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:coral1:12", "herba 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:coral1:13", "herba 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:coral1:14", "herba 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:coral1:14", "herba 2, lux 1");

        TCHelper.setAspects("BiomesOPlenty:longGrass", "herba 3, terra 1");

        TCHelper.setAspects("BiomesOPlenty:bopGrass", "tenebrae 1, herba 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:newBopGrass", "aqua 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:newBopGrass:1", "perditio 1, terra 1, herba 1");

        TCHelper.setAspects("BiomesOPlenty:newBopGrass:2", "terra 2, herba 1");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt", "terra 1, aqua 1");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt:1", "terra 1");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt:2", "perditio 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt:3", "perditio 1, terra 1");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt:4", "perditio 1, terra 2");

        TCHelper.setAspects("BiomesOPlenty:newBopDirt:5", "perditio 1, terra 2");

        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:0", "terra 1");
        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:1", "terra 1");
        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:1", "terra 1");
        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:3", "terra 1");
        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:4", "terra 1");
        TCHelper.setAspects("BiomesOPlenty:newBopFarmland:5", "terra 1");

        TCHelper.setAspects("BiomesOPlenty:hive", "ordo 1, bestia 1");
        TCHelper.setAspects("BiomesOPlenty:hive:1", "ordo 1, terra 1");
        TCHelper.setAspects("BiomesOPlenty:hive:2", "permutatio 1, ordo 1");
        TCHelper.setAspects("BiomesOPlenty:hive:3", "permutatio 1, fames 1");
        TCHelper.setAspects("BiomesOPlenty:honeyBlock", "victus 2, permutatio 2 1");

        TCHelper.setAspects("BiomesOPlenty:grave", "mortuus 2");

        TCHelper.setAspects("BiomesOPlenty:stoneSingleSlab", "terra 6, ignis 3");
        TCHelper.setAspects("BiomesOPlenty:stoneDoubleSlab", "terra 6, ignis 3");

        TCHelper.setAspects("BiomesOPlenty:poison", "venenum 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:hell_blood", "mortuus 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:honey", "victus 2, permutatio 2, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:jarFilled", "victus 2, permutatio 2, aqua 1, vitreus 3");
        TCHelper.setAspects("BiomesOPlenty:bopBucket", "metallum 8, aqua 1");

        TCHelper.setAspects("BiomesOPlenty:food:9", "victus 2, permutatio 2");
        TCHelper.setAspects("BiomesOPlenty:misc:2", "perditio 1, permutatio 2");

        TCHelper.setAspects("BiomesOPlenty:misc:3", "corpus 1");

        TCHelper.setAspects("BiomesOPlenty:misc:10", "spiritus 3, exanimis 1");
        TCHelper.setAspects("BiomesOPlenty:misc:11", "spiritus 3, lux 1");
        TCHelper.setAspects("BiomesOPlenty:misc:12", "luxuria 1");
        TCHelper.setAspects("BiomesOPlenty:mudball", "terra 1, aqua 1");
        TCHelper.setAspects("BiomesOPlenty:jarFilled:2", "praecantatio 3, vitreus 3");

        TCHelper.setAspects("BiomesOPlenty:record_wanderer", "sensus 4, aer 4, luxuria 4");
        TCHelper.setAspects("BiomesOPlenty:record_corruption", "sensus 4, aer 4, luxuria 4");

        TCHelper.setAspects("BiomesOPlenty:lilyBop:0", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:lilyBop:1", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:lilyBop:2", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:0", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:1", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:2", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:3", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:4", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:9", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:10", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:11", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:12", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:13", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:14", "herba 1");
        TCHelper.setAspects("BiomesOPlenty:foliage:15", "herba 1");

        TCHelper.setEntityAspects("BiomesOPlenty.JungleSpider", "bestia 2, herba 1, venenum 1");
        TCHelper.setEntityAspects("BiomesOPlenty.Rosester", "bestia 2, sensus 1, volatus 1");
        TCHelper.setEntityAspects("BiomesOPlenty.Glob", "terra 2, limus 2");
        TCHelper.setEntityAspects("BiomesOPlenty.Phantom", "spiritus 2, tenebrae 2");
        TCHelper.setEntityAspects("BiomesOPlenty.Wasp", "aer 2, volatus 2, telum 1");
        TCHelper.setEntityAspects("BiomesOPlenty.Bird", "bestia 2, volatus 1");
        TCHelper.setEntityAspects("BiomesOPlenty.Pixie", "praecantatio 3, sensus 1");
        TCHelper.setEntityAspects("BiomesOPlenty.dart", "telum 1");
        TCHelper.setEntityAspects("BiomesOPlenty.mudball", "terra 2, aqua 2, motus 4");

        // Et Futurum
        TCHelper.setAspects("etfuturum:deepslate", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:cobbled_deepslate", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:polished_deepslate", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:deepslate_bricks:*", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:deepslate_slab:*", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:double_deepslate_slab:*", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:double_deepslate_brick_slab:*", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:polished_deepslate_stairs", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:cobbled_deepslate_stairs", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:deepslate_brick_stairs", "terra 2, tenebrae 1");
        TCHelper.setAspects("etfuturum:deepslate_tile_stairs", "terra 2, tenebrae 1");

        TCHelper.setAspects("etfuturum:tuff", "terra 2, perditio 1");

        TCHelper.setAspects("etfuturum:smooth_basalt", "terra 2, ignis 1");

        TCHelper.setAspects("etfuturum:calcite", "terra 2");

        TCHelper.setAspects("etfuturum:amethyst_block", "vitreus 5, sensus 2");
        TCHelper.setAspects("etfuturum:budding_amethyst", "vitreus 5, sensus 2");
        TCHelper.setAspects("etfuturum:amethyst_shard", "vitreus 1, sensus 1");

        TCHelper.setAspects("etfuturum:amethyst_cluster_1:*", "vitreus 1, sensus 1");
        TCHelper.setAspects("etfuturum:amethyst_cluster_2:*", "vitreus 4, sensus 2");

        TCHelper.setAspects("etfuturum:tinted_glass", "vitreus 1");

        TCHelper.setAspects("etfuturum:sweet_berries", "herba 3, messis 1");

        TCHelper.setEntityAspects("etfuturum.endermite", "bestia 1, iter 1");

        // Special Mobs
        TCHelper.setEntityAspects("SpecialMobs.SpecialBlaze", "alienis 4, ignis 1");
        TCHelper.setEntityAspects("SpecialMobs.CinderBlaze", "alienis 4, ignis 1");
        TCHelper.setEntityAspects("SpecialMobs.ConflagrationBlaze", "alienis 4, ignis 3");
        TCHelper.setEntityAspects("SpecialMobs.EmberBlaze", "alienis 4, vacuos 1");
        TCHelper.setEntityAspects("SpecialMobs.HellfireBlaze", "alienis 4, perditio 1");
        TCHelper.setEntityAspects("SpecialMobs.InfernoBlaze", "alienis 4, infernus 1");
        TCHelper.setEntityAspects("SpecialMobs.JoltBlaze", "alienis 4, tempestas 1");
        TCHelper.setEntityAspects("SpecialMobs.SmolderBlaze", "alienis 4, tenebrae 1");
        TCHelper.setEntityAspects("SpecialMobs.WildfireBlaze", "alienis 4, ira 1");
        TCHelper.setEntityAspects("SpecialMobs.SpecialBlaze", "alienis 4, ignis 1");

        TCHelper.setEntityAspects("SpecialMobs.SpecialCaveSpider", "bestia 2, terra 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.BabyCaveSpider", "bestia 1, venenum 1");
        TCHelper.setEntityAspects("SpecialMobs.FlyingCaveSpider", "bestia 2, volatus 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.MotherCaveSpider", "bestia 2, victus 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.ToughCaveSpider", "bestia 2, tutamen 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.WebCaveSpider", "bestia 2, vinculum 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.WitchCaveSpider", "bestia 2, praecantatio 1, venenum 2");

        TCHelper.setEntityAspects("SpecialMobs.SpecialCreeper", "herba 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.ArmorCreeper", "tutamen 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.DarkCreeper", "lux 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.DeathCreeper", "mortuus 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.DirtCreeper", "terra 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.DoomCreeper", "exanimis 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.DrowningCreeper", "aqua 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.EnderCreeper", "alienis 2, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.FireCreeper", "ignis 4, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.GravityCreeper", "iter 1, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.JumpingCreeper", "volatus 1, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.LightningCreeper", "tempestas 1, ignis 2, ira 2");
        TCHelper.setEntityAspects("SpecialMobs.MiniCreeper", "ignis 1, ira 1");
        TCHelper.setEntityAspects("SpecialMobs.SplittingCreeper", "permutatio 1, ignis 2, ira 2");

        TCHelper.setEntityAspects("SpecialMobs.SpecialEnderman", "aer 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper
            .setEntityAspects("SpecialMobs.BlindingEnderman", "tenebrae 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper
            .setEntityAspects("SpecialMobs.CursedEnderman", "praecantatio 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper.setEntityAspects("SpecialMobs.IcyEnderman", "gelum 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper
            .setEntityAspects("SpecialMobs.LightningEnderman", "tempestas 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper.setEntityAspects("SpecialMobs.MiniEnderman", "aer 1, alienis 2, invidia 2, iter 1");
        TCHelper.setEntityAspects("SpecialMobs.MirageEnderman", "sensus 2, alienis 4, invidia 4, iter 2, superbia 4");
        TCHelper.setEntityAspects("SpecialMobs.ThiefEnderman", "alienis 4, invidia 8, iter 2, superbia 4");

        TCHelper.setEntityAspects("SpecialMobs.SpecialGhast", "exanimis 3, ignis 2, infernus 3, ira 3");
        TCHelper.setEntityAspects("SpecialMobs.BabyGhast", "exanimis 1, ignis 1, infernus 2, ira 1");
        TCHelper.setEntityAspects("SpecialMobs.FaintGhast", "exanimis 3, vacuos 2, infernus 3, ira 3");
        TCHelper.setEntityAspects("SpecialMobs.FighterGhast", "exanimis 3, infernus 3, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.KingGhast", "exanimis 3, potentia 2, infernus 3, ira 3");
        TCHelper.setEntityAspects("SpecialMobs.MiniGhast", "exanimis 1, ignis 1, infernus 2, ira 1");
        TCHelper.setEntityAspects("SpecialMobs.QueenGhast", "exanimis 3, victus 2, infernus 3, ira 3");
        TCHelper.setEntityAspects("SpecialMobs.UnholyGhast", "exanimis 6, infernus 3, ira 3");

        TCHelper.setEntityAspects("SpecialMobs.SpecialPigZombie", "exanimis 4, ignis 2, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.BrutishPigZombie", "exanimis 4, perditio 2, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.FishingPigZombie", "exanimis 4, vinculum 2, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.GiantPigZombie", "exanimis 4, superbia 1, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.HungryPigZombie", "exanimis 4, fames 3, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.PlaguePigZombie", "exanimis 4, venenum 3, ira 6");
        TCHelper.setEntityAspects("SpecialMobs.VampirePigZombie", "exanimis 4, corpus 2, ira 6");

        TCHelper.setEntityAspects("SpecialMobs.SpecialSilverfish", "bestia 1, terra 1");
        TCHelper.setEntityAspects("SpecialMobs.BlindingSilverfish", "bestia 1, tenebrae 1");
        TCHelper.setEntityAspects("SpecialMobs.FishingSilverfish", "bestia 1, vinculum 1");
        TCHelper.setEntityAspects("SpecialMobs.FlyingSilverfish", "bestia 1, volatus 1");
        TCHelper.setEntityAspects("SpecialMobs.PoisonSilverfish", "bestia 1, venenum 1");
        TCHelper.setEntityAspects("SpecialMobs.ToughSilverfish", "bestia 1, tutamen 1");

        TCHelper.setEntityAspects("SpecialMobs.SpecialSkeleton", "exanimis 3, humanus 1, terra 1");
        TCHelper.setEntityAspects("SpecialMobs.BrutishSkeleton", "exanimis 3, humanus 1, perditio 1");
        TCHelper.setEntityAspects("SpecialMobs.FireSkeleton", "exanimis 3, humanus 1, ignis 1");
        TCHelper.setEntityAspects("SpecialMobs.GatlingSkeleton", "exanimis 3, humanus 1, machina 2");
        TCHelper.setEntityAspects("SpecialMobs.GiantSkeleton", "exanimis 3, humanus 1, superbia 1");
        TCHelper.setEntityAspects("SpecialMobs.NinjaSkeleton", "exanimis 3, humanus 1, tenebrae 1");
        TCHelper.setEntityAspects("SpecialMobs.PoisonSkeleton", "exanimis 3, humanus 1, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.SniperSkeleton", "exanimis 3, humanus 1, sensus 1");
        TCHelper.setEntityAspects("SpecialMobs.SpitfireSkeleton", "exanimis 3, humanus 1, potentia 1");
        TCHelper.setEntityAspects("SpecialMobs.ThiefSkeleton", "exanimis 3, humanus 1, invidia 1");

        TCHelper.setEntityAspects("SpecialMobs.SpecialSlime", "aqua 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.BlackberrySlime", "potentia 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.BlueberrySlime", "perditio 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.CaramelSlime", "iter 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.GrapeSlime", "vacuos 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.LemonSlime", "tempestas 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.StrawberrySlime", "ignis 2, limus 2");
        TCHelper.setEntityAspects("SpecialMobs.WatermelonSlime", "motus 2, limus 2");

        TCHelper.setEntityAspects("SpecialMobs.SpecialSpider", "bestia 3, perditio 2");
        TCHelper.setEntityAspects("SpecialMobs.BabySpider", "bestia 1, perditio 1");
        TCHelper.setEntityAspects("SpecialMobs.DesertSpider", "bestia 3, ignis 2");
        TCHelper.setEntityAspects("SpecialMobs.FlyingSpider", "bestia 3, volatus 2");
        TCHelper.setEntityAspects("SpecialMobs.GhostSpider", "bestia 3, gelum 2");
        TCHelper.setEntityAspects("SpecialMobs.GiantSpider", "bestia 3, superbia 1");
        TCHelper.setEntityAspects("SpecialMobs.HungrySpider", "bestia 3, fames 2");
        TCHelper.setEntityAspects("SpecialMobs.MotherSpider", "bestia 3, victus 2");
        TCHelper.setEntityAspects("SpecialMobs.PaleSpider", "bestia 3, desidia 2");
        TCHelper.setEntityAspects("SpecialMobs.PoisonSpider", "bestia 3, venenum 2");
        TCHelper.setEntityAspects("SpecialMobs.SmallSpider", "bestia 2, perditio 1");
        TCHelper.setEntityAspects("SpecialMobs.ToughSpider", "bestia 3, tutamen 2");
        TCHelper.setEntityAspects("SpecialMobs.WebSpider", "bestia 3, vinculum 2");
        TCHelper.setEntityAspects("SpecialMobs.WitchSpider", "bestia 3, praecantatio 2");

        TCHelper.setEntityAspects("SpecialMobs.SpecialWitch", "humanus 3, ignis 1, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.DominationWitch", "humanus 3, motus 1, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.RageWitch", "humanus 3, ira 3, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.ShadowsWitch", "humanus 3, tenebrae 2, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.UndeadWitch", "humanus 3, exanimis 2, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.WildsWitch", "humanus 3, bestia 1, praecantatio 2");
        TCHelper.setEntityAspects("SpecialMobs.WindWitch", "humanus 3, aer 1, praecantatio 2");

        TCHelper.setEntityAspects("SpecialMobs.SpecialZombie", "humanus 1, exanimis 2, terra 1");
        TCHelper.setEntityAspects("SpecialMobs.BrutishZombie", "humanus 1, exanimis 2, perditio 1");
        TCHelper.setEntityAspects("SpecialMobs.FireZombie", "humanus 1, exanimis 2, ignis 2");
        TCHelper.setEntityAspects("SpecialMobs.FishingZombie", "humanus 1, exanimis 2, vinculum 1");
        TCHelper.setEntityAspects("SpecialMobs.GiantZombie", "humanus 1, exanimis 2, superbia 1");
        TCHelper.setEntityAspects("SpecialMobs.HungryZombie", "humanus 1, exanimis 2, fames 1");
        TCHelper.setEntityAspects("SpecialMobs.PlagueZombie", "humanus 1, exanimis 2, venenum 1");

        TCHelper.setEntityAspects("SpecialMobs.LavaMonster", "ignis 3, potentia 1");
    }
}
