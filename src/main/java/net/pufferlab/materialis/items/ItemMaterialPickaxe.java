package net.pufferlab.materialis.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterialPickaxe extends ItemPickaxe {

    String toolName;
    ToolMaterial toolMaterial;

    public ItemMaterialPickaxe(ToolMaterial tool, String name) {
        super(tool);

        toolMaterial = tool;
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

    @Override
    public boolean getIsRepairable(ItemStack damagedItem, ItemStack repairMaterial) {
        String material = toolMaterial.name();
        return Utils.containsOreDict(repairMaterial, Utils.getOreDictionaryName("ingot", material));
    }
}
