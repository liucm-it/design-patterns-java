package design.pattern.structural.proxy.typicalexample;

public class Proxy extends Subject {

    private RealSubject realSubject = new RealSubject();

    public void before() {

    }
    public void Request() {
        before();
        realSubject.Request();
        after();
    }

    public void after() {

    }
}
