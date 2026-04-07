package net.mcreator.ambigous.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.ambigous.procedures.PineappleeffectOnEntityHurtProcedure;

public class PineappleeffectMobEffect extends InstantenousMobEffect {
	public PineappleeffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -14080);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		PineappleeffectOnEntityHurtProcedure.execute(level, entity);
	}
}