package design.pattern.structural.facade;

public class FacadeB extends AbstractFacade {
    private SubSystemA systemA = new SubSystemA();
    private SubSystemB systemB = new SubSystemB();
    private SubSystemC systemC = new SubSystemC();

    public void method() {
        systemA.methodA();
        systemB.methodB();
        systemC.methodC();
    }
}
