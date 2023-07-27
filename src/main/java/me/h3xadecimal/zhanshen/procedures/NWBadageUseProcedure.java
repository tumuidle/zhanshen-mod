package me.h3xadecimal.zhanshen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import me.h3xadecimal.zhanshen.init.ZhanshenModMobEffects;

public class NWBadageUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ZhanshenModMobEffects.DEMON_GUIDE.get()) : false) {
			entity.hurt(DamageSource.GENERIC, 65535);
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(ZhanshenModMobEffects.DEMON_GUIDE.get(), 6000, 1));
		}
	}
}
