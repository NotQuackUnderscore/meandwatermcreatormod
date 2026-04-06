package net.mcreator.ambigous.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PineapplebundleBlock extends Block {
	public PineapplebundleBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.TERRACOTTA_YELLOW).sound(SoundType.WOOD).strength(1f, 10f).instrument(NoteBlockInstrument.BANJO));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}