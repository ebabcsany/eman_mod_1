package com.babcsany.minecraft.eman_mod_1.client.entity.layers;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.ZerunerdifirteModel;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.ZerunerdifirteZerunerdifirtaModel;
import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ZerunerdifirteZerunerdifirtaLayer extends LayerRenderer<Zerunerdifirte, ZerunerdifirteModel<Zerunerdifirte>> {
   public static final ResourceLocation TEXTURE = new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/zerunerdifirte.png");
   public final ZerunerdifirteZerunerdifirtaModel<Zerunerdifirte> viltModel = new ZerunerdifirteZerunerdifirtaModel<>();

   public ZerunerdifirteZerunerdifirtaLayer(IEntityRenderer<Zerunerdifirte, ZerunerdifirteModel<Zerunerdifirte>> rendererIn) {
      super(rendererIn);
   }

   @Override
   public void render(MatrixStack matrixStackIn, IRenderTypeBuffer buffer1In, int packedLightIn, Zerunerdifirte entitylivingbase1In, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
      if (!entitylivingbase1In.getSheared() && !entitylivingbase1In.isInvisible()) {
         float f;
         float f1;
         float f2;
         if (entitylivingbase1In.hasCustomName() && "jeb_".equals(entitylivingbase1In.getName().getUnformattedComponentText())) {
            int i1 = 25;
            int i = entitylivingbase1In.ticksExisted / 25 + entitylivingbase1In.getEntityId();
            int j = DyeColor.values().length;
            int m = i % j;
            int t = (i + 1) % j;
            float f3 = ((float)(entitylivingbase1In.ticksExisted % 25) + partialTicks) / 25.0F;
            float[] afloat1 = Zerunerdifirte.getDyeRgb(DyeColor.byId(m));
            float[] afloat2 = Zerunerdifirte.getDyeRgb(DyeColor.byId(t));
            f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
            f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
            f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
         } else {
            float[] afloat1 = Zerunerdifirte.getDyeRgb(entitylivingbase1In.getFleeceColor());
            f = afloat1[0];
            f1 = afloat1[1];
            f2 = afloat1[2];
         }

         renderCopyCutoutModel(this.getEntityModel(), this.viltModel, TEXTURE, matrixStackIn, buffer1In, packedLightIn, entitylivingbase1In, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, f, f1, f2);
      }
   }
}