package xyz.janderedev.sexmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SexNugget extends ItemBase {
    public SexNugget() {
        super(
                "sexnugget",
                new Item.Properties()
                        .tab(ItemGroup.TAB_MATERIALS)
        );
    }
}
