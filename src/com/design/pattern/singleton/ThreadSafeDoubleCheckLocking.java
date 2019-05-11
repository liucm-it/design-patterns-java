package design.pattern.singleton;

public class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalThreadStateException("Already initialized.");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
