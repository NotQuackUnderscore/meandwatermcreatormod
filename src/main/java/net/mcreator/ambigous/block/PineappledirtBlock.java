package net.mcreator.ambigous.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PineappledirtBlock extends Block {
	public PineappledirtBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(2f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}