package com.jtmnf.abstractengineering.blocks;

import net.minecraft.block.material.Material;

public class MagnesiumOre extends AbstractEngineeringBlocks {
    public MagnesiumOre(Material material) {
        super(material);

        this.setBlockName("oreMagnesium");
        this.setBlockTextureName("abstractengineering:oreMagnesium");
    }
}
