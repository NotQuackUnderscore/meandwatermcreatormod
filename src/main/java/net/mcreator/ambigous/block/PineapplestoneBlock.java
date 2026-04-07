package net.mcreator.ambigous.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PineapplestoneBlock extends Block {
	public PineapplestoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(4f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}