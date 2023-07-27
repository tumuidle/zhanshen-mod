
package me.h3xadecimal.zhanshen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import me.h3xadecimal.zhanshen.procedures.MurakumoAttackProcedure;

import java.util.List;

public class MurakumoItem extends SwordItem {
	public MurakumoItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MurakumoAttackProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u65E0\u7269\u4E0D\u53EF\u65A9"));
		list.add(Component.literal("\u5B9E\u9645\u4F24\u5BB31000,\u65E0\u89C6\u4E00\u5207\u62A4\u7532"));
		list.add(Component.literal("\u76EE\u6807\u5E26\u6709\u4E0D\u673D\u65F6\u4F24\u5BB3\u51CF\u534A"));
	}
}
