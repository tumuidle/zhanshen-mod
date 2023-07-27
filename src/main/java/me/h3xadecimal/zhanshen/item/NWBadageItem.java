
package me.h3xadecimal.zhanshen.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import me.h3xadecimal.zhanshen.procedures.NWBadageUseProcedure;
import me.h3xadecimal.zhanshen.init.ZhanshenModTabs;

import java.util.List;

public class NWBadageItem extends Item {
	public NWBadageItem() {
		super(new Item.Properties().tab(ZhanshenModTabs.TAB_PROHIBITED_SUBSTANCE).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u82E5\u9EEF\u591C\u7EC8\u4E34"));
		list.add(Component.literal("\u543E\u5FC5\u7ACB\u4E8E\u4E07\u4E07\u4EBA\u524D"));
		list.add(Component.literal("\u6A2A\u5200\u5411\u6E0A"));
		list.add(Component.literal("\u8840\u67D3\u82CD\u7A79\uFF01"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NWBadageUseProcedure.execute(entity);
		return retval;
	}
}
