package net.mcreator.rutielolmod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.rutielolmod.entity.EgelEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EgelRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EgelEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelegie_egel(), 0.3f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/egel.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelegie_egel extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer frontleftleg;
		private final ModelRenderer frontrightleg;
		private final ModelRenderer backleftleg;
		private final ModelRenderer backrightleg;

		public Modelegie_egel() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 20.9286F, 1.9286F);
			body.setTextureOffset(0, 0).addBox(-2.0F, -0.9286F, -3.9286F, 4.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(13, 10).addBox(-1.0F, -1.6786F, -3.4286F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(0.75F, -1.4286F, -2.9286F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(14, 0).addBox(-1.75F, -1.4286F, -2.9286F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 9).addBox(-2.5F, -0.4286F, -2.9286F, 5.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 3).addBox(-1.0F, -0.4286F, 1.5714F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-0.5F, 0.8214F, 1.3214F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 22.0F, -2.0F);
			head.setTextureOffset(6, 15).addBox(-1.0F, -1.25F, -1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 9).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 0).addBox(0.5F, -1.75F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 5).addBox(-1.5F, -1.75F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			frontleftleg = new ModelRenderer(this);
			frontleftleg.setRotationPoint(1.0F, 23.0F, -1.0F);
			frontleftleg.setTextureOffset(14, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			frontrightleg = new ModelRenderer(this);
			frontrightleg.setRotationPoint(-1.0F, 23.0F, -1.0F);
			frontrightleg.setTextureOffset(14, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			backleftleg = new ModelRenderer(this);
			backleftleg.setRotationPoint(1.0F, 23.0F, 3.0F);
			backleftleg.setTextureOffset(0, 11).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			backrightleg = new ModelRenderer(this);
			backrightleg.setRotationPoint(-1.0F, 23.0F, 3.0F);
			backrightleg.setTextureOffset(0, 9).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			frontleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			frontrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			backleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			backrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.backleftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.backrightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.frontrightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.frontleftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
