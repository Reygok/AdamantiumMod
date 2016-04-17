package com.reygok.adamantiummod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AdamantiumBlock extends Block{
	
    public AdamantiumBlock(String name)
    {
		super(Material.iron);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 3);
		setHardness(26.0F);
        setResistance(1000.0F);
		setStepSound(SoundType.METAL);
    }

    
    public int quantityDropped()
    {
    	return 1;
    }
    
    public Item getItemDropped(int par1, int par2)
    {
    	return Item.getItemFromBlock(this);
    }
}
