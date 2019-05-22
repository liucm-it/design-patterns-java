package design.pattern.behavioral.visitor.typicalexample;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        // ...
    }
}

class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {

    }

    public void operationA() {
        // ...
    }
}

class ConcreteElementC implements Element {

    @Override
    public void accept(Visitor visitor) {

    }

    public void operationA() {
        // ...
    }
}