/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.ambigous.fluid.types.PineappleJuiceFluidType;
import net.mcreator.ambigous.AmbigousMod;

public class AmbigousModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, AmbigousMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> PINEAPPLE_JUICE_TYPE = REGISTRY.register("pineapple_juice", () -> new PineappleJuiceFluidType());
}