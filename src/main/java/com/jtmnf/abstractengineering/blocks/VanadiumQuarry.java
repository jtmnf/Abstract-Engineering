package com.jtmnf.abstractengineering.blocks;

import com.jtmnf.abstractengineering.tileentities.TileEntityVanadiumQuarry;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class VanadiumQuarry extends AbstractEngineeringBlocks {
    public static boolean isActivated = false;

    public VanadiumQuarry(Material material) {
        super(material);

        this.setBlockName("vanadiumQuarry");
    }

    @Override
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        isActivated = true;
        return isActivated;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileEntityVanadiumQuarry();
    }
}
