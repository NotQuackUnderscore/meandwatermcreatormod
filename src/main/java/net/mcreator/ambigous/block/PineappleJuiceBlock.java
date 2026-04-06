package net.mcreator.ambigous.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PineappleJuiceBlock extends LiquidBlock {
	public PineappleJuiceBlock(BlockBehaviour.Properties properties) {
		super(AmbigousModFluids.PINEAPPLE_JUICE.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}