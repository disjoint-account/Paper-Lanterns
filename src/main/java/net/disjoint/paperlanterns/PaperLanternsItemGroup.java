package net.disjoint.paperlanterns;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PaperLanternsItemGroup {
    public static ItemGroup PAPERLANTERNS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PaperLanterns.MOD_ID, "paper-lanterns"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.paper-lanterns"))
                    .icon(() -> new ItemStack(PaperLanternsBlocks.PAPER_LANTERN.asItem())).entries((displayContext, entries) -> {
                        entries.add(PaperLanternsBlocks.PAPER_LANTERN);

                    }).build());
    public static void registerItemGroups() {
        PaperLanterns.LOGGER.info("Registering Item Groups for " + PaperLanterns.MOD_ID);
    }
}