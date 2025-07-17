package net.pufferlab.materialis.scripts;

import net.pufferlab.materialis.recipes.TCHelper;

public class ScriptResearch implements IScript {

    public static final String[] researchesToRemove = new String[] { "CLOAKKAMA", "WG.BATHSALTS", "WG.MIRRORESSENTIA",
        "WG.JARLABEL", "WG.INFERNALFURNACE", "WG.ALCHEMICALMANUFACTURE", "WG.ARCANESTONE", "TXJARVOID",
        "TXROD_greatwood_staff", "TXROD_greatwood", "TXCAP_thaumium", "TXHOVERHARNESS", "TXBASICARTIFACE",
        "TXINFUSIONENCHANTMENT", "TXDISTILESSENTIA", "alternateGolemBell", "focusLiquefaction",
        "GADOMANCY.PSEUDO.BELLOWS", "GADOMANCY.PSEUDO.GOLEMTALLOW", "GADOMANCY.PSEUDO.JARLABEL",
        "GADOMANCY.PSEUDO.ESSENTIARESERVOIR", "GADOMANCY.PSEUDO.INFUSIONENCHANTMENT", "GADOMANCY.PSEUDO.WANDPED",
        "GADOMANCY.PSEUDO.VOIDMETAL", "GADOMANCY.PSEUDO.OCULUS", "GADOMANCY.PSEUDO.COREGUARD",
        "GADOMANCY.PSEUDO.COREHARVEST", "ENCHANTER", "JARSEAL", "FIRE_IGNIS", "FIRE_AQUA", "FIRE_TERRA", "FIRE_ORDO",
        "FIRE_AER", "FIRE_PERDITIO" };

