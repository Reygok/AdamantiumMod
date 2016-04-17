package com.reygok.adamantiummod.init;

import com.reygok.adamantiummod.blocks.AdamantiumBlock;
import com.reygok.adamantiummod.blocks.VibraniumOre;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AdaBlocks
{
	public static Block adamantiumBlock;
	public static Block vibraniumOre;

	public static void initBlocks()
	{
		adamantiumBlock = new AdamantiumBlock("adamantiumBlock");
		vibraniumOre = new VibraniumOre("vibraniumOre");
	}
	
	public static void registerBlocks()
	{
		GameRegistry.register(adamantiumBlock);
		GameRegistry.register(vibraniumOre);
	}
}
