package com.design.principle.singleresponsibility;

class Animal {
    public void terrestrialBreathe(String animal) {
        System.out.println(animal + "陆上呼吸空气");
    }

    public void aquaticBreathe(String animal) {
        System.out.println(animal + "水下呼吸");
    }
}

public class Client {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.terrestrialBreathe("牛");
        animal.terrestrialBreathe("猪");
        animal.terrestrialBreathe("狗");
        animal.aquaticBreathe("鱼");
    }
}
