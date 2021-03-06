package com.babcsany.minecraft.eman_mod_1.world.dimension;

import com.babcsany.minecraft.eman_mod_1.world.feature.GenerationSettings;

public class ExampleGenSettings extends GenerationSettings {

	public int getBiomeSize() {
		return 4;
	}

	public int getRiverSize() {
		return 4;
	}

	public int getBiomeId() {
		return -1;
	}

	@Override
	public int getBedrockFloorHeight() {
		return 0;
	}
}
