package net.mcreator.rutielolmod.procedures;

@RutielolModModElements.ModElement.Tag
public class UraniumFoodEatenProcedure extends RutielolModModElements.ModElement {

	public UraniumFoodEatenProcedure(RutielolModModElements instance) {
		super(instance, 76);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RutielolModMod.LOGGER.warn("Failed to load dependency entity for procedure UraniumFoodEaten!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(RadiatieEffectPotion.potion, (int) 600, (int) 0));

	}

}
