package com.reygok.adamantiummod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumRecipes {

	public AdamantiumRecipes()
	{
    	// Adamantium Tools ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumPickaxe),
    			"xxx",
    			" y ",
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumShovel), 
    			" x ",
    			" y ",
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumAxe), 
    			"xx ", 
    			"xy ", 
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumAxe), 
    			" xx", 
    			" yx", 
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumHoe), 
    			"xx ", 
    			" y ", 
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumHoe), 
    			" xx", 
    			" y ", 
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumSword), 
    			"  x", 
    			"  x", 
    			"  y",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumSword), 
    			" x ", 
    			" x ", 
    			" y ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumSword), 
    			"x  ", 
    			"x  ", 
    			"y  ",
    			'x', CommonProxy.adamantiumIngot, 'y', Items.stick);
    	
    	// Adamantium Armor ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumChestplate), 
    			"x x", 
    			"xxx", 
    			"xxx",
    			'x', CommonProxy.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumHelmet), 
    			"xxx", 
    			"x x", 
    			"   ",
    			'x', CommonProxy.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumHelmet), 
    			"   ", 
    			"xxx", 
    			"x x",
    			'x', CommonProxy.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumBoots), 
    			"   ", 
    			"x x", 
    			"x x",
    			'x', CommonProxy.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumBoots), 
    			"x x", 
    			"x x", 
    			"   ",
    			'x', CommonProxy.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumLeggings), 
    			"xxx", 
    			"x x", 
    			"x x",
    			'x', CommonProxy.adamantiumIngot);
    	
    	// Vibranium Lumps ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.vibraniumLump), 
    			"xx ", 
    			"xx ", 
    			"   ",
    			'x', CommonProxy.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.vibraniumLump), 
    			" xx", 
    			" xx", 
    			"   ",
    			'x', CommonProxy.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.vibraniumLump), 
    			"   ", 
    			"xx ", 
    			"xx ",
    			'x', CommonProxy.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.vibraniumLump), 
    			"   ", 
    			" xx", 
    			" xx",
    			'x', CommonProxy.tinyVibraniumLump);
    	
    	// Adamantium Ingot & Block----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumIngot), 
    			"cbi", 
    			"bab", 
    			"gbd",
    			'a', CommonProxy.vibraniumLump, 'b', Items.blaze_powder, 'c', Items.coal,
    			'i', Items.iron_ingot, 'g', Items.gold_ingot, 'd', Items.diamond);
    	GameRegistry.addShapelessRecipe(new ItemStack(CommonProxy.adamantiumIngot, 9), CommonProxy.adamantiumBlock);
    	GameRegistry.addRecipe(new ItemStack(CommonProxy.adamantiumBlock), 
    			"xxx", 
    			"xxx", 
    			"xxx",
    			'x', CommonProxy.adamantiumIngot);
    	

	}
	
}
