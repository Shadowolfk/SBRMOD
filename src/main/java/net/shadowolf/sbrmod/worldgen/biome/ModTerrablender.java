package net.shadowolf.sbrmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import net.shadowolf.sbrmod.SBRMod;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(SBRMod.MOD_ID, "overworld"), 5));
    }
}