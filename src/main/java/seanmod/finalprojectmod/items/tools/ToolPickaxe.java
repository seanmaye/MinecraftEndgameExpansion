package seanmod.tutorial.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import seanmod.tutorial.init.ModItems;
import seanmod.tutorial.main.FinalProjectMod;
import seanmod.tutorial.main.IHasModel;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	public ToolPickaxe(String name, ToolMaterial material) {
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
