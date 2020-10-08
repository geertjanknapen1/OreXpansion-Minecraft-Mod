package com.geertjanknapen.orexpansion.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperBlock extends Block {
    public CopperBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
        );
    }
}
