package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.blocks.AbstractEngineeringBlocks;
import com.jtmnf.abstractengineering.blocks.FlaxSeedsCrop;
import com.jtmnf.abstractengineering.blocks.ManganeseOre;
import com.jtmnf.abstractengineering.blocks.VanadiumQuarry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public class RegisterBlocks {
    public static final AbstractEngineeringBlocks oreManganese = new ManganeseOre(Material.rock);
    public static final AbstractEngineeringBlocks vanadiumQuarry = new VanadiumQuarry(Material.iron);

    public static final FlaxSeedsCrop flaxSeedsCrop = new FlaxSeedsCrop();

    public static void register(){
        GameRegistry.registerBlock(oreManganese, "oreManganese");
        GameRegistry.registerBlock(vanadiumQuarry, "vanadiumQuarry");

        GameRegistry.registerBlock(flaxSeedsCrop, "flaxSeedsCrop");
    }
}
