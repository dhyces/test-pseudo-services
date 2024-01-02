package dev.dhyces.pseudoservices;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.function.Supplier;

public interface RegistryHelper {
    <T> Supplier<T> registerTo(ResourceKey<? extends Registry<T>> registryKey, String id, Supplier<T> obj);
}
