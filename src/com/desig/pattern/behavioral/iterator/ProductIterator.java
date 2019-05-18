package desig.pattern.behavioral.iterator;

import java.util.List;

public class ProductIterator implements AbstractIterator {
    private ProductList productList;
    private List products;
    private int head;
    private int tail;
    public ProductIterator(ProductList list) {
        this.productList = list;
        this.products = list.getObjects();
        this.head = 0;
        this.tail = products.size() - 1;
    }

    public void next() {
        if (head < products.size()) {
            head++;
        }
    }

    public boolean isLast() {
        return head == products.size();
    }

    public void previous() {
        if (tail > -1) {
            tail--;
        }
    }

    public boolean isFirst() {
        return tail == -1;
    }

    public Object getNextItem() {
        return products.get(head);
    }

    public Object getPreviousItem() {
        return products.get(tail);
    }

    public boolean hasNext() {
        return !isLast();
    }
}
