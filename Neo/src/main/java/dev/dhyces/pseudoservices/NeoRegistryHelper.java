package dev.dhyces.pseudoservices;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class NeoRegistryHelper implements RegistryHelper {
    public static final Map<ResourceKey<? extends Registry<?>>, DeferredRegister<?>> REGISTER_MAP = new Reference2ObjectOpenHashMap<>();

    @Override
    public <T> Supplier<T> registerTo(ResourceKey<? extends Registry<T>> registryKey, String id, Supplier<T> obj) {
        if (!REGISTER_MAP.containsKey(registryKey)) {
            REGISTER_MAP.put(registryKey, DeferredRegister.create(registryKey, Constants.MODID));
        }
        return ((DeferredRegister<T>)REGISTER_MAP.get(registryKey)).register(id, obj);
    }
}
