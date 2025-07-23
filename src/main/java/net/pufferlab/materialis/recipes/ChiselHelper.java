package net.pufferlab.materialis.recipes;

import java.util.List;

import net.minecraft.block.Block;

import com.cricketcraft.chisel.api.carving.CarvingUtils;
import com.cricketcraft.chisel.api.carving.ICarvingGroup;
import com.cricketcraft.chisel.api.carving.ICarvingVariation;

import cpw.mods.fml.common.registry.GameRegistry;
import team.chisel.carving.Carving;

public class ChiselHelper {

    public static void removeAllVariations(String name) {
        ICarvingGroup group = CarvingUtils.getChiselRegistry()
            .getGroup(name);
        List<ICarvingVariation> variations = group.getVariations();
        group.setOreName(null);
        for (ICarvingVariation variation : variations) {
            group.removeVariation(variation);
        }
        Carving.chisel.removeGroup(name);
        Carving.chisel.addGroup(group);
    }

    public static void removeGroup(String name) {
        Carving.chisel.removeGroup(name);
    }

    public static void removeVariation(String name, String mod, String block, int meta) {
        Block block2 = GameRegistry.findBlock(mod, block);
        Carving.chisel.removeVariation(block2, meta, name);
    }

    public static void addVariation(String name, String mod, String block, int meta, int order) {
        Block block2 = GameRegistry.findBlock(mod, block);
        Carving.chisel.addVariation(name, block2, meta, order);
    }

}
