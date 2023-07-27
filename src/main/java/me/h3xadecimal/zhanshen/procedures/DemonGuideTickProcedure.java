package me.h3xadecimal.zhanshen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import me.h3xadecimal.zhanshen.init.ZhanshenModMobEffects;

public class DemonGuideTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ZhanshenModMobEffects.DEMON_GUIDE.get()) ? _livEnt.getEffect(ZhanshenModMobEffects.DEMON_GUIDE.get()).getDuration() : 0) <= 5) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			entity.hurt(DamageSource.GENERIC, 32767);
		}
	}
}
