package net.mcreator.ambigous.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.ambigous.procedures.PineappleswordLivingEntityIsHitWithToolProcedure;

public class PineappleswordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 350, 4f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("ambigous:pineapplesword_repair_items")));

	public PineappleswordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3.5f, -2.8f));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		PineappleswordLivingEntityIsHitWithToolProcedure.execute(entity);
	}
}