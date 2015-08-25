package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ManganeseHoe extends ItemHoe {
    public ManganeseHoe() {
        super(ToolMaterial.IRON);

        this.setUnlocalizedName("abstractengineering:manganeseHoe");
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setTextureName("abstractengineering:manganeseHoe");
    }
}
