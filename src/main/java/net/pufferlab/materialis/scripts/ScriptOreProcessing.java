package net.pufferlab.materialis.scripts;

import static net.pufferlab.materialis.scripts.ItemList.*;

import net.pufferlab.materialis.recipes.ModItems;
import net.pufferlab.materialis.recipes.TCHelper;

public class ScriptOreProcessing implements IScript {

    public void run() {
        TCHelper.orphanResearch("METALLURGICPERFECTION_CLUSTERS");
        TCHelper.removeResearch("METALLURGICPERFECTION_CLUSTERS");

        TCHelper.moveResearch("PURESILVER", "ALCHEMY", -3, 7);
        TCHelper.moveResearch("PURELEAD", "ALCHEMY", -2, 7);
        TCHelper.moveResearch("PURETIN", "ALCHEMY", -4, 6);
        TCHelper.moveResearch("PUREGOLD", "ALCHEMY", -4, 4);

        TCHelper.moveResearch("TRANSGOLD", "ALCHEMY", 2, 4);

        TCHelper.clearPages("TRANSGOLD");
        TCHelper.addPage("TRANSGOLD", "tc.research_page.TRANSGOLD.1");
        TCHelper.clearPages("TRANSIRON");
        TCHelper.addPage("TRANSIRON", "tc.research_page.TRANSIRON.1");

        TCHelper.orphanResearch("TRANSCOPPER");
        TCHelper.removeResearch("TRANSCOPPER");
        TCHelper.addResearch("TRANSCOPPER", "ALCHEMY", "metallum 3, permutatio 3", 2, 5, 8, copperNugget);
        TCHelper.setConcealed("TRANSCOPPER", true);
        TCHelper.setSecondary("TRANSCOPPER", true);
        TCHelper.addPage("TRANSCOPPER", "tc.research_page.TRANSCOPPER.1");
        TCHelper.addPrereq("TRANSCOPPER", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSTIN");
        TCHelper.removeResearch("TRANSTIN");
        TCHelper.addResearch("TRANSTIN", "ALCHEMY", "metallum 3, permutatio 2, vitreus 1", 2, 6, 8, tinNugget);
        TCHelper.setConcealed("TRANSTIN", true);
        TCHelper.setSecondary("TRANSTIN", true);
        TCHelper.addPage("TRANSTIN", "tc.research_page.TRANSTIN.1");
        TCHelper.addPrereq("TRANSTIN", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSSILVER");
        TCHelper.removeResearch("TRANSSILVER");
        TCHelper.addResearch("TRANSSILVER", "ALCHEMY", "metallum 3, permutatio 2, lucrum 1", 1, 7, 8, silverNugget);
        TCHelper.setConcealed("TRANSSILVER", true);
        TCHelper.setSecondary("TRANSSILVER", true);
        TCHelper.addPage("TRANSSILVER", "tc.research_page.TRANSSILVER.1");
        TCHelper.addPrereq("TRANSSILVER", "TRANSIRON", false);

        TCHelper.orphanResearch("TRANSLEAD");
        TCHelper.removeResearch("TRANSLEAD");
        TCHelper.addResearch("TRANSLEAD", "ALCHEMY", "metallum 3, permutatio 2, ordo 1", 0, 7, 8, leadNugget);
        TCHelper.setConcealed("TRANSLEAD", true);
        TCHelper.setSecondary("TRANSLEAD", true);
        TCHelper.addPage("TRANSLEAD", "tc.research_page.TRANSLEAD.1");
        TCHelper.addPrereq("TRANSLEAD", "TRANSIRON", false);

        TCHelper.addResearch("TRANSNICKEL", "ALCHEMY", "metallum 3, permutatio 2, ordo 1", 1, 3, 8, nickelNugget);
        TCHelper.setConcealed("TRANSNICKEL", true);
        TCHelper.setSecondary("TRANSNICKEL", true);
        TCHelper.addPage("TRANSNICKEL", "tc.research_page.TRANSNICKEL.1");
        TCHelper.addPrereq("TRANSNICKEL", "TRANSIRON", false);

        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:1"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:2"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:3"));
        TCHelper.removeCrucibleRecipe(ModItems.getItem("Thaumcraft:ItemNugget:4"));
    }
}
