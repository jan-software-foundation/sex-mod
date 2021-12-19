package com.janderedev.sexmod.blocks;

import com.janderedev.sexmod.init.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockBase extends Block {
    public BlockBase(String id, Block.Properties blockProps, Item.Properties itemProps) {
        super(blockProps);

        RegistryHandler.BLOCKS.register(id, () -> this);
        RegistryHandler.ITEMS.register(id, () -> new BlockItem(this, itemProps));
    }
}
