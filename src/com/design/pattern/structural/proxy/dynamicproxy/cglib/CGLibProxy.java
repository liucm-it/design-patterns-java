package design.pattern.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    // CGLib需要代理的目标对象
    private Object target;

    public Object bind(Object obj) {
        this.target = obj;
        Enhancer enhancer = new Enhancer();
        // 设置父类(可以是类或者接口)
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        // 返回代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        HumanUtil util = new HumanUtil();

        util.before();
        Object result = methodProxy.invokeSuper(o, args);
//        Object result = method.invoke(target, args);
        util.after();

        return result;
    }
}

class HumanUtil {
    public void before() {
        System.out.println("==========方法调用前========");
    }

    public void after() {
        System.out.println("==========方法调用后========");
    }
}