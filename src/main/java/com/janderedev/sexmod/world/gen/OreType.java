package com.janderedev.sexmod.world.gen;

import com.janderedev.sexmod.RegistryHandler;
import net.minecraft.block.Block;

public enum OreType {
    SEX_ORE(RegistryHandler.BLOCK_SEX_ORE, 8, 0, 64);

    private final Block block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;


    OreType(Block block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Block getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
