package desig.pattern.behavioral.iterator.typicalexample;

public class ConcreteAggregate implements Aggregate{
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
