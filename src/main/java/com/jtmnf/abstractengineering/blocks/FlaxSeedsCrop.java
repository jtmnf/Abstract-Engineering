package com.jtmnf.abstractengineering.blocks;

import com.jtmnf.abstractengineering.register.RegisterItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class FlaxSeedsCrop extends BlockCrops {
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public FlaxSeedsCrop() {
        this.setBlockName("abstractengineering:flaxSeedsCrop");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.icons = new IIcon[5];

        for(int i = 0; i < icons.length; ++i){
            this.icons[i] = iconRegister.registerIcon("abstractengineering:flax"+(i+1));
        }
    }

    @Override
    public IIcon getIcon(int side, int metadata) {
        if(metadata < 7){
            if(metadata == 6){
                metadata = 5;
            }
            return this.icons[metadata >> 1];
        }

        return this.icons[(icons.length-1)];
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        super.quantityDropped(meta, fortune, random);
        if(meta == 5){
            return random.nextInt(2) + 1;
        }
        else{
            return 1;
        }
    }

    @Override
    protected Item func_149866_i() {
        return RegisterItems.flaxSeeds;
    }

    @Override
    protected Item func_149865_P() {
        return Items.string;
    }
}
