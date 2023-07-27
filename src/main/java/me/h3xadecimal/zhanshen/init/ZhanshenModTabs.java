
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.h3xadecimal.zhanshen.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ZhanshenModTabs {
	public static CreativeModeTab TAB_DOMAIN;
	public static CreativeModeTab TAB_PROHIBITED_SUBSTANCE;
	public static CreativeModeTab TAB_ARTIFACT;

	public static void load() {
		TAB_DOMAIN = new CreativeModeTab("tabdomain") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZhanshenModItems.IMMORTAL_DOMAIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_PROHIBITED_SUBSTANCE = new CreativeModeTab("tabprohibited_substance") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BARRIER);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ARTIFACT = new CreativeModeTab("tabartifact") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ZhanshenModItems.MURAKUMO.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
