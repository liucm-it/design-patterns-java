package design.pattern.behavioral.memento.typicalexample;

public class Memento {
    String state;

    public Memento(Originator originator) {
        state = originator.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
