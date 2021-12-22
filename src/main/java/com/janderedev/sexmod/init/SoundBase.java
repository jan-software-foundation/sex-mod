package com.janderedev.sexmod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundBase extends SoundEvent {
    public SoundBase(ResourceLocation location) {
        super(location);

        RegistryHandler.SOUNDS.register(location.getPath(), () -> this);
    }
}
