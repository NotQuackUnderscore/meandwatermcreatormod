/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ambigous.item.PineappleitemItem;
import net.mcreator.ambigous.item.PineappleJuiceItem;
import net.mcreator.ambigous.item.PineappleIngotItem;
import net.mcreator.ambigous.item.PineappleChunkItem;
import net.mcreator.ambigous.item.EssenceItem;
import net.mcreator.ambigous.AmbigousMod;

import java.util.function.Function;

public class AmbigousModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AmbigousMod.MODID);
	public static final DeferredItem<Item> PINEAPPLE;
	public static final DeferredItem<Item> PINEAPPLE_JUICE_BUCKET;
	public static final DeferredItem<Item> ESSENCE;
	public static final DeferredItem<Item> PINEAPPLEITEM;
	public static final DeferredItem<Item> PINEAPPLETABLE;
	public static final DeferredItem<Item> PINEAPPLEBUNDLE;
	public static final DeferredItem<Item> PINEAPPLE_CHUNK;
	public static final DeferredItem<Item> PINEAPPLE_INGOT;
	public static final DeferredItem<Item> PINEAPPLEINGOTBLOCK;
	public static final DeferredItem<Item> PINEAPPLEDIRT;
	public static final DeferredItem<Item> PINEAPPLEGRASS;
	public static final DeferredItem<Item> PINEAPPLESTONE;
	public static final DeferredItem<Item> PINEAPPLECOBBLE;
	static {
		PINEAPPLE = block(AmbigousModBlocks.PINEAPPLE);
		PINEAPPLE_JUICE_BUCKET = register("pineapple_juice_bucket", PineappleJuiceItem::new);
		ESSENCE = register("essence", EssenceItem::new);
		PINEAPPLEITEM = register("pineappleitem", PineappleitemItem::new);
		PINEAPPLETABLE = block(AmbigousModBlocks.PINEAPPLETABLE);
		PINEAPPLEBUNDLE = block(AmbigousModBlocks.PINEAPPLEBUNDLE);
		PINEAPPLE_CHUNK = register("pineapple_chunk", PineappleChunkItem::new);
		PINEAPPLE_INGOT = register("pineapple_ingot", PineappleIngotItem::new);
		PINEAPPLEINGOTBLOCK = block(AmbigousModBlocks.PINEAPPLEINGOTBLOCK);
		PINEAPPLEDIRT = block(AmbigousModBlocks.PINEAPPLEDIRT);
		PINEAPPLEGRASS = block(AmbigousModBlocks.PINEAPPLEGRASS);
		PINEAPPLESTONE = block(AmbigousModBlocks.PINEAPPLESTONE);
		PINEAPPLECOBBLE = block(AmbigousModBlocks.PINEAPPLECOBBLE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), PINEAPPLE_JUICE_BUCKET.get());
	}
}