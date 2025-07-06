package net.pufferlab.materialis.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.pufferlab.materialis.Utils;
import net.pufferlab.materialis.blocks.BlockMaterial;

public class ItemBlockMaterial extends ItemBlock {

    private String[] elements;
    private String[] elementsBlacklist;
    private String name;
    private BlockMaterial blockC;

    public ItemBlockMaterial(Block block) {
        super(block);
        blockC = (BlockMaterial) field_150939_a;

        elements = blockC.getElements();
        elementsBlacklist = blockC.getElementsBlacklist();
        name = blockC.getElementName();
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        if (stack.getItemDamage() >= elements.length
            || Utils.containsExactMatch(elementsBlacklist, elements[stack.getItemDamage()])) {
            return "tile.materialis.error";
        }
        return "tile.materialis." + elements[stack.getItemDamage()] + "_" + name;
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

}
