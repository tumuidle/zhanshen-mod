
package me.h3xadecimal.zhanshen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import me.h3xadecimal.zhanshen.procedures.ImmortalInInventoryProcedure;
import me.h3xadecimal.zhanshen.init.ZhanshenModTabs;

public class ImmortalDomainItem extends Item {
	public ImmortalDomainItem() {
		super(new Item.Properties().tab(ZhanshenModTabs.TAB_PROHIBITED_SUBSTANCE).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		ImmortalInInventoryProcedure.execute(entity);
	}
}
