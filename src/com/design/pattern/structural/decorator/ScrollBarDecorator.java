package design.pattern.structural.decorator;

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addScrollBar();

        super.display();
    }

    public void addScrollBar() {
        System.out.println("构件增加滚动条！");
    }
}
