package com.babcsany.minecraft.eman_mod_1.client.entity.render;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.ZerunerdifirteModel;
import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ZerunerdifirteRender extends MobRenderer<Zerunerdifirte, ZerunerdifirteModel<Zerunerdifirte>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Eman_mod_1.MOD_ID,
            "textures/entity/zerunerdifirte.png");

    public ZerunerdifirteRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ZerunerdifirteModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(Zerunerdifirte entity) {
        return TEXTURE;
    }
}
