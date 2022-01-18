package seanmod.tutorial.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import seanmod.tutorial.init.ModBlocks;
import seanmod.tutorial.init.ModItems;
import net.minecraft.init.Blocks;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.PUREBALANCE_ORE, new ItemStack(ModItems.PUREBALANCE_INGOT, 1), 2.0F);
	}

}
