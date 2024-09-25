package com.bshaven.akumasbgui;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.server.MinecraftServer;

public class AkumaSBGui implements ModInitializer {
	public static final String MOD_ID = "akumasbgui";
	@Override
	public void onInitialize() {
		// This code runs when your mod is initialized
		ServerLifecycleEvents.SERVER_STARTED.register(this::onServerStarted);
	}

	private void onServerStarted(MinecraftServer server) {
		System.out.println("Hello Fabric world!");
	}
}
