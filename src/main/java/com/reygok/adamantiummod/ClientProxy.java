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

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

		// Items -------------------------------------------------------------------------    		
		ModelResourceLocation adamantiumLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumIngot) adamantiumIngot).getName(), "inventory");
		ModelResourceLocation adamantiumLumpLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((VibraniumLump) vibraniumLump).getName(), "inventory");
		ModelResourceLocation tinyAdamantiumLumpLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((TinyVibraniumLump) tinyVibraniumLump).getName(), "inventory");
		
		ModelResourceLocation adamantiumPickaxeLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumPickaxe) adamantiumPickaxe).getName(), "inventory");			
		ModelResourceLocation adamantiumShovelLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumShovel) adamantiumShovel).getName(), "inventory");			
		ModelResourceLocation adamantiumAxeLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumAxe) adamantiumAxe).getName(), "inventory");			
		ModelResourceLocation adamantiumHoeLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumHoe) adamantiumHoe).getName(), "inventory");			
		ModelResourceLocation adamantiumSwordLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumSword) adamantiumSword).getName(), "inventory");			
		ModelResourceLocation adamantiumHelmetLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumArmor) adamantiumHelmet).getName(), "inventory");			
		ModelResourceLocation adamantiumChestplateLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumArmor) adamantiumChestplate).getName(), "inventory");			
		ModelResourceLocation adamantiumLeggingsLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumArmor) adamantiumLeggings).getName(), "inventory");			
		ModelResourceLocation adamantiumBootsLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumArmor) adamantiumBoots).getName(), "inventory");			
		
		renderItem.getItemModelMesher().register(adamantiumIngot, 0, adamantiumLoc);
		renderItem.getItemModelMesher().register(vibraniumLump, 0, adamantiumLumpLoc);
		renderItem.getItemModelMesher().register(tinyVibraniumLump, 0, tinyAdamantiumLumpLoc);

		renderItem.getItemModelMesher().register(adamantiumPickaxe, 0, adamantiumPickaxeLoc);
		renderItem.getItemModelMesher().register(adamantiumShovel, 0, adamantiumShovelLoc);
		renderItem.getItemModelMesher().register(adamantiumAxe, 0, adamantiumAxeLoc);
		renderItem.getItemModelMesher().register(adamantiumHoe, 0, adamantiumHoeLoc);
		renderItem.getItemModelMesher().register(adamantiumSword, 0, adamantiumSwordLoc);
		renderItem.getItemModelMesher().register(adamantiumHelmet, 0, adamantiumHelmetLoc);
		renderItem.getItemModelMesher().register(adamantiumChestplate, 0, adamantiumChestplateLoc);
		renderItem.getItemModelMesher().register(adamantiumLeggings, 0, adamantiumLeggingsLoc);
		renderItem.getItemModelMesher().register(adamantiumBoots, 0, adamantiumBootsLoc);
//
//		// Blocks -------------------------------------------------------------------------------------
		ModelResourceLocation vibraniumOreLoc =
				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((VibraniumOre) vibraniumOre).getName(), "inventory");
//		ModelResourceLocation adamantiumBlockLoc =
//				new ModelResourceLocation(AdamantiumMod.MODID + ":" + ((AdamantiumBlock) adamantiumBlock).getName(), "inventory");
		    		
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(vibraniumOre), 0, vibraniumOreLoc);
//		renderItem.getItemModelMesher().register(Item.getItemFromBlock(adamantiumBlock), 0, adamantiumBlockLoc);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{
		// TODO Auto-generated method stub
		super.postInit(e);
	}

}
