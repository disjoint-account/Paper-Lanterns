package net.disjoint.paperlanterns.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PaperLanternsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PaperLanternsRecipeGenerator::new);
		pack.addProvider(PaperLanternsBlockTagProvider::new);
		pack.addProvider(PaperLanternsLootTableGenerator::new);
	}
}