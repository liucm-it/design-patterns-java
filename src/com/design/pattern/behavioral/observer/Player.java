package design.pattern.behavioral.observer;

public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住！ " + this.name + "马上赶来支援！");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被袭击！");
        acc.notifyObserver(name);
    }
}
