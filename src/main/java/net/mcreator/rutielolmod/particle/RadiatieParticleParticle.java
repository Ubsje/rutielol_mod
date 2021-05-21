
package net.mcreator.rutielolmod.particle;

@RutielolModModElements.ModElement.Tag
public class RadiatieParticleParticle extends RutielolModModElements.ModElement {

	public static final BasicParticleType particle = new BasicParticleType(false);

	public RadiatieParticleParticle(RutielolModModElements instance) {
		super(instance, 1);

		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerParticleType(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().register(particle.setRegistryName("radiatie_particle"));
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public void registerParticle(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particles.registerFactory(particle, CustomParticleFactory::new);
	}

	@OnlyIn(Dist.CLIENT)
	private static class CustomParticle extends SpriteTexturedParticle {

		private final IAnimatedSprite spriteSet;
		private float angularVelocity;
		private float angularAcceleration;

		protected CustomParticle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz, IAnimatedSprite spriteSet) {
			super(world, x, y, z);
			this.spriteSet = spriteSet;

			this.setSize((float) 0.2, (float) 0.2);
			this.particleScale *= (float) 0.5;

			this.maxAge = (int) Math.max(1, 16 + (this.rand.nextInt(8) - 4));

			this.particleGravity = (float) -0.2;
			this.canCollide = false;

			this.motionX = vx * 1;
			this.motionY = vy * 1;
			this.motionZ = vz * 1;

			this.angularVelocity = (float) 0.5;
			this.angularAcceleration = (float) -0.05;

			this.selectSpriteRandomly(spriteSet);
		}

		@Override
		public IParticleRenderType getRenderType() {
			return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
		}

		@Override
		public void tick() {
			super.tick();

			this.prevParticleAngle = this.particleAngle;
			this.particleAngle += this.angularVelocity;
			this.angularVelocity += this.angularAcceleration;

		}

	}

	@OnlyIn(Dist.CLIENT)
	private static class CustomParticleFactory implements IParticleFactory<BasicParticleType> {
		private final IAnimatedSprite spriteSet;

		public CustomParticleFactory(IAnimatedSprite spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new CustomParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

}
