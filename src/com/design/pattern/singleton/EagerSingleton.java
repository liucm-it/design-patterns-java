package design.pattern.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {
    private static final EagerSingleton instance = new EagerSingleton();
    private static final long serialVersionUID = 357605829315230045L;

    private EagerSingleton() {
        if (instance != null) {
            // preventing reflection calls
            throw new IllegalThreadStateException("Already initialized.");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    // 解决序列化破坏单例模式
    private Object readResolve() {
        return instance;
    }
}
