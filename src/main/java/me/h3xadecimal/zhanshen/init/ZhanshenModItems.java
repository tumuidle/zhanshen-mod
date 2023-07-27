
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.h3xadecimal.zhanshen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import me.h3xadecimal.zhanshen.item.StarshineSaberItem;
import me.h3xadecimal.zhanshen.item.NWBadageItem;
import me.h3xadecimal.zhanshen.item.MurakumoItem;
import me.h3xadecimal.zhanshen.item.ImmortalDomainItem;
import me.h3xadecimal.zhanshen.ZhanshenMod;

public class ZhanshenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ZhanshenMod.MODID);
	public static final RegistryObject<Item> NW_BADAGE = REGISTRY.register("nw_badage", () -> new NWBadageItem());
	public static final RegistryObject<Item> IMMORTAL_DOMAIN = REGISTRY.register("immortal_domain", () -> new ImmortalDomainItem());
	public static final RegistryObject<Item> STARSHINE_SABER = REGISTRY.register("starshine_saber", () -> new StarshineSaberItem());
	public static final RegistryObject<Item> MURAKUMO = REGISTRY.register("murakumo", () -> new MurakumoItem());
}
