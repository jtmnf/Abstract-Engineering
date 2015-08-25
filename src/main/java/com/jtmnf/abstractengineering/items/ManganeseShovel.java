package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.item.ItemSpade;

public class ManganeseShovel extends ItemSpade {
    public ManganeseShovel() {
        super(ToolMaterial.IRON);

        this.setUnlocalizedName("abstractengineering:manganeseShovel");
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setTextureName("abstractengineering:manganeseShovel");
    }
}
