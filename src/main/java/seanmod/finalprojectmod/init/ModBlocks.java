package seanmod.tutorial.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import seanmod.tutorial.blocks.BlockBase;
import seanmod.tutorial.blocks.PurebalanceOre;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block PUREBALANCE_ORE = new PurebalanceOre("purebalance_ore", Material.IRON);

}
