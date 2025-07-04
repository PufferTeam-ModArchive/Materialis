package net.pufferlab.pfmod.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.pufferlab.pfmod.Constants;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemLumber extends Item {

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    private String[] woods;

    public ItemLumber(String registryName) {
        if (registryName.equals("vanilla")) {
            woods = Constants.woodTypes;
        } else if (registryName.equals("biomesoplenty")) {
            woods = Constants.bopWoodTypes;
        } else if (registryName.equals("thaumcraft")) {
            woods = Constants.thaumcraftWoodTypes;
        }
        this.setHasSubtypes(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        icons = new IIcon[woods.length];

        for (int i = 0; i < woods.length; i++) {
            icons[i] = register.registerIcon("pfmod:" + woods[i] + "_lumber");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List<net.minecraft.item.ItemStack> list) {
        for (int i = 0; i < woods.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return icons[meta];
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item.pfmod." + woods[stack.getItemDamage()] + "_lumber";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int meta) {
        if(meta >= woods.length) {
            return icons[0];
        }
        return icons[meta];
    }

}
