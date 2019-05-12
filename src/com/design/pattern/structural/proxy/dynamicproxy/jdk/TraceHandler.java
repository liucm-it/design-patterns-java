package design.pattern.structural.proxy.dynamicproxy.jdk;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用JDK动态代理跟踪二分查找算法调用栈
public class TraceHandler implements InvocationHandler, Serializable {
    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    public Object bind() {
        return Proxy.newProxyInstance(null,
                target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1)
                    System.out.print("，");
            }
        }
        System.out.println(")");
        // invoke actual method
        return method.invoke(target, args);
    }
}
