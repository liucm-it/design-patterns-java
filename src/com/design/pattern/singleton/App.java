package design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) {
        reflection();

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("eagerSingleton1={" + eagerSingleton1 + "}");
        System.out.println("eagerSingleton2={" + eagerSingleton2 + "}");

        EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
        EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
        System.out.println("enumIvoryTower1={" + enumIvoryTower1 + "}");
        System.out.println("enumIvoryTower2={" + enumIvoryTower2 + "}");

        InitializingOnDemandHolderIdiom holderIdiom1 = InitializingOnDemandHolderIdiom.getInstance();
        InitializingOnDemandHolderIdiom holderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
        System.out.println("holderIdiom1={" + holderIdiom1 + "}");
        System.out.println("holderIdiom2={" + holderIdiom2 + "}");

        ThreadSafeDoubleCheckLocking doubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstance();
        ThreadSafeDoubleCheckLocking doubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstance();
        System.out.println("doubleCheckLocking1={" + doubleCheckLocking1 + "}");
        System.out.println("doubleCheckLocking2={" + doubleCheckLocking2 + "}");

        ThreadSafeLazyLoadedIvoryTower lazyLoadedIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower lazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println("lazyLoadedIvoryTower1={" + lazyLoadedIvoryTower1 + "}");
        System.out.println("lazyLoadedIvoryTower2={" + lazyLoadedIvoryTower2 + "}");
    }

    public static void reflection() {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton newInstance = null;
        try {
            Class<EagerSingleton> singletonClass = EagerSingleton.class;
            Constructor<EagerSingleton> constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            newInstance = constructor.newInstance();
        } catch (Exception e) {
            System.out.println("反射调用失败");
        }

        System.out.println("正常获取实例：" + instance);
        System.out.println("反射获取实例：" + newInstance);
        System.out.println(instance == newInstance);

    }
}
