package com.babcsany.minecraft.eman_mod_1.client.entity.layers;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.EpicTraderModel;
import com.babcsany.minecraft.eman_mod_1.entity.villager.EpicTrader;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EpicTraderOuterLayer<T extends EpicTrader> extends LayerRenderer<T, EpicTraderModel<T>> {
   private static final ResourceLocation LOCATION_OUTER_LAYER = new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/traders/epic/epic_outer_layer.png");
   private final EpicTraderModel<T> modelOuterLayer = new EpicTraderModel<>(0.25F, 0.0F, 64, 64);

   public EpicTraderOuterLayer(IEntityRenderer<T, EpicTraderModel<T>> p_i50943_1_) {
      super(p_i50943_1_);
   }

   public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
      renderCopyCutoutModel(this.getEntityModel(), this.modelOuterLayer, LOCATION_OUTER_LAYER, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
   }
}