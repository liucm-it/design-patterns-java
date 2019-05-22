package design.pattern.behavioral.visitor.typicalexample;

import java.util.ArrayList;
import java.util.Iterator;

public class ObjectStructure {
    private ArrayList<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addElement(Element element) {
        list.add(element);
    }

    public void removeElement(Element element) {
        list.remove(element);
    }
}
