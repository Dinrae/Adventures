package com.asmodin.adventures;

import com.asmodin.adventures.registry.ModBlocks;
import com.asmodin.adventures.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Adventures implements ModInitializer {

    public  static final String MOD_ID = "adventures";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}
