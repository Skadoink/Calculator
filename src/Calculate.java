import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
// import javax.script.ScriptException;

public class Calculate{
    public double getAnswer(String displayText){
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = displayText;
        try {
            try{
                return (double)((Integer) engine.eval(foo));
            }
            catch (ClassCastException cce){
                return (double) engine.eval(foo);
            }
            // result = engine.eval(foo);
            // return (double)((Integer) engine.eval(foo)); //error casting object to double because it boxes into Integer when we 
            //want ordinary int in order to be able to convert. 
            //class java.lang.Integer cannot be cast to class java.lang.Double
            //fixed by adding (Integer) as an unboxing conversion
        } catch (ScriptException e) {
            return 0.000;
        }
        } 

    
}