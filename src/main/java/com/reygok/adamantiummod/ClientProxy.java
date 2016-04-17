package com.reygok.adamantiummod;

import com.reygok.adamantiummod.init.AdaRender;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{

	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
		AdaRender.init();
	}

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{
		// TODO Auto-generated method stub
		super.postInit(e);
	}

}
