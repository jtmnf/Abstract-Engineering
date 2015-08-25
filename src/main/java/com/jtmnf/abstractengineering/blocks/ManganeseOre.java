package com.jtmnf.abstractengineering.blocks;

import com.jtmnf.abstractengineering.register.RegisterItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class ManganeseOre extends AbstractEngineeringBlocks {
    public ManganeseOre(Material material) {
        super(material);

        this.setBlockName("oreManganese");
        this.setBlockTextureName("abstractengineering:oreManganese");
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 3 + random.nextInt(fortune + 4 + 1);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return RegisterItems.dustManganese;
    }
}
