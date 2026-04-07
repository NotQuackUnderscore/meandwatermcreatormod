/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.ambigous.potion.PineappleeffectMobEffect;
import net.mcreator.ambigous.AmbigousMod;

public class AmbigousModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, AmbigousMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> PINEAPPLEEFFECT = REGISTRY.register("pineappleeffect", () -> new PineappleeffectMobEffect());
}