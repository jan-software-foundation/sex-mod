package com.janderedev.sexmod.init;

import com.janderedev.sexmod.SexMod;
import com.janderedev.sexmod.blocks.SexBlock;
import com.janderedev.sexmod.blocks.SexOre;
import com.janderedev.sexmod.items.CBTDevice;
import com.janderedev.sexmod.items.SexNugget;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SexMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SexMod.MODID);

    public static void init() {
        // Attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final Item ITEM_SEXNUGGET = new SexNugget();
    public static final Item ITEM_CBTDEVICE = new CBTDevice();

    public static final Block BLOCK_SEX_ORE = new SexOre();
    public static final Block BLOCK_SEX = new SexBlock();
}
