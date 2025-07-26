package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.scripts.ItemList.*;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.pufferlab.materialis.Constants;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.recipes.*;

public class ScriptOreProcessing implements IScript {

    public void run() {
        addResearches();

        for (String element : Constants.metalTypes) {
            addRecipes(element);
        }
        addSpecialRecipes();
    }

    int delay = 200;
    int ingotMB = 144;
    int nuggetMB = ingotMB / 9;
    int blockMB = ingotMB * 9;
    int energy = 500;
    int energyPress = 500;
    int alloyingTime = 100;
    int smeltingTime = 200;
    int afEnergy = 512;

    public void addRecipes(String metal) {
        ItemStack ore = ModItems.getModItem("metal", "raw_ore", metal, 1);
        ItemStack ore_block = ModItems.getModItem("metal", "raw_ore_block", metal, 1);
        ItemStack block = ModItems.getModItem("metal", "block", metal, 1);
        ItemStack ingot = ModItems.getModItem("metal", "ingot", metal, 1);
        ItemStack nugget = ModItems.getModItem("metal", "nugget", metal, 1);
        ItemStack dust = ModItems.getModItem("metal", "dust", metal, 1);
        ItemStack plate = ModItems.getModItem("metal", "plate", metal, 1);
        ItemStack gear = ModItems.getModItem("metal", "gear", metal, 1);
        ItemStack cluster = ModItems.getModItem("metal", "cluster", metal, 1);
        int temperature = Utils.getItemFromArray(Constants.metalTypesTemp, Constants.metalTypes, metal);
        Fluid fluid = FluidRegistry.getFluid(metal + ".molten");

        if (ore != null) {
            addFurnaceSmelting(ModItems.getModItem("metal", "ingot", metal, 1), ore, 0);
            if (ore_block != null && fluid != null) {
                TinkerHelper.addMeltingRecipe(new FluidStack(fluid, ingotMB / 2), ore, temperature, ore_block);
                TinkerHelper.addMeltingRecipe(new FluidStack(fluid, blockMB / 2), ore_block, temperature, ore_block);
            }
            addShapedRecipe(ModItems.getModItem("metal", "raw_ore_block", metal, 1), "III", "III", "III", 'I', ore);

            addShapedRecipe(ModItems.getModItem("metal", "raw_ore", metal, 9), "I", 'I', ore_block);
        }
        if (cluster != null && Utils.containsExactMatch(Constants.moddedMetalTypes, metal) && ingot != null) {
            addFurnaceSmelting(ModItems.getModItem("metal", "ingot", metal, 2), cluster, 0);
            if (ore_block != null && fluid != null) {
                TinkerHelper.addMeltingRecipe(new FluidStack(fluid, ingotMB), cluster, temperature, ore_block);
            }
        }
        if (dust != null) {
            MekanismHelper.addCrusherRecipe(ModItems.getModItem("metal", "dust", metal, 1), ingot);
            WGHelper.addInfernalBlastFurnaceRecipe(ModItems.getModItem("metal", "ingot", metal, 1), dust, 240, false);
            IEHelper.addCrusherRecipe(ModItems.getModItem("metal", "dust", metal, 1), ingot, energy);
            if (Utils.containsExactMatch(Constants.moddedMetalTypes, metal) && ore != null) {
                String byproduct = Utils
                    .getItemFromArray(Constants.moddedMetalTypes, Constants.metalTypesByproduct, metal);
                IEHelper.addCrusherRecipe(ModItems.getModItem("metal", "dust", metal, 2), ore, energy);
                if (byproduct != null && cluster != null) {
                    IEHelper.addCrusherRecipe(
                        ModItems.getModItem("metal", "dust", metal, 3),
                        cluster,
                        energy,
                        ModItems
                            .getItem("materialis", "dust", Utils.getItemFromArray(Constants.metalTypes, byproduct), 1),
                        0.5F);
                }
            }
        }
        if (plate != null) {
            IEHelper
                .addPressRecipe(ModItems.getModItem("metal", "plate", metal, 1), ingot, plateCastSteel, energyPress);
        }
        if (gear != null) {
            IEHelper.addPressRecipe(
                ModItems.getModItem("metal", "gear", metal, 1),
                ModItems.getModItem("metal", "ingot", metal, 4),
                gearCastSteel,
                energyPress);
        }
        if (fluid != null && block != null) {
            TinkerHelper.addMeltingRecipe(new FluidStack(fluid, ingotMB), ingot, temperature, block);
            TinkerHelper.addMeltingRecipe(new FluidStack(fluid, nuggetMB), nugget, temperature, block);
            TinkerHelper.addMeltingRecipe(new FluidStack(fluid, blockMB), block, temperature, block);

            TinkerHelper.addTableCastingRecipe(ingot, new FluidStack(fluid, ingotMB), false, delay);
            TinkerHelper.addBasinTableRecipe(block, new FluidStack(fluid, blockMB), delay);

            if (Utils.containsExactMatch(Constants.toolTypes, metal)) {
                if (!Utils.containsExactMatch(Constants.hoeBlacklist, metal)) {
                    addCastRecipes(fluid, metal, "hoe_head", 2, block, temperature);
                    addCastRecipes(fluid, metal, "scythe_head", 2, block, temperature);
                }

                addCastRecipes(fluid, metal, "pickaxe_head", 3, block, temperature);
                addCastRecipes(fluid, metal, "axe_head", 3, block, temperature);
                addCastRecipes(fluid, metal, "shovel_head", 1, block, temperature);
                addCastRecipes(fluid, metal, "sword_blade", 2, block, temperature);
                addCastRecipes(fluid, metal, "saw_blade", 3, block, temperature);
                addCastRecipes(fluid, metal, "chisel_head", 1, block, temperature);
                addCastRecipes(fluid, metal, "helmet", 5, block, temperature);
                addCastRecipes(fluid, metal, "chestplate", 8, block, temperature);
                addCastRecipes(fluid, metal, "leggings", 7, block, temperature);
                addCastRecipes(fluid, metal, "boots", 4, block, temperature);
            }
        }

        addShapedRecipe(ModItems.getModItem("metal", "block", metal, 1), "III", "III", "III", 'I', ingot);

        addShapedRecipe(ModItems.getModItem("metal", "ingot", metal, 9), "I", 'I', block);

        addShapedRecipe(ModItems.getModItem("metal", "ingot", metal, 1), "III", "III", "III", 'I', nugget);

        addShapedRecipe(ModItems.getModItem("metal", "nugget", metal, 9), "I", 'I', ingot);
    }

