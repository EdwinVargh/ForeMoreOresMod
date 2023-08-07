package net.edwin.foremoreores.world.feature;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JADE_KEY = registerKey("jade_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BAUXITE_KEY = registerKey("bauxite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GALENA_KEY = registerKey("galena");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TUNGSTEN_KEY = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GALENA_KEY = registerKey("nether_galena");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        List<OreConfiguration.TargetBlockState> overworldJadeOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.JADE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_JADE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBauxiteOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.BAUXITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldGalena = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.GALENA.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_GALENA.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTungstenOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_GALENA_KEY, Feature.ORE, new OreConfiguration(overworldGalena, 6));
        register(context, NETHER_GALENA_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_GALENA.get().defaultBlockState(), 6));
        register(context, OVERWORLD_JADE_KEY, Feature.ORE, new OreConfiguration(overworldJadeOres, 5));
        register(context, OVERWORLD_BAUXITE_KEY, Feature.ORE, new OreConfiguration(overworldBauxiteOres, 8));
        register(context, OVERWORLD_TUNGSTEN_KEY, Feature.ORE, new OreConfiguration(overworldTungstenOres, 5));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ForeMoreOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}