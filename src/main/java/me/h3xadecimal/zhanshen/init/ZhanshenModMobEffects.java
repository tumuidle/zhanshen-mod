
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.h3xadecimal.zhanshen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import me.h3xadecimal.zhanshen.potion.ImmortalMobEffect;
import me.h3xadecimal.zhanshen.potion.DemonGuideMobEffect;
import me.h3xadecimal.zhanshen.ZhanshenMod;

public class ZhanshenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ZhanshenMod.MODID);
	public static final RegistryObject<MobEffect> IMMORTAL = REGISTRY.register("immortal", () -> new ImmortalMobEffect());
	public static final RegistryObject<MobEffect> DEMON_GUIDE = REGISTRY.register("demon_guide", () -> new DemonGuideMobEffect());
}
