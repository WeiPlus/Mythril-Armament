
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythrilarmament.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mythrilarmament.block.MythrilOreBlock;
import net.mcreator.mythrilarmament.block.MythrilBlockBlock;
import net.mcreator.mythrilarmament.block.DeepslateMythrilOreBlock;
import net.mcreator.mythrilarmament.MythrilArmamentMod;

public class MythrilArmamentModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MythrilArmamentMod.MODID);
	public static final RegistryObject<Block> MYTHRIL_ORE = REGISTRY.register("mythril_ore", () -> new MythrilOreBlock());
	public static final RegistryObject<Block> MYTHRIL_BLOCK = REGISTRY.register("mythril_block", () -> new MythrilBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_MYTHRIL_ORE = REGISTRY.register("deepslate_mythril_ore", () -> new DeepslateMythrilOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
