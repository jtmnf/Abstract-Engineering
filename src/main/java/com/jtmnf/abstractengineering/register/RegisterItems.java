package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterItems {
    public static final AbstractEngineeringItems magnesiumAxe = new MagnesiumAxe();
    public static final AbstractEngineeringItems magnesiumPickaxe = new MagnesiumPickaxe();
    public static final AbstractEngineeringItems magnesiumShovel = new MagnesiumShovel();


    public static void register(){
        GameRegistry.registerItem(magnesiumAxe, "magnesiumAxe");
        GameRegistry.registerItem(magnesiumPickaxe, "magnesiumPickaxe");
        GameRegistry.registerItem(magnesiumShovel, "magnesiumShovel");
    }
}
