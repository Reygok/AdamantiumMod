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
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = AdamantiumMod.MODID, version = AdamantiumMod.VERSION, name = AdamantiumMod.NAME)
public class AdamantiumMod
{
	public static final String MODID = "adamantium";
	public static final String VERSION = "1.4.3";
	public static final String NAME = "Adamantium Mod";
	
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
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// Blocks-----------------------------------------------------------------
    	vibraniumOre = new VibraniumOre();
    	adamantiumBlock = new AdamantiumBlock();
    	
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
    }    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	recipes = new AdamantiumRecipes();
    	GameRegistry.register(adamantiumHelmet, new ResourceLocation(MODID, "adamantiumHelmet"));
    	GameRegistry.registerItem(adamantiumChestplate, "adamantiumChestplate");
    	GameRegistry.registerItem(adamantiumLeggings, "adamantiumLeggings");
    	GameRegistry.registerItem(adamantiumBoots, "adamantiumBoots");
    	
    	// WorldGenerator --------------------------------------------------------------
    	GameRegistry.registerWorldGenerator(new AdamantiumGenerator(), 0);
    	
    	// Rendering -------------------------------------------------------------------------
    	if(event.getSide() == Side.CLIENT)
    	{
    		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

    		// Items -------------------------------------------------------------------------    		
			ModelResourceLocation adamantiumLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumIngot) adamantiumIngot).getName(), "inventory");
			ModelResourceLocation adamantiumLumpLoc =
					new ModelResourceLocation(MODID + ":" + ((VibraniumLump) vibraniumLump).getName(), "inventory");
			ModelResourceLocation tinyAdamantiumLumpLoc =
					new ModelResourceLocation(MODID + ":" + ((TinyVibraniumLump) tinyVibraniumLump).getName(), "inventory");
			
			ModelResourceLocation adamantiumPickaxeLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumPickaxe) adamantiumPickaxe).getName(), "inventory");			
			ModelResourceLocation adamantiumShovelLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumShovel) adamantiumShovel).getName(), "inventory");			
			ModelResourceLocation adamantiumAxeLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumAxe) adamantiumAxe).getName(), "inventory");			
			ModelResourceLocation adamantiumHoeLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumHoe) adamantiumHoe).getName(), "inventory");			
			ModelResourceLocation adamantiumSwordLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumSword) adamantiumSword).getName(), "inventory");			
			ModelResourceLocation adamantiumHelmetLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumArmor) adamantiumHelmet).getName(), "inventory");			
			ModelResourceLocation adamantiumChestplateLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumArmor) adamantiumChestplate).getName(), "inventory");			
			ModelResourceLocation adamantiumLeggingsLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumArmor) adamantiumLeggings).getName(), "inventory");			
			ModelResourceLocation adamantiumBootsLoc =
					new ModelResourceLocation(MODID + ":" + ((AdamantiumArmor) adamantiumBoots).getName(), "inventory");			
			
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

    		// Blocks -------------------------------------------------------------------------------------
    		ModelResourceLocation vibraniumOreLoc =
    				new ModelResourceLocation(MODID + ":" + ((VibraniumOre) vibraniumOre).getName(), "inventory");
    		ModelResourceLocation adamantiumBlockLoc =
    				new ModelResourceLocation(MODID + ":" + ((AdamantiumBlock) adamantiumBlock).getName(), "inventory");
    		    		
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(vibraniumOre), 0, vibraniumOreLoc);
    		renderItem.getItemModelMesher().register(Item.getItemFromBlock(adamantiumBlock), 0, adamantiumBlockLoc);

    	}
    	
    }   
}
