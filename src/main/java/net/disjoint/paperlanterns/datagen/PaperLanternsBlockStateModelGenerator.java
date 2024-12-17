package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class PaperLanternsBlockStateModelGenerator extends FabricModelProvider {

    public PaperLanternsBlockStateModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PaperLanternsBlocks.PAPER_LANTERN.asItem());
    }
}
