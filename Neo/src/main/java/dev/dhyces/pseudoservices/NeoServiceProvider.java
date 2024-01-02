package dev.dhyces.pseudoservices;

public class NeoServiceProvider implements ServiceProvider {
    public static final RegistryHelper REGISTRY_HELPER = new NeoRegistryHelper();

    @Override
    public RegistryHelper getRegistryHelper() {
        return REGISTRY_HELPER;
    }
}
