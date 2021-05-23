package net.mcreator.rutielolmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.rutielolmod.RutielolModModElements;
import net.mcreator.rutielolmod.RutielolModMod;

import java.util.Map;

@RutielolModModElements.ModElement.Tag
public class ManexNoteblockOnBlockRightClickedProcedure extends RutielolModModElements.ModElement {
	public ManexNoteblockOnBlockRightClickedProcedure(RutielolModModElements instance) {
		super(instance, 88);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RutielolModMod.LOGGER.warn("Failed to load dependency x for procedure ManexNoteblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RutielolModMod.LOGGER.warn("Failed to load dependency y for procedure ManexNoteblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RutielolModMod.LOGGER.warn("Failed to load dependency z for procedure ManexNoteblockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RutielolModMod.LOGGER.warn("Failed to load dependency world for procedure ManexNoteblockOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) (y + 0.9), (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rutielol_mod:tuu")),
					SoundCategory.NEUTRAL, (float) 1, (float) 0.9);
		} else {
			((World) world).playSound(x, (y + 0.9), z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("rutielol_mod:tuu")),
					SoundCategory.NEUTRAL, (float) 1, (float) 0.9, false);
		}
		world.addParticle(ParticleTypes.NOTE, x, (y + 1), z, 0, 1, 0);
	}
}
