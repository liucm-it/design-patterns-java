package design.pattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new Window();
        ScrollBarDecorator componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        BlackBorderDecorator borderDecorator = new BlackBorderDecorator(componentSB);
        borderDecorator.display();
    }
}
