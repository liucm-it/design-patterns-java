package design.pattern.behavioral.visitor.typicalexample;

public class ConcreteVisitor extends Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        // elementA操作
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        // elementB操作
    }
}
