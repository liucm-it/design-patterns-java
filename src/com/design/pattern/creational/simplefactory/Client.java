package com.design.pattern.creational.simplefactory;

public class Client {

    public static void main(String[] args) {
        Fruit apple = StaticFruitFactory.getFruit(Apple.class);
        System.out.println(apple.getFruitName());
        Fruit banana = StaticFruitFactory.getFruit(Banana.class);
        System.out.println(banana.getFruitName());
        Fruit orange = StaticFruitFactory.getFruit(Orange.class);
        System.out.println(orange.getFruitName());
    }
}
