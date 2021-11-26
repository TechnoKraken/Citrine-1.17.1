package com.technokraken.ct.citrine.world;

import com.technokraken.ct.citrine.Citrine;
import com.technokraken.ct.citrine.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OreGeneration {

    public static final List<ConfiguredFeature<?, ?>> OVERWORLD_ORES = new ArrayList<>();

    public static final RuleTest OVERWORLD_TEST = new BlockMatchTest(Blocks.STONE);

    public static void registerOres() {
        ConfiguredFeature<?, ?> citrineOre = Feature.ORE.configured(new OreConfiguration(List.of(OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState())), 2)).rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(10)).squared().count(2);

        OVERWORLD_ORES.add(register("citrine_ore", citrineOre));
    }

    private static <Config extends FeatureConfiguration> ConfiguredFeature<Config, ?>register(String name, ConfiguredFeature<Config, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Citrine.MOD_ID, name), configuredFeature);
    }
    @Mod.EventBusSubscriber(modid = Citrine.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeBusSubscriber {
        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            List<Supplier<ConfiguredFeature<?, ?>>> features = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
            if(event.getName().getNamespace().equals("minecraft") && event.getCategory() != Biome.BiomeCategory.UNDERGROUND) {

            }

            switch (event.getCategory()) {
                default -> OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
            }
        }
    }
}
