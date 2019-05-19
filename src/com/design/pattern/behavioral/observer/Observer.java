package design.pattern.behavioral.observer;

public interface Observer {
    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}
