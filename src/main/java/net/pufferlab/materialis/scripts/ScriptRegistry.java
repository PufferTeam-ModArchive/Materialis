package net.pufferlab.materialis.scripts;

public class ScriptRegistry {

    public static ScriptOreDict oreDict = new ScriptOreDict();
    public static ScriptWood wood = new ScriptWood();
    public static ScriptCutting cutting = new ScriptCutting();
    public static ScriptChisel chisel = new ScriptChisel();
    public static ScriptResearch research = new ScriptResearch();
    public static ScriptOreProcessing oreProcessing = new ScriptOreProcessing();
    public static ScriptAspects aspects = new ScriptAspects();
    public static ScriptMisc misc = new ScriptMisc();

    public void init() {
        oreDict.run();
        aspects.run();

        misc.run();
        wood.run();
        cutting.run();
        chisel.run();
        research.run();
        oreProcessing.run();
    }
}
