package com.babcsany.minecraft.eman_mod_1.client.entity.render;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.layers.ZerunerdifirteZerunerdifirtaLayer;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.ZerunerdifirteModel;
import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ZerunerdifirteRender extends MobRenderer<Zerunerdifirte, ZerunerdifirteModel<Zerunerdifirte>> {
    private static final ResourceLocation SHEARED_VILT_TEXTURES = new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/zerunerdifirta.png");

    public ZerunerdifirteRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ZerunerdifirteModel<>(), 0.7F);
        this.addLayer(new ZerunerdifirteZerunerdifirtaLayer(this));
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(Zerunerdifirte entity) {
        return SHEARED_VILT_TEXTURES;
    }
}
