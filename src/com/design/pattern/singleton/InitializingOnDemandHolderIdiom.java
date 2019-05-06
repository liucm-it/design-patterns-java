package design.pattern.singleton;

public class InitializingOnDemandHolderIdiom {

    private InitializingOnDemandHolderIdiom() {}

    private static class HelperHolder {
        static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }
}
