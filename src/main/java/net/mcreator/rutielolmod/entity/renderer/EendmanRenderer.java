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

import net.mcreator.rutielolmod.entity.EendmanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EendmanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EendmanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEendman_final(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/eendman.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class ModelEendman_final extends EntityModel<Entity> {
		private final ModelRenderer arm_links;
		private final ModelRenderer been_links;
		private final ModelRenderer kop;
		private final ModelRenderer been_rechts;
		private final ModelRenderer arm_rechts;
		private final ModelRenderer kop_animatie;
		private final ModelRenderer bb_main;

		public ModelEendman_final() {
			textureWidth = 32;
			textureHeight = 32;
			arm_links = new ModelRenderer(this);
			arm_links.setRotationPoint(2.5F, 8.0F, -1.5F);
			arm_links.setTextureOffset(22, 5).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			been_links = new ModelRenderer(this);
			been_links.setRotationPoint(2.5F, 16.0F, 0.5F);
			been_links.setTextureOffset(22, 14).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			kop = new ModelRenderer(this);
			kop.setRotationPoint(-0.5F, 6.2F, -1.7F);
			kop.setTextureOffset(0, 2).addBox(-2.5F, -5.2F, -3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			kop.setTextureOffset(0, 0).addBox(1.5F, -5.2F, -3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			kop.setTextureOffset(0, 4).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			kop.setTextureOffset(16, 0).addBox(-1.5F, -3.2F, -6.3F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			kop.setTextureOffset(0, 16).addBox(-2.5F, -6.2F, -2.3F, 5.0F, 6.0F, 4.0F, 0.0F, false);
			been_rechts = new ModelRenderer(this);
			been_rechts.setRotationPoint(-3.5F, 16.0F, 0.5F);
			been_rechts.setTextureOffset(22, 23).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			arm_rechts = new ModelRenderer(this);
			arm_rechts.setRotationPoint(-3.5F, 8.0F, -1.5F);
			arm_rechts.setTextureOffset(18, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			kop_animatie = new ModelRenderer(this);
			kop_animatie.setRotationPoint(-0.5F, 6.0F, -2.0F);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-3.0F, -17.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			arm_links.render(matrixStack, buffer, packedLight, packedOverlay);
			been_links.render(matrixStack, buffer, packedLight, packedOverlay);
			kop.render(matrixStack, buffer, packedLight, packedOverlay);
			been_rechts.render(matrixStack, buffer, packedLight, packedOverlay);
			arm_rechts.render(matrixStack, buffer, packedLight, packedOverlay);
			kop_animatie.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.been_links.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.been_rechts.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.arm_rechts.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.arm_links.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.kop.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.kop.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
