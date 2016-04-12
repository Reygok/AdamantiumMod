package com.reygok.adamantiummod;

import com.reygok.adamantiummod.blocks.AdamantiumBlock;
import com.reygok.adamantiummod.blocks.VibraniumOre;
import com.reygok.adamantiummod.items.AdamantiumArmor;
import com.reygok.adamantiummod.items.AdamantiumAxe;
import com.reygok.adamantiummod.items.AdamantiumHoe;
import com.reygok.adamantiummod.items.AdamantiumIngot;
import com.reygok.adamantiummod.items.AdamantiumPickaxe;
import com.reygok.adamantiummod.items.AdamantiumShovel;
import com.reygok.adamantiummod.items.AdamantiumSword;
import com.reygok.adamantiummod.items.TinyVibraniumLump;
import com.reygok.adamantiummod.items.VibraniumLump;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
	public static ToolMaterial TOOL_ADAMANTIUM =
			EnumHelper.addToolMaterial("ADAMANTIUM", 3, 16383, 19.0F, 8.0F, 30);
	public static ArmorMaterial ARMOR_ADAMANTIUM = 
			EnumHelper.addArmorMaterial("adamantium", "adamantiumArmor", 128, new int[]{3, 8, 6, 3}, 30, SoundEvents.item_armor_equip_iron);
	
	public static Block vibraniumOre;
	public static Block adamantiumBlock;
	
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
	
	public static AdamantiumRecipes recipes;

	public void preInit(FMLPreInitializationEvent e)
	{
		// Blocks-----------------------------------------------------------------
		adamantiumBlock = new AdamantiumBlock();
    	vibraniumOre = new VibraniumOre();
    	
    	// Items-------------------------------------------------------------------
    	adamantiumIngot = new AdamantiumIngot();
    	vibraniumLump = new VibraniumLump();
    	tinyVibraniumLump = new TinyVibraniumLump();
    	
    	adamantiumPickaxe = new AdamantiumPickaxe(TOOL_ADAMANTIUM);
    	adamantiumShovel = new AdamantiumShovel(TOOL_ADAMANTIUM);
    	adamantiumAxe = new AdamantiumAxe(TOOL_ADAMANTIUM);
    	adamantiumHoe = new AdamantiumHoe(TOOL_ADAMANTIUM);
    	adamantiumSword = new AdamantiumSword(TOOL_ADAMANTIUM);

    	// Armor ----------------------------------------------------------------
    	adamantiumHelmet = new AdamantiumArmor(ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.HEAD);
    	adamantiumChestplate = new AdamantiumArmor(ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.CHEST);
    	adamantiumLeggings = new AdamantiumArmor(ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.LEGS);
    	adamantiumBoots = new AdamantiumArmor(ARMOR_ADAMANTIUM, 0, EntityEquipmentSlot.FEET);

    	GameRegistry.register(adamantiumHelmet.setRegistryName(adamantiumHelmet.getRegistryName()));
    	GameRegistry.registerItem(adamantiumChestplate, "adamantiumChestplate");
    	GameRegistry.registerItem(adamantiumLeggings, "adamantiumLeggings");
    	GameRegistry.registerItem(adamantiumBoots, "adamantiumBoots");
    	
    	// WorldGenerator --------------------------------------------------------------
    	GameRegistry.registerWorldGenerator(new AdamantiumGenerator(), 0);
    	

	}
		
	public void init(FMLInitializationEvent e)
	{
    	recipes = new AdamantiumRecipes();

	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}

}
