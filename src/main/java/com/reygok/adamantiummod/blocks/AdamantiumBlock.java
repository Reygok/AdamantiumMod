package com.reygok.adamantiummod.blocks;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumBlock extends Block{

	private final String name = "adamantiumBlock";
	
    public AdamantiumBlock()
    {
		super(Material.iron);
    	GameRegistry.registerBlock(this, name);  	
		setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 3);
		setHardness(26.0F);
        setResistance(1000.0F);
		setStepSound(SoundType.METAL);
    }
    
    
    public String getName()
    {
    	return name;
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
