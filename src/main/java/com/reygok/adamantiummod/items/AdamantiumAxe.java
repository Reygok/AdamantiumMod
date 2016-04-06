package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumAxe extends ItemAxe
{
	private static final String name = "adamantiumAxe";
	
	public AdamantiumAxe(ToolMaterial mat)	
	{
		super(ToolMaterial.WOOD);
        this.damageVsEntity = 10.0F;
        this.attackSpeed = -2.8F;
        this.toolMaterial = mat;
        this.setMaxDamage(mat.getMaxUses());
        this.efficiencyOnProperMaterial = mat.getEfficiencyOnProperMaterial();
        this.damageVsEntity = 0 + mat.getDamageVsEntity();

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