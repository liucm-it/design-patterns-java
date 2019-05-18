package desig.pattern.behavioral.iterator;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> products) {
        super(products);
    }

    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
