
package net.mcreator.mythrilarmament.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MythrilIngotItem extends Item {
	public MythrilIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
