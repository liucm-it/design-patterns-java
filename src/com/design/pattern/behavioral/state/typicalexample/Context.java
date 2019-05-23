package design.pattern.behavioral.state.typicalexample;

public class Context {
    private State state;
    private int value;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        // ...
        state.handle();
        // ...
    }

    public void changeState() {
        // 根据条件属性值进行状态转换
        if (value == 0) {
            this.setState(new ConcreteState());
        } else if (value == 1) {
            this.setState(new ConcreteState());
        }

    }
}
