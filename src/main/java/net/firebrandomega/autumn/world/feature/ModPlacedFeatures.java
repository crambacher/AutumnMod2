package net.firebrandomega.autumn.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

import static net.minecraft.world.gen.feature.VegetationPlacedFeatures.modifiers;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> MOD_AUTUMN_BIRCH_AND_OAK = PlacedFeatures.register("autumn_birch_and_oak", VegetationConfiguredFeatures.TREES_BIRCH_AND_OAK, modifiers(PlacedFeatures.createCountExtraModifier(3, 0.1F, 1)));

    public static final RegistryEntry<PlacedFeature> RED_AUTUMN_PLACED = PlacedFeatures.register(
            "red_autumn_placed", ModConfiguredFeatures.RED_AUTUMN_SPAWN, modifiers(
                    PlacedFeatures.createCountExtraModifier(3, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> ORANGE_AUTUMN_PLACED = PlacedFeatures.register(
            "orange_autumn_placed", ModConfiguredFeatures.ORANGE_AUTUMN_SPAWN, modifiers(
                    PlacedFeatures.createCountExtraModifier(3, 0.1f, 2)
            ));

    public static final RegistryEntry<PlacedFeature> YELLOW_AUTUMN_PLACED = PlacedFeatures.register(
            "yellow_autumn_placed", ModConfiguredFeatures.YELLOW_AUTUMN_SPAWN, modifiers(
                    PlacedFeatures.createCountExtraModifier(3, 0.1f, 2)
            ));

}
