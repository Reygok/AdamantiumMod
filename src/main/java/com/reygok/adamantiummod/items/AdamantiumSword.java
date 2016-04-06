package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumSword extends ItemSword
{
	private static final String name = "adamantiumSword";
	
	public AdamantiumSword(ToolMaterial mat)
	{
		super(mat);
    	GameRegistry.registerItem(this, name);
		setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabCombat);
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
