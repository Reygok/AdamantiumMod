package com.reygok.adamantiummod.blocks;

import java.util.Random;

import com.reygok.adamantiummod.init.AdaItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class VibraniumOre extends Block
{
	
    public VibraniumOre(String name)
    {
		super(Material.rock);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 3);
		setHardness(20.0F);
        setResistance(100.0F);
		setStepSound(SoundType.STONE);
    }
    
    public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        Random rand = world instanceof World ? ((World)world).rand : new Random();
    	return MathHelper.getRandomIntegerInRange(rand, 15, 20);
    }
    
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount)
    {
        if (!worldIn.isRemote)
        {
            while (amount > 0)
            {
                int j = EntityXPOrb.getXPSplit(amount);
                amount -= j;
                worldIn.spawnEntityInWorld(new EntityXPOrb(worldIn, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, j));
            }
        }
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
    	return 1 + random.nextInt(fortune + 1);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return AdaItems.tinyVibraniumLump;
    }
}
