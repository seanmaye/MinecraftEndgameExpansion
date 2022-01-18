package seanmod.tutorial.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import seanmod.tutorial.init.ModItems;
import seanmod.tutorial.main.FinalProjectMod;
import seanmod.tutorial.main.IHasModel;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		FinalProjectMod.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
