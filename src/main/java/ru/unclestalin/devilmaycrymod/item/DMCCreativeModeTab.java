package ru.unclestalin.devilmaycrymod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DMCCreativeModeTab {
    public static final CreativeModeTab DMC_TAB = new CreativeModeTab("devilmaycrytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RED_ORB.get());
        }
    };
}
