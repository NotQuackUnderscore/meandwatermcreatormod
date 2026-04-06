package net.mcreator.ambigous.item;

import net.minecraft.network.chat.Component;

public class PineappleJuiceItem extends BucketItem {

	public PineappleJuiceItem(Item.Properties properties) {
		super(AmbigousModFluids.PINEAPPLE_JUICE.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}

}