package desig.pattern.behavioral.iterator.typicalexample;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate objects;
    private int cursor;
    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects = objects;
    }

    public void first() {
        // ...
    }

    public void next() {
        // ...
    }

    public boolean hasNext() {
        // ...
        return false;
    }

    public Object currentItem() {
        // ...
        return null;
    }
}
