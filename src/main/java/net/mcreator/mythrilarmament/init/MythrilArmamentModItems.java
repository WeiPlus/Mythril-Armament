
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythrilarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mythrilarmament.item.MythrilSwordItem;
import net.mcreator.mythrilarmament.item.MythrilShovelItem;
import net.mcreator.mythrilarmament.item.MythrilPickaxeItem;
import net.mcreator.mythrilarmament.item.MythrilIngotItem;
import net.mcreator.mythrilarmament.item.MythrilHoeItem;
import net.mcreator.mythrilarmament.item.MythrilAxeItem;
import net.mcreator.mythrilarmament.item.MythrilArmorItem;
import net.mcreator.mythrilarmament.MythrilArmamentMod;

public class MythrilArmamentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MythrilArmamentMod.MODID);
	public static final RegistryObject<Item> MYTHRIL_INGOT = REGISTRY.register("mythril_ingot", () -> new MythrilIngotItem());
	public static final RegistryObject<Item> MYTHRIL_ORE = block(MythrilArmamentModBlocks.MYTHRIL_ORE);
	public static final RegistryObject<Item> MYTHRIL_BLOCK = block(MythrilArmamentModBlocks.MYTHRIL_BLOCK);
	public static final RegistryObject<Item> MYTHRIL_PICKAXE = REGISTRY.register("mythril_pickaxe", () -> new MythrilPickaxeItem());
	public static final RegistryObject<Item> MYTHRIL_AXE = REGISTRY.register("mythril_axe", () -> new MythrilAxeItem());
	public static final RegistryObject<Item> MYTHRIL_SWORD = REGISTRY.register("mythril_sword", () -> new MythrilSwordItem());
	public static final RegistryObject<Item> MYTHRIL_SHOVEL = REGISTRY.register("mythril_shovel", () -> new MythrilShovelItem());
	public static final RegistryObject<Item> MYTHRIL_HOE = REGISTRY.register("mythril_hoe", () -> new MythrilHoeItem());
	public static final RegistryObject<Item> MYTHRIL_ARMOR_HELMET = REGISTRY.register("mythril_armor_helmet", () -> new MythrilArmorItem.Helmet());
	public static final RegistryObject<Item> MYTHRIL_ARMOR_CHESTPLATE = REGISTRY.register("mythril_armor_chestplate", () -> new MythrilArmorItem.Chestplate());
	public static final RegistryObject<Item> MYTHRIL_ARMOR_LEGGINGS = REGISTRY.register("mythril_armor_leggings", () -> new MythrilArmorItem.Leggings());
	public static final RegistryObject<Item> MYTHRIL_ARMOR_BOOTS = REGISTRY.register("mythril_armor_boots", () -> new MythrilArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
