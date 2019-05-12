package design.pattern.structural.proxy.dynamicproxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class App {

    public static void main(String[] args) {
        // 创建一个被代理的对象
        Human superMan = new SuperMan();

        // 添加如下代码，获取代理类源文件
        String path = CGLibProxy.class.getResource(".").getPath();
        System.out.println(path);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, path);

        CGLibProxy cgLibProxy = new CGLibProxy();
        Object proxy = cgLibProxy.bind(superMan);

        System.out.println(proxy.getClass());

        SuperMan human = (SuperMan) proxy;
        human.info();
        System.out.println();
        human.fly();

        human.self();


    }
}
