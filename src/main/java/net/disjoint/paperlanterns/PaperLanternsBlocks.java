package net.disjoint.paperlanterns;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class PaperLanternsBlocks {
    public static final Block PAPER_LANTERN = registerBlock("paper_lantern",
            HangingLanternBlock::new, AbstractBlock.Settings.copy(Blocks.LANTERN));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PaperLanterns.MOD_ID, name));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(PaperLanterns.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Registry.register(Registries.ITEM, key, new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(key)));
    }
    public static void registerModBlocks() {
        PaperLanterns.LOGGER.info("Registering blocks for " + PaperLanterns.MOD_ID);
    }
}
