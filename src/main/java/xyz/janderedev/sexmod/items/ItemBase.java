package xyz.janderedev.sexmod.items;

import net.minecraft.item.Item;
import xyz.janderedev.sexmod.init.RegistryHandler;

public class ItemBase extends Item {
    public ItemBase(String id, Item.Properties props) {
        super(props);

        RegistryHandler.ITEMS.register(id, () -> this);
    }
}
