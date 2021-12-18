package com.janderedev.sexmod.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class SexBlock extends BlockBase {
    public SexBlock() {
        super(
                "sex_block",
                AbstractBlock.Properties.of(Material.HEAVY_METAL)
                        .strength(40.0f, Float.MAX_VALUE)
                        .sound(SoundType.METAL)
                        .harvestTool(ToolType.PICKAXE),
                new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
        );
    }
}
