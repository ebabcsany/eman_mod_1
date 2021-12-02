package com.babcsany.minecraft.eman_mod_1.init;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
/*import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;*/
import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;
import com.babcsany.minecraft.eman_mod_1.entity.villager.EpicTrader;
import com.babcsany.minecraft.eman_mod_1.entity.villager.Oplikuxi;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Eman_mod_1.MOD_ID);


    public static final RegistryObject<EntityType<Zerunerdifirte>> ZERUNERDIFIRTE = ENTITY_TYPES
            .register("zerunerdifirte",
                    () -> EntityType.Builder.<Zerunerdifirte>create(Zerunerdifirte::new, EntityClassification.CREATURE)
                            .size(0.9f, 1.3f)
                            .build(new ResourceLocation(Eman_mod_1.MOD_ID, "zerunerdifirte").toString()
    ));
    public static final RegistryObject<EntityType<EpicTrader>> EPIC_TRADER = ENTITY_TYPES
            .register("traders/epic_trader",
                    () -> EntityType.Builder.<EpicTrader>create(EpicTrader::new, EntityClassification.CREATURE)
                            .size(0.6f, 1.95f).func_233606_a_(10)
                            .build(new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/traders/epic/epic_trader.png").toString()
                            ));
    public static final RegistryObject<EntityType<Oplikuxi>> OPLIKUXI = ENTITY_TYPES
            .register("traders/oplikuxi",
                    () -> EntityType.Builder.create(Oplikuxi::new, EntityClassification.CREATURE)
                            .size(0.6f, 1.95f).func_233606_a_(10)
                            .build(new ResourceLocation(Eman_mod_1.MOD_ID,"textures/entity/traders/oplikuxi.png").toString()
                            ));


}