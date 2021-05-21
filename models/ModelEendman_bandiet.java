// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelEendman_bandiet extends EntityModel<Entity> {
	private final ModelRenderer arm_links;
	private final ModelRenderer been_links;
	private final ModelRenderer kop;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer been_rechts;
	private final ModelRenderer arm_rechts;
	private final ModelRenderer kop_animatie;
	private final ModelRenderer bb_main;

	public ModelEendman_bandiet() {
		textureWidth = 64;
		textureHeight = 64;

		arm_links = new ModelRenderer(this);
		arm_links.setRotationPoint(2.5F, 8.0F, -1.5F);
		arm_links.setTextureOffset(23, 31).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		been_links = new ModelRenderer(this);
		been_links.setRotationPoint(2.5F, 16.0F, 0.5F);
		been_links.setTextureOffset(19, 31).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		kop = new ModelRenderer(this);
		kop.setRotationPoint(-0.5F, 6.0F, -1.7F);
		kop.setTextureOffset(22, 9).addBox(-2.5F, -5.0F, -3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		kop.setTextureOffset(0, 20).addBox(1.5F, -5.0F, -3.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		kop.setTextureOffset(0, 18).addBox(-0.5F, 0.0F, -0.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		kop.setTextureOffset(0, 23).addBox(-1.5F, -3.0F, -6.3F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		kop.setTextureOffset(20, 12).addBox(-2.5F, -6.0F, -2.3F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 18.0F, 1.7F);
		kop.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.setTextureOffset(0, 37).addBox(-7.0F, -23.8F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 18.0F, 1.7F);
		kop.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
		cube_r2.setTextureOffset(0, 37).addBox(3.0F, -24.0F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		been_rechts = new ModelRenderer(this);
		been_rechts.setRotationPoint(-3.5F, 16.0F, 0.5F);
		been_rechts.setTextureOffset(4, 28).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		arm_rechts = new ModelRenderer(this);
		arm_rechts.setRotationPoint(-3.5F, 8.0F, -1.5F);
		arm_rechts.setTextureOffset(0, 28).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		arm_rechts.setTextureOffset(28, 22).addBox(-0.5F, 7.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		arm_rechts.setTextureOffset(10, 27).addBox(-0.5F, 7.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		kop_animatie = new ModelRenderer(this);
		kop_animatie.setRotationPoint(-0.5F, 6.0F, -2.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -17.0F, -3.0F, 5.0F, 10.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.been_links.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.been_rechts.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arm_rechts.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.arm_links.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.kop.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.kop.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}