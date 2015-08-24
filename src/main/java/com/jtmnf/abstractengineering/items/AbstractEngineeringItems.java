package com.jtmnf.abstractengineering.items;

import com.jtmnf.abstractengineering.AbstractEngineering;
import com.jtmnf.abstractengineering.AbstractEngineering.AbstractEngineeringTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AbstractEngineeringItems extends Item {
    public AbstractEngineeringItems() {
        this.setCreativeTab(AbstractEngineeringTab.tab);
        this.setMaxDamage(312);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", AbstractEngineering.MODID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", AbstractEngineering.MODID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }
}
