package com.fairlymanaged.flowerpower;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = FlowerPower.MODID, name = FlowerPower.NAME, version = FlowerPower.VERSION)
public class FlowerPower
{
    public static final String MODID = "flowerpower";
    public static final String NAME = "Flower Power";
    public static final String VERSION = "0.0.1";

    private static Logger logger;
    
    private Block petalBlock;
    
    @SubscribeEveRegistryEvent<IForgeRegistryEntry<T>>c void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(petalBlock);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
