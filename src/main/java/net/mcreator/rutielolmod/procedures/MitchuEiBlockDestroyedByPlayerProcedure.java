package net.mcreator.rutielolmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.rutielolmod.entity.BabyMitchuEntity;
import net.mcreator.rutielolmod.RutielolModMod;

import java.util.Map;

public class MitchuEiBlockDestroyedByPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RutielolModMod.LOGGER.warn("Failed to load dependency world for procedure MitchuEiBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RutielolModMod.LOGGER.warn("Failed to load dependency x for procedure MitchuEiBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RutielolModMod.LOGGER.warn("Failed to load dependency y for procedure MitchuEiBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RutielolModMod.LOGGER.warn("Failed to load dependency z for procedure MitchuEiBlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new BabyMitchuEntity.CustomEntity(BabyMitchuEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles((x + 0.5), y, (z + 0.5), (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			entityToSpawn.setRotationYawHead((float) 0);
			entityToSpawn.setMotion(0.1, 0.4, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new BabyMitchuEntity.CustomEntity(BabyMitchuEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles((x + 0.5), y, (z + 0.5), (float) 0, (float) 0);
			entityToSpawn.setRenderYawOffset((float) 0);
			entityToSpawn.setRotationYawHead((float) 0);
			entityToSpawn.setMotion((-0.1), 0.4, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) (x + 0.5), (int) y, (int) (z + 0.5)),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rutielol_mod:mitchu_spawn")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound((x + 0.5), y, (z + 0.5),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rutielol_mod:mitchu_spawn")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
