package net.shadowolf.sbrmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.entity.custom.ThrowableSB;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SBRMod.MOD_ID);

    public static final RegistryObject<EntityType<ThrowableSB>> STEEL_BALL_FLY =
            ENTITY_TYPES.register("flying_steel_ball", () -> EntityType.Builder.<ThrowableSB>of(ThrowableSB::new, MobCategory.MISC).sized(0.5f, 0.5f).build("flying_steel_ball"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
