
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.h3xadecimal.zhanshen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import me.h3xadecimal.zhanshen.enchantment.TimeRuleEnchantment;
import me.h3xadecimal.zhanshen.enchantment.SaberRuleEnchantment;
import me.h3xadecimal.zhanshen.ZhanshenMod;

public class ZhanshenModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ZhanshenMod.MODID);
	public static final RegistryObject<Enchantment> TIME_RULE = REGISTRY.register("time_rule", () -> new TimeRuleEnchantment());
	public static final RegistryObject<Enchantment> SABER_RULE = REGISTRY.register("saber_rule", () -> new SaberRuleEnchantment());
}
