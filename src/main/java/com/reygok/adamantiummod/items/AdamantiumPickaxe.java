package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.init.AdaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class AdamantiumPickaxe extends ItemPickaxe
{
	
	public AdamantiumPickaxe(String name, ToolMaterial mat)
	{
		super(mat);
    	setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == AdaItems.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}
}
