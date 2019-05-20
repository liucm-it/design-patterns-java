package design.pattern.behavioral.memento.typicalexample;

public class Originator {
    private String state;

    public Originator() {

    }

    public Memento createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(Memento m) {
        state = m.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
