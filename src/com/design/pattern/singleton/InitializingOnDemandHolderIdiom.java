package design.pattern.singleton;

public class InitializingOnDemandHolderIdiom {

    private InitializingOnDemandHolderIdiom() {
        if (HelperHolder.INSTANCE != null) {
            throw new IllegalThreadStateException("Already initialized.");
        }
    }

    private static class HelperHolder {
        static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }
}
