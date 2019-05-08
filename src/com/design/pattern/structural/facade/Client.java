package design.pattern.structural.facade;

public class Client {

    public static void main(String[] args) {

        AbstractFacade facadeA = new FacadeA();
        facadeA.method();

        AbstractFacade facadeB = new FacadeB();
        facadeB.method();
    }
}
