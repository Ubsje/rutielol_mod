package net.mcreator.rutielolmod.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class BabyMitchuRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BabyMitchuEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbaby_mitchu(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/baby_mitchu.png");
					}
				};
			});

		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports

	public static class Modelbaby_mitchu extends EntityModel<Entity> {
		private final ModelRenderer mitchu;

		public Modelbaby_mitchu() {
			textureWidth = 32;
			textureHeight = 32;

			mitchu = new ModelRenderer(this);
			mitchu.setRotationPoint(0.0F, 24.0F, 0.0F);
			mitchu.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			mitchu.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

}
