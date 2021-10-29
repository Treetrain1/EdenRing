package paulevs.edenring.world.biomes;

import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import paulevs.edenring.EdenRing;
import paulevs.edenring.registries.EdenBiomes;
import paulevs.edenring.world.structures.EdenFeatures;
import ru.bclib.config.IdConfig;
import ru.bclib.world.biomes.BCLBiome;
import ru.bclib.world.biomes.BCLBiomeDef;

public class MycoticForestBiome extends BCLBiome {
	public MycoticForestBiome(IdConfig config, ConfiguredSurfaceBuilder surfaceBuilder) {
		super(EdenBiomes.addDefaultFeatures(
			new BCLBiomeDef(EdenRing.makeID("mycotic_forest"))
				.loadConfigValues(config)
				.setCategory(BiomeCategory.FOREST)
				.setSurface(surfaceBuilder)
				.setGrassColor(220, 130, 189)
				.setFoliageColor(152, 90, 131)
				.addFeature(Decoration.VEGETAL_DECORATION, Features.PATCH_GRASS_FOREST)
				.addFeature(EdenFeatures.MYCOTIC_GRASS)
				.addFeature(EdenFeatures.BALOON_MUSHROOM_TREE)
				.addFeature(EdenFeatures.GRASS_FLOOR)
				.setSkyColor(113, 178, 255)
				.setFogColor(178, 112, 143)
		));
	}
}