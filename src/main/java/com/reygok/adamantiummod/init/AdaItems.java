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
    	vibraniumLump = new VibraniumLump("vibraniumLump");
    	tinyVibraniumLump = new TinyVibraniumLump("tinyVibraniumLump");
    	adamantiumPickaxe = new AdamantiumPickaxe("adamantiumPickaxe", AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumShovel = new AdamantiumShovel("adamantiumShovel", AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumAxe = new AdamantiumAxe("adamantiumAxe", AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumHoe = new AdamantiumHoe("adamantiumHoe", AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumSword = new AdamantiumSword("adamantiumSword", AdaMaterials.TOOL_ADAMANTIUM);
    	adamantiumHelmet = new AdamantiumArmor("adamantiumHelmet", AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.HEAD);
    	adamantiumChestplate = new AdamantiumArmor("adamantiumChestplate", AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.CHEST);
    	adamantiumLeggings = new AdamantiumArmor("adamantiumLeggings", AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.LEGS);
    	adamantiumBoots = new AdamantiumArmor("adamantiumBoots", AdaMaterials.ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.FEET);

		itemAdamanitumBlock = new ItemBlock(AdaBlocks.adamantiumBlock);
		itemVibraniumOre = new ItemBlock(AdaBlocks.vibraniumOre);
	}
	
	public static void registerItems()
	{
		itemAdamanitumBlock.setRegistryName(AdaBlocks.adamantiumBlock.getRegistryName().toString());
    	itemVibraniumOre.setRegistryName(AdaBlocks.vibraniumOre.getRegistryName().toString());
    	
    	GameRegistry.register(adamantiumIngot);
    	GameRegistry.register(vibraniumLump);
    	GameRegistry.register(tinyVibraniumLump);
    	GameRegistry.register(adamantiumPickaxe);
    	GameRegistry.register(adamantiumShovel);
    	GameRegistry.register(adamantiumAxe);
    	GameRegistry.register(adamantiumHoe);
    	GameRegistry.register(adamantiumSword);
    	GameRegistry.register(adamantiumHelmet);
    	GameRegistry.register(adamantiumChestplate);
    	GameRegistry.register(adamantiumLeggings);
    	GameRegistry.register(adamantiumBoots);
    	
    	GameRegistry.register(itemVibraniumOre);
    	GameRegistry.register(itemAdamanitumBlock);
	}


}
