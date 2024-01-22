package ru.unclestalin.devilmaycrymod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import ru.unclestalin.devilmaycrymod.sound.ModSounds;

public class JumpyBlock extends SlabBlock {

    private static boolean IsRed;
    public JumpyBlock(Properties properties, boolean isRed) {
        super(properties);
        IsRed = isRed;
    }
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float damage_amount) {
        super.fallOn(level, blockState, blockPos, entity, 0);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        double jumpPower = IsRed? 2: 4;
        entity.push(0, jumpPower, 0);
        entity.playSound(ModSounds.WING_BLOCK_JUMP.get());
        super.stepOn(level, blockPos, blockState, entity);
    }
}