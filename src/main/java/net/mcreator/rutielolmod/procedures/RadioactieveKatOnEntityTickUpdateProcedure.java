package net.mcreator.rutielolmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.rutielolmod.potion.RadiatieEffectPotion;
import net.mcreator.rutielolmod.particle.RadiatieParticleParticle;
import net.mcreator.rutielolmod.RutielolModModElements;
import net.mcreator.rutielolmod.RutielolModMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@RutielolModModElements.ModElement.Tag
public class RadioactieveKatOnEntityTickUpdateProcedure extends RutielolModModElements.ModElement {
	public RadioactieveKatOnEntityTickUpdateProcedure(RutielolModModElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RutielolModMod.LOGGER.warn("Failed to load dependency x for procedure RadioactieveKatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RutielolModMod.LOGGER.warn("Failed to load dependency y for procedure RadioactieveKatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RutielolModMod.LOGGER.warn("Failed to load dependency z for procedure RadioactieveKatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RutielolModMod.LOGGER.warn("Failed to load dependency world for procedure RadioactieveKatOnEntityTickUpdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
			((LivingEntity) ((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)))
							.addPotionEffect(new EffectInstance(RadiatieEffectPotion.potion, (int) 200, (int) 0));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(RadiatieParticleParticle.particle, x, y, z, (int) 2, 0.2, 0.2, 0.2, 0.05);
		}
	}
}
