package chorn.in.th.advantage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScriptEngine {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        if (engine != null) {
            try {
                String script = "print('Hello from Nashorn!')";
                engine.eval(script);
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Nashorn not available in this Java version.");
        }
    }
}
