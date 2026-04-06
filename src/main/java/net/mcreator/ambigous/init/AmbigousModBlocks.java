/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.ambigous.block.PineappleessensecrafterBlock;
import net.mcreator.ambigous.block.PineapplebundleBlock;
import net.mcreator.ambigous.block.PineappleJuiceBlock;
import net.mcreator.ambigous.block.PineappleBlock;
import net.mcreator.ambigous.AmbigousMod;

import java.util.function.Function;

public class AmbigousModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AmbigousMod.MODID);
	public static final DeferredBlock<Block> PINEAPPLE;
	public static final DeferredBlock<Block> PINEAPPLE_JUICE;
	public static final DeferredBlock<Block> PINEAPPLEESSENSECRAFTER;
	public static final DeferredBlock<Block> PINEAPPLEBUNDLE;
	static {
		PINEAPPLE = register("pineapple", PineappleBlock::new);
		PINEAPPLE_JUICE = register("pineapple_juice", PineappleJuiceBlock::new);
		PINEAPPLEESSENSECRAFTER = register("pineappleessensecrafter", PineappleessensecrafterBlock::new);
		PINEAPPLEBUNDLE = register("pineapplebundle", PineapplebundleBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}