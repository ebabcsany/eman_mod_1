package com.babcsany.minecraft.eman_mod_1.item.tool;

import net.minecraft.item.IItemTier;

public enum ModItemTier implements IItemTier1 {
    // int harvestLevel, int maxUses, float efficiency, float attackDamage, int
    //enchantability, Supplier<Ingredient> repairMaterial
    DAXI_ROF_TUZZI(821677912, 300);

    //private final int harvestLevel;
    //private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    //private final int enchantability;
    //private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(/*int harvestLevel, int maxUses,*/ float efficiency, float attackDamage /*int enchantability, Supplier<Ingredient> repairMaterialIn*/) {
        //this.harvestLevel = harvestLevel;
        //this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        //this.enchantability = enchantability;
        //this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    /*public int getHarvestLevel() {
        return harvestLevel;
    }

    public int getMaxUses() {
        return maxUses;
    }*/

    public float getEfficiency() {
        return efficiency;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    /*public int getEnchantability() {
        return enchantability;
    }

    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }*/
}


