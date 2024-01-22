package ru.unclestalin.devilmaycrymod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;

public class JumpyBlock extends SlabBlock {

    public JumpyBlock(Properties properties) {
        super(properties);
    }
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float damage_amount) {
        super.fallOn(level, blockState, blockPos, entity, 0);
    }

}
