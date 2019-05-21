package design.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// 具体中介者：房地产中介
public class EstateMedium implements Medium {

    private List<Customer> customers = new ArrayList<Customer>();

    @Override
    public void register(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            customer.setMedium(this);
        }
    }

    @Override
    public void relay(String form, String ad) {
        for (Customer c : customers) {
            String name = c.getName();
            if (!name.equals(form)) {
                c.receive(form, ad);
            }
        }
    }
}
