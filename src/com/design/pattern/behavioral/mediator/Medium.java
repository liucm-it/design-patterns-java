package design.pattern.behavioral.mediator;

// 抽象中介者：中介公司
public interface Medium {
    void register(Customer customer);
    void relay(String form, String ad);
}
