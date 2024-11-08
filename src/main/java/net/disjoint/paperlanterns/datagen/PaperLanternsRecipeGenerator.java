package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PaperLanternsRecipeGenerator extends FabricRecipeProvider {
    public PaperLanternsRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, PaperLanternsBlocks.PAPER_LANTERN)
                        .pattern("PPP")
                        .pattern("PLP")
                        .pattern("PPP")
                        .input('P', Items.PAPER)
                        .input('L', Blocks.LANTERN)
                        .criterion(hasItem(Blocks.LANTERN), conditionsFromItem(Blocks.LANTERN))
                        .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                        .offerTo(exporter);
            }
        };
    }
    @Override
    public String getName() {
        return "Paper Lanterns Recipes";
    }
}