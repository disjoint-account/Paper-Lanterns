package net.disjoint.paperlanterns;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaperLanterns implements ModInitializer {

	public static final String MOD_ID = "paper-lanterns";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		PaperLanternsItemGroup.registerItemGroups();
		PaperLanternsBlocks.registerModBlocks();
	}

}
