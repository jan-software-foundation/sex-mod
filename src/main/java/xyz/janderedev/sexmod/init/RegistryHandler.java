package xyz.janderedev.sexmod.init;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.janderedev.sexmod.SexMod;
import xyz.janderedev.sexmod.blocks.SexBlock;
import xyz.janderedev.sexmod.blocks.SexOre;
import xyz.janderedev.sexmod.items.CBTDevice;
import xyz.janderedev.sexmod.items.SexNugget;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SexMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SexMod.MODID);
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SexMod.MODID);

    public static void init() {
        // Attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final Item ITEM_SEXNUGGET = new SexNugget();
    public static final Item ITEM_CBTDEVICE = new CBTDevice();

    public static final Block BLOCK_SEX_ORE = new SexOre();
    public static final Block BLOCK_SEX = new SexBlock();

    public static final SoundEvent SOUND_ONIICHAN = new SoundBase(new ResourceLocation(SexMod.MODID, "onii_chan"));
    public static final SoundEvent SOUND_NYAA = new SoundBase(new ResourceLocation(SexMod.MODID, "nyaa"));
    public static final SoundEvent SOUND_CBT = new SoundBase(new ResourceLocation(SexMod.MODID, "cbt"));
}
