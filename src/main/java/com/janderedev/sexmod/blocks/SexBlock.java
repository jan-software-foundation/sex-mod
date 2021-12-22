package com.janderedev.sexmod.blocks;

import com.janderedev.sexmod.init.RegistryHandler;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Date;

public class SexBlock extends BlockBase {
    private long lastOniiChan = 0;

    public SexBlock() {
        super(
                "sex_block",
                AbstractBlock.Properties.of(Material.HEAVY_METAL)
                        .strength(4.0f, Float.MAX_VALUE)
                        .sound(SoundType.METAL)
                        .harvestTool(ToolType.PICKAXE)
                        .harvestLevel(2)
                        .requiresCorrectToolForDrops(),
                new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
        );
    }

    @Override
    public void stepOn(World world, BlockPos blockPos, Entity entity) {
        super.stepOn(world, blockPos, entity);
        if (!world.isClientSide()) {
            Date date = new Date();
            long time = date.getTime();

            if (time > lastOniiChan + 1000) {
                lastOniiChan = time;
                world.playSound(null, blockPos, RegistryHandler.SOUND_ONIICHAN, SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
        }
    }

    // why is this deprecated
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos blockPos,
                                PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        world.playSound(player, blockPos, RegistryHandler.SOUND_NYAA, SoundCategory.BLOCKS, 1.0f, 1.0f);

        ActionResultType result = ActionResultType.SUCCESS;
        result.shouldSwing();
        return result;
    }
}
