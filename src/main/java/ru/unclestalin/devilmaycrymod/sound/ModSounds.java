package ru.unclestalin.devilmaycrymod.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.unclestalin.devilmaycrymod.DevilMayCryMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DevilMayCryMod.MOD_ID);

    public static final RegistryObject<SoundEvent> WING_BLOCK_JUMP = registerSoundEvent("wing_block_jump");
    public static final RegistryObject<SoundEvent> DMC5_VERGIL_THEME = registerSoundEvent("dmc5_vergil_theme");
    public static final RegistryObject<SoundEvent> DMC5_DANTE_THEME = registerSoundEvent("dmc5_dante_theme");
    public static final RegistryObject<SoundEvent> DMC3_DEVILS_NEVER_CRY = registerSoundEvent("dmc3_devils_never_cry");
    public static final RegistryObject<SoundEvent> DMC5_NERO_THEME = registerSoundEvent("dmc5_nero_theme");
    public static final RegistryObject<SoundEvent> DMC5_V_THEME = registerSoundEvent("dmc5_v_theme");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = new ResourceLocation(DevilMayCryMod.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
