package net.shadowolf.sbrmod.entity.client;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;


public class SteeL_Ball_Fly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "steel_ball_fly"), "main");
	private final ModelPart bone;

	public SteeL_Ball_Fly(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(72, 100).addBox(-15.0F, -15.0F, 1.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(46, 42).addBox(-15.0F, -14.0F, 0.0F, 14.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-14.0F, -15.0F, 0.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 65).addBox(-14.0F, -2.0F, 0.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(-16.0F, -14.0F, 1.0F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(44, 16).addBox(-16.0F, -15.0F, 2.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(16, 41).addBox(-16.0F, -2.0F, 2.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(42, 0).addBox(-15.0F, -14.0F, 15.0F, 14.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 63).addBox(-14.0F, -15.0F, 15.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 61).addBox(-14.0F, -2.0F, 15.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 29).addBox(-15.0F, -1.0F, 2.0F, 14.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(62, 59).addBox(-14.0F, -1.0F, 1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(62, 57).addBox(-14.0F, -1.0F, 14.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-15.0F, -16.0F, 2.0F, 14.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(62, 55).addBox(-14.0F, -16.0F, 1.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 26).addBox(-14.0F, -16.0F, 14.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 0).addBox(-1.0F, -14.0F, 1.0F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(58, 13).addBox(-1.0F, -15.0F, 2.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(48, 56).addBox(-1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}



	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}


	@Override
	public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

	}
}