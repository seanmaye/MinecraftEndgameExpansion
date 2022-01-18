package seanmod.tutorial.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PurebalanceOre extends BlockBase {

	public PurebalanceOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(45.0F);
		setHarvestLevel("pickaxe",3);
		setLightLevel(10.0F);
	}

}
