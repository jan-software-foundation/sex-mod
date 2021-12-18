package com.janderedev.sexmod.items;

import com.janderedev.sexmod.RegistryHandler;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(String id, Item.Properties props) {
        super(props);

        RegistryHandler.ITEMS.register(id, () -> this);
    }
}
