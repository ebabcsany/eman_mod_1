package com.babcsany.minecraft.eman_mod_1.world.gen;

import com.babcsany.minecraft.eman_mod_1.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.registries.ForgeRegistries;

public class FeatureGen {
	private static final BlockState NETHERITE_ORE = BlockInit.NETHERITE_ORE.get().getDefaultState();
	private static final BlockState HELON = BlockInit.HELON.get().getDefaultState();
	public static void generateFeature() {
		for (Biome biome : ForgeRegistries.BIOMES) {
			if (biome == Biomes.OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.FROZEN_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.DEEP_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.WARM_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.LUKEWARM_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.COLD_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.DEEP_WARM_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.DEEP_LUKEWARM_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.DEEP_COLD_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
			if (biome == Biomes.DEEP_FROZEN_OCEAN) {
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, NETHERITE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 4, 15))));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, HELON, 1)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(2, 32, 32))));
			}
		}
	}
}