    public void addCastRecipes(Fluid fluid, String metal, String part, int number, ItemStack block, int temperature) {
        String[] partA = part.split("_");
        String moldName = part;
        String stick = "stickWood";
        if (metal.equals("manasteel")) {
            stick = "livingwoodTwig";
        }
        if (partA.length > 1) {
            moldName = partA[0];
            addShapedRecipe(
                ModItems.getModItem("tool", moldName, metal, 1),
                "I",
                "S",
                'I',
                ModItems.getModItem("tool", part, metal, 1),
                'S',
                stick);

            TinkerHelper.addMeltingRecipe(
                new FluidStack(fluid, ingotMB * number),
                ModItems.getModItem("tool", moldName, metal, 1),
                temperature,
                block);
        }
        ItemStack cast = ModItems
            .getItem("materialis", "cast", Utils.getItemFromArray(Constants.castTypes, moldName), 1);
        ItemStack castClay = ModItems
            .getItem("materialis", "cast_clay", Utils.getItemFromArray(Constants.castTypes, moldName), 1);
        ItemStack castSteel = ModItems
            .getItem("materialis", "cast_steel", Utils.getItemFromArray(Constants.castTypesAdvanced, moldName), 1);

        TinkerHelper.addTableCastingRecipe(
            ModItems.getModItem("tool", part, metal, 1),
            new FluidStack(fluid, ingotMB * number),
            cast,
            false,
            delay);
        TinkerHelper.addTableCastingRecipe(
            ModItems.getModItem("tool", part, metal, 1),
            new FluidStack(fluid, ingotMB * number),
            castClay,
            true,
            delay);
        IEHelper.addPressRecipe(
            ModItems.getModItem("tool", part, metal, 1),
            ModItems.getModItem("metal", "ingot", metal, number),
            castSteel,
            energyPress);
        TinkerHelper.addMeltingRecipe(
            new FluidStack(fluid, ingotMB * number),
            ModItems.getModItem("tool", part, metal, 1),
            temperature,
            block);
    }

