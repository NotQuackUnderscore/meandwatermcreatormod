package net.mcreator.ambigous.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PineappleingotblockBlock extends Block {
	public PineappleingotblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.IRON_XYLOPHONE));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}