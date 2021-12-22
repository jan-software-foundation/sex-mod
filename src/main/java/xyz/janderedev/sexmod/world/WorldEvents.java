package xyz.janderedev.sexmod.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xyz.janderedev.sexmod.SexMod;
import xyz.janderedev.sexmod.world.gen.WorldGen;

@Mod.EventBusSubscriber(modid = SexMod.MODID)
public class WorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        WorldGen.generateOres(event);
    }
}