    public void addSpecialRecipes() {
        TinkerHelper.addFuel(FluidRegistry.LAVA, 1600, 80);

        TinkerHelper.addAlloying(
            new FluidStack(FluidRegistry.getFluid("bronze.molten"), nuggetMB * 4),
            new FluidStack(FluidRegistry.getFluid("copper.molten"), nuggetMB * 3),
            new FluidStack(FluidRegistry.getFluid("tin.molten"), nuggetMB));
        IEHelper.addArcFurnaceRecipe(
            "Alloying",
            ModItems.getModItem("metal", "dust", "bronze", 4),
            ModItems.getModItem("metal", "dust", "tin", 1),
            null,
            alloyingTime,
            afEnergy,
            ModItems.getModItem("metal", "dust", "copper", 3));
        TinkerHelper.addAlloying(
            new FluidStack(FluidRegistry.getFluid("electrum.molten"), nuggetMB * 2),
            new FluidStack(FluidRegistry.getFluid("gold.molten"), nuggetMB),
            new FluidStack(FluidRegistry.getFluid("silver.molten"), nuggetMB));
        IEHelper.addArcFurnaceRecipe(
            "Alloying",
            ModItems.getModItem("metal", "dust", "electrum", 2),
            ModItems.getModItem("metal", "dust", "gold", 1),
            null,
            alloyingTime,
            afEnergy,
            ModItems.getModItem("metal", "dust", "silver", 1));
        TinkerHelper.addAlloying(
            new FluidStack(FluidRegistry.getFluid("invar.molten"), nuggetMB * 3),
            new FluidStack(FluidRegistry.getFluid("iron.molten"), nuggetMB * 2),
            new FluidStack(FluidRegistry.getFluid("nickel.molten"), nuggetMB));
        IEHelper.addArcFurnaceRecipe(
            "Alloying",
            ModItems.getModItem("metal", "dust", "invar", 3),
            ModItems.getModItem("metal", "dust", "nickel", 1),
            null,
            alloyingTime,
            afEnergy,
            ModItems.getModItem("metal", "dust", "iron", 2));
        TinkerHelper.addAlloying(
            new FluidStack(FluidRegistry.getFluid("constantan.molten"), nuggetMB * 2),
            new FluidStack(FluidRegistry.getFluid("copper.molten"), nuggetMB),
            new FluidStack(FluidRegistry.getFluid("nickel.molten"), nuggetMB));
        IEHelper.addArcFurnaceRecipe(
            "Alloying",
            ModItems.getModItem("metal", "dust", "constantan", 2),
            ModItems.getModItem("metal", "dust", "copper", 1),
            null,
            alloyingTime,
            afEnergy,
            ModItems.getModItem("metal", "dust", "nickel", 1));
        addShapedRecipe(
            ModItems.getItem("materialis", "flint_axe", 0, 1),
            "II",
            "S ",
            'I',
            ModItems.getItem("materialis", "item", 0, 1),
            'S',
            "stickWood");
        addShapedRecipe(
            ModItems.getItem("ForgeMicroblock", "sawFlint", 0, 1),
            "II",
            "SI",
            'I',
            ModItems.getItem("materialis", "item", 0, 1),
            'S',
            "stickWood");
        addShapedRecipe(
            ModItems.getItem("materialis", "flint_shovel", 0, 1),
            "I",
            "S",
            'I',
            ModItems.getItem("materialis", "item", 0, 1),
            'S',
            "stickWood");
        addShapedRecipe(
            ModItems.getItem("materialis", "flint_pickaxe", 0, 1),
            "III",
            "S  ",
            'I',
            ModItems.getItem("materialis", "item", 0, 1),
            'S',
            "stickWood");
    }

