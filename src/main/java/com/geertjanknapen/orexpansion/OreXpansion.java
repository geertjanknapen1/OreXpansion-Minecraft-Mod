package com.geertjanknapen.orexpansion;

import com.geertjanknapen.orexpansion.util.BlockRegistryHandler;
import com.geertjanknapen.orexpansion.util.ItemRegistryHandler;
import com.geertjanknapen.orexpansion.util.ToolRegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("orexpansion")
public class OreXpansion
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "orexpansion";

    public OreXpansion() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ItemRegistryHandler.itemsInit();
        BlockRegistryHandler.blocksInit();
        ToolRegistryHandler.toolsInit();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        //
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        //
    }

    public static final ItemGroup ITEMS_BLOCKS_TAB = new ItemGroup("orexpansionItemsBlocksTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockRegistryHandler.STEEL_BLOCK_ITEM.get());
        }
    };

    public static final ItemGroup TOOLS_TAB = new ItemGroup("orexpansionToolsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ToolRegistryHandler.STEEL_SWORD.get());
        }
    };
}
