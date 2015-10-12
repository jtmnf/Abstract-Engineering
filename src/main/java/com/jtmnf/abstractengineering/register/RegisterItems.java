package com.jtmnf.abstractengineering.register;

import com.jtmnf.abstractengineering.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;

public class RegisterItems {
    public static final ItemAxe manganeseAxe = new ManganeseAxe();
    public static final ItemPickaxe manganesePickaxe = new ManganesePickaxe();
    public static final ItemSpade manganeseShovel = new ManganeseShovel();
    public static final ItemSword manganeseSword = new ManganeseSword();
    public static final ItemHoe manganeseHoe = new ManganeseHoe();

    public static final AbstractEngineeringItems ingotManganese = new ManganeseIngot();
    public static final AbstractEngineeringItems dustManganese = new ManganeseDust();
    public static final AbstractEngineeringItems ingotVanadium = new VanadiumIngot();
    public static final AbstractEngineeringItems dustVanadium = new VanadiumDust();

    public static final FlaxSeeds flaxSeeds = new FlaxSeeds();

    public static void register(){
        GameRegistry.registerItem(manganeseAxe, "manganeseAxe");
        GameRegistry.registerItem(manganesePickaxe, "manganesePickaxe");
        GameRegistry.registerItem(manganeseShovel, "manganeseShovel");
        GameRegistry.registerItem(manganeseHoe, "manganeseHoe");
        GameRegistry.registerItem(manganeseSword, "manganeseSword");

        GameRegistry.registerItem(ingotManganese, "ingotManganese");
        GameRegistry.registerItem(dustManganese, "dustManganese");
        GameRegistry.registerItem(ingotVanadium, "ingotVanadium");
        GameRegistry.registerItem(dustVanadium, "dustVanadium");

        GameRegistry.registerItem(flaxSeeds, "flaxSeeds");
    }
}
