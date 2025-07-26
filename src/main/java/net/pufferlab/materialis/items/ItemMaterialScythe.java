package net.pufferlab.materialis.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.pufferlab.materialis.Utils;

import biomesoplenty.api.content.BOPCBlocks;
import biomesoplenty.common.items.ItemBOPScythe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMaterialScythe extends ItemBOPScythe {

    String toolName;
    ToolMaterial toolMaterial;

    public ItemMaterialScythe(ToolMaterial tool, String name) {
        super(tool, 0);

        toolMaterial = tool;
        toolName = name;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemstack, World world, Block block, int x, int y, int z,
        EntityLivingBase entity) {
        int radius = 3;
        int height = 4;

        if (block != null) {
            if (block.isLeaves(world, x, y, z)) {
                if (height > 0) {
                    trimLeaves(itemstack, entity, world, x, y, z, height, radius);

                    return true;
                } else {
                    itemstack.damageItem(1, entity);
                }
            } else {
                trimCutCorner(itemstack, entity, world, x, y, z, height, radius);

                if (world.rand.nextInt(3) == 0) {
                    trim(itemstack, entity, world, x, y, z, height, radius - 1);

                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public void trim(ItemStack stack, EntityLivingBase entity, World world, int x, int y, int z, int height,
        int radius) {
        for (int aX = -radius; aX <= radius; aX++) {
            for (int aY = 0; aY <= radius; aY++) {
                for (int aZ = -radius; aZ <= radius; aZ++) {
                    Block block = world.getBlock(x + aX, y + aY, z + aZ);
                    int meta = world.getBlockMetadata(x + aX, y + aY, z + aZ);

                    if (block != null && block != Blocks.air) {
                        if (block == BOPCBlocks.foliage && (meta == 1 || meta == 2 || meta == 6)) {
                            if (meta == 1) {
                                block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                world.setBlockToAir(x + aX, y + aY, z + aZ);
                            } else if (meta == 2) {
                                block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                world.setBlock(x + aX, y + aY, z + aZ, BOPCBlocks.foliage, 1, 2);
                            } else if (meta == 6) {
                                block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                world.setBlockToAir(x + aX, y + aY, z + aZ);
                            }
                        } else if (block == Blocks.tallgrass) {
                            block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                            world.setBlock(x + aX, y + aY, z + aZ, BOPCBlocks.foliage, 2, 2);
                        } else if (block != Blocks.waterlily && block instanceof BlockFlower) {
                            block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                            world.setBlockToAir(x + aX, y + aY, z + aZ);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void trimLeaves(ItemStack stack, EntityLivingBase entity, World world, int x, int y, int z, int height,
        int radius) {
        for (int aX = -radius; aX <= radius; aX++) {
            for (int aY = -radius; aY <= radius; aY++) {
                for (int aZ = -radius; aZ <= radius; aZ++) {
                    Block block = world.getBlock(x + aX, y + aY, z + aZ);
                    int meta = world.getBlockMetadata(x + aX, y + aY, z + aZ);

                    if (block != null) {
                        if (block.isLeaves(world, x + aX, y + aY, z + aZ)) {
                            if (world.rand.nextInt(24) == 0) {
                                stack.damageItem(1, entity);
                            } else {
                                return;
                            }

                            block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                            world.setBlockToAir(x + aX, y + aY, z + aZ);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void trimCutCorner(ItemStack stack, EntityLivingBase entity, World world, int x, int y, int z, int height,
        int radius) {
        for (int aX = -radius; aX <= radius; aX++) {
            for (int aY = 0; aY <= radius; aY++) {
                for (int aZ = -radius; aZ <= radius; aZ++) {
                    if ((aX + aZ < radius * 2) && (-aX + aZ < radius * 2)
                        && (aX + -aZ < radius * 2)
                        && (-aX + -aZ < radius * 2)) {
                        Block block = world.getBlock(x + aX, y + aY, z + aZ);
                        int meta = world.getBlockMetadata(x + aX, y + aY, z + aZ);

                        if (block != null && block != Blocks.air) {
                            if (world.rand.nextInt(34) == 0) {
                                stack.damageItem(1, entity);
                            }

                            if (block == BOPCBlocks.foliage && (meta == 1 || meta == 2 || meta == 6)) {
                                if (meta == 1) {
                                    block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                    world.setBlockToAir(x + aX, y + aY, z + aZ);
                                } else if (meta == 2) {
                                    block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                    world.setBlock(x + aX, y + aY, z + aZ, BOPCBlocks.foliage, 1, 2);
                                } else if (meta == 6) {
                                    block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                    world.setBlockToAir(x + aX, y + aY, z + aZ);
                                }
                            } else if (block == Blocks.tallgrass) {
                                block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                world.setBlock(x + aX, y + aY, z + aZ, BOPCBlocks.foliage, 2, 2);
                            } else if (block != Blocks.waterlily && block instanceof BlockFlower) {
                                block.dropBlockAsItem(world, x + aX, y + aY, z + aZ, meta, 0);
                                world.setBlockToAir(x + aX, y + aY, z + aZ);
                            }
                        }
                    }
                }
            }
        }
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
