package com.janderedev.sexmod.blocks;


import com.janderedev.sexmod.SexMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

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
