/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.ambigous.block.PineappleJuiceBlock;
import net.mcreator.ambigous.AmbigousMod;

import java.util.function.Function;

public class AmbigousModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AmbigousMod.MODID);
	public static final DeferredBlock<Block> PINEAPPLE_JUICE;
	static {
		PINEAPPLE_JUICE = register("pineapple_juice", PineappleJuiceBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}