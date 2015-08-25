package com.jtmnf.abstractengineering;

import com.jtmnf.abstractengineering.proxy.Client;
import com.jtmnf.abstractengineering.proxy.IProxy;
import com.jtmnf.abstractengineering.register.RegisterBlocks;
import com.jtmnf.abstractengineering.register.RegisterItems;
import com.jtmnf.abstractengineering.register.RegisterTileEntities;
import com.jtmnf.abstractengineering.register.RegisterWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(name = AbstractEngineering.MOD, modid = AbstractEngineering.MODID, version = AbstractEngineering.VERSION)
public class AbstractEngineering {
    public static final String MOD = "AbstractEngineering";
    public static final String MODID = "abstractengineering";
    public static final String VERSION = "1.0.0";

    public static final String CLIENT = "com.jtmnf.abstractengineering.proxy.Client";
    public static final String SERVER = "com.jtmnf.abstractengineering.proxy.Server";

    @Mod.Instance
    public static AbstractEngineering abstractEngineering;

    @SidedProxy(clientSide = AbstractEngineering.CLIENT, serverSide = AbstractEngineering.SERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        RegisterBlocks.register();
        RegisterItems.register();
        RegisterTileEntities.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RegisterWorldGen.register();
        Client.registerRender();
    }

    @Mod.EventHandler
    public void posInit(FMLPostInitializationEvent event){

    }

    public static class AbstractEngineeringTab {
        public static final CreativeTabs tab = new CreativeTabs(AbstractEngineering.MODID) {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(RegisterBlocks.oreManganese);
            }
        };
    }

}
