package design.pattern.structural.decorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addBlackBorder();
        super.display();
    }

    public void addBlackBorder() {
        System.out.println("构件增加黑色边框！");
    }
}
