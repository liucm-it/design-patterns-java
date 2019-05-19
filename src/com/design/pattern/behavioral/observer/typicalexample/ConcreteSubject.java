package design.pattern.behavioral.observer.typicalexample;


public class ConcreteSubject extends Subject {
    @Override
    public void notice() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
