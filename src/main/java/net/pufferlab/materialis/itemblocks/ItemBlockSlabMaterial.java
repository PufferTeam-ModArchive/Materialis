package net.pufferlab.materialis.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.blocks.BlockSlabMaterial;

public class ItemBlockSlabMaterial extends ItemSlab {

    private String[] elements;
    private String[] elementsBlacklist;
    private String name;
    private BlockSlabMaterial blockC;

    public ItemBlockSlabMaterial(Block p_i45355_1_, BlockSlabMaterial p_i45355_2_, BlockSlabMaterial p_i45355_3_, Boolean p_i45355_4_) {
        super(p_i45355_1_, p_i45355_2_, p_i45355_3_, p_i45355_4_);
        
        blockC = (BlockSlabMaterial) field_150939_a;

        elements = blockC.getElements();
        elementsBlacklist = blockC.getElementsBlacklist();
        name = blockC.getElementName();
        
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        int meta = stack.getItemDamage();
        if(meta > 7) {
            meta = meta - 8;
        }
        String[] array = name.split("");
        String[] array2 = name.split("_");
        if(array2[array2.length - 1].equals("double")) {
            name = name.substring(0, array.length - 7);
        }
        if (Utils.containsExactMatch(elementsBlacklist, elements[meta])) {
            return "tile.materialis.error";
        }
        return "tile.materialis." + elements[meta] + "_" + name;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}
