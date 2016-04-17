package com.reygok.adamantiummod.init;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdaRecipes {

	public static void registerRecipes()
	{
    	// Adamantium Tools ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumPickaxe),
    			"xxx",
    			" y ",
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumShovel), 
    			" x ",
    			" y ",
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumAxe), 
    			"xx ", 
    			"xy ", 
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumAxe), 
    			" xx", 
    			" yx", 
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumHoe), 
    			"xx ", 
    			" y ", 
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumHoe), 
    			" xx", 
    			" y ", 
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumSword), 
    			"  x", 
    			"  x", 
    			"  y",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumSword), 
    			" x ", 
    			" x ", 
    			" y ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumSword), 
    			"x  ", 
    			"x  ", 
    			"y  ",
    			'x', AdaItems.adamantiumIngot, 'y', Items.stick);
    	
    	// Adamantium Armor ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumChestplate), 
    			"x x", 
    			"xxx", 
    			"xxx",
    			'x', AdaItems.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumHelmet), 
    			"xxx", 
    			"x x", 
    			"   ",
    			'x', AdaItems.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumHelmet), 
    			"   ", 
    			"xxx", 
    			"x x",
    			'x', AdaItems.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumBoots), 
    			"   ", 
    			"x x", 
    			"x x",
    			'x', AdaItems.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumBoots), 
    			"x x", 
    			"x x", 
    			"   ",
    			'x', AdaItems.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumLeggings), 
    			"xxx", 
    			"x x", 
    			"x x",
    			'x', AdaItems.adamantiumIngot);
    	
    	// Vibranium Lumps ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdaItems.vibraniumLump), 
    			"xx ", 
    			"xx ", 
    			"   ",
    			'x', AdaItems.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.vibraniumLump), 
    			" xx", 
    			" xx", 
    			"   ",
    			'x', AdaItems.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.vibraniumLump), 
    			"   ", 
    			"xx ", 
    			"xx ",
    			'x', AdaItems.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdaItems.vibraniumLump), 
    			"   ", 
    			" xx", 
    			" xx",
    			'x', AdaItems.tinyVibraniumLump);
    	
    	// Adamantium Ingot & Block----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdaItems.adamantiumIngot), 
    			"cbi", 
    			"bab", 
    			"gbd",
    			'a', AdaItems.vibraniumLump, 'b', Items.blaze_powder, 'c', Items.coal,
    			'i', Items.iron_ingot, 'g', Items.gold_ingot, 'd', Items.diamond);
    	GameRegistry.addShapelessRecipe(new ItemStack(AdaItems.adamantiumIngot, 9), AdaBlocks.adamantiumBlock);
    	GameRegistry.addRecipe(new ItemStack(AdaBlocks.adamantiumBlock), 
    			"xxx", 
    			"xxx", 
    			"xxx",
    			'x', AdaItems.adamantiumIngot);
//    	

	}
	
}
