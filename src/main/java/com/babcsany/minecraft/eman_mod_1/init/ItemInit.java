package com.babcsany.minecraft.eman_mod_1.init;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.item.IrtatedserwintKrezonItem;
import com.babcsany.minecraft.eman_mod_1.item.ModArmorMaterial;
import com.babcsany.minecraft.eman_mod_1.item.ModItemTier;
import com.babcsany.minecraft.eman_mod_1.item.TurgShieldItem;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Properties;

import static com.babcsany.minecraft.eman_mod_1.item.ModItemTier.*;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Eman_mod_1.MOD_ID);

    public static final RegistryObject<Item> DAXI_ROF_TUZZI = ITEMS.register("daxi_rof_tuzzi", () -> new Item(
            (new Item.Properties())
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_PICKAXE = ITEMS.register("pirzen_urne_pickaxe", () -> new PickaxeItem(
        ModItemTier.PIRZEN_URNE, 100416, 230.0F, (new Item.Properties())
    ));
    public static final RegistryObject<Item> PIRZEN_URNE = ITEMS.register("pirzen_urne", () -> new Item(
            (new Item.Properties().group(ItemGroup.MATERIALS))
    ));
    public static final RegistryObject<Item> SAJT = ITEMS.register("sajt", () -> new Item(
            (new Item.Properties().group(ItemGroup.MATERIALS).food(FoodInit.SAJT))
    ));
    public static final RegistryObject<Item> HUS_OS_SAJT = ITEMS.register("hus_os_sajt", () -> new Item(
            (new Item.Properties().food(FoodInit.HUS_OS_SAJT).group(ItemGroup.MATERIALS))
    ));
    public static final RegistryObject<Item> IRTATEDSERWINT_KREZON = ITEMS.register("irtatedserwint_krezon", () -> new IrtatedserwintKrezonItem(
            (new Item.Properties().group(ItemGroup.MATERIALS))
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_HELMET = ITEMS.register("pirzen_urne_helmet", () -> new ArmorItem(
            ModArmorMaterial.PIRZEN_URNE, EquipmentSlotType.HEAD, (new Item.Properties().group(ItemGroup.COMBAT))
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_CHESTPLATE = ITEMS.register("pirzen_urne_chestplate", () -> new ArmorItem(
            ModArmorMaterial.PIRZEN_URNE, EquipmentSlotType.CHEST, (new Item.Properties().group(ItemGroup.COMBAT))
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_LEGGINGS = ITEMS.register("pirzen_urne_leggings", () -> new ArmorItem(
            ModArmorMaterial.PIRZEN_URNE, EquipmentSlotType.LEGS, (new Item.Properties().group(ItemGroup.COMBAT))
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_BOOTS = ITEMS.register("pirzen_urne_boots", () -> new ArmorItem(
            ModArmorMaterial.PIRZEN_URNE, EquipmentSlotType.FEET, (new Item.Properties().group(ItemGroup.COMBAT))
    ));
    /*public static final RegistryObject<Item> ZENDIO_ENTIO = ITEMS.register("zendio_entio", () -> new Item(
            (new Item.Properties().group(ItemGroup.MATERIALS))
    ));*/
    public static final RegistryObject<Item> PIRZEN_URNE_AXE = ITEMS.register("pirzen_urne_axe", () -> new AxeItem(
            ModItemTier.PIRZEN_URNE, 1010046, 27153.0F, (new Item.Properties()).group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> DAXI_ROF_TUZZI_PICKAXE = ITEMS.register("daxi_rof_tuzzi_pickaxe", () -> new PickaxeItem(
            ModItemTier.daxi_rof_tuzzi, 999999999, 230.0F, (new Item.Properties()).group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> DOEIRTIDOPI = ITEMS.register("doeirtidopi", () -> new Item(
            (new Item.Properties()).group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> DIRT_PICKAXE = ITEMS.register("dirt_pickaxe", () -> new PickaxeItem(
            ModItemTier.DIRT, 999999999, 230.0F, (new Item.Properties()).group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> DIRT_STICK = ITEMS.register("dirt_stick", () -> new Item(
            (new Item.Properties().group(ItemGroup.MATERIALS))
    ));
    public static final RegistryObject<Item> biltukiopencvedsert = ITEMS.register("biltukiopencvedsert", () -> new Item(
            (new Item.Properties().group(ItemGroup.MATERIALS))
    ));
    public static final RegistryObject<Item> TURG_SHIELD = ITEMS.register("turg_shield", () -> new ShieldItem(
            (new Item.Properties()
                    .maxDamage(5000)
                    .group(ItemGroup.COMBAT))
    ));
    public static final RegistryObject<Item> RED_BOW = ITEMS.register("red_bow", () -> new BowItem(
            (new Item.Properties()
                    .maxDamage(384)
                    .group(ItemGroup.COMBAT))
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_SHOVEL = ITEMS.register("pirzen_urne_shovel", () -> new ShovelItem(
            ModItemTier.PIRZEN_URNE, 73283, 230.0F, (new Item.Properties())
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_HOE = ITEMS.register("pirzen_urne_hoe", () -> new HoeItem(
            ModItemTier.PIRZEN_URNE, 4, 73287642.4F, (new Item.Properties())
    ));
    public static final RegistryObject<Item> PIRZEN_URNE_SWORD = ITEMS.register("pirzen_urne_sword", () -> new SwordItem(
            ModItemTier.PIRZEN_URNE, 938786237, 7856776.0F, (new Item.Properties())
    ));
}
