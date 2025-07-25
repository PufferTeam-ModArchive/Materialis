package net.pufferlab.materialis;

public class Constants {

    public static final String[] none = new String[] {};
    public static final int[] noneI = new int[] {};

    public static final String[] woodTypes = new String[] { "oak", "spruce", "birch", "jungle", "acacia", "dark_oak" };
    public static final String[] bopWoodTypes = new String[] { "sacredoak", "cherry", "dark", "fir", "ethereal",
        "magic", "mangrove", "palm", "redwood", "willow", "pine", "hellbark", "jacaranda", "mahogany" };
    public static final String[] bopLogTypes = new String[] { "sacredoak", "cherry", "dark", "fir", "ethereal", "magic",
        "mangrove", "palm", "redwood", "willow", "dead", "bigflowerstem", "pine", "hellbark", "jacaranda", "mahogany" };
    public static final String[] bopPlankTypes = new String[] { "sacredoak", "cherry", "dark", "fir", "ethereal",
        "magic", "mangrove", "palm", "redwood", "willow", "bamboo", "pine", "hellbark", "jacaranda", "mahogany" };
    public static final String[] thaumcraftWoodTypes = new String[] { "greatwood", "silverwood" };
    public static final String[] thaumcraftArcaneWoodTypes = new String[] { "greatwood", "silverwood", "magic" };
    public static final String[] witcheryWoodTypes = new String[] { "rowan", "alder", "hawthorn" };

    public static final String[] gemTypes = new String[] { "cinnabar", "slag", "rich_slag" };

    public static final String[] moddedMetalTypes = new String[] { "iron", "gold", "copper", "tin", "silver", "lead",
        "nickel", "platinum", "bauxite", "cinnabar", "osmium" };
    public static final String[] metalTypes = new String[] { "iron", "gold", "copper", "tin", "silver", "lead",
        "nickel", "bronze", "electrum", "invar", "constantan", "platinum", "steel", "aluminum", "osmium", "thaumium",
        "manasteel", "terrasteel" };
    public static final int[] metalTypesTemp = new int[] { 1538, 1064, 1084, 231, 961, 327, 1455, 900, 1032, 1427, 1250,
        1768, 1540, 660, 3033, 1230, 1045, 1457 };
    public static final String[] metalTypesByproduct = new String[] { "nickel", "copper", "gold", "iron", "lead",
        "silver", "platinum", null, null, null, null };

    public static final String[] ingotBlacklist = new String[] { "iron", "gold", "thaumium", "manasteel",
        "terrasteel" };
    public static final String[] nuggetBlacklist = new String[] { "iron", "gold", "thaumium", "manasteel",
        "terrasteel" };
    public static final String[] miscBlacklist = new String[] { "pig_iron" };

    public static final String[] oreTypes = new String[] { "copper", "tin", "silver", "lead", "nickel", "platinum",
        "mithril", "bauxite" };
    public static final String[] oreTools = new String[] { "pickaxe", "pickaxe", "pickaxe", "pickaxe", "pickaxe",
        "pickaxe", "pickaxe", "pickaxe" };
    public static final int[] oreLevels = new int[] { 0, 0, 2, 2, 2, 3, 3, 1 };

    public static final String[] blockTypes = new String[] { "copper", "tin", "silver", "lead", "nickel", "bronze",
        "electrum", "invar", "constantan", "platinum" };
    public static final String[] blockTools = new String[] { "pickaxe", "pickaxe", "pickaxe", "pickaxe", "pickaxe",
        "pickaxe", "pickaxe", "pickaxe", "pickaxe", "pickaxe" };
    public static final int[] blockLevels = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    public static final String[] rockTypes = new String[] { "andesite", "diorite", "granite", "limestone", "marble" };

    public static final String[] castTypes = new String[] { "blank", "pickaxe", "shovel", "axe", "hoe", "sword", "saw",
        "hammer", "chisel", "helmet", "chestplate", "leggings", "boots" };

    public static final String[] castTypesAdvanced = new String[] { "blank", "pickaxe", "shovel", "axe", "hoe", "sword",
        "saw", "hammer", "chisel", "helmet", "chestplate", "leggings", "boots", "plate", "gear", "rod" };

    public static final String[] headTypes = new String[] { "pickaxe_head", "shovel_head", "axe_head", "hoe_head",
        "sword_blade", "saw_blade", "chisel_head" };

    public static final String[] miscItems = new String[] { "flint_shard" };

    public static final String[] toolTypes = new String[] { "bronze", "iron", "steel", "gold", "thaumium",
        "manasteel" };

    public static final String[] hoeBlacklist = new String[] { "manasteel" };

}
