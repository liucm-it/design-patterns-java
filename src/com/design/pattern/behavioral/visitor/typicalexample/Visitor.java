package design.pattern.behavioral.visitor.typicalexample;

public abstract class Visitor {
    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);

    public void visit(ConcreteElementC elementC) {
        // elementC操作
    }
}
