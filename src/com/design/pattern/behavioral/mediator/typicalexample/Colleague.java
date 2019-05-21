package design.pattern.behavioral.mediator.typicalexample;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void methodA();

    public void methodB() {
        mediator.operation();
    }
}
