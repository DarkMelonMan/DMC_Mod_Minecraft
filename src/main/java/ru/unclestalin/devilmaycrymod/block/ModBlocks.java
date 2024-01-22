package ru.unclestalin.devilmaycrymod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.unclestalin.devilmaycrymod.DevilMayCryMod;
import ru.unclestalin.devilmaycrymod.block.custom.JumpyBlock;
import ru.unclestalin.devilmaycrymod.item.DMCCreativeModeTab;
import ru.unclestalin.devilmaycrymod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DevilMayCryMod.MOD_ID);

    public static final RegistryObject<Block> HEXAGON_BLOCK = registerBlock("hexagon_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
    .strength(6f).requiresCorrectToolForDrops()), DMCCreativeModeTab.DMC_TAB);

    public static final RegistryObject<Block> RED_JUMPY_BLOCK = registerBlock("red_jumpy_block", () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(7f).requiresCorrectToolForDrops(), true), DMCCreativeModeTab.DMC_TAB);

    public static final RegistryObject<Block> BLUE_JUMPY_BLOCK = registerBlock("blue_jumpy_block", () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
            .strength(7f).requiresCorrectToolForDrops(), false), DMCCreativeModeTab.DMC_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
