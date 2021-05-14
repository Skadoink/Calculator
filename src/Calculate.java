import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculate{
    public static double getAnswer(String[] args) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "40+2233/123-321";
        System.out.println(engine.eval(foo));

        double testDouble = 70.11;
        return(testDouble);
        } 

    
}