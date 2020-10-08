package com.geertjanknapen.orexpansion.util;

import com.geertjanknapen.orexpansion.OreXpansion;
import com.geertjanknapen.orexpansion.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, OreXpansion.MOD_ID);

    public static void blocksInit() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks (the thing you mine)
    // Ores
    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCKS.register("silver_ore_block", SilverOreBlock::new);
    public static final RegistryObject<Block> STEEL_ORE_BLOCK = BLOCKS.register("steel_ore_block", SteelOreBlock::new);
    // Full blocks
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);


    // Block items (the thing in the inventory)
    // Ores
    public static final RegistryObject<Item> SILVER_ORE_BLOCK_ITEM = ItemRegistryHandler.ITEMS.register("silver_ore_block", () -> new BlockItemBase(SILVER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_ORE_BLOCK_ITEM = ItemRegistryHandler.ITEMS.register("steel_ore_block", () -> new BlockItemBase(STEEL_ORE_BLOCK.get()));

    // Full blocks
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ItemRegistryHandler.ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ItemRegistryHandler.ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
}
