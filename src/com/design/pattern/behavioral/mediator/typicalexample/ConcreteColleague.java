package design.pattern.behavioral.mediator.typicalexample;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void methodA() {
        // ...
    }
}
