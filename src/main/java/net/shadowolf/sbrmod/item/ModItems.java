package net.shadowolf.sbrmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.TridentItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.item.custom.SteelBallItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, SBRMod.MOD_ID);

    public static final RegistryObject<Item> STEEL_BALL = ITEMS.register("steel_ball",
            () -> new SteelBallItem(new Item.Properties()));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
