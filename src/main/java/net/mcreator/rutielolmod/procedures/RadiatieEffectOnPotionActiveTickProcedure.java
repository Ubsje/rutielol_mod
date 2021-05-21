package net.mcreator.rutielolmod.procedures;

@RutielolModModElements.ModElement.Tag
public class RadiatieEffectOnPotionActiveTickProcedure extends RutielolModModElements.ModElement {

	public RadiatieEffectOnPotionActiveTickProcedure(RutielolModModElements instance) {
		super(instance, 2);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RutielolModMod.LOGGER.warn("Failed to load dependency entity for procedure RadiatieEffectOnPotionActiveTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((Math.random() < 0.2)) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).attackEntityFrom(new DamageSource("radiation").setDamageBypassesArmor(),
						(float) (2 + Math.round((Math.random() * 2))));
			}
		}

	}

}
