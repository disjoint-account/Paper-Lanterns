package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class PaperLanternsLootTableGenerator extends FabricBlockLootSubProvider {
    public PaperLanternsLootTableGenerator(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(PaperLanternsBlocks.PAPER_LANTERN);
    }
}