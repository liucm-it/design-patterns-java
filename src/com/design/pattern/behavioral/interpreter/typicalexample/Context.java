package design.pattern.behavioral.interpreter.typicalexample;

import java.util.HashMap;

public class Context {
    private HashMap<String, String> map = new HashMap();
    public void assign(String key, String value) {
        // 往环境中设值
        map.put(key, value);
    }

    public String lookup(String key) {
        return map.get(key);
    }
}
