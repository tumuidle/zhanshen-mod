package me.h3xadecimal.zhanshen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import me.h3xadecimal.zhanshen.init.ZhanshenModMobEffects;
import me.h3xadecimal.zhanshen.init.ZhanshenModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TImmortalOnAttackProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, Entity sourceentity, double amount) {
		execute(null, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ZhanshenModItems.MURAKUMO.get())) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ZhanshenModMobEffects.IMMORTAL.get()) ? _livEnt.getEffect(ZhanshenModMobEffects.IMMORTAL.get()).getAmplifier() : 0) != 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount));
			}
		}
	}
}
