package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.PICKAXE_MINEABLE;

public class PaperLanternsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public PaperLanternsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(PICKAXE_MINEABLE)
                .add(PaperLanternsBlocks.PAPER_LANTERN);
    }
}