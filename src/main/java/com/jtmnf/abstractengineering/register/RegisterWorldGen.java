package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.world.WorldGen;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterWorldGen {
    public static final WorldGen worldGen = new WorldGen();

    public static void register(){
        GameRegistry.registerWorldGenerator(worldGen, 0);
    }
}
