package com.reygok.adamantiummod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinyVibraniumLump extends Item{
	
	
   	public TinyVibraniumLump(String name)
    {
   		setRegistryName(name);
    	setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabMaterials);
    }

}
