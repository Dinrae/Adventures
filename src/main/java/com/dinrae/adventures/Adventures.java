package com.dinrae.adventures;

import com.dinrae.adventures.registry.ModBlocks;
import com.dinrae.adventures.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Adventures implements ModInitializer {

    // MOD_ID
    public  static final String MOD_ID = "adventures";

    // CREATIVE TABS
    public static final ItemGroup BUILDING_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "building_blocks"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));
    public static final ItemGroup DECORATION_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "decoration_blocks"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));
    public static final ItemGroup MISCELLANEOUS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "miscellaneous"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));
    public static final ItemGroup FOODSTUFFS = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "foodstuffs"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));
    public static final ItemGroup Tools = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "tools"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));
    public static final ItemGroup Combat = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "combat"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));

    // INITIALIZATION
    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
