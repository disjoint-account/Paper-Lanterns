package net.disjoint.paperlanterns;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class PaperLanternsItemGroup {
    public static CreativeModeTab PAPERLANTERNS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(PaperLanterns.MOD_ID, "paper-lanterns"),
            FabricCreativeModeTab.builder().title(Component.translatable("itemgroup.paper-lanterns"))
                    .icon(() -> new ItemStack(PaperLanternsBlocks.PAPER_LANTERN.asItem())).displayItems((displayContext, entries) -> {
                        entries.accept(PaperLanternsBlocks.PAPER_LANTERN);

                    }).build());
    public static void registerItemGroups() {
        PaperLanterns.LOGGER.info("Registering Item Groups for " + PaperLanterns.MOD_ID);
    }
}