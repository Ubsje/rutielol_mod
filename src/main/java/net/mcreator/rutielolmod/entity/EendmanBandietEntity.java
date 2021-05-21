
package net.mcreator.rutielolmod.entity;

import net.minecraft.block.material.Material;

@RutielolModModElements.ModElement.Tag
public class EendmanBandietEntity extends RutielolModModElements.ModElement {

	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.5999999999999999f)).build("eendman_bandiet").setRegistryName("eendman_bandiet");

	public EendmanBandietEntity(RutielolModModElements instance) {
		super(instance, 41);

		FMLJavaModLoadingContext.get().getModEventBus().register(new EendmanBandietRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());

	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);

		elements.items.add(() -> new SpawnEggItem(entity, -6710887, -256, new Item.Properties().group(ItemGroup.MISC))
				.setRegistryName("eendman_bandiet_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {

	}

	private static class EntityAttributesRegisterHandler {

		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 15);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 2);

			event.put(entity, ammma.create());
		}

	}

	public static class CustomEntity extends MonsterEntity {

		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);

			enablePersistence();

		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();

			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, EendmanEntity.CustomEntity.class, true, true));
			this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, BewaakEendmanEntity.CustomEntity.class, true, true));
			this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, PlayerEntity.class, true, true));
			this.goalSelector.addGoal(5, new RandomWalkingGoal(this, 1));
			this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
			this.goalSelector.addGoal(8, new OpenDoorGoal(this, true));
			this.targetSelector.addGoal(9, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(10, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(11, new SwimGoal(this));

		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
		}

	}

}
