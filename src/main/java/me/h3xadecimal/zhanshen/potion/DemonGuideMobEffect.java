
package me.h3xadecimal.zhanshen.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import me.h3xadecimal.zhanshen.procedures.DemonGuideTickProcedure;
import me.h3xadecimal.zhanshen.procedures.DemonGuideStartProcedure;

public class DemonGuideMobEffect extends MobEffect {
	public DemonGuideMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.zhanshen.demon_guide";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		DemonGuideStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DemonGuideTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
