package init;

import java.util.ArrayList;
import java.util.List;

import com.fairlymanaged.flowerpower.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item hyacinth = new ItemBase("hyacinth");
	
	
}
