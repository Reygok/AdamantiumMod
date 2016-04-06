package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumShovel extends ItemSpade
{
	private static final String name = "adamantiumShovel";
	
	public AdamantiumShovel(ToolMaterial mat)
	{
		super(mat);
    	GameRegistry.registerItem(this, name);
		setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == AdamantiumMod.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}

}
