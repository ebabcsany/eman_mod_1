package com.babcsany.minecraft.eman_mod_1.init;

import net.minecraft.item.Food;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
    public static final Food SAJT = (new Food.Builder()).hunger(20).saturation(1000.0F).effect(new EffectInstance(Effects.REGENERATION, 100, 100), 100.0F).effect(new EffectInstance(Effects.HASTE, 1000000,  100), 200.0F).effect(new EffectInstance(Effects.NAUSEA, 50, 50), 50).build();
public static final Food HUS_OS_SAJT = (new Food.Builder()).hunger(25).saturation(10000.0F).effect(new EffectInstance(Effects.REGENERATION, 1000000, 1000000), 1000000.0F).effect(new EffectInstance(Effects.JUMP_BOOST, 1000000,  1000000), 1000000.0F).effect(new EffectInstance(Effects.SATURATION, 5000000, 50), 50).build();
}