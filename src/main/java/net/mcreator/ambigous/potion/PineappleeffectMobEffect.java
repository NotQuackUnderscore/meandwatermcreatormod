package net.mcreator.ambigous.potion;

public class PineappleeffectMobEffect extends InstantenousMobEffect {
	public PineappleeffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -14080);
	}

	@Override
	public void onMobHurt(ServerLevel level, LivingEntity entity, int amplifier, DamageSource damagesource, float damage) {
		PineappleeffectOnEntityHurtProcedure.execute(level, entity);
	}
}