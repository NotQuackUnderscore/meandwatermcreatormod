/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ambigous.AmbigousMod;

@EventBusSubscriber
public class AmbigousModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmbigousMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PINEAPPLE_MOD = REGISTRY.register("pineapple_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ambigous.pineapple_mod")).icon(() -> new ItemStack(AmbigousModItems.PINEAPPLE_JUICE_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AmbigousModItems.PINEAPPLE_JUICE_BUCKET.get());
				tabData.accept(AmbigousModItems.PINEAPPLEITEM.get());
				tabData.accept(AmbigousModBlocks.PINEAPPLETABLE.get().asItem());
				tabData.accept(AmbigousModBlocks.PINEAPPLEBUNDLE.get().asItem());
				tabData.accept(AmbigousModItems.PINEAPPLE_CHUNK.get());
				tabData.accept(AmbigousModItems.PINEAPPLE_INGOT.get());
				tabData.accept(AmbigousModBlocks.PINEAPPLESTONE.get().asItem());
				tabData.accept(AmbigousModBlocks.PINEAPPLEDIRT.get().asItem());
				tabData.accept(AmbigousModBlocks.PINEAPPLEGRASS.get().asItem());
				tabData.accept(AmbigousModBlocks.PINEAPPLECOBBLE.get().asItem());
				tabData.accept(AmbigousModItems.PINEAPPLE_CANNON.get());
				tabData.accept(AmbigousModBlocks.PINELOG.get().asItem());
				tabData.accept(AmbigousModBlocks.PINEPLANKS.get().asItem());
				tabData.accept(AmbigousModItems.PINEAPPLESWORD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(AmbigousModBlocks.PINEAPPLE.get().asItem());
			tabData.accept(AmbigousModBlocks.PINETREE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AmbigousModItems.PINEAPPLESWORD.get());
		}
	}
}