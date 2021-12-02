package com.babcsany.minecraft.eman_mod_1.entity.villager.trigger;

import com.babcsany.minecraft.eman_mod_1.entity.villager.AbstractEpicTrader;
import com.google.gson.JsonObject;
import net.minecraft.advancements.criterion.AbstractCriterionTrigger;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.loot.ConditionArraySerializer;
import net.minecraft.loot.LootContext;
import net.minecraft.util.ResourceLocation;

public class EpicTraderTrigger extends AbstractCriterionTrigger<EpicTraderTrigger.Instance> {
   private static final ResourceLocation ID = new ResourceLocation("epic_trade");

   public ResourceLocation getId() {
      return ID;
   }

   public EpicTraderTrigger.Instance deserializeTrigger(JsonObject json, EntityPredicate.AndPredicate entityPredicate, ConditionArrayParser conditionsParser) {
      EntityPredicate.AndPredicate entitypredicate$andpredicate = EntityPredicate.AndPredicate.deserializeJSONObject(json, "epic", conditionsParser);
      ItemPredicate itempredicate = ItemPredicate.deserialize(json.get("item"));
      return new EpicTraderTrigger.Instance(entityPredicate, entitypredicate$andpredicate, itempredicate);
   }

   public void test(ServerPlayerEntity player, AbstractEpicTrader zombie_trader, ItemStack stack) {
      LootContext lootcontext = EntityPredicate.getLootContext(player, zombie_trader);
      this.triggerListeners(player, (p_227267_2_) -> {
         return p_227267_2_.test(lootcontext, stack);
      });
   }

   public static class Instance extends CriterionInstance {
      private final EntityPredicate.AndPredicate zombie_trader;
      private final ItemPredicate item;

      public Instance(EntityPredicate.AndPredicate player, EntityPredicate.AndPredicate zombie_trader, ItemPredicate stack) {
         super(EpicTraderTrigger.ID, player);
         this.zombie_trader = zombie_trader;
         this.item = stack;
      }

      public static EpicTraderTrigger.Instance any() {
         return new EpicTraderTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, EntityPredicate.AndPredicate.ANY_AND, ItemPredicate.ANY);
      }

      public boolean test(LootContext context, ItemStack stack) {
         if (!this.zombie_trader.testContext(context)) {
            return false;
         } else {
            return this.item.test(stack);
         }
      }

      public JsonObject serialize(ConditionArraySerializer conditions) {
         JsonObject jsonobject = super.serialize(conditions);
         jsonobject.add("item", this.item.serialize());
         jsonobject.add("truer", this.zombie_trader.serializeConditions(conditions));
         return jsonobject;
      }
   }
}