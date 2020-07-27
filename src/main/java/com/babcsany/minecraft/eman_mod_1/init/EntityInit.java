package com.babcsany.minecraft.eman_mod_1.init;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
/*import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;*/
import com.babcsany.minecraft.eman_mod_1.entity.animal.Zerunerdifirte;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
            Eman_mod_1.MOD_ID);

    public static final RegistryObject<EntityType<Zerunerdifirte>> ZERUNERDIFIRTE = ENTITY_TYPES
            .register("zerunerdifirte",
                    () -> EntityType.Builder.<Zerunerdifirte>create(Zerunerdifirte::new, EntityClassification.CREATURE)
                            .size(0.9f, 1.3f)
                            .build(new ResourceLocation(Eman_mod_1.MOD_ID, "zerunerdifirte").toString()));


}