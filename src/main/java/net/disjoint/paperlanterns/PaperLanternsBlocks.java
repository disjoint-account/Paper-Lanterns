package net.disjoint.paperlanterns;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

import java.util.function.Function;

public class PaperLanternsBlocks {
    public static final Block PAPER_LANTERN = registerBlock("paper_lantern",
            HangingLanternBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(PaperLanterns.MOD_ID, name));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(PaperLanterns.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }
    public static void registerModBlocks() {
        PaperLanterns.LOGGER.info("Registering blocks for " + PaperLanterns.MOD_ID);
    }

    public static ResourceKey<Block> getResourceKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
}