    public void addResearches() {
        TCHelper.orphanResearch("METALLURGICPERFECTION_CLUSTERS");
        TCHelper.removeResearch("METALLURGICPERFECTION_CLUSTERS");

        TCHelper.moveResearch("PURESILVER", "ALCHEMY", -3, 7);
        TCHelper.moveResearch("PURELEAD", "ALCHEMY", -2, 7);
        TCHelper.moveResearch("PURETIN", "ALCHEMY", -4, 6);
        TCHelper.moveResearch("PUREGOLD", "ALCHEMY", -4, 4);

        TCHelper.moveResearch("TRANSGOLD", "ALCHEMY", 2, 4);

        TCHelper.clearPages("TRANSGOLD");
        TCHelper.addPage("TRANSGOLD", "tc.research_page.TRANSGOLD.1");
        TCHelper.clearPages("TRANSIRON");
        TCHelper.addPage("TRANSIRON", "tc.research_page.TRANSIRON.1");

        TCHelper.orphanResearch("TRANSCOPPER");
        TCHelper.removeResearch("TRANSCOPPER");
        TCHelper.addResearch("TRANSCOPPER", "ALCHEMY", "metallum 3, permutatio 3", 2, 5, 8, copperNugget);
        TCHelper.setConcealed("TRANSCOPPER", true);
        TCHelper.setSecondary("TRANSCOPPER", true);
        TCHelper.addPage("TRANSCOPPER", "tc.research_page.TRANSCOPPER.1");
        TCHelper.addPrereq("TRANSCOPPER", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSTIN");
        TCHelper.removeResearch("TRANSTIN");
        TCHelper.addResearch("TRANSTIN", "ALCHEMY", "metallum 3, permutatio 2, vitreus 1", 2, 6, 8, tinNugget);
        TCHelper.setConcealed("TRANSTIN", true);
        TCHelper.setSecondary("TRANSTIN", true);
        TCHelper.addPage("TRANSTIN", "tc.research_page.TRANSTIN.1");
        TCHelper.addPrereq("TRANSTIN", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSSILVER");
        TCHelper.removeResearch("TRANSSILVER");
        TCHelper.addResearch("TRANSSILVER", "ALCHEMY", "metallum 3, permutatio 2, lucrum 1", 1, 7, 8, silverNugget);
        TCHelper.setConcealed("TRANSSILVER", true);
        TCHelper.setSecondary("TRANSSILVER", true);
        TCHelper.addPage("TRANSSILVER", "tc.research_page.TRANSSILVER.1");
        TCHelper.addPrereq("TRANSSILVER", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSLEAD");
        TCHelper.removeResearch("TRANSLEAD");
        TCHelper.addResearch("TRANSLEAD", "ALCHEMY", "metallum 3, permutatio 2, ordo 1", 0, 7, 8, leadNugget);
        TCHelper.setConcealed("TRANSLEAD", true);
        TCHelper.setSecondary("TRANSLEAD", true);
        TCHelper.addPage("TRANSLEAD", "tc.research_page.TRANSLEAD.1");
        TCHelper.addPrereq("TRANSLEAD", "TRANSIRON", false);

        TCHelper.addResearch("TRANSNICKEL", "ALCHEMY", "metallum 3, permutatio 2, ordo 1", 1, 3, 8, nickelNugget);
        TCHelper.setConcealed("TRANSNICKEL", true);
        TCHelper.setSecondary("TRANSNICKEL", true);
        TCHelper.addPage("TRANSNICKEL", "tc.research_page.TRANSNICKEL.1");
        TCHelper.addPrereq("TRANSNICKEL", "TRANSIRON", false);

        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:1"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:2"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:3"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:4"));
    }
}
