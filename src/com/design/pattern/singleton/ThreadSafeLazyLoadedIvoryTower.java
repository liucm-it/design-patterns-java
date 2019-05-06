package design.pattern.singleton;

public class ThreadSafeLazyLoadedIvoryTower {

    private static ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        // protect against instantiation via reflection
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalThreadStateException("Already initialized.");
        }
    }

    public synchronized static ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }

        return instance;
    }
}
