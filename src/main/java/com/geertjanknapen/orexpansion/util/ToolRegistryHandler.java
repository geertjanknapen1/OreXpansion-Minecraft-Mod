package com.geertjanknapen.orexpansion.util;

import com.geertjanknapen.orexpansion.OreXpansion;
import com.geertjanknapen.orexpansion.tools.OrexpansionItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolRegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OreXpansion.MOD_ID);

    public static void toolsInit() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Tools - Swords
    public static final RegistryObject<SwordItem> SILVER_SWORD = ItemRegistryHandler.ITEMS.register("silver_sword", () ->
            new SwordItem(OrexpansionItemTier.SILVER, 3, -1.4F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    public static final RegistryObject<SwordItem> STEEL_SWORD = ItemRegistryHandler.ITEMS.register("steel_sword", () ->
            new SwordItem(OrexpansionItemTier.STEEL, 4, -1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    public static final RegistryObject<SwordItem> COPPER_SWORD = ItemRegistryHandler.ITEMS.register("copper_sword", () ->
            new SwordItem(OrexpansionItemTier.COPPER, 3, -0.5F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
        );

    // Tools - Pickaxes
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ItemRegistryHandler.ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(OrexpansionItemTier.SILVER, 0, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ItemRegistryHandler.ITEMS.register("steel_pickaxe", () ->
            new PickaxeItem(OrexpansionItemTier.STEEL, 0, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ItemRegistryHandler.ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(OrexpansionItemTier.COPPER, 0, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    // Tools - Axes
    public static final RegistryObject<AxeItem> COPPER_AXE = ItemRegistryHandler.ITEMS.register("copper_axe", () ->
            new AxeItem(OrexpansionItemTier.COPPER, 2, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    // Tools - Shovels
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ItemRegistryHandler.ITEMS.register("copper_shovel", () ->
            new ShovelItem(OrexpansionItemTier.COPPER, 0, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );

    // Tools - Hoes
    public static final RegistryObject<HoeItem> COPPER_HOE = ItemRegistryHandler.ITEMS.register("copper_hoe", () ->
            new HoeItem(OrexpansionItemTier.COPPER, 1.0F, new Item.Properties().group(OreXpansion.TOOLS_TAB))
    );
}
