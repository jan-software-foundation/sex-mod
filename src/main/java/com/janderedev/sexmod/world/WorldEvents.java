package com.janderedev.sexmod.world;

import com.janderedev.sexmod.SexMod;
import com.janderedev.sexmod.world.gen.WorldGen;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SexMod.MODID)
public class WorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        WorldGen.generateOres(event);
    }
}
