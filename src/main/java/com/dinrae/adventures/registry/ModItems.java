package com.dinrae.adventures.registry;

import com.dinrae.adventures.Adventures;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // BLOCK ITEMS
   public static final BlockItem STONE_BRICKS_CIRCULAR = new BlockItem(ModBlocks.STONE_BRICKS_CIRCULAR, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_CRACKED = new BlockItem(ModBlocks.STONE_BRICKS_CRACKED, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_DENT = new BlockItem(ModBlocks.STONE_BRICKS_DENT, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_MOSAIC = new BlockItem(ModBlocks.STONE_BRICKS_MOSAIC, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_TILES_LARGE = new BlockItem(ModBlocks.STONE_BRICKS_TILES_LARGE, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_TILES_MEDIUM = new BlockItem(ModBlocks.STONE_BRICKS_TILES_MEDIUM, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_TILES_SMALL = new BlockItem(ModBlocks.STONE_BRICKS_TILES_SMALL, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem STONE_BRICKS_WEAVER = new BlockItem(ModBlocks.STONE_BRICKS_WEAVER, new Item.Settings().group(Adventures.BUILDING_BLOCKS));
    public static final BlockItem BASKET_LAUNDRY_01 = new BlockItem(ModBlocks.BASKET_LAUNDRY_01, new Item.Settings().group(Adventures.DECORATION_BLOCKS));

    //ITEMS


    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/circular"), STONE_BRICKS_CIRCULAR);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/cracked"), STONE_BRICKS_CRACKED);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/dent"), STONE_BRICKS_DENT);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/mosaic"), STONE_BRICKS_MOSAIC);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/tiles_large"), STONE_BRICKS_TILES_LARGE);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/tiles_medium"), STONE_BRICKS_TILES_MEDIUM);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/tiles_small"), STONE_BRICKS_TILES_SMALL);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "stone_bricks/weaver"), STONE_BRICKS_WEAVER);
        Registry.register(Registry.ITEM, new Identifier(Adventures.MOD_ID, "basket_laundry_01"), BASKET_LAUNDRY_01);
    }
}
