package com.reygok.adamantiummod.init;

import com.reygok.adamantiummod.items.AdamantiumArmor;
import com.reygok.adamantiummod.items.AdamantiumAxe;
import com.reygok.adamantiummod.items.AdamantiumHoe;
import com.reygok.adamantiummod.items.AdamantiumIngot;
import com.reygok.adamantiummod.items.AdamantiumPickaxe;
import com.reygok.adamantiummod.items.AdamantiumShovel;
import com.reygok.adamantiummod.items.AdamantiumSword;
import com.reygok.adamantiummod.items.TinyVibraniumLump;
import com.reygok.adamantiummod.items.VibraniumLump;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdaItems
{
	public static Item adamantiumIngot;
	public static Item vibraniumLump;
	public static Item tinyVibraniumLump;
	
	public static Item adamantiumPickaxe;
	public static Item adamantiumShovel;
	public static Item adamantiumAxe;
	public static Item adamantiumHoe;
	public static Item adamantiumSword;
	
	public static Item adamantiumHelmet;
	public static Item adamantiumChestplate;
	public static Item adamantiumLeggings;
	public static Item adamantiumBoots;
	

	public static ItemBlock itemAdamanitumBlock;
	public static ItemBlock itemVibraniumOre;

	public static void initItems()
	{
		
    	adamantiumIngot = new AdamantiumIngot("adamantiumIngot");
    	vibraniumLump = new VibraniumLump("vibrationLump");
    	tinyVibraniumLump = new TinyVibraniumLump();
    	adamantiumPickaxe = new AdamantiumPickaxe(AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumShovel = new AdamantiumShovel(AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumAxe = new AdamantiumAxe(AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumHoe = new AdamantiumHoe(AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumSword = new AdamantiumSword(AdaMaterials.TOOL_ADAMANTIUM);
    	
    	adamantiumHelmet = new AdamantiumArmor(AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.HEAD, "adamantiumHelmet");
    	adamantiumChestplate = new AdamantiumArmor(AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.CHEST, "adamantiumChestplate");
    	adamantiumLeggings = new AdamantiumArmor(AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.LEGS, "adamantiumLeggings");
    	adamantiumBoots = new AdamantiumArmor(AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.FEET, "adamantiumBoots");

		itemAdamanitumBlock = new ItemBlock(AdaBlocks.adamantiumBlock);
		itemVibraniumOre = new ItemBlock(AdaBlocks.vibraniumOre);
	}
	
	public static void registerItems()
	{
		itemAdamanitumBlock.setRegistryName(AdaBlocks.adamantiumBlock.getRegistryName().toString());
    	itemVibraniumOre.setRegistryName(AdaBlocks.vibraniumOre.getRegistryName().toString());
    	
    	GameRegistry.register(itemVibraniumOre);
    	GameRegistry.register(itemAdamanitumBlock);
	}


}
