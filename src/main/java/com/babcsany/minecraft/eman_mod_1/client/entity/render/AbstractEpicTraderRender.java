package com.babcsany.minecraft.eman_mod_1.client.entity.render;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.layers.BipedArmorLayer1;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.EpicTraderModel;
import com.babcsany.minecraft.eman_mod_1.entity.villager.EpicTrader;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractEpicTraderRender<T extends EpicTrader, M extends EpicTraderModel<T>> extends AbstractEpicTraderBipedRender<T, M> {
   private static final ResourceLocation field_217771_a = new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/traders/epic/epic_trader.png");

   protected AbstractEpicTraderRender(EntityRendererManager p_i50974_1_, M p_i50974_2_, M p_i50974_3_, M p_i50974_4_) {
      super(p_i50974_1_, p_i50974_2_, 0.5F);
      this.addLayer(new BipedArmorLayer1<>(this, p_i50974_3_, p_i50974_4_));
   }

   /**
    * Returns the location of an entity's texture.
    */
   public ResourceLocation getEntityTexture(EpicTrader entity) {
      return field_217771_a;
   }
}