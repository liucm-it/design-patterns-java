package design.pattern.behavioral.interpreter;

public class DirectionNode extends AbstractNode {

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    public String interpret() {
        switch (direction) {
            case "up":
                return "向上";
            case "down":
                return "向下";
            case "left":
                return "向左";
            case "right":
                return "向右";
            default:
                return "无效指令";
        }
    }
}
