package com.reygok.adamantiummod;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdamantiumRecipes {

	public AdamantiumRecipes()
	{
    	// Adamantium Tools ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumPickaxe),
    			"xxx",
    			" y ",
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumShovel), 
    			" x ",
    			" y ",
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumAxe), 
    			"xx ", 
    			"xy ", 
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumAxe), 
    			" xx", 
    			" yx", 
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumHoe), 
    			"xx ", 
    			" y ", 
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumHoe), 
    			" xx", 
    			" y ", 
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumSword), 
    			"  x", 
    			"  x", 
    			"  y",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumSword), 
    			" x ", 
    			" x ", 
    			" y ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumSword), 
    			"x  ", 
    			"x  ", 
    			"y  ",
    			'x', AdamantiumMod.adamantiumIngot, 'y', Items.stick);
    	
    	// Adamantium Armor ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumChestplate), 
    			"x x", 
    			"xxx", 
    			"xxx",
    			'x', AdamantiumMod.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumHelmet), 
    			"xxx", 
    			"x x", 
    			"   ",
    			'x', AdamantiumMod.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumHelmet), 
    			"   ", 
    			"xxx", 
    			"x x",
    			'x', AdamantiumMod.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumBoots), 
    			"   ", 
    			"x x", 
    			"x x",
    			'x', AdamantiumMod.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumBoots), 
    			"x x", 
    			"x x", 
    			"   ",
    			'x', AdamantiumMod.adamantiumIngot);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumLeggings), 
    			"xxx", 
    			"x x", 
    			"x x",
    			'x', AdamantiumMod.adamantiumIngot);
    	
    	// Vibranium Lumps ----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.vibraniumLump), 
    			"xx ", 
    			"xx ", 
    			"   ",
    			'x', AdamantiumMod.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.vibraniumLump), 
    			" xx", 
    			" xx", 
    			"   ",
    			'x', AdamantiumMod.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.vibraniumLump), 
    			"   ", 
    			"xx ", 
    			"xx ",
    			'x', AdamantiumMod.tinyVibraniumLump);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.vibraniumLump), 
    			"   ", 
    			" xx", 
    			" xx",
    			'x', AdamantiumMod.tinyVibraniumLump);
    	
    	// Adamantium Ingot & Block----------------------------------------------------------------------------------------------------------------
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumIngot), 
    			"cbi", 
    			"bab", 
    			"gbd",
    			'a', AdamantiumMod.vibraniumLump, 'b', Items.blaze_powder, 'c', Items.coal,
    			'i', Items.iron_ingot, 'g', Items.gold_ingot, 'd', Items.diamond);
    	GameRegistry.addShapelessRecipe(new ItemStack(AdamantiumMod.adamantiumIngot, 9), AdamantiumMod.adamantiumBlock);
    	GameRegistry.addRecipe(new ItemStack(AdamantiumMod.adamantiumBlock), 
    			"xxx", 
    			"xxx", 
    			"xxx",
    			'x', AdamantiumMod.adamantiumIngot);
    	

	}
	
}
