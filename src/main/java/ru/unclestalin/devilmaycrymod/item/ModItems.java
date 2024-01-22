package ru.unclestalin.devilmaycrymod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.unclestalin.devilmaycrymod.DevilMayCryMod;
import ru.unclestalin.devilmaycrymod.item.custom.VitalStar;
import ru.unclestalin.devilmaycrymod.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DevilMayCryMod.MOD_ID);
    public static final RegistryObject<Item> RED_ORB = ITEMS.register("redorb", () -> new Item(new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> BURY_THE_LIGHT_RECORD = ITEMS.register("bury_the_light_record", () -> new RecordItem(666, ModSounds.DMC5_VERGIL_THEME.get(), new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> SUBHUMAN_RECORD = ITEMS.register("subhuman_record", () -> new RecordItem(666, ModSounds.DMC5_DANTE_THEME.get(), new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> DEVIL_TRIGGER_RECORD = ITEMS.register("devil_trigger_record", () -> new RecordItem(666, ModSounds.DMC5_NERO_THEME.get(), new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> CRIMSON_CLOUD_RECORD = ITEMS.register("crimson_cloud_record", () -> new RecordItem(666, ModSounds.DMC5_V_THEME.get(), new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> DEVILS_NEVER_CRY_RECORD = ITEMS.register("devils_never_cry_record", () -> new RecordItem(666, ModSounds.DMC3_DEVILS_NEVER_CRY.get(), new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));
    public static final RegistryObject<Item> VITAL_STAR_S = ITEMS.register("vital_star_s", () -> new VitalStar(new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB).stacksTo(10), 5f));
    public static final RegistryObject<Item> VITAL_STAR_M = ITEMS.register("vital_star_m", () -> new VitalStar(new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB).stacksTo(10), 10f));
    public static final RegistryObject<Item> VITAL_STAR_L = ITEMS.register("vital_star_l", () -> new VitalStar(new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB).stacksTo(10), 20f));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}