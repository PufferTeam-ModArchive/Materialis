package net.pufferlab.materialis.nei;

import net.pufferlab.materialis.Tags;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import cpw.mods.fml.common.FMLCommonHandler;

public class NEIConfig implements IConfigureNEI {

    @Override
    public void loadConfig() {
        if (FMLCommonHandler.instance()
            .getSide()
            .isClient()) {
            API.registerRecipeHandler(new NEIInfernalFurnaceHandler());
        }
    }

    @Override
    public String getName() {
        return "Materialis NEI Plugin";
    }

    @Override
    public String getVersion() {
        return Tags.VERSION;
    }
}
