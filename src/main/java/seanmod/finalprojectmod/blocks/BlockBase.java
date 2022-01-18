package seanmod.tutorial.blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import seanmod.tutorial.init.ModBlocks;
import seanmod.tutorial.init.ModItems;
import seanmod.tutorial.main.FinalProjectMod;
import seanmod.tutorial.main.IHasModel;

public class BlockBase extends Block implements IHasModel{
	
public BlockBase(String name, Material material) {
	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MATERIALS);
	
	ModBlocks.BLOCKS.add(this);
	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}

@Override
public void registerModels() {
	FinalProjectMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
}
}
