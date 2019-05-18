package desig.pattern.behavioral.iterator;

public interface AbstractIterator {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
    boolean hasNext();
}
