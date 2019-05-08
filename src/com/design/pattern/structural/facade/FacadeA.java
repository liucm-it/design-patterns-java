package design.pattern.structural.facade;

public class FacadeA extends AbstractFacade {

    private SubSystemA systemA = new SubSystemA();
    private SubSystemB systemB = new SubSystemB();

    public void method() {
        systemA.methodA();
        systemB.methodB();
    }
}
