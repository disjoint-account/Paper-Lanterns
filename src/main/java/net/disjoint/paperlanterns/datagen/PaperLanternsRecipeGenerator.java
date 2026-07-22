package net.disjoint.paperlanterns.datagen;

import net.disjoint.paperlanterns.PaperLanternsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class PaperLanternsRecipeGenerator extends FabricRecipeProvider {
    public PaperLanternsRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.MISC, PaperLanternsBlocks.PAPER_LANTERN)
                        .pattern("PPP")
                        .pattern("PLP")
                        .pattern("PPP")
                        .define('P', Items.PAPER)
                        .define('L', Blocks.LANTERN)
                        .unlockedBy(getHasName(Blocks.LANTERN), has(Blocks.LANTERN))
                        .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                        .save(output);
            }
        };
    }
    @Override
    public String getName() {
        return "Paper Lanterns Recipes";
    }
}