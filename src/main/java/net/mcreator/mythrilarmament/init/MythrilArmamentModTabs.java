
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythrilarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythrilarmament.MythrilArmamentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MythrilArmamentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MythrilArmamentMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYTHRIL_ARMAMENTTAB = REGISTRY.register("mythril_armamenttab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mythril_armament.mythril_armamenttab")).icon(() -> new ItemStack(MythrilArmamentModItems.MYTHRIL_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MythrilArmamentModItems.MYTHRIL_INGOT.get());
				tabData.accept(MythrilArmamentModBlocks.MYTHRIL_ORE.get().asItem());
				tabData.accept(MythrilArmamentModBlocks.MYTHRIL_BLOCK.get().asItem());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_AXE.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_SWORD.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_SHOVEL.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_HOE.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_HELMET.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_CHESTPLATE.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_LEGGINGS.get());
				tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_BOOTS.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MythrilArmamentModItems.MYTHRIL_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MythrilArmamentModBlocks.MYTHRIL_ORE.get().asItem());
			tabData.accept(MythrilArmamentModBlocks.MYTHRIL_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MythrilArmamentModBlocks.MYTHRIL_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MythrilArmamentModItems.MYTHRIL_PICKAXE.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_AXE.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_SHOVEL.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_HOE.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_HELMET.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_CHESTPLATE.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_LEGGINGS.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MythrilArmamentModItems.MYTHRIL_SWORD.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_HELMET.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_CHESTPLATE.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_LEGGINGS.get());
			tabData.accept(MythrilArmamentModItems.MYTHRIL_ARMOR_BOOTS.get());
		}
	}
}
