package com.babcsany.minecraft.eman_mod_1.client.entity.render;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.client.entity.layers.EpicTraderOuterLayer;
import com.babcsany.minecraft.eman_mod_1.client.entity.model.EpicTraderModel;
import com.babcsany.minecraft.eman_mod_1.entity.villager.EpicTrader;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EpicTraderRender extends AbstractEpicTraderRender<EpicTrader, EpicTraderModel<EpicTrader>> {
   private static final ResourceLocation EPIC_LOCATION = new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/traders/epic/epic_trader.png");

   public EpicTraderRender(EntityRendererManager renderManagerIn) {
      super(renderManagerIn, new EpicTraderModel<>(0.0F, 0.0F, 64, 64), new EpicTraderModel<>(0.5F, true), new EpicTraderModel<>(1.0F, true));
      //this.addLayer(new EpicTraderOuterLayer<>(this));
   }

   /**
    * Returns the location of an entity's texture.
    */
   public ResourceLocation getEntityTexture(EpicTrader entity) {
      return EPIC_LOCATION;
   }

   protected void applyRotations(EpicTrader entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
      super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
      float f = entityLiving.getSwimAnimation(partialTicks);
      if (f > 0.0F) {
         matrixStackIn.rotate(Vector3f.XP.rotationDegrees(MathHelper.lerp(f, entityLiving.rotationPitch, -10.0F - entityLiving.rotationPitch)));
      }

   }
}