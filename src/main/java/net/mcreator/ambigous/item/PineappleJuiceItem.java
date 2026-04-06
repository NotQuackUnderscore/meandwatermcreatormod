package net.mcreator.ambigous.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ambigous.init.AmbigousModFluids;

public class PineappleJuiceItem extends BucketItem {
	public PineappleJuiceItem(Item.Properties properties) {
		super(AmbigousModFluids.PINEAPPLE_JUICE.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}