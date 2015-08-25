package com.jtmnf.abstractengineering.world;

import com.jtmnf.abstractengineering.register.RegisterBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGen implements IWorldGenerator {
   private WorldGenerator ore;

    public WorldGen(){
        this.ore = new WorldGenMinable(RegisterBlocks.oreManganese, 10);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case 0:
                this.generateOreInWorld(this.ore, world, random, chunkX, chunkZ, 15, 0, 64);
                break;
            default:
                break;
        }
    }

    private void generateOreInWorld(WorldGenerator generator, World world, Random random, int x, int z, int chances, int min, int max){
        int diff = max - min + 1;

        for(int i = 0; i < chances; ++i){
            generator.generate(world, random, (x*16+random.nextInt(16)), (min+random.nextInt(diff)), (z*16+random.nextInt(16)));
        }
    }
}
