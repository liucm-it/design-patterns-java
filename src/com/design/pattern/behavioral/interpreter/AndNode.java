package design.pattern.behavioral.interpreter;

public class AndNode extends AbstractNode {
    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    public String interpret() {
        return left.interpret() + "并且" + right.interpret();
    }
}
