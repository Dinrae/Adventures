package com.asmodin.adventures.registry;

import com.asmodin.adventures.Adventures;
import com.asmodin.adventures.blocks.BasketLaundry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block STONE_BRICKS_WEAVER = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
    );

    public static final Block BASKET_LAUNDRY_01 = new BasketLaundry(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES,0)
            .requiresTool()
            .strength(1.5f, 30.0f)
            .sounds(BlockSoundGroup.STONE)
            .nonOpaque()
    );

    public static void registerBlocks()
    {
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "stone_bricks_weaver"), STONE_BRICKS_WEAVER);
        Registry.register(Registry.BLOCK, new Identifier(Adventures.MOD_ID, "basket_laundry_01"), BASKET_LAUNDRY_01);
    }
}
