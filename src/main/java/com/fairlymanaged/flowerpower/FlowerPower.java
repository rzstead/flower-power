package com.fairlymanaged.flowerpower;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fairlymanaged.flowerpower.proxy.ProxyCommon;

@Mod(modid = FlowerPower.MODID, name = FlowerPower.NAME, version = FlowerPower.VERSION)
public class FlowerPower
{
    public static final String MODID = "flowerpower";
    public static final String NAME = "Flower Power";
    public static final String VERSION = "0.0.1";
    public static final String PROXY_CLIENT = "com.fairlymanaged.flowerpower.proxy.ProxyClient";
    public static final String PROXY_COMMON = "com.fairlymanaged.flowerpower.proxy.ProxyCommon";
    private static final Logger logger = LogManager.getLogger(MODID);
    
    @SidedProxy(clientSide = PROXY_CLIENT, serverSide = PROXY_COMMON)
    public static ProxyCommon proxy;
    
    @Mod.Instance
    public static FlowerPower _this;
    
    @SubscribeEvent
    void registerBlocks(RegistryEvent.Register<Block> event) {
    	//event.getRegistry().register(petalBlock);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger.info("Starting pre-initialization");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	logger.info("Starting initialization");
        proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	logger.info("Starting post-initialization");
        proxy.postInit(event);
    }
}
