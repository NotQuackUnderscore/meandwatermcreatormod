/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.ambigous.block.entity.PineleavesBlockEntity;
import net.mcreator.ambigous.block.entity.PineappleessensecrafterBlockEntity;
import net.mcreator.ambigous.AmbigousMod;

@EventBusSubscriber
public class AmbigousModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AmbigousMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PineappleessensecrafterBlockEntity>> PINEAPPLETABLE = register("pineappletable", AmbigousModBlocks.PINEAPPLETABLE, PineappleessensecrafterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PineleavesBlockEntity>> PINELEAVES = register("pineleaves", AmbigousModBlocks.PINELEAVES, PineleavesBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PINEAPPLETABLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PINELEAVES.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.FluidHandler.BLOCK, PINELEAVES.get(), (blockEntity, side) -> blockEntity.getFluidTank());
	}
}