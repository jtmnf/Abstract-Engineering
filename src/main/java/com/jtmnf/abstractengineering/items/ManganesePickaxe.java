package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.item.ItemPickaxe;

public class ManganesePickaxe extends ItemPickaxe {
    public ManganesePickaxe() {
        super(ToolMaterial.IRON);

        this.setUnlocalizedName("abstractengineering:manganesePickaxe");
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setTextureName("abstractengineering:manganesePickaxe");
    }
}
