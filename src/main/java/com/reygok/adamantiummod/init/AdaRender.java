package com.reygok.adamantiummod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class AdaRender
{

	public static void init()
	{
		//Items -------------------------------------------------------------------------
		initModel(AdaItems.adamantiumIngot);
		initModel(AdaItems.vibraniumLump);
		initModel(AdaItems.tinyVibraniumLump);
		initModel(AdaItems.adamantiumPickaxe);
		initModel(AdaItems.adamantiumShovel);
		initModel(AdaItems.adamantiumAxe);
		initModel(AdaItems.adamantiumHoe);
		initModel(AdaItems.adamantiumSword);
		initModel(AdaItems.adamantiumHelmet);
		initModel(AdaItems.adamantiumChestplate);
		initModel(AdaItems.adamantiumLeggings);
		initModel(AdaItems.adamantiumBoots);
		
		//Blocks-------------------------------------------------------------------------------------------
		initModel(AdaItems.itemAdamanitumBlock);
		initModel(AdaItems.itemVibraniumOre);
				
	}
	
	private static void initModel(Item item)
	{
		ModelResourceLocation modResLoc = new ModelResourceLocation(item.getRegistryName().toString(), "inventory");
		ModelLoader.setCustomModelResourceLocation(item, 0, modResLoc);
	}
}
