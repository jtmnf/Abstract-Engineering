package com.jtmnf.abstractengineering.blocks;

import com.jtmnf.abstractengineering.AbstractEngineering;
import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AbstractEngineeringBlocks extends Block {
    public AbstractEngineeringBlocks(Material material) {
        super(material);

        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setHardness(2.0F);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", AbstractEngineering.MODID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.toLowerCase().indexOf(".")+1);
    }
}
