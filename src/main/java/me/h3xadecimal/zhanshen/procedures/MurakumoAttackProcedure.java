package me.h3xadecimal.zhanshen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import me.h3xadecimal.zhanshen.init.ZhanshenModMobEffects;

public class MurakumoAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ZhanshenModMobEffects.IMMORTAL.get()) : false) {
			entity.hurt(DamageSource.GENERIC, 500);
		} else {
			entity.hurt(DamageSource.GENERIC, 1000);
		}
	}
}
