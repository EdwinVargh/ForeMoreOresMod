package net.edwin.miningmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CANNED_APPLES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.45F).build();
    public static final FoodProperties CANNED_BEEF = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.2F).meat().build();
    public static final FoodProperties CANNED_BREAD = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.9F).build();
    public static final FoodProperties CANNED_BEETROOT_SOUP = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.9F).build();
    public static final FoodProperties CANNED_BERRIES = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.6F).build();
    public static final FoodProperties CANNED_CARROTS = (new FoodProperties.Builder()).nutrition(3).saturationMod(5.4F).build();
    public static final FoodProperties CANNED_CHICKEN = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.9F).build();
    public static final FoodProperties CANNED_CHORUS_FRUIT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.45F).build();
    public static final FoodProperties CANNED_POTATOES = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.9F).build();
    public static final FoodProperties CANNED_COD = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.9F).build();
    public static final FoodProperties CANNED_SALMON = (new FoodProperties.Builder()).nutrition(6).saturationMod(1.2F).build();
    public static final FoodProperties CANNED_MELON = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.45F).build();
    public static final FoodProperties CANNED_ROTTEN_FLESH = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.15F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.8F).meat().build();
    public static final FoodProperties SODA = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1), 1.0F).fast().build();
}
