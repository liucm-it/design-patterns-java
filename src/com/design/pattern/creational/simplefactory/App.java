package com.design.pattern.creational.simplefactory;

public class App {
    public static void main(String[] args) {
        Fruit apple = StaticFruitFactory.getFruit(StaticFruitFactory.APPLE_TYPE);
        System.out.println(apple.getFruitName());
        Fruit banana = StaticFruitFactory.getFruit(StaticFruitFactory.BANANA_TYPE);
        System.out.println(banana.getFruitName());
        Fruit orange = StaticFruitFactory.getFruit(StaticFruitFactory.ORANGE_TYPE);
        System.out.println(orange.getFruitName());
    }
}
