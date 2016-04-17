package com.reygok.adamantiummod.items;

import com.reygok.adamantiummod.AdamantiumMod;
import com.reygok.adamantiummod.init.AdaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public class AdamantiumArmor extends ItemArmor
{
	public AdamantiumArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlotIn, String name)
	{
		super(material, renderIndex, equipmentSlotIn);
		setCreativeTab(CreativeTabs.tabCombat);

		switch (equipmentSlotIn)
		{
		case HEAD:
			name = "adamantiumHelmet";
			setRegistryName(name);
			setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
			break;
		case CHEST:
			name = "adamantiumChestplate";
			setRegistryName(name);
			setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
			break;
		case LEGS:
			name = "adamantiumLeggings";
			setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
			break;
		case FEET:
			name = "adamantiumBoots";
			setUnlocalizedName(AdamantiumMod.MODID + "_" + name);
			break;
		default:
			break;
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == AdaItems.adamantiumIngot ? true : super.getIsRepairable(toRepair, repair);
	}

	// @Override
	// public String getArmorTexture(ItemStack stack, Entity entity, int slot,
	// String type) {
	// if (slot == 0 || slot == 1 || slot == 3) {
	// return "adamantium:textures/models/armor/adamantium_layer_1.png";
	//
	// } else if (slot == 2) {
	// return "adamantium:textures/models/armor/adamantium_layer_2.png";
	// } else {
	// return null;
	// }
	// }

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem() == AdaItems.adamantiumChestplate)
		{
			effectPlayer(player, Potion.potionRegistry.getObjectById(5), 0);
		}
		if (isWearingFullAdamantiumArmor(player))
		{
			this.effectPlayer(player, Potion.potionRegistry.getObjectById(12), 1);
		}
	}

	private boolean isWearingFullAdamantiumArmor(EntityPlayer player)
	{
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(2) != null
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(0) != null
				&& player.inventory.armorItemInSlot(3).getItem() == AdaItems.adamantiumHelmet
				&& player.inventory.armorItemInSlot(2).getItem() == AdaItems.adamantiumChestplate
				&& player.inventory.armorItemInSlot(1).getItem() == AdaItems.adamantiumLeggings
				&& player.inventory.armorItemInSlot(0).getItem() == AdaItems.adamantiumBoots)
		{
			return true;
		} else
		{
			return false;
		}
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier)
	{
		// Always effect for 8 seconds, then refresh
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, false));
	}


}
