package design.pattern.structural.proxy.dynamicproxy.cglib;

public class SuperMan implements Human {
    @Override
    public void info() {
        System.out.println("我是超人！我怕谁！");
    }

    @Override
    public void fly() {
        System.out.println("我相信我能飞!");
    }

    public void self() {
        System.out.println("这是私有方法！");
    }
}
