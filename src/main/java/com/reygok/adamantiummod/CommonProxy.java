package com.reygok.adamantiummod;

import com.reygok.adamantiummod.init.AdaBlocks;
import com.reygok.adamantiummod.init.AdaItems;
import com.reygok.adamantiummod.init.AdaRecipes;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	
	public static AdaRecipes recipes;

	public void preInit(FMLPreInitializationEvent e)
	{
		AdaBlocks.initBlocks();
		AdaItems.initItems();
		
		AdaBlocks.registerBlocks();
		AdaItems.registerItems();
	
		// Instantiate blocks and items--------------------------------------------------------------------

    	// Register blocks and items--------------------------------------------------------------------
//    	GameRegistry.register(vibraniumOre);
    	//    	GameRegistry.register(adamantiumHelmet);

//    	GameRegistry.register(adamantiumChestplate);
//    	GameRegistry.registerItem(adamantiumLeggings, "adamantiumLeggings");
//    	GameRegistry.registerItem(adamantiumBoots, "adamantiumBoots");
    	
    	// WorldGenerator --------------------------------------------------------------
//    	GameRegistry.registerWorldGenerator(new AdamantiumGenerator(), 0);
    	

	}
		
	public void init(FMLInitializationEvent e)
	{
    	AdaRecipes.registerRecipes();

	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}

}
