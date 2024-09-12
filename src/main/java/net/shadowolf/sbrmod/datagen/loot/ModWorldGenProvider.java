package net.shadowolf.sbrmod.datagen.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.shadowolf.sbrmod.worldgen.biome.ModBiomes;
import net.shadowolf.sbrmod.SBRMod;
import net.shadowolf.sbrmod.worldgen.ModBiomeModifiers;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()

            .add(Registries.BIOME, ModBiomes::boostrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::boostrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries, BUILDER, Set.of(SBRMod.MOD_ID));
        }
    }