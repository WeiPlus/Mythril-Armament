
package net.mcreator.mythrilarmament.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.mythrilarmament.init.MythrilArmamentModItems;

public class MythrilAxeItem extends AxeItem {
	public MythrilAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 10f;
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
		}, 1, -3f, new Item.Properties());
	}
}
