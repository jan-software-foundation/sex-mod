package xyz.janderedev.sexmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import xyz.janderedev.sexmod.init.RegistryHandler;

public class BlockBase extends Block {
    public BlockBase(String id, Block.Properties blockProps, Item.Properties itemProps) {
        super(blockProps);

        RegistryHandler.BLOCKS.register(id, () -> this);
        RegistryHandler.ITEMS.register(id, () -> new BlockItem(this, itemProps));
    }
}
