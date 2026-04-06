/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ambigous.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.ambigous.client.gui.PineAppleMenuScreen;

@EventBusSubscriber(Dist.CLIENT)
public class AmbigousModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AmbigousModMenus.PINE_APPLE_MENU.get(), PineAppleMenuScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}