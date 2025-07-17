package net.pufferlab.materialis.scripts;

public class ScriptRegistry {

    public static ScriptOreDict oreDict = new ScriptOreDict();
    public static ScriptWood wood = new ScriptWood();
    public static ScriptResearch research = new ScriptResearch();
    public static ScriptOreProcessing oreProcessing = new ScriptOreProcessing();

    public void init() {
        oreDict.run();

        wood.run();
        research.run();
        oreProcessing.run();
    }
}
