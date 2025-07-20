package net.pufferlab.materialis.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMaterial extends Block {

    private String[] elements;
    private String[] elementsBlacklist;
    private IIcon[] icons;
    private String name;

    public BlockMaterial(Material material, String[] materials, String type, String[] blacklist, String[] tools,
        int[] levels) {
        super(material);
        elements = materials;
        name = type;
        elementsBlacklist = blacklist;
        this.setCreativeTab(CreativeTabs.tabBlock);

        for (int i = 0; i < elements.length; i++) {
            if (!Utils.containsExactMatch(elementsBlacklist, elements[i]) && tools != null) {
                this.setHarvestLevel(tools[i], levels[i], i);
            } else {
                if (material == Material.rock) {
                    this.setHarvestLevel("pickaxe", 0, i);
                } else if (material == Material.wood) {
                    this.setHarvestLevel("axe", 0, i);
                }
            }
        }

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        icons = new IIcon[elements.length];

        for (int i = 0; i < elements.length; i++) {
            if (!Utils.containsExactMatch(elementsBlacklist, elements[i])) {
                icons[i] = register.registerIcon("materialis:" + elements[i] + "_" + name);
            }
        }
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
        if (meta >= elements.length || Utils.containsExactMatch(elementsBlacklist, elements[meta])) {
            return null;
        }
        return icons[meta];
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
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
