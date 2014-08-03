package net.waschtl.moddingtest.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.waschtl.moddingtest.item.ItemMT;
import net.waschtl.moddingtest.item.ItemRedstoneSchwert;
import net.waschtl.moddingtest.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	public static final ItemMT redstoneSchwert = new ItemRedstoneSchwert();
	
	public static void init(){
		
		GameRegistry.registerItem(redstoneSchwert, "redstoneSchwert");
	}
}
