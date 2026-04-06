package net.mcreator.ambigous.client.fluid;

@EventBusSubscriber(Dist.CLIENT)
public class PineappleJuiceFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("minecraft:block/cactus_side");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("minecraft:block/cactus_top");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, AmbigousModFluidTypes.PINEAPPLE_JUICE_TYPE.get());
	}
}