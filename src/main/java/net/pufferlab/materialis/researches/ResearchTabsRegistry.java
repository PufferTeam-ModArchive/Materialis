package net.pufferlab.materialis.researches;

import net.minecraft.util.ResourceLocation;

import thaumcraft.api.research.ResearchCategories;

public class ResearchTabsRegistry {

    private static final ResourceLocation RESEARCH_BACKGROUND = new ResourceLocation(
        "thaumcraft:textures/gui/gui_researchback.png");
    private static final ResourceLocation BOTANIA_ICON = new ResourceLocation(
        "materialis:textures/misc/botania_tab.png");
    private static final ResourceLocation BLOODMAGIC_ICON = new ResourceLocation(
        "materialis:textures/misc/bloodmagic_tab.png");

    public void init() {
        ResearchCategories
            .registerCategory("BOTANY", ResearchTabsRegistry.BOTANIA_ICON, ResearchTabsRegistry.RESEARCH_BACKGROUND);
        ResearchCategories.registerCategory(
            "BLOODMAGIC",
            ResearchTabsRegistry.BLOODMAGIC_ICON,
            ResearchTabsRegistry.RESEARCH_BACKGROUND);
    }
}
