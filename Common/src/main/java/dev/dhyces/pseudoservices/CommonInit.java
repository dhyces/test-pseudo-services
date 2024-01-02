package dev.dhyces.pseudoservices;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CommonInit {
    public static Supplier<Item> TEST_ITEM;

    public static void init(ServiceProvider provider) {
        RegistryHelper registryHelper = provider.getRegistryHelper();
        TEST_ITEM = registryHelper.registerTo(Registries.ITEM, "test_item", () -> new Item(new Item.Properties()));
    }
}
