package net.mcreator.rutielolmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.rutielolmod.RutielolModModElements;
import net.mcreator.rutielolmod.RutielolModMod;

import java.util.Map;

@RutielolModModElements.ModElement.Tag
public class MitchuOnEntityTickUpdateProcedure extends RutielolModModElements.ModElement {
	public MitchuOnEntityTickUpdateProcedure(RutielolModModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RutielolModMod.LOGGER.warn("Failed to load dependency x for procedure MitchuOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RutielolModMod.LOGGER.warn("Failed to load dependency y for procedure MitchuOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RutielolModMod.LOGGER.warn("Failed to load dependency z for procedure MitchuOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RutielolModMod.LOGGER.warn("Failed to load dependency world for procedure MitchuOnEntityTickUpdate!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.CLOUD, x, (y + 0.5), z, (int) 3, 0.2, 0.2, 0.2, 0);
		}
		if ((Math.random() < 0.01)) {
			if ((Math.random() < 0.02)) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"summon falling_block ~ ~ ~ {BlockState:{Name:\"rutielol_mod:mitchu_ei\"},Time:1}");
				}
			}
		}
	}
}
