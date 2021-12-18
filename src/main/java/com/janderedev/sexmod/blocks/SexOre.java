package com.janderedev.sexmod.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class SexOre extends BlockBase {
    public SexOre() {
        super(
                "sex_ore",
                AbstractBlock.Properties.of(Material.STONE)
                        .strength(5.0f, 6.0f)
                        .sound(SoundType.STONE)
                        .harvestLevel(3)
                        .harvestTool(ToolType.PICKAXE)
                        .lightLevel((BlockState state) -> 6),
                new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
        );
    }
}
