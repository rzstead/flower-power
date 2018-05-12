package com.fairlymanaged.flowerpower.items;

import com.fairlymanaged.flowerpower.FlowerPower;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		FlowerPower.proxy.registerItemRenderer(this, 0, "inventory");	
	}

}
