package net.shadowolf.sbrmod.event;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.entity.ModEntities;
import net.shadowolf.sbrmod.entity.custom.ThrowableSB;


    @Mod.EventBusSubscriber(modid = SBRMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBusEvents {
        @SubscribeEvent
        public static void registerAttributes(EntityAttributeCreationEvent event) {

        }
    }


