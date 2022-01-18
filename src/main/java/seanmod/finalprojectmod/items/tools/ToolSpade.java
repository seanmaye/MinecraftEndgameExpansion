package seanmod.tutorial.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import seanmod.tutorial.init.ModItems;
import seanmod.tutorial.main.FinalProjectMod;
import seanmod.tutorial.main.IHasModel;

public class ToolSpade extends ItemSpade implements IHasModel {
	
	public ToolSpade(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		FinalProjectMod.proxy.registerItemRenderer(this, 0, "inventory");
		
	}


}
