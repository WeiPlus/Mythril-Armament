
package net.mcreator.mythrilarmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.mythrilarmament.init.MythrilArmamentModItems;

public class MythrilSwordItem extends SwordItem {
	public MythrilSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 4.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MythrilArmamentModItems.MYTHRIL_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties());
	}
}
