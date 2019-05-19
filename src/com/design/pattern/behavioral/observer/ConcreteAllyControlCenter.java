package design.pattern.behavioral.observer;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("--------------------------");
        this.setAllyName(allyName);
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.getAllyName() + "战队紧急通知，盟友" + name + "遭受敌人攻击！请求支援...");
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
