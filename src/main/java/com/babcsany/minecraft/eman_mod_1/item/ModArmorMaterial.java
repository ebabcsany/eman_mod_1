package com.babcsany.minecraft.eman_mod_1.item;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    PIRZEN_URNE(Eman_mod_1.MOD_ID + ":pirzen_urne", 20, new int[]{600, 800, 1000, 600}, 1000000, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 5000930.3562F, () -> { return Ingredient.fromItems(ItemInit.PIRZEN_URNE.get()); }),
    Daxi_rof_tuzzi(Eman_mod_1.MOD_ID +":daxi_rof_tuzzi", 80,new int[]{999999999, 999999999, 999999999, 999999999}, 8000000,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 86.8F, () -> { return Ingredient.fromItems(ItemInit.DAXI_ROF_TUZZI.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 4761887, 2719018, 9010001, 1700000 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;


    ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
                     int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
                     Supplier<Ingredient> repairMaterialIn) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }


    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }


    @Override
    public int getEnchantability() {
        return this.enchantability;
    }


    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }


    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }


    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
