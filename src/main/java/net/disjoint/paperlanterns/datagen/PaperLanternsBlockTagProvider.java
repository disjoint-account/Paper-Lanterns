package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE;

public class PaperLanternsBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public PaperLanternsBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(MINEABLE_WITH_PICKAXE)
                .add(PaperLanternsBlocks.PAPER_LANTERN);
    }
}