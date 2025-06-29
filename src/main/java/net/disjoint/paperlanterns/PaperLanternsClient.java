package net.disjoint.paperlanterns;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class PaperLanternsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(PaperLanternsBlocks.PAPER_LANTERN, BlockRenderLayer.CUTOUT);
    }
}