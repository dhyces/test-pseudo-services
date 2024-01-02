package dev.dhyces.pseudoservices;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MODID)
public class NeoInit {
    public NeoInit(IEventBus modBus) {
        CommonInit.init(new NeoServiceProvider());
        NeoRegistryHelper.REGISTER_MAP.forEach((resourceKey, deferredRegister) -> deferredRegister.register(modBus));
    }
}
