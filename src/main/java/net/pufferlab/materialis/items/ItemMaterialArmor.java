package net.pufferlab.materialis.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Materialis;
import net.pufferlab.materialis.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterialArmor extends ItemArmor {

    String armorName;

    public ItemMaterialArmor(ArmorMaterial armor, String name, int renderIndex, int armorType) {
        super(armor, renderIndex, armorType);

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
    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2) {
        return Utils.equalsWildcard(getRepairStack(), stack2) ? true : super.getIsRepairable(stack1, stack2);
    }

    private ItemStack getRepairStack() {
        if (getArmorMaterial() == Materialis.armorBronze) {
            return new ItemStack(Materialis.ingot, 1, 7);
        }

        return new ItemStack(getArmorMaterial().func_151685_b());
    }

}
