package net.shadowolf.sbrmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.entity.client.ModModelLayer;
import net.shadowolf.sbrmod.entity.client.SteeL_Ball_Fly;


@Mod.EventBusSubscriber(modid = SBRMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayer.STEEL_BALL_LAYER, SteeL_Ball_Fly::createBodyLayer);
    }
}

