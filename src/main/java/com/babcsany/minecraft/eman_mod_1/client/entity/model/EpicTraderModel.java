package com.babcsany.minecraft.eman_mod_1.client.entity.model;

import com.babcsany.minecraft.eman_mod_1.entity.villager.EpicTrader;

public class EpicTraderModel<T extends EpicTrader> extends AbstractEpicTraderModel<T> {
    public EpicTraderModel(float modelSize, boolean p_i1168_2_) {
        this(modelSize, 0.0F, 64, p_i1168_2_ ? 32 : 64);
    }

    public EpicTraderModel(float p_i48914_1_, float p_i48914_2_, int p_i48914_3_, int p_i48914_4_) {
        super(p_i48914_1_, p_i48914_2_, p_i48914_3_, p_i48914_4_);
    }

    @Override
    public boolean isAggressive(T entityIn) {
        return false;
    }

}
