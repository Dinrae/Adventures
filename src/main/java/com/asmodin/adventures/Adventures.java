package com.asmodin.adventures;

import com.asmodin.adventures.registry.ModBlocks;
import com.asmodin.adventures.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Adventures implements ModInitializer {

    public  static final String MOD_ID = "adventures";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack (ModItems.STONE_BRICKS_WEAVER));


    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
