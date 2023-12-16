package ru.unclestalin.devilmaycrymod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.unclestalin.devilmaycrymod.DevilMayCryMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DevilMayCryMod.MOD_ID);
    public static final RegistryObject<Item> RED_ORB = ITEMS.register("redorb", () -> new Item(new Item.Properties().tab(DMCCreativeModeTab.DMC_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}