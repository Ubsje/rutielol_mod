package net.mcreator.rutielolmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rutielolmod.potion.RadiatieEffectPotionEffect;
import net.mcreator.rutielolmod.RutielolModMod;

import java.util.Map;

public class UraniumFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RutielolModMod.LOGGER.warn("Failed to load dependency entity for procedure UraniumFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(RadiatieEffectPotionEffect.potion, (int) 600, (int) 0));
	}
}
