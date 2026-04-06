package net.mcreator.ambigous.fluid;

public abstract class PineappleJuiceFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> AmbigousModFluidTypes.PINEAPPLE_JUICE_TYPE.get(), () -> AmbigousModFluids.PINEAPPLE_JUICE.get(),
			() -> AmbigousModFluids.FLOWING_PINEAPPLE_JUICE.get()).explosionResistance(100f).bucket(() -> AmbigousModItems.PINEAPPLE_JUICE_BUCKET.get()).block(() -> (LiquidBlock) AmbigousModBlocks.PINEAPPLE_JUICE.get());

	private PineappleJuiceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PineappleJuiceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PineappleJuiceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}