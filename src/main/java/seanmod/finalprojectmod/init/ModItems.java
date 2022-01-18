package seanmod.tutorial.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import seanmod.tutorial.armor.ArmorBase;
import seanmod.tutorial.items.ItemBase;
import seanmod.tutorial.items.tools.ToolAxe;
import seanmod.tutorial.items.tools.ToolHoe;
import seanmod.tutorial.items.tools.ToolPickaxe;
import seanmod.tutorial.items.tools.ToolSpade;
import seanmod.tutorial.items.tools.ToolSword;
import seanmod.tutorial.main.Reference;

public class ModItems {

	public static final List <Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial MATERIAL_PUREBALANCE = EnumHelper.addToolMaterial("material_purebalance", 3, 4200, 10.0F, 4.0F, 16);
	public static final ToolMaterial MATERIAL_DEMONIC = EnumHelper.addToolMaterial("material_demonic", 3, 5000, 12.0F, 6.0F, 18);
	public static final ToolMaterial MATERIAL_SCHAMA = EnumHelper.addToolMaterial("material_schama", 3, 10000, 99.0F, 99.0F, 20);
	
	public static ArmorMaterial ARMOR_DEMONIC = EnumHelper.addArmorMaterial("armor_demonic", Reference.MODID + ":demonic", 40, new int[]{5, 8, 10, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	//Items
	public static final Item PUREBALANCE_INGOT = new ItemBase("purebalance_ingot");
	public static final Item DEMONIC_INGOT = new ItemBase("demonic_ingot");
	
	
	
	//Tools
	
	//PureBalance
	public static final ItemSword PUREBALANCE_SWORD = new ToolSword("purebalance_sword", MATERIAL_PUREBALANCE);
	public static final ItemSpade PUREBALANCE_SHOVEL = new ToolSpade("purebalance_shovel", MATERIAL_PUREBALANCE);
	public static final ItemPickaxe PUREBALANCE_PICKAXE = new ToolPickaxe("purebalance_pickaxe", MATERIAL_PUREBALANCE);
	public static final ItemAxe PUREBALANCE_AXE = new ToolAxe("purebalance_axe", MATERIAL_PUREBALANCE);
	public static final ItemHoe PUREBALANCE_HOE = new ToolHoe("purebalance_hoe", MATERIAL_PUREBALANCE);
	
	//Molten
	public static final ItemSword DEMONIC_SWORD = new ToolSword("demonic_sword", MATERIAL_DEMONIC);
	public static final ItemSpade DEMONIC_SHOVEL = new ToolSpade("demonic_shovel", MATERIAL_DEMONIC);
	public static final ItemPickaxe DEMONIC_PICKAXE = new ToolPickaxe("demonic_pickaxe", MATERIAL_DEMONIC);
	public static final ItemAxe DEMONIC_AXE = new ToolAxe("demonic_axe", MATERIAL_DEMONIC);
	public static final ItemHoe DEMONIC_HOE = new ToolHoe("demonic_hoe", MATERIAL_DEMONIC);
	
	//Armor
	public static final Item HELMET_DEMONIC = new ArmorBase("helmet_demonic", ARMOR_DEMONIC, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_DEMONIC = new ArmorBase("chestplate_demonic", ARMOR_DEMONIC, 1,EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_DEMONIC = new ArmorBase("leggings_demonic", ARMOR_DEMONIC, 2,EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_DEMONIC = new ArmorBase("boots_demonic", ARMOR_DEMONIC,1,EntityEquipmentSlot.FEET);
	
	//Special (Schama)
	
	public static final ItemSword MOTIVATION_STICK = new ToolSword("motivation_stick", MATERIAL_SCHAMA);
	
	
	
	
}
