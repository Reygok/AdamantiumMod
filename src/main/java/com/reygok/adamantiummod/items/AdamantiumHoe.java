package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;
import com.reygok.adamantiummod.CommonProxy;
import com.reygok.adamantiummod.init.AdaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumHoe extends ItemHoe
{
	private static final String name = "adamantiumHoe";
	
	public AdamantiumHoe(ToolMaterial mat)
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
        return repair.getItem() == AdaItems.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}

}
