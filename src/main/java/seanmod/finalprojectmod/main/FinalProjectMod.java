package seanmod.tutorial.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

import seanmod.tutorial.init.ModRecipes;
import seanmod.tutorial.main.Reference;
import seanmod.tutorial.proxy.CommonProxy;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = "[1.12]")




public class FinalProjectMod {
	
	@Instance
	public static FinalProjectMod instance;
	
@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
public static CommonProxy proxy;

@EventHandler
public static void preInit(FMLPreInitializationEvent event) {
	
}
@EventHandler
public static void init(FMLInitializationEvent event) {
	ModRecipes.init();
}
@EventHandler
public static void postInit(FMLPostInitializationEvent event) {
	
}
}



