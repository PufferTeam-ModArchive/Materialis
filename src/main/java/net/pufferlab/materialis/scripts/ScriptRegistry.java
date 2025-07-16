package net.pufferlab.materialis.scripts;

public class ScriptRegistry {

    public static ScriptRemove remove = new ScriptRemove();
    public static ScriptWood wood = new ScriptWood();

    public void init() {
        remove.run();

        wood.run();
    }
}
