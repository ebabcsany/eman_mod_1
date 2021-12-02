package com.babcsany.minecraft.eman_mod_1.entity.ai.goal;

import com.babcsany.minecraft.eman_mod_1.entity.villager.AbstractEpicTrader;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.player.PlayerEntity;

public class ZombieTraderLookAtCustomerGoal extends LookAtGoal {
   private final AbstractEpicTrader zombieTrader;

   public ZombieTraderLookAtCustomerGoal(AbstractEpicTrader abstractZombieTraderEntityIn) {
      super(abstractZombieTraderEntityIn, PlayerEntity.class, 20.0F);
      this.zombieTrader = abstractZombieTraderEntityIn;
   }

   /**
    * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
    * method as well.
    */
   public boolean shouldExecute() {
      if (this.zombieTrader.hasCustomer()) {
         this.closestEntity = this.zombieTrader.getCustomer();
         return true;
      } else {
         return false;
      }
   }
}