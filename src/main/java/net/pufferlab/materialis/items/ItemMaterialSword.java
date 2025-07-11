package net.pufferlab.materialis.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterialSword extends ItemSword {

    String toolName;

    public ItemMaterialSword(ToolMaterial tool, String name) {
        super(tool);

        toolName = name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon("materialis:" + toolName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item.materialis." + toolName;
    }
}
