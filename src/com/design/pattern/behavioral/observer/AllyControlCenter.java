package design.pattern.behavioral.observer;

import java.util.Vector;

// 战队控制中心
public abstract class AllyControlCenter {
    private String allyName;
    protected Vector<Observer> players = new Vector<>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
        players.add(observer);
    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "战队！");
    }

    public abstract void notifyObserver(String name);
}
