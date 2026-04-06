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
import net.mcreator.ambigous.item.EssenceItem;
import net.mcreator.ambigous.AmbigousMod;

import java.util.function.Function;

public class AmbigousModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AmbigousMod.MODID);
	public static final DeferredItem<Item> PINEAPPLE;
	public static final DeferredItem<Item> PINEAPPLE_JUICE_BUCKET;
	public static final DeferredItem<Item> ESSENCE;
	public static final DeferredItem<Item> PINEAPPLEITEM;
	public static final DeferredItem<Item> PINEAPPLEESSENSECRAFTER;
	static {
		PINEAPPLE = block(AmbigousModBlocks.PINEAPPLE);
		PINEAPPLE_JUICE_BUCKET = register("pineapple_juice_bucket", PineappleJuiceItem::new);
		ESSENCE = register("essence", EssenceItem::new);
		PINEAPPLEITEM = register("pineappleitem", PineappleitemItem::new);
		PINEAPPLEESSENSECRAFTER = block(AmbigousModBlocks.PINEAPPLEESSENSECRAFTER);
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