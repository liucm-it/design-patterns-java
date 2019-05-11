package design.pattern.structural.composite.typicalexamples;

public abstract class Component {
    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract Component getChild(int i);

    public abstract void operation();
}
