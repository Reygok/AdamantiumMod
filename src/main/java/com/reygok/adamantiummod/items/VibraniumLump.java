package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class VibraniumLump extends Item {
	
	
   	public VibraniumLump(String name)
    {
   		setRegistryName(name);
    	setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
    }
}
