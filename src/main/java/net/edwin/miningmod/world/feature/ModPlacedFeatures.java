package net.edwin.miningmod.world.feature;

import net.edwin.miningmod.MiningMod;
import net.edwin.miningmod.block.ModBlocks;
import net.edwin.miningmod.world.feature.ModOrePlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> GALENA_PLACED_KEY = createKey("galena_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GALENA_PLACED_KEY = createKey("nether_galena_placed");
    public static final ResourceKey<PlacedFeature> JADE_PLACED_KEY = createKey("jade_placed");
    public static final ResourceKey<PlacedFeature> BAUXITE_PLACED_KEY = createKey("bauxite_placed");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_PLACED_KEY = createKey("tungsten_placed");
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, GALENA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GALENA_KEY),
                ModOrePlacements.commonOrePlacement(6, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-60), VerticalAnchor.absolute(50))));
        register(context, NETHER_GALENA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GALENA_KEY),
                ModOrePlacements.commonOrePlacement(6, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(104))));
        register(context, JADE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_JADE_KEY),
                ModOrePlacements.commonOrePlacement(5, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(45))));
        register(context, BAUXITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BAUXITE_KEY),
                ModOrePlacements.commonOrePlacement(6, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(64), VerticalAnchor.absolute(100))));
        register(context, TUNGSTEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TUNGSTEN_KEY),
                ModOrePlacements.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(16))));
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MiningMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}