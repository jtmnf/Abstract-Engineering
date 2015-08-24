package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.blocks.AbstractEngineeringBlocks;
import com.jtmnf.abstractengineering.blocks.MagnesiumOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
    public static final AbstractEngineeringBlocks oreMagnesium = new MagnesiumOre(Material.rock);

    public static void register(){
        GameRegistry.registerBlock(oreMagnesium, "oreMagnesium");
    }
}
