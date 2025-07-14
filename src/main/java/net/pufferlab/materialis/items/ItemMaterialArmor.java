package net.pufferlab.materialis.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterialArmor extends ItemArmor {

    String armorName;
    ArmorMaterial armorMaterial;

    public ItemMaterialArmor(ArmorMaterial armor, String name, int renderIndex, int armorType) {
        super(armor, renderIndex, armorType);

        armorMaterial = armor;
        armorName = name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon("materialis:" + armorName);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "item.materialis." + armorName;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        int layer = (slot == 2) ? 2 : 1;
        return "materialis:textures/models/" + getArmorMaterial().name()
            .toLowerCase() + "_" + layer + ".png";
    }

    @Override
    public boolean getIsRepairable(ItemStack damagedItem, ItemStack repairMaterial) {
        String material = armorMaterial.name();
        return Utils.containsOreDict(repairMaterial, Utils.getOreDictionaryName("ingot", material));
    }

}
