package ru.unclestalin.devilmaycrymod.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class VitalStar extends Item {

    private final float healAmount;
    public VitalStar(Properties properties, float healAmount) {
        super(properties);
        this.healAmount = healAmount;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (hand == InteractionHand.MAIN_HAND) {
            player.heal(healAmount);
            int itemsCount = player.getMainHandItem().getCount();
            player.getMainHandItem().setCount(itemsCount - 1);
        }
        return super.use(level, player, hand);
    }
}
