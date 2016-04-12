package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;
import com.reygok.adamantiummod.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumPickaxe extends ItemPickaxe
{
	private static final String name = "adamantiumPickaxe";
	
	public AdamantiumPickaxe(ToolMaterial mat)
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
        return repair.getItem() == CommonProxy.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}
}
