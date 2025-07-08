package net.pufferlab.materialis.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlabMaterial extends BlockSlab {

    private Block elementBlock;
    private Block elementSlabBlock;
    private String[] elements;
    private String[] elementsBlacklist;
    private String name;

    public BlockSlabMaterial(boolean doubleSlab, Block slabBlock, Block block, Material material, String[] materials,
        String type, String[] blacklist, String[] tools, int[] levels) {
        super(doubleSlab, material);
        this.useNeighborBrightness = true;
        elements = materials;
        name = type;
        elementsBlacklist = blacklist;
        elementBlock = block;
        elementSlabBlock = slabBlock;

        for (int i = 0; i < elements.length; i++) {
            if (!Utils.containsExactMatch(elementsBlacklist, elements[i]) && tools != null) {
                this.setHarvestLevel(tools[i], levels[i], i);
            } else {
                this.setHarvestLevel("pickaxe", 0, i);
            }
        }

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {}

    public Block idDropped(int par1, Random par2Random, int par3) {
        return elementSlabBlock;
    }

    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(elementSlabBlock);
    }

    @Override
    public ItemStack createStackedBlock(int meta) {
        return new ItemStack(Item.getItemFromBlock(elementSlabBlock), 2, meta & 7);
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List<net.minecraft.item.ItemStack> list) {
        for (int i = 0; i < elements.length; i++) {
            if (!Utils.containsExactMatch(elementsBlacklist, elements[i])) {
                list.add(new ItemStack(item, 1, i));
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta > 7) {
            meta = meta - 8;
        }
        if (meta >= elements.length || Utils.containsExactMatch(elementsBlacklist, elements[meta])) {
            return elementBlock.getIcon(side, 0);
        }
        return elementBlock.getIcon(side, meta);
    }

    @Override
    public String func_150002_b(int p_150002_1_) {
        if (p_150002_1_ < 0 || p_150002_1_ >= elements.length) {
            p_150002_1_ = 0;
        }

        return super.getUnlocalizedName() + "." + elements[p_150002_1_];
    }

    public Item getItem(World worldIn, int x, int y, int z) {
        return Item.getItemFromBlock(elementSlabBlock);
    }

    public String[] getElements() {
        return elements;
    }

    public String[] getElementsBlacklist() {
        return elementsBlacklist;
    }

    public String getElementName() {
        return name;
    }
}
