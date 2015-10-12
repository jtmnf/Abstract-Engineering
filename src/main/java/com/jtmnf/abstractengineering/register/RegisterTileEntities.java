package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.tileentities.TileEntityVanadiumQuarry;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterTileEntities {
    public static void register(){
        GameRegistry.registerTileEntity(TileEntityVanadiumQuarry.class, "tileEntityVanadiumQuarry");
    }
}
