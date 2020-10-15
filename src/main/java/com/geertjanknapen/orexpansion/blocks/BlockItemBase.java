package com.geertjanknapen.orexpansion.blocks;

import com.geertjanknapen.orexpansion.OreXpansion;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(OreXpansion.ITEMS_BLOCKS_TAB));
    }
}
