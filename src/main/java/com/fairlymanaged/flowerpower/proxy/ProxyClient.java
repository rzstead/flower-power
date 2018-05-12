package com.fairlymanaged.flowerpower.proxy;

import com.fairlymanaged.flowerpower.items.ItemBase;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class ProxyClient extends ProxyCommon {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
	}
	@Override
	public void init(FMLInitializationEvent event) {
	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}
	@Override
	public void serverStarting(FMLServerStartingEvent event) {
	}
	@Override
	public void serverStopping(FMLServerStoppingEvent event) {
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
}
