package com.reygok.adamantiummod;

import com.reygok.adamantiummod.init.AdaBlocks;
import com.reygok.adamantiummod.init.AdaItems;
import com.reygok.adamantiummod.init.AdaRecipes;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public static AdamantiumGenerator adamantioumGenerator;
	public static AdaRecipes recipes;

	public void preInit(FMLPreInitializationEvent e)
	{
		AdaBlocks.initBlocks();
		AdaItems.initItems();
		
		AdaBlocks.registerBlocks();
		AdaItems.registerItems();
	}
		
	public void init(FMLInitializationEvent e)
	{
    	AdaRecipes.registerRecipes();
    	adamantioumGenerator = new AdamantiumGenerator();

	}
	
	public void postInit(FMLPostInitializationEvent e)
	{
		
	}

}
