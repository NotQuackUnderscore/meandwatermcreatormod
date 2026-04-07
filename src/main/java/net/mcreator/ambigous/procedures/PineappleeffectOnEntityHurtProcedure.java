package net.mcreator.ambigous.procedures;

import net.neoforged.bus.api.Event;

public class PineappleeffectOnEntityHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.CACTUS)), 100);
	}
}