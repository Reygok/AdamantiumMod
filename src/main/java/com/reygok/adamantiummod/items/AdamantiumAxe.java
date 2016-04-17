package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.init.AdaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class AdamantiumAxe extends ItemAxe
{
	
	public AdamantiumAxe(String name, ToolMaterial mat)	
	{
		super(ToolMaterial.WOOD);
        this.damageVsEntity = 10.0F;
        this.attackSpeed = -2.8F;
        this.toolMaterial = mat;
        this.setMaxDamage(mat.getMaxUses());
        this.efficiencyOnProperMaterial = mat.getEfficiencyOnProperMaterial();
        this.damageVsEntity = 0 + mat.getDamageVsEntity();

        setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == AdaItems.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}
}