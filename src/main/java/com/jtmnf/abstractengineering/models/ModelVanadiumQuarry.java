package com.jtmnf.abstractengineering.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVanadiumQuarry extends ModelBase {
    ModelRenderer PowerTap;
    ModelRenderer Main;
    ModelRenderer ItemTap;

    public ModelVanadiumQuarry(){
        textureWidth = 64;
        textureHeight = 64;

        PowerTap = new ModelRenderer(this, 0, 52);
        PowerTap.addBox(0F, 0F, 0F, 1, 6, 6);
        PowerTap.setRotationPoint(-8F, 13F, -3F);
        PowerTap.setTextureSize(64, 64);
        PowerTap.mirror = true;
        setRotation(PowerTap, 0F, 0F, 0F);
        Main = new ModelRenderer(this, 0, 0);
        Main.addBox(0F, 0F, 0F, 14, 15, 14);
        Main.setRotationPoint(-7F, 9F, -7F);
        Main.setTextureSize(64, 64);
        Main.mirror = true;
        setRotation(Main, 0F, 0F, 0F);
        ItemTap = new ModelRenderer(this, 14, 52);
        ItemTap.addBox(0F, 0F, 0F, 1, 6, 6);
        ItemTap.setRotationPoint(7F, 13F, -3F);
        ItemTap.setTextureSize(64, 64);
        ItemTap.mirror = true;
        setRotation(ItemTap, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        PowerTap.render(f5);
        Main.render(f5);
        ItemTap.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
