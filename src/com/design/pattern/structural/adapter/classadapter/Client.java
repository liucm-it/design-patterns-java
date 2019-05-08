package design.pattern.structural.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
