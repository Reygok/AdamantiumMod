package com.reygok.adamantiummod;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class AdamantiumGenerator implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case -1:
			if (random.nextInt(2) == 0) {
				generateNether(world, random, chunkX * 16, chunkZ * 16);
			}
			break;	
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}

	private void generateEnd(World world, Random random, int i, int j) {

	}

	private void generateSurface(World world, Random random, int i, int j) {

	}

	private void generateNether(World world, Random random, int i, int j) {
		int AdamantiumOreXCoord = i + random.nextInt(16);
		int AdamantiumOreYCoord = random.nextInt(10);
		int AdamantiumOreZCoord = j + random.nextInt(16);
		BlockPos blockpos = new BlockPos(AdamantiumOreXCoord, AdamantiumOreYCoord, AdamantiumOreZCoord);
		WorldGenMinable worldGenMinable = new WorldGenMinable(AdamantiumMod.vibraniumOre.getDefaultState(), 10,
				BlockMatcher.forBlock(Blocks.netherrack));
		worldGenMinable.generate(world, random, blockpos);
	}

}
