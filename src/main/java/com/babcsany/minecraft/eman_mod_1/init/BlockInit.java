package com.babcsany.minecraft.eman_mod_1.init;

import com.babcsany.minecraft.eman_mod_1.Eman_mod_1;
import com.babcsany.minecraft.eman_mod_1.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Eman_mod_1.MOD_ID);

    public static final RegistryObject<Block> RED_DOW_WITSIP = BLOCKS.register("red_dow_witsip", () -> new RedDowWitsip(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(70)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000000.0f)
    ));
    public static final RegistryObject<Block> LOXIZA = BLOCKS.register("loxiza", () -> new Loxiza(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1000.0f)
    ));
    public static final RegistryObject<Block> HELON = BLOCKS.register("helon", () -> new Helon(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000000.0f)
    ));
    public static final RegistryObject<Block> PIRZEN_URNE_ORE = BLOCKS.register("pirzen_urne_ore", () -> new Block(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000.0f)
    ));
    public static final RegistryObject<Block> ZENDIO_ENTIO = BLOCKS.register("zendio_entio", () -> new ZendioEntio(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(65)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000.0f)
    ));
    public static final RegistryObject<Block> BIONRINEN_UDEZTRI = BLOCKS.register("bionrinen_udeztri", () -> new BionrinenUdeztri(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(65)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000.0f)
    ));
    public static final RegistryObject<Block> KIWITERDIA = BLOCKS.register("kiwiterdia", () -> new Kiwiterdia(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(65)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10000.0f)
    ));
    public static final RegistryObject<Block> OPIJER_HEDCERLEND = BLOCKS.register("opijer_hedcerlend", () -> new OpijerHedcerlend(
            Block.Properties.create(Material.WATER)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(10.0f)
    ));
}
