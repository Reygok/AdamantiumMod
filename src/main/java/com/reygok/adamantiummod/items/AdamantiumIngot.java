package com.reygok.adamantiummod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AdamantiumIngot extends Item
{
	
    public AdamantiumIngot(String name)
    {
    	setRegistryName(name);
    	setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabMaterials);
    }
    
}