    public void run() {
        for (String s : researchesToRemove) {
            TCHelper.orphanResearch(s);
            TCHelper.removeResearch(s);
        }

        TCHelper.moveResearch("GADOMANCY.STICKYJAR", "ALCHEMY", 6, -3);
        TCHelper.clearPrereqs("GADOMANCY.STICKYJAR");
        TCHelper.addPrereq("GADOMANCY.STICKYJAR", "JARLABEL", false);

        TCHelper.moveResearch("GADOMANCY.REMOTEJAR", "ALCHEMY", 8, -4);
        TCHelper.clearPrereqs("GADOMANCY.REMOTEJAR");
        TCHelper.addPrereq("GADOMANCY.REMOTEJAR", "MIRRORESSENTIA", false);
        TCHelper.addPrereq("GADOMANCY.REMOTEJAR", "GADOMANCY.STICKYJAR", false);

        TCHelper.moveResearch("FUNNEL", "ALCHEMY", 10, -1);
        TCHelper.clearPrereqs("FUNNEL");
        TCHelper.addPrereq("FUNNEL", "TUBEFILTER", false);

        TCHelper.moveResearch("GADOMANCY.GOLEMSILVERWOOD", "GOLEMANCY", 6, 6);
        TCHelper.clearPrereqs("GADOMANCY.GOLEMSILVERWOOD");
        TCHelper.addPrereq("GADOMANCY.GOLEMSILVERWOOD", "GOLEMTALLOW", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMSILVERWOOD", "INFUSION", false);

        TCHelper.moveResearch("COREFISHING", "GOLEMANCY", 0, 6);

        TCHelper.moveResearch("GADOMANCY.GOLEMCOREBODYGUARD", "GOLEMANCY", -5, 7);
        TCHelper.clearPrereqs("GADOMANCY.GOLEMCOREBODYGUARD");
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBODYGUARD", "COREGUARD", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBODYGUARD", "BOOTSTRAVELLER", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBODYGUARD", "ELEMENTALSWORD", false);

        TCHelper.moveResearch("GADOMANCY.GOLEMCOREBREAK", "GOLEMANCY", -2, 9);
        TCHelper.clearPrereqs("GADOMANCY.GOLEMCOREBREAK");
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBREAK", "CORELUMBER", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBREAK", "ELEMENTALSHOVEL", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBREAK", "ELEMENTALSWORD", false);
        TCHelper.addPrereq("GADOMANCY.GOLEMCOREBREAK", "ELEMENTALPICK", false);

        TCHelper.moveResearch("GADOMANCY.ARCANEDROPPER", "ARTIFICE", -6, -4);
        TCHelper.clearPrereqs("GADOMANCY.ARCANEDROPPER");
        TCHelper.addPrereq("GADOMANCY.ARCANEDROPPER", "BELLOWS", false);
        TCHelper.addPrereq("GADOMANCY.ARCANEDROPPER", "DISTILESSENTIA", false);

        TCHelper.moveResearch("WARDEDARCANA", "ARTIFICE", -2, -1);

        TCHelper.orphanResearch("XP_TALISMAN");
        TCHelper.moveResearch("XP_TALISMAN", "ARTIFICE", -6, 9);

        TCHelper.moveResearch("TD.DYEDFORTRESS", "ARTIFICE", -8, 11);
        TCHelper.clearPrereqs("TD.DYEDFORTRESS");
        TCHelper.addPrereq("TD.DYEDFORTRESS", "ARMORFORTRESS", false);

        TCHelper.moveResearch("GADOMANCY.ARMORDISGUISE", "ARTIFICE", -7, 13);
        TCHelper.clearPrereqs("GADOMANCY.ARMORDISGUISE");
        TCHelper.addPrereq("GADOMANCY.ARMORDISGUISE", "INFUSIONENCHANTMENT", false);

        TCHelper.moveResearch("GADOMANCY.REVEALER", "ARTIFICE", -9, 15);
        TCHelper.clearPrereqs("GADOMANCY.REVEALER");
        TCHelper.addPrereq("GADOMANCY.REVEALER", "INFUSIONENCHANTMENT", false);

        TCHelper.moveResearch("TTENCH_ASCENT_BOOST", "ARTIFICE", -11, 14);
        TCHelper.clearPrereqs("TTENCH_ASCENT_BOOST");
        TCHelper.addPrereq("TTENCH_ASCENT_BOOST", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("TTENCH_POUNCE", "ARTIFICE", -13, 13);
        TCHelper.clearPrereqs("TTENCH_POUNCE");
        TCHelper.addPrereq("TTENCH_POUNCE", "TTENCH_ASCENT_BOOST", false);

        TCHelper.moveResearch("TTENCH_SLOW_FALL", "ARTIFICE", -10, 13);
        TCHelper.clearPrereqs("TTENCH_SLOW_FALL");
        TCHelper.addPrereq("TTENCH_SLOW_FALL", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("TTENCH_SHOCKWAVE", "ARTIFICE", -12, 12);
        TCHelper.clearPrereqs("TTENCH_SHOCKWAVE");
        TCHelper.addPrereq("TTENCH_SHOCKWAVE", "TTENCH_SLOW_FALL", false);

        TCHelper.moveResearch("TTENCH_VAMPIRISM", "ARTIFICE", -11, 16);
        TCHelper.clearPrereqs("TTENCH_VAMPIRISM");
        TCHelper.addPrereq("TTENCH_VAMPIRISM", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("TTENCH_VALIANCE", "ARTIFICE", -13, 15);
        TCHelper.clearPrereqs("TTENCH_VALIANCE");
        TCHelper.addPrereq("TTENCH_VALIANCE", "TTENCH_VAMPIRISM", false);

        TCHelper.moveResearch("TTENCH_DISPERSED", "ARTIFICE", -13, 17);
        TCHelper.clearPrereqs("TTENCH_DISPERSED");
        TCHelper.addPrereq("TTENCH_DISPERSED", "TTENCH_VAMPIRISM", false);

        TCHelper.moveResearch("TTENCH_FOCUSED", "ARTIFICE", -12, 18);
        TCHelper.clearPrereqs("TTENCH_FOCUSED");
        TCHelper.addPrereq("TTENCH_FOCUSED", "TTENCH_VAMPIRISM", false);

        TCHelper.moveResearch("TTENCH_FINAL", "ARTIFICE", -14, 19);
        TCHelper.clearPrereqs("TTENCH_FINAL");
        TCHelper.addPrereq("TTENCH_FINAL", "TTENCH_DISPERSED", false);
        TCHelper.addPrereq("TTENCH_FINAL", "TTENCH_FOCUSED", false);

        TCHelper.moveResearch("TTENCH_DESINTEGRATE", "ARTIFICE", -10, 17);
        TCHelper.clearPrereqs("TTENCH_DESINTEGRATE");
        TCHelper.addPrereq("TTENCH_DESINTEGRATE", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("TTENCH_SHATTER", "ARTIFICE", -11, 19);
        TCHelper.clearPrereqs("TTENCH_SHATTER");
        TCHelper.addPrereq("TTENCH_SHATTER", "TTENCH_DESINTEGRATE", false);

        TCHelper.moveResearch("TTENCH_AUTO_SMELT", "ARTIFICE", -8, 17);
        TCHelper.clearPrereqs("TTENCH_AUTO_SMELT");
        TCHelper.addPrereq("TTENCH_AUTO_SMELT", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("TTENCH_TUNNEL", "ARTIFICE", -7, 19);
        TCHelper.clearPrereqs("TTENCH_TUNNEL");
        TCHelper.addPrereq("TTENCH_TUNNEL", "TTENCH_AUTO_SMELT", false);

        TCHelper.moveResearch("TTENCH_QUICK_DRAW", "ARTIFICE", -7, 16);
        TCHelper.clearPrereqs("TTENCH_QUICK_DRAW");
        TCHelper.addPrereq("TTENCH_QUICK_DRAW", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("ENCHDISARM", "ARTIFICE", -6, 18);
        TCHelper.clearPrereqs("ENCHDISARM");
        TCHelper.addPrereq("ENCHDISARM", "TTENCH_QUICK_DRAW", false);

        TCHelper.moveResearch("ENCHBINDING", "ARTIFICE", -5, 17);
        TCHelper.clearPrereqs("ENCHBINDING");
        TCHelper.addPrereq("ENCHBINDING", "TTENCH_QUICK_DRAW", false);

        TCHelper.moveResearch("ENCH_RIDEPROTECT", "ARTIFICE", -11, 11);
        TCHelper.setSecondary("ENCH_RIDEPROTECT", true);
        TCHelper.clearPrereqs("ENCH_RIDEPROTECT");
        TCHelper.addPrereq("ENCH_RIDEPROTECT", "TTENCH_SLOW_FALL", false);

        TCHelper.moveResearch("ENCHNIGHTVISION", "ARTIFICE", -9, 19);
        TCHelper.clearPrereqs("ENCHNIGHTVISION");
        TCHelper.addPrereq("ENCHNIGHTVISION", "GADOMANCY.REVEALER", false);

        TCHelper.moveResearch("ENCH_STEALTH", "ARTIFICE", -8, 20);
        TCHelper.setSecondary("ENCH_STEALTH", true);
        TCHelper.clearPrereqs("ENCH_STEALTH");
        TCHelper.addPrereq("ENCH_STEALTH", "ENCHNIGHTVISION", false);

        TCHelper.moveResearch("ENCH_BACKSTAB", "ARTIFICE", -10, 20);
        TCHelper.setSecondary("ENCH_BACKSTAB", true);
        TCHelper.clearPrereqs("ENCH_BACKSTAB");
        TCHelper.addPrereq("ENCH_BACKSTAB", "ENCHNIGHTVISION", false);

        TCHelper.moveResearch("ENCH_UNVEILING", "ARTIFICE", -9, 21);
        TCHelper.setSecondary("ENCH_UNVEILING", true);
        TCHelper.clearPrereqs("ENCH_UNVEILING");
        TCHelper.addPrereq("ENCH_UNVEILING", "ENCHNIGHTVISION", false);

        TCHelper.moveResearch("NITORLIGHT", "ARTIFICE", -5, 1);
        TCHelper.addPrereq("ARCANELAMP", "NITORLIGHT", false);

        TCHelper.moveResearch("INFERNALBLASTFURNACE", "ARTIFICE", -4, -3);
        TCHelper.clearPrereqs("INFERNALBLASTFURNACE");
        TCHelper.addPrereq("INFERNALBLASTFURNACE", "INFERNALFURNACE", false);

        TCHelper.moveResearch("MIRRORPUMP", "ARTIFICE", 1, 11);
        TCHelper.clearPrereqs("MIRRORPUMP");
        TCHelper.addPrereq("MIRRORPUMP", "MIRRORESSENTIA", false);

        TCHelper.moveResearch("DISLOCATOR", "ARTIFICE", 3, 11);
        TCHelper.clearPrereqs("DISLOCATOR");
        TCHelper.addPrereq("DISLOCATOR", "MIRRORHAND", false);

        TCHelper.moveResearch("STABILIZERBELT", "ARTIFICE", 4, 7);
        TCHelper.clearPrereqs("STABILIZERBELT");
        TCHelper.addPrereq("STABILIZERBELT", "HOVERGIRDLE", false);

        TCHelper.moveResearch("ALCHEMYBOILER", "ALCHEMY", 4, 1);
        TCHelper.clearPrereqs("ALCHEMYBOILER");
        TCHelper.addPrereq("ALCHEMYBOILER", "DISTILESSENTIA", false);

        TCHelper.moveResearch("CRUCSOULS", "ALCHEMY", 4, 3);
        TCHelper.clearPrereqs("CRUCSOULS");
        TCHelper.addPrereq("CRUCSOULS", "ALCHEMYBOILER", false);
        TCHelper.addPrereq("CRUCSOULS", "INFUSION", false);
        TCHelper.addPrereq("CRUCSOULS", "FLESHCURE", true);

        TCHelper.moveResearch("FLOATCANDLE", "ALCHEMY", -2, 1);
        TCHelper.clearPrereqs("FLOATCANDLE");
        TCHelper.addPrereq("FLOATCANDLE", "TALLOW", false);

        TCHelper.moveResearch("SAUNASTOVE", "ALCHEMY", -8, -5);
        TCHelper.clearPrereqs("SAUNASTOVE");
        TCHelper.addPrereq("SAUNASTOVE", "ARCANESPA", false);
        TCHelper.addPrereq("SAUNASTOVE", "INFUSION", false);

        TCHelper.moveResearch("GADOMANCY.BLOCK_PROTECTOR", "ALCHEMY", 6, 2);
        TCHelper.clearPrereqs("GADOMANCY.BLOCK_PROTECTOR");
        TCHelper.addPrereq("GADOMANCY.BLOCK_PROTECTOR", "TUBES", false);

        TCHelper.moveResearch("CENTRIFUGE", "ALCHEMY", 10, 3);
        TCHelper.moveResearch("THAUMATORIUM", "ALCHEMY", 10, 5);

        TCHelper.moveResearch("TERRAFORMER", "ALCHEMY", 6, 5);
        TCHelper.clearPrereqs("TERRAFORMER");
        TCHelper.addPrereq("TERRAFORMER", "CENTRIFUGE", false);
        TCHelper.addPrereq("TERRAFORMER", "INFUSION", false);

        TCHelper.moveResearch("SANESOAP", "ALCHEMY", -4, -6);
        TCHelper.moveResearch("ETHEREALBLOOM", "ALCHEMY", -7, -3);
        TCHelper.clearPrereqs("ETHEREALBLOOM");
        TCHelper.addPrereq("ETHEREALBLOOM", "BATHSALTS", false);

        TCHelper.moveResearch("ALCHEMICALTRANSMOGRIFY", "ALCHEMY", -7, -1);
        TCHelper.clearPrereqs("ALCHEMICALTRANSMOGRIFY");
        TCHelper.addPrereq("ALCHEMICALTRANSMOGRIFY", "ALCHEMICALMANUFACTURE", false);

        TCHelper.moveResearch("ROSEVINE", "ALCHEMY", -9, -1);
        TCHelper.clearPrereqs("ROSEVINE");
        TCHelper.addPrereq("ROSEVINE", "ALCHEMICALTRANSMOGRIFY", false);

        TCHelper.moveResearch("PHIAL", "ALCHEMY", 0, 1);
        TCHelper.addPrereq("PHIAL", "CRUCIBLE", false);

        TCHelper.moveResearch("LABELLIB", "ALCHEMY", 3, -5);
        TCHelper.clearPrereqs("LABELLIB");
        TCHelper.addPrereq("LABELLIB", "JARLABEL", false);

        TCHelper.moveResearch("GASEOUS_LIGHT", "ALCHEMY", 0, -2);
        TCHelper.clearPrereqs("GASEOUS_LIGHT");
        TCHelper.addPrereq("GASEOUS_LIGHT", "NITOR", false);

        TCHelper.moveResearch("GASEOUS_SHADOW", "ALCHEMY", -1, -4);
        TCHelper.clearPrereqs("GASEOUS_SHADOW");
        TCHelper.addPrereq("GASEOUS_SHADOW", "GASEOUS_LIGHT", false);

        TCHelper.moveResearch("GAS_REMOVER", "ALCHEMY", -1, -5);
        TCHelper.clearPrereqs("GAS_REMOVER");
        TCHelper.addPrereq("GAS_REMOVER", "GASEOUS_SHADOW", false);

        TCHelper.moveResearch("BRIGHT_NITOR", "ALCHEMY", 1, -4);
        TCHelper.clearPrereqs("BRIGHT_NITOR");
        TCHelper.addPrereq("BRIGHT_NITOR", "GASEOUS_LIGHT", false);

        TCHelper.moveResearch("INFUSED_POTIONS", "ALCHEMY", 1, -6);
        TCHelper.clearPrereqs("INFUSED_POTIONS");
        TCHelper.addPrereq("INFUSED_POTIONS", "BRIGHT_NITOR", false);
        TCHelper.addPrereq("INFUSED_POTIONS", "INFUSION", false);

        TCHelper.moveResearch("FLESHCURE", "ALCHEMY", -2, -2);
        TCHelper.clearPrereqs("FLESHCURE");
        TCHelper.addPrereq("FLESHCURE", "TALLOW", false);

        TCHelper.moveResearch("INTERFACE", "ALCHEMY", 8, 3);
        TCHelper.clearPrereqs("INTERFACE");
        TCHelper.addPrereq("INTERFACE", "CENTRIFUGE", false);

        TCHelper.moveResearch("TRASHJAR", "ALCHEMY", 7, -6);
        TCHelper.clearPrereqs("TRASHJAR");
        TCHelper.addPrereq("TRASHJAR", "JARVOID", false);
        TCHelper.addPrereq("TRASHJAR", "INFUSION", false);

        TCHelper.moveResearch("SHARE_TOME", "BASICS", 2, -4);
        TCHelper.addPrereq("SHARE_TOME", "THAUMONOMICON", false);
        TCHelper.addPrereq("SHARE_TOME", "THAUMOMETER", false);

        TCHelper.moveResearch("KNOWFRAG", "BASICS", 7, -4);
        TCHelper.clearPrereqs("KNOWFRAG");
        TCHelper.addPrereq("KNOWFRAG", "RESTABLE", false);

        TCHelper.moveResearch("TABLE", "BASICS", 6, 0);
        TCHelper.moveResearch("ARCTABLE", "BASICS", 5, -2);
        TCHelper.moveResearch("RESTABLE", "BASICS", 7, -2);

        TCHelper.moveResearch("THAUMOMETER", "BASICS", 3, -2);
        TCHelper.addPrereq("THAUMOMETER", "RESEARCH", false);

        // PREVENT CRASH BY MOVING RANDOM PLACE
        TCHelper.moveResearch("PAVETRAVEL", "ARTIFICE", 5, -4);
        // -----------
        TCHelper.moveResearch("PAVEWARD", "ARTIFICE", 4, -4);
        TCHelper.moveResearch("PAVETRAVEL", "ARTIFICE", 6, -4);

        // TCHelper.moveResearch("BANNERS", "ARTIFICE", 2, -1);

        TCHelper.moveResearch("AGEINGSTONE", "ARTIFICE", 3, -3);
        TCHelper.clearPrereqs("AGEINGSTONE");
        TCHelper.addPrereq("AGEINGSTONE", "PAVEWARD", false);

        TCHelper.moveResearch("ETHEREALWALL", "ARTIFICE", 2, -5);
        TCHelper.clearPrereqs("ETHEREALWALL");
        TCHelper.addPrereq("ETHEREALWALL", "PAVEWARD", false);
        TCHelper.addPrereq("ETHEREALWALL", "PLATFORM", false);

        TCHelper.moveResearch("STONEEXTRUDER", "ARTIFICE", 7, -2);
        TCHelper.clearPrereqs("STONEEXTRUDER");
        TCHelper.addPrereq("STONEEXTRUDER", "ARCANESTONE", false);
        TCHelper.addPrereq("STONEEXTRUDER", "INFUSION", true);

        TCHelper.moveResearch("ICESOLIDIFIER", "ARTIFICE", 8, -4);
        TCHelper.clearPrereqs("ICESOLIDIFIER");
        TCHelper.addPrereq("ICESOLIDIFIER", "STONEEXTRUDER", false);

        TCHelper.moveResearch("URN", "ARTIFICE", 10, -4);
        TCHelper.clearPrereqs("URN");
        TCHelper.addPrereq("URN", "ICESOLIDIFIER", false);

        TCHelper.moveResearch("BURN", "ARTIFICE", 9, -2);

        TCHelper.moveResearch("SLIVERS", "ARTIFICE", 5, -7);
        TCHelper.moveResearch("SLIVERS_WARDING", "ARTIFICE", 4, -5);
        TCHelper.moveResearch("SLIVERS_TRAVEL", "ARTIFICE", 6, -5);

        TCHelper.moveResearch("LEVITATOR", "ARTIFICE", 0, -1);

        TCHelper.moveResearch("PLATFORM", "ARTIFICE", 0, -3);
        TCHelper.clearPrereqs("PLATFORM");
        TCHelper.addPrereq("PLATFORM", "LEVITATOR", false);

        TCHelper.moveResearch("LEVITATOR_LOCOMOTIVE", "ARTIFICE", 0, -5);
        TCHelper.clearPrereqs("LEVITATOR_LOCOMOTIVE");
        TCHelper.addPrereq("LEVITATOR_LOCOMOTIVE", "PLATFORM", false);
        TCHelper.addPrereq("LEVITATOR_LOCOMOTIVE", "INFUSION", true);

        TCHelper.moveResearch("DISCOUNTRINGS", "ARTIFICE", 2, 1);
        TCHelper.clearPrereqs("DISCOUNTRINGS");
        TCHelper.addPrereq("DISCOUNTRINGS", "BASICARTIFACE", false);

        TCHelper.moveResearch("REVEALING_HELM", "ARTIFICE", 4, 0);
        TCHelper.clearPrereqs("REVEALING_HELM");
        TCHelper.addPrereq("REVEALING_HELM", "GOGGLES", false);

        TCHelper.moveResearch("TD.RUNICARMOR", "ARTIFICE", 8, 4);
        TCHelper.clearPrereqs("TD.RUNICARMOR");
        TCHelper.addPrereq("TD.RUNICARMOR", "RUNICAUGMENTATION", false);
        TCHelper.addPrereq("TD.RUNICARMOR", "INFUSION", true);

        TCHelper.moveResearch("TD.RUNICARMORUPGRADES", "ARTIFICE", 9, 4);
        TCHelper.clearPrereqs("TD.RUNICARMORUPGRADES");
        TCHelper.addPrereq("TD.RUNICARMORUPGRADES", "TD.RUNICARMOR", false);

        TCHelper.moveResearch("TD.RUNICGOGGLES", "ARTIFICE", 8, 3);
        TCHelper.clearPrereqs("TD.RUNICGOGGLES");
        TCHelper.addPrereq("TD.RUNICGOGGLES", "TD.RUNICARMOR", false);

        TCHelper.moveResearch("TD.RUNICBOOTSTRAVELLER", "ARTIFICE", 8, 5);
        TCHelper.clearPrereqs("TD.RUNICBOOTSTRAVELLER");
        TCHelper.addPrereq("TD.RUNICBOOTSTRAVELLER", "TD.RUNICARMOR", false);

        TCHelper.moveResearch("REPAIRER", "ARTIFICE", -2, 12);
        TCHelper.addPrereq("REPAIRER", "ARCANEBORE", false);

        TCHelper.moveResearch("MAGNETS", "ARTIFICE", -1, 14);
        TCHelper.clearPrereqs("MAGNETS");
        TCHelper.addPrereq("MAGNETS", "FOCUS_TELEKINESIS", false);
        TCHelper.addPrereq("MAGNETS", "REPAIRER", false);

        TCHelper.moveResearch("REPLICATOR", "ARTIFICE", -3, 14);
        TCHelper.clearPrereqs("REPLICATOR");
        TCHelper.addPrereq("REPLICATOR", "REPAIRER", false);

        TCHelper.moveResearch("BLOOD_SWORD", "ARTIFICE", -2, 16);
        TCHelper.clearPrereqs("BLOOD_SWORD");
        TCHelper.addPrereq("BLOOD_SWORD", "ROD_NECROMANCER_staff", false);
        // TCHelper.addPrereq("BLOOD_SWORD", "REPAIRER", false);

        TCHelper.moveResearch("SUMMON", "ARTIFICE", -3, 18);
        TCHelper.clearPrereqs("SUMMON");
        // TCHelper.addPrereq("SUMMON", "MAGNETS", false);
        TCHelper.addPrereq("SUMMON", "BLOOD_SWORD", false);

        TCHelper.moveResearch("ANIMATION_TABLET", "AUTOMAGY", 7, -7);
        TCHelper.clearPrereqs("ANIMATION_TABLET");
        TCHelper.addPrereq("ANIMATION_TABLET", "COREUSE", false);
        TCHelper.addPrereq("ANIMATION_TABLET", "GOLEMINHIBITOR", false);

        TCHelper.moveResearch("VISREADER", "AUTOMAGY", 2, -1);

        TCHelper.moveResearch("ESSENTIALOCUS", "AUTOMAGY", 3, -6);

        TCHelper.moveResearch("ESSENTIALOCUS", "AUTOMAGY", 4, -2);
        TCHelper.moveResearch("ESSENTIALOCUSAGGREGATOR", "AUTOMAGY", 2, -3);

        TCHelper.moveResearch("GADOMANCY.AURA_CORE", "AUTOMAGY", 3, -5);
        TCHelper.clearPrereqs("GADOMANCY.AURA_CORE");
        TCHelper.addPrereq("GADOMANCY.AURA_CORE", "INFUSION", false);
        TCHelper.addPrereq("GADOMANCY.AURA_CORE", "CRYSTALBRAIN", false);

        TCHelper.moveResearch("GADOMANCY.ARCANE_PACKAGER", "AUTOMAGY", 2, -8);

        TCHelper.moveResearch("GADOMANCY.KNOWLEDGE_BOOK", "AUTOMAGY", 0, -4);

        TCHelper.moveResearch("GADOMANCY.AURA_PYLON", "AUTOMAGY", 1, -6);
        TCHelper.moveResearch("GADOMANCY.AURA_EFFECTS", "AUTOMAGY", 0, -7);

        TCHelper.moveResearch("GADOMANCY.CLEAN_AURA_CORE", "AUTOMAGY", 4, -5);

        TCHelper.moveResearch("BRAINCURE", "ARTIFICE", -4, 11);
        TCHelper.clearPrereqs("BRAINCURE");
        TCHelper.addPrereq("BRAINCURE", "FLESHCURE", false);
        TCHelper.addPrereq("BRAINCURE", "JARBRAIN", false);

        TCHelper.moveResearch("THINKTANK", "ARTIFICE", -5, 13);
        TCHelper.clearPrereqs("THINKTANK");
        TCHelper.addPrereq("THINKTANK", "BRAINCURE", false);

        TCHelper.moveResearch("GRATE", "AUTOMAGY", 0, -2);
        TCHelper.addPrereq("GRATE", "REDSTONETHEORY", false);

        TCHelper.moveResearch("GADOMANCY.NODE_MANIPULATOR", "ELDRITCH", 1, -5);
        TCHelper.clearPrereqs("GADOMANCY.NODE_MANIPULATOR");
        TCHelper.addPrereq("GADOMANCY.NODE_MANIPULATOR", "VOIDMETAL", false);
        TCHelper.addPrereq("GADOMANCY.NODE_MANIPULATOR", "WANDPED", false);
        TCHelper.addPrereq("GADOMANCY.NODE_MANIPULATOR", "FOCUSWARDING", false);
        TCHelper.addPrereq("GADOMANCY.NODE_MANIPULATOR", "PAVEWARD", false);

        TCHelper.moveResearch("GADOMANCY.INFUSIONCLAW", "ELDRITCH", 3, -5);
        TCHelper.clearPrereqs("GADOMANCY.INFUSIONCLAW");
        TCHelper.addPrereq("GADOMANCY.INFUSIONCLAW", "VOIDMETAL", false);
        TCHelper.addPrereq("GADOMANCY.INFUSIONCLAW", "WANDPED", false);
        TCHelper.addPrereq("GADOMANCY.INFUSIONCLAW", "COREUSE", false);
        TCHelper.addPrereq("GADOMANCY.INFUSIONCLAW", "FOCUSPRIMAL", true);

        TCHelper.moveResearch("GADOMANCY.ESSENTIA_COMPRESSOR", "ELDRITCH", 5, -5);
        TCHelper.clearPrereqs("GADOMANCY.ESSENTIA_COMPRESSOR");
        TCHelper.addPrereq("GADOMANCY.ESSENTIA_COMPRESSOR", "ESSENTIARESERVOIR", false);
        TCHelper.addPrereq("GADOMANCY.ESSENTIA_COMPRESSOR", "GADOMANCY.AURA_CORE", false);

        TCHelper.moveResearch("GADOMANCY.GROWING", "ELDRITCH", -1, -7);
        TCHelper.moveResearch("GADOMANCY.GROWING_AGGRESSION", "ELDRITCH", -4, -6);
        TCHelper.moveResearch("GADOMANCY.GROWING_GROWTH", "ELDRITCH", -3, -5);
        TCHelper.moveResearch("GADOMANCY.GROWING_ATTACK", "ELDRITCH", -2, -4);
        TCHelper.moveResearch("GADOMANCY.GROWING_GROWTHCLUE", "ELDRITCH", -5, -3);

        TCHelper.moveResearch("GADOMANCY.E_PORTAL_CREATOR", "ELDRITCH", -4, 1);
        TCHelper.clearPrereqs("GADOMANCY.E_PORTAL_CREATOR");
        TCHelper.addPrereq("GADOMANCY.E_PORTAL_CREATOR", "OCULUS", false);
        TCHelper.addPrereq("GADOMANCY.E_PORTAL_CREATOR", "GADOMANCY.NODE_MANIPULATOR", true);

        TCHelper.moveResearch("TD.VOIDROBE", "ELDRITCH", -2, -2);
        TCHelper.clearPrereqs("TD.VOIDROBE");
        TCHelper.addPrereq("TD.VOIDROBE", "ARMORVOIDFORTRESS", false);

        TCHelper.moveResearch("TD.MASKEVIL", "ELDRITCH", -4, -1);
        TCHelper.clearPrereqs("TD.MASKEVIL");
        TCHelper.addPrereq("TD.MASKEVIL", "OCULUS", false);

        TCHelper.moveResearch("ALCHGRATE", "ELDRITCH", -4, 6);

        // PREVENT CRASH BY MOVING RANDOM PLACE
        TCHelper.moveResearch("ROD_bone", "THAUMATURGY", -5, 9);
        TCHelper.moveResearch("ROD_bone_staff", "THAUMATURGY", -5, 10);
        TCHelper.moveResearch("FOCUS_SMELT", "THAUMATURGY", -4, 10);
        // -----------

        TCHelper.moveResearch("FOCUS_SMELT", "THAUMATURGY", -1, -6);
        TCHelper.clearPrereqs("FOCUS_SMELT");
        TCHelper.addPrereq("FOCUS_SMELT", "FOCUSEXCAVATION", false);
        TCHelper.moveResearch("FOCUS_FLIGHT", "THAUMATURGY", 6, -4);
        TCHelper.clearPrereqs("FOCUS_FLIGHT");
        TCHelper.addPrereq("FOCUS_FLIGHT", "FOCUSTRADE", false);
        TCHelper.addPrereq("FOCUS_FLIGHT", "ELEMENTALSWORD", false);

        TCHelper.moveResearch("FOCUS_DEFLECT", "THAUMATURGY", 8, -4);
        TCHelper.clearPrereqs("FOCUS_DEFLECT");
        TCHelper.addPrereq("FOCUS_DEFLECT", "FOCUS_FLIGHT", false);

        TCHelper.moveResearch("FOCUS_HEAL", "THAUMATURGY", 9, -6);
        TCHelper.clearPrereqs("FOCUS_HEAL");
        TCHelper.addPrereq("FOCUS_HEAL", "FOCUS_DEFLECT", false);

        TCHelper.moveResearch("FOCUS_DISLOCATION", "THAUMATURGY", 5, -6);
        TCHelper.clearPrereqs("FOCUS_DISLOCATION");
        TCHelper.addPrereq("FOCUS_DISLOCATION", "FOCUS_FLIGHT", false);

        TCHelper.moveResearch("FOCUS_TELEKINESIS", "THAUMATURGY", 7, -6);
        TCHelper.clearPrereqs("FOCUS_TELEKINESIS");
        TCHelper.addPrereq("FOCUS_TELEKINESIS", "FOCUS_FLIGHT", false);

        TCHelper.moveResearch("FOCUSPORTABLEHOLE", "THAUMATURGY", 6, -1);

        TCHelper.moveResearch("FOCUS_ENDER_CHEST", "THAUMATURGY", 8, -2);
        TCHelper.clearPrereqs("FOCUS_ENDER_CHEST");
        TCHelper.addPrereq("FOCUS_ENDER_CHEST", "FOCUS_FLIGHT", false);
        TCHelper.addPrereq("FOCUS_ENDER_CHEST", "FOCUSPORTABLEHOLE", false);
        TCHelper.addPrereq("FOCUS_ENDER_CHEST", "MIRROR", false);

        TCHelper.moveResearch("FOCUSWARDING", "THAUMATURGY", -4, -4);
        TCHelper.clearPrereqs("FOCUSWARDING");
        TCHelper.addPrereq("FOCUSWARDING", "focusIllumination", false);

        TCHelper.moveResearch("focusIllumination", "THAUMATURGY", -2, -4);
        TCHelper.clearPrereqs("focusIllumination");
        TCHelper.addPrereq("focusIllumination", "FOCUSEXCAVATION", false);

        TCHelper.addPrereq("FOCUSHELLBAT", "FOCUS_SMELT", false);

        TCHelper.moveResearch("ROD_quartz", "THAUMATURGY", -3, 0);
        TCHelper.moveResearch("ROD_quartz_staff", "THAUMATURGY", -2, -1);

        TCHelper.moveResearch("ROD_bone", "THAUMATURGY", -5, 5);
        TCHelper.moveResearch("ROD_bone_staff", "THAUMATURGY", -5, 6);

        TCHelper.moveResearch("ROD_silverwood", "THAUMATURGY", -3, 4);
        TCHelper.moveResearch("ROD_silverwood_staff", "THAUMATURGY", -2, 5);
        TCHelper.moveResearch("SCEPTRE", "THAUMATURGY", -1, 4);
        TCHelper.moveResearch("ROD_greatwood_staff", "THAUMATURGY", -3, 6);

        TCHelper.moveResearch("ROD_NECROMANCER_staff", "THAUMATURGY", -4, 8);
        TCHelper.clearPrereqs("ROD_NECROMANCER_staff");
        TCHelper.addPrereq("ROD_NECROMANCER_staff", "ROD_greatwood_staff", false);
        TCHelper.addPrereq("ROD_NECROMANCER_staff", "ROD_bone_staff", false);
        TCHelper.addPrereq("ROD_NECROMANCER_staff", "INFUSION", false);

        TCHelper.moveResearch("ROD_AMBER", "THAUMATURGY", -2, 2);
        TCHelper.clearPrereqs("ROD_AMBER");
        TCHelper.addPrereq("ROD_AMBER", "ROD_greatwood", false);
        TCHelper.addPrereq("ROD_AMBER", "INFUSION", false);

        TCHelper.moveResearch("ROD_AMBER_staff", "THAUMATURGY", -1, 2);
        TCHelper.clearPrereqs("ROD_AMBER_staff");
        TCHelper.addPrereq("ROD_AMBER_staff", "ROD_AMBER", false);
        TCHelper.addPrereq("ROD_AMBER_staff", "ROD_greatwood_staff", true);

        TCHelper.moveResearch("CAP_gold", "THAUMATURGY", 3, 2);

        TCHelper.moveResearch("CAP_thaumium", "THAUMATURGY", 4, 4);
        TCHelper.moveResearch("CAP_silver", "THAUMATURGY", 2, 4);

        TCHelper.moveResearch("CAP_MECHANIST", "THAUMATURGY", 3, 6);
        TCHelper.clearPrereqs("CAP_MECHANIST");
        TCHelper.addPrereq("CAP_MECHANIST", "CAP_thaumium", false);

        TCHelper.moveResearch("CAP_SOJOURNER", "THAUMATURGY", 5, 6);
        TCHelper.clearPrereqs("CAP_SOJOURNER");
        TCHelper.addPrereq("CAP_SOJOURNER", "CAP_thaumium", false);

        TCHelper.moveResearch("ROD_TRANSMUTATION", "THAUMATURGY", -2, 8);
        TCHelper.clearPrereqs("ROD_TRANSMUTATION");
        TCHelper.addPrereq("ROD_TRANSMUTATION", "ROD_NECROMANCER_staff", false);
        TCHelper.addPrereq("ROD_TRANSMUTATION", "INFUSION", false);

        TCHelper.moveResearch("ROD_TRANSMUTATION_staff", "THAUMATURGY", -1, 8);
        TCHelper.clearPrereqs("ROD_TRANSMUTATION_staff");
        TCHelper.addPrereq("ROD_TRANSMUTATION_staff", "ROD_TRANSMUTATION", false);
        TCHelper.addPrereq("ROD_TRANSMUTATION_staff", "ROD_greatwood_staff", true);
    }
}
