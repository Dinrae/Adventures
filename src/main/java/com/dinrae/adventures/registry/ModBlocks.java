package com.dinrae.adventures.registry;

import com.dinrae.adventures.Adventures;
import com.dinrae.adventures.blocks.BasketLaundry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block STONE_BRICKS_CIRCULAR = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_CRACKED = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_DENT = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_MOSAIC = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_TILES_LARGE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_TILES_MEDIUM = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_TILES_SMALL = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block STONE_BRICKS_WEAVER = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block BASKET_LAUNDRY_01 = new BasketLaundry(FabricBlockSettings.of(Material.BAMBOO)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
            .nonOpaque()
    );

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_circular"), STONE_BRICKS_CIRCULAR);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_cracked"), STONE_BRICKS_CRACKED);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_dent"), STONE_BRICKS_DENT);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_mosaic"), STONE_BRICKS_MOSAIC);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_tiles_large"), STONE_BRICKS_TILES_LARGE);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_tiles_medium"), STONE_BRICKS_TILES_MEDIUM);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_tiles_small"), STONE_BRICKS_TILES_SMALL);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_weaver"), STONE_BRICKS_WEAVER);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "basket_laundry_01"), BASKET_LAUNDRY_01);
    }
}
