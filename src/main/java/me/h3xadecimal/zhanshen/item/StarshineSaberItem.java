
package me.h3xadecimal.zhanshen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import me.h3xadecimal.zhanshen.init.ZhanshenModTabs;

import java.util.List;

public class StarshineSaberItem extends SwordItem {
	public StarshineSaberItem() {
		super(new Tier() {
			public int getUses() {
				return 32767;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 6f, new Item.Properties().tab(ZhanshenModTabs.TAB_PROHIBITED_SUBSTANCE).fireResistant());
	}

	@Override
	public boolean hasCraftingRemainingItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u5C0F\u5B50\uFF0C\u4F60\u770B\u597D\u4E86\u3002\u8FD9\u4E00\u5200...\u4F1A\u5F88\u5E05"));
	}
}
