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

import net.mcreator.rutielolmod.entity.RadioactieveKatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RadioactieveKatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RadioactieveKatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelkat(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/radioactieve_kat_2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelkat extends EntityModel<Entity> {
		private final ModelRenderer back_left_leg;
		private final ModelRenderer back_right_leg;
		private final ModelRenderer front_left_leg;
		private final ModelRenderer front_right_leg;
		private final ModelRenderer tail;
		private final ModelRenderer tail4_r1;
		private final ModelRenderer tail3_r1;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rotation;

		public Modelkat() {
			textureWidth = 64;
			textureHeight = 64;
			back_left_leg = new ModelRenderer(this);
			back_left_leg.setRotationPoint(-1.1F, 18.0F, 5.0F);
			back_left_leg.setTextureOffset(16, 26).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			back_right_leg = new ModelRenderer(this);
			back_right_leg.setRotationPoint(1.1F, 18.0F, 5.0F);
			back_right_leg.setTextureOffset(8, 24).addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			front_left_leg = new ModelRenderer(this);
			front_left_leg.setRotationPoint(-1.2F, 14.0F, -5.0F);
			front_left_leg.setTextureOffset(0, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			front_right_leg = new ModelRenderer(this);
			front_right_leg.setRotationPoint(1.2F, 14.0F, -5.0F);
			front_right_leg.setTextureOffset(20, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 14.5F, 9.0F);
			tail4_r1 = new ModelRenderer(this);
			tail4_r1.setRotationPoint(0.0F, 3.0F, 2.0F);
			tail.addChild(tail4_r1);
			setRotationAngle(tail4_r1, -0.7854F, 0.0F, 0.0F);
			tail4_r1.setTextureOffset(14, 0).addBox(-0.52F, -7.75F, 3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			tail4_r1.setTextureOffset(24, 26).addBox(-0.52F, -4.25F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			tail3_r1 = new ModelRenderer(this);
			tail3_r1.setRotationPoint(0.0F, 2.5F, 1.0F);
			tail.addChild(tail3_r1);
			setRotationAngle(tail3_r1, 0.7854F, 0.0F, 0.0F);
			tail3_r1.setTextureOffset(0, 0).addBox(-0.48F, 1.0F, 3.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			tail3_r1.setTextureOffset(28, 6).addBox(-0.48F, -2.5F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 15.0F, -9.0F);
			head.setTextureOffset(15, 17).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(20, 12).addBox(-1.5F, -0.02F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 3).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 0).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 6.0F, 6.1F);
			rotation = new ModelRenderer(this);
			rotation.setRotationPoint(0.0F, 11.0F, -5.1F);
			body.addChild(rotation);
			setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
			rotation.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -2.9F, 4.0F, 16.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.front_right_leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.front_left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
