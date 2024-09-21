package net.disjoint.paperlanterns;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PaperLanternsBlocks {
    public static final Block PAPER_LANTERN = registerBlock("paper_lantern",
            new HangingLanternBlock());

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PaperLanterns.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PaperLanterns.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PaperLanterns.LOGGER.info("Registering blocks for " + PaperLanterns.MOD_ID);
    }
}
