package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class PaperLanternsBlockStateModelGenerator extends FabricModelProvider {

    public PaperLanternsBlockStateModelGenerator(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.declareCustomModelItem(PaperLanternsBlocks.PAPER_LANTERN.asItem());
    }
}
