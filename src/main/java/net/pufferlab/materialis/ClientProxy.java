package net.pufferlab.materialis;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    // Override CommonProxy methods here, if you want a different behaviour on the client (e.g. registering renders).
    // Don't forget to call the super methods as well.
    @Override
    public int getArmorIndex(String string) {
        return RenderingRegistry.addNewArmourRendererPrefix(string);
    }

}
