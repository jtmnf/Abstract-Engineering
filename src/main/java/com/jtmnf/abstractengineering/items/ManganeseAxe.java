package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.item.ItemAxe;

public class ManganeseAxe extends ItemAxe{
    public ManganeseAxe() {
        super(ToolMaterial.IRON);

        this.setUnlocalizedName("abstractengineering:manganeseAxe");
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setTextureName("abstractengineering:manganeseAxe");
    }
}
