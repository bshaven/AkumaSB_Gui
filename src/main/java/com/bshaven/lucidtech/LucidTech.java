package com.bshaven.lucidtech;

import com.bshaven.lucidtech.block.ModBlocks;
import com.bshaven.lucidtech.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class LucidTech implements ModInitializer {
	public static final String MOD_ID = "lucidtech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems(); // Registers ModItems Class
		ModBlocks.registerModBlocks(); // Registers ModBlocks Class
	}
}
