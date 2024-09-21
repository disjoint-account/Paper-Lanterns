package net.disjoint.paperlanterns;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
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
