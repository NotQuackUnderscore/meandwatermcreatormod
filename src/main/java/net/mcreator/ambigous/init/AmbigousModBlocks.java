/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.ambigous.block.*;
import net.mcreator.ambigous.AmbigousMod;

import java.util.function.Function;

public class AmbigousModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AmbigousMod.MODID);
	public static final DeferredBlock<Block> PINEAPPLE;
	public static final DeferredBlock<Block> PINEAPPLE_JUICE;
	public static final DeferredBlock<Block> PINEAPPLETABLE;
	public static final DeferredBlock<Block> PINEAPPLEBUNDLE;
	public static final DeferredBlock<Block> PINEAPPLEINGOTBLOCK;
	public static final DeferredBlock<Block> PINEAPPLESTONE;
	public static final DeferredBlock<Block> PINEAPPLEDIRT;
	public static final DeferredBlock<Block> PINEAPPLEGRASS;
	public static final DeferredBlock<Block> PINEAPPLECOBBLE;
	public static final DeferredBlock<Block> PINELOG;
	public static final DeferredBlock<Block> PINEPLANKS;
	public static final DeferredBlock<Block> PINELEAVES;
	public static final DeferredBlock<Block> PINETREE;
	static {
		PINEAPPLE = register("pineapple", PineappleBlock::new);
		PINEAPPLE_JUICE = register("pineapple_juice", PineappleJuiceBlock::new);
		PINEAPPLETABLE = register("pineappletable", PineappleessensecrafterBlock::new);
		PINEAPPLEBUNDLE = register("pineapplebundle", PineapplebundleBlock::new);
		PINEAPPLEINGOTBLOCK = register("pineappleingotblock", PineappleingotblockBlock::new);
		PINEAPPLESTONE = register("pineapplestone", PineapplestoneBlock::new);
		PINEAPPLEDIRT = register("pineappledirt", PineappledirtBlock::new);
		PINEAPPLEGRASS = register("pineapplegrass", PineapplegrassBlock::new);
		PINEAPPLECOBBLE = register("pineapplecobble", PineapplecobbleBlock::new);
		PINELOG = register("pinelog", PinelogBlock::new);
		PINEPLANKS = register("pineplanks", PineplanksBlock::new);
		PINELEAVES = register("pineleaves", PineleavesBlock::new);
		PINETREE = register("pinetree", PinetreeBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}