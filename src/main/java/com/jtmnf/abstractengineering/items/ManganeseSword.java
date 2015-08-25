package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.item.ItemSword;

public class ManganeseSword extends ItemSword {
    public ManganeseSword() {
        super(ToolMaterial.IRON);

        this.setUnlocalizedName("abstractengineering:manganeseSword");
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setTextureName("abstractengineering:manganeseSword");
    }
}
