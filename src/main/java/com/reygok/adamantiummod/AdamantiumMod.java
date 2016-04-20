package com.reygok.adamantiummod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AdamantiumMod.MODID, version = AdamantiumMod.VERSION, name = AdamantiumMod.NAME)
public class AdamantiumMod
{
	public static final String MODID = "adamantium";
	public static final String VERSION = "1.5";
	public static final String NAME = "Adamantium Mod";
	
	@SidedProxy(clientSide="com.reygok.adamantiummod.ClientProxy", serverSide="com.reygok.adamantiummod.ServerProxy")
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
    
}
