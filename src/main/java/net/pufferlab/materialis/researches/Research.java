package net.pufferlab.materialis.researches;

import net.minecraft.util.ResourceLocation;

import thaumcraft.api.research.ResearchCategories;

public class Research {

    private static final ResourceLocation RESEARCH_BACKGROUND = new ResourceLocation(
        "thaumcraft:textures/gui/gui_researchback.png");
    private static final ResourceLocation BOTANIA_ICON = new ResourceLocation(
        "materialis:textures/misc/botania_tab.png");
    private static final ResourceLocation BLOODMAGIC_ICON = new ResourceLocation(
        "materialis:textures/misc/bloodmagic_tab.png");

    public static void init() {
        ResearchCategories.registerCategory("BOTANY", Research.BOTANIA_ICON, Research.RESEARCH_BACKGROUND);
        ResearchCategories.registerCategory("BLOODMAGIC", Research.BLOODMAGIC_ICON, Research.RESEARCH_BACKGROUND);
    }
}
