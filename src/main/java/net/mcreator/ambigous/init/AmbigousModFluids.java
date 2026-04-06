/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.ambigous.fluid.PineappleJuiceFluid;
import net.mcreator.ambigous.AmbigousMod;

public class AmbigousModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, AmbigousMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> PINEAPPLE_JUICE = REGISTRY.register("pineapple_juice", () -> new PineappleJuiceFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PINEAPPLE_JUICE = REGISTRY.register("flowing_pineapple_juice", () -> new PineappleJuiceFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PINEAPPLE_JUICE.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PINEAPPLE_JUICE.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}