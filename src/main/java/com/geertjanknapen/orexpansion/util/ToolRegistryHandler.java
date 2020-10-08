package com.geertjanknapen.orexpansion.util;

import com.geertjanknapen.orexpansion.OreXpansion;
import com.geertjanknapen.orexpansion.tools.OrexpansionItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OreXpansion.MOD_ID);

    public static void toolsInit() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Tools
    public static final RegistryObject<SwordItem> SILVER_SWORD = ItemRegistryHandler.ITEMS.register("silver_sword", () ->
            new SwordItem(OrexpansionItemTier.SILVER, 3, -1.4F, new Item.Properties().group(OreXpansion.TAB))
    );

    public static final RegistryObject<SwordItem> STEEL_SWORD = ItemRegistryHandler.ITEMS.register("steel_sword", () ->
            new SwordItem(OrexpansionItemTier.STEEL, 4, -1.0F, new Item.Properties().group(OreXpansion.TAB))
    );
}
