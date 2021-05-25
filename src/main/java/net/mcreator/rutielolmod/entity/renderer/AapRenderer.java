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

import net.mcreator.rutielolmod.entity.AapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelaap(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("rutielol_mod:textures/aap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelaap extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer tail;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer rightleg;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer head;
		public Modelaap() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 13).addBox(-2.5F, -17.0F, -2.5F, 5.0F, 11.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -18.0F, -2.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(20, 17).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, -0.5F, 0.0F);
			body.addChild(tail);
			tail.setTextureOffset(18, 0).addBox(-0.48F, -8.0F, 1.75F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -11.0F, 5.0F);
			tail.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(27, 25).addBox(-0.48F, -0.25F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -11.3971F, 4.3416F);
			tail.addChild(cube_r3);
			setRotationAngle(cube_r3, -2.0071F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(28, 28).addBox(-0.52F, -0.5F, -1.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -12.75F, 5.5F);
			tail.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(0, 29).addBox(-0.48F, -0.25F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -7.5F, 5.5F);
			tail.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(29, 0).addBox(-0.52F, -4.75F, -3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, -8.5F, 7.5F);
			tail.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.5708F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(24, 5).addBox(-0.48F, -0.75F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, -7.5F, 5.5F);
			tail.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(25, 20).addBox(-0.52F, -0.5F, -0.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(-1.5F, 18.0F, 0.5F);
			rightleg.setTextureOffset(24, 27).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			rightleg.setTextureOffset(24, 0).addBox(-0.5F, 5.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			rightleg.setTextureOffset(32, 10).addBox(-0.5F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(1.5F, 18.0F, 0.5F);
			leftleg.setTextureOffset(20, 27).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			leftleg.setTextureOffset(20, 23).addBox(-0.5F, 5.0F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			leftleg.setTextureOffset(32, 8).addBox(-0.5F, 4.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(3.0F, 9.0F, 0.5F);
			leftarm.setTextureOffset(28, 17).addBox(-1.0F, -1.0F, -0.48F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(31, 24).addBox(0.75F, 0.0F, -0.52F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(15, 13).addBox(3.0F, 1.25F, -0.52F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			leftarm.setTextureOffset(0, 32).addBox(0.75F, 4.0F, -0.48F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(7.2123F, 2.0303F, 0.0F);
			leftarm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
			cube_r8.setTextureOffset(5, 31).addBox(-6.5F, -1.0F, -0.48F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(3.5F, 1.5F, 0.0F);
			leftarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
			cube_r9.setTextureOffset(11, 31).addBox(-1.75F, -0.5F, -0.48F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(1.75F, 6.0F, 0.0F);
			leftarm.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2618F);
			cube_r10.setTextureOffset(30, 20).addBox(-1.0F, -0.75F, -0.52F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-3.0F, 9.0F, 0.5F);
			setRotationAngle(rightarm, 0.0F, 3.1416F, 0.0F);
			rightarm.setTextureOffset(0, 3).addBox(-1.0F, -1.0F, -0.48F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(10, 29).addBox(0.75F, 0.0F, -0.52F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(0, 13).addBox(3.0F, 1.25F, -0.52F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			rightarm.setTextureOffset(28, 31).addBox(0.75F, 4.0F, -0.48F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(7.2123F, 2.0303F, 0.0F);
			rightarm.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
			cube_r11.setTextureOffset(4, 29).addBox(-6.5F, -1.0F, -0.48F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(3.5F, 1.5F, 0.0F);
			rightarm.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
			cube_r12.setTextureOffset(29, 4).addBox(-1.75F, -0.5F, -0.48F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(1.75F, 6.0F, 0.0F);
			rightarm.addChild(cube_r13);
			setRotationAngle(cube_r13, 0.0F, 0.0F, 0.2618F);
			cube_r13.setTextureOffset(29, 6).addBox(-1.0F, -0.75F, -0.52F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 5.5F, -4.0F);
			head.setTextureOffset(20, 9).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(16, 29).addBox(2.0F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 24).addBox(-0.5F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 0).addBox(-3.0F, -2.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
