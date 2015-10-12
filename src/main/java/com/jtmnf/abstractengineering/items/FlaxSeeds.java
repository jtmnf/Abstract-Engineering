package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import com.jtmnf.abstractengineering.register.RegisterBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class FlaxSeeds extends ItemSeeds {
    public FlaxSeeds() {
        super(RegisterBlocks.flaxSeedsCrop, Blocks.farmland);

        this.setUnlocalizedName("abstractengineering:flaxSeeds");
        this.setTextureName("abstractengineering:flaxSeeds");
        this.setCreativeTab(AbstractEngineeringTab.tab);
    }
}
