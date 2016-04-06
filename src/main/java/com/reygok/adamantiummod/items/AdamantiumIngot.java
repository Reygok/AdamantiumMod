package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumIngot extends Item
{
	private final String name = "adamantiumIngot";
	
    public AdamantiumIngot()
    {
    	GameRegistry.registerItem(this, name);
    	setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMaterials);
    }

	public String getName()
	{
		return name;
	}
    
}
