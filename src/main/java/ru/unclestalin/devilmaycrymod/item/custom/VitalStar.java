package ru.unclestalin.devilmaycrymod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

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

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()){
            components.add(Component.literal("Right Click to heal yourself.").withStyle(ChatFormatting.GREEN));
        }
        else{
            components.add(Component.literal("Press SHIFT for more info.").withStyle(ChatFormatting.WHITE));
        }
        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
