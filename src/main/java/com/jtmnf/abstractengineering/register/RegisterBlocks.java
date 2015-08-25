package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.blocks.AbstractEngineeringBlocks;
import com.jtmnf.abstractengineering.blocks.ManganeseOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
    public static final AbstractEngineeringBlocks oreManganese = new ManganeseOre(Material.rock);

    public static void register(){
        GameRegistry.registerBlock(oreManganese, "oreManganese");
    }
}
