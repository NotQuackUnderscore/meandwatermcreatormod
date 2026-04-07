package net.mcreator.ambigous.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PineapplecobbleBlock extends Block {
	public PineapplecobbleBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(3.5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}