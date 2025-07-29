package com.victor.custommod.sound;

import com.victor.custommod.CustomMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent PENGUIN_AMBIENT = registerSoundEvent("penguin_ambient");

    private static SoundEvent registerSoundEvent (String name) {
        Identifier id = Identifier.of(CustomMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        CustomMod.LOGGER.info("Registering Mod Sounds for " + CustomMod.MOD_ID);
    }
}
