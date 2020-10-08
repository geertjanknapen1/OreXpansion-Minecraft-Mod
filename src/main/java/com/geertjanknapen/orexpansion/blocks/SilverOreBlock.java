package com.geertjanknapen.orexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SilverOreBlock extends Block {
    public SilverOreBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f) // hardness = amount of time it takes to mine, resistance = tnt resistance
                .sound(SoundType.METAL)
                .harvestLevel(1) // 0 = wood, 1 = stone + gold, 2 = iron, 3 = diamond.
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
