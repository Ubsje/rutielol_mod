package net.mcreator.rutielolmod.entity.renderer;

@OnlyIn(Dist.CLIENT)
public class PlanksperRenderer {

	public static class ModelRegisterHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PlanksperEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelplanksper(), 0.2f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/texture_1_1.png");
					}
				};
			});

		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports

	public static class Modelplanksper extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public Modelplanksper() {
			textureWidth = 32;
			textureHeight = 32;

			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, -1.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 5).addBox(-8.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(0, 9).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 5).addBox(-4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
