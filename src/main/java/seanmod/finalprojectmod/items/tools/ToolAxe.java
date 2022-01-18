package seanmod.tutorial.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import seanmod.tutorial.init.ModItems;
import seanmod.tutorial.main.FinalProjectMod;
import seanmod.tutorial.main.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material) {
		super(material, 8.0F, -3.2F);
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
