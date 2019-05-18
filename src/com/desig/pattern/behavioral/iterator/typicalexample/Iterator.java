package desig.pattern.behavioral.iterator.typicalexample;

public interface Iterator {
    void first();
    void next();
    boolean hasNext();
    Object currentItem();
}
