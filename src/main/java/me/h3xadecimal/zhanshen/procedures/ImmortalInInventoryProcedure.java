package me.h3xadecimal.zhanshen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import me.h3xadecimal.zhanshen.init.ZhanshenModMobEffects;

public class ImmortalInInventoryProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(ZhanshenModMobEffects.IMMORTAL.get(), 60, 1));
	}
}
