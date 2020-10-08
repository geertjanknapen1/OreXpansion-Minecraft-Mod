package com.geertjanknapen.orexpansion.util;

import com.geertjanknapen.orexpansion.OreXpansion;
import com.geertjanknapen.orexpansion.items.ItemBase;
import com.geertjanknapen.orexpansion.tools.OrexpansionItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OreXpansion.MOD_ID);

    public static void itemsInit() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Misc Items
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
}
