package net.mcreator.rutielolmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rutielolmod.RutielolModMod;

import java.util.Map;

public class RadiatieEffectOnPotionActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RutielolModMod.LOGGER.warn("Failed to load dependency entity for procedure RadiatieEffectOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("radiation").setDamageBypassesArmor(),
						(float) (2 + Math.round(Math.random() * 2)));
			}
		}
	}
}
