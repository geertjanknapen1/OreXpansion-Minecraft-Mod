package com.geertjanknapen.orexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperOreBlock extends Block {
    public CopperOreBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
