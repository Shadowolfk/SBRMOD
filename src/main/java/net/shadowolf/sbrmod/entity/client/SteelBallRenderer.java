package net.shadowolf.sbrmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.TridentModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.entity.custom.ThrowableSB;

public class SteelBallRenderer extends EntityRenderer<ThrowableSB> {
    private final SteeL_Ball_Fly model;

    public SteelBallRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.model = new SteeL_Ball_Fly(pContext.bakeLayer(ModModelLayer.STEEL_BALL_LAYER));
    }

    @Override
    public ResourceLocation getTextureLocation(ThrowableSB pEntity) {
        return new ResourceLocation(SBRMod.MOD_ID, "textures/entity/steel_ball_fly.png");
    }

    @Override
    public void render(ThrowableSB pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.pushPose();
        pPoseStack.mulPose(Axis.YP.rotationDegrees(pEntity.getSpinAngle()));
        pPoseStack.scale(0.35f,0.35f,0.35f);
        pPoseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.yRotO, pEntity.getYRot()) - 90.0F));
        pPoseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTicks, pEntity.xRotO, pEntity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(pEntity)), false, false);
        this.model.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        pPoseStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);

    }


}
