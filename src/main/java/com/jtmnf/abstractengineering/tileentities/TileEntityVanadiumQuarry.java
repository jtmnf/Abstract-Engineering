package com.jtmnf.abstractengineering.tileentities;

import com.jtmnf.abstractengineering.blocks.VanadiumQuarry;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityVanadiumQuarry extends TileEntity {

    private int currentX;
    private int currentY;
    private int currentZ;

    private int time = 0;

    public TileEntityVanadiumQuarry(){
    }

    @Override
    public void updateEntity() {
        if(!worldObj.isRemote){
            if(currentX == 0 && currentY == 0 && currentZ == 0){
                initialize();
            }
            if(time % 2 == 0) {
                time = 0;

                Block block = worldObj.getBlock(xCoord, yCoord, zCoord);
                if (block instanceof VanadiumQuarry) {

                    VanadiumQuarry vanadiumQuarry = (VanadiumQuarry) block;

                    if (vanadiumQuarry.isActivated) {
                        worldObj.playSoundEffect((double)currentX + 0.5D, (double)currentY + 0.5D, (double)currentZ + 0.5D, worldObj.getBlock(currentX, currentY, currentZ).stepSound.func_150496_b(), 1.0F, worldObj.rand.nextFloat() * 0.1F + 0.9F);
                        dropBlock(worldObj.getBlock(currentX, currentY, currentZ));
                        worldObj.setBlock(currentX, currentY, currentZ, Blocks.air);
                    }
                }
            }
            time++;
        }
    }

    public void initialize(){
        currentX = xCoord;
        currentY = yCoord-1;
        currentZ = zCoord;
    }

    public void dropBlock(Block block){
        TileEntity aux = worldObj.getTileEntity(xCoord, yCoord+1, zCoord);
        ItemStack itemStack = new ItemStack(block);

        if(aux instanceof ISidedInventory){
            ISidedInventory sidedInventory = (ISidedInventory)aux;

            for(int i = 0; i < sidedInventory.getSizeInventory(); ++i){
                if(sidedInventory.getStackInSlot(i) == null){
                    sidedInventory.setInventorySlotContents(i, itemStack);
                    break;
                }
                if(Block.getBlockFromItem(sidedInventory.getStackInSlot(i).getItem()).equals(block) && (sidedInventory.getStackInSlot(i).stackSize + itemStack.stackSize) < sidedInventory.getInventoryStackLimit()){
                    sidedInventory.setInventorySlotContents(i, new ItemStack(block, sidedInventory.getStackInSlot(i).stackSize + itemStack.stackSize));
                    break;
                }
            }
        }
        else if(aux instanceof IInventory) {
            IInventory iInventory = (IInventory) aux;

            for (int i = 0; i < iInventory.getSizeInventory(); ++i) {
                if (iInventory.getStackInSlot(i) == null) {
                    iInventory.setInventorySlotContents(i, itemStack);
                    break;
                }

                if (Block.getBlockFromItem(iInventory.getStackInSlot(i).getItem()).equals(block) && (iInventory.getStackInSlot(i).stackSize + itemStack.stackSize) <= iInventory.getInventoryStackLimit()) {
                    iInventory.setInventorySlotContents(i, new ItemStack(block, iInventory.getStackInSlot(i).stackSize + itemStack.stackSize));
                    break;
                }
            }
        }
        else {
            float spawnX = xCoord + worldObj.rand.nextFloat();
            float spawnY = yCoord + worldObj.rand.nextFloat();
            float spawnZ = zCoord + worldObj.rand.nextFloat();

            EntityItem droppedItem = new EntityItem(worldObj, spawnX, spawnY, spawnZ, new ItemStack(block));

            float mult = 0.05F;

            droppedItem.motionY = (-0.5F + worldObj.rand.nextFloat()) * mult;
            droppedItem.motionY = (4 + worldObj.rand.nextFloat()) * mult;
            droppedItem.motionZ = (-0.5F + worldObj.rand.nextFloat()) * mult;

            worldObj.spawnEntityInWorld(droppedItem);
        }
    }
}
