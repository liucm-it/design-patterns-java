package com.design.principle.singleresponsibility;

public class App {
    public static void main(String[] args) {
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("猪");
        terrestrial.breathe("狗");
        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }
}
