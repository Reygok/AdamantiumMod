package com.reygok.adamantiummod.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AdaMaterials
{
	private static int[] durability = new int[]
	{ 3, 8, 6, 3 };

	public static ToolMaterial TOOL_ADAMANTIUM = EnumHelper.addToolMaterial("ADAMANTIUM", 3, 16383, 19.0F, 8.0F, 30);
	public static ArmorMaterial ARMOR_ADAMANTIUM = EnumHelper.addArmorMaterial("adamantium",
			"adamantium:adamantiumArmor", 128, durability, 30, SoundEvents.item_armor_equip_iron);

}
