package net.pufferlab.materialis.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockStairsMaterial extends BlockStairs {

    public BlockStairsMaterial(Block block, int meta, String blockName) {
        super(block, meta);
        this.useNeighborBrightness = true;

        this.setBlockName("materialis." + blockName + "_stairs");
    }

}
