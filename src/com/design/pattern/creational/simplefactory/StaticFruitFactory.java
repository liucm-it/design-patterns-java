package com.design.pattern.creational.simplefactory;

public class StaticFruitFactory {
    public static final int APPLE_TYPE = 1;
    public static final int ORANGE_TYPE = 2;
    public static final int BANANA_TYPE = 3;

    public static Fruit getFruit(int type) {
        if (type == APPLE_TYPE) {
            return new Apple();
        } else if (type == ORANGE_TYPE) {
            return new Orange();
        } else if (type == BANANA_TYPE) {
            return new Banana();
        } else {
            throw new RuntimeException("no such type");
        }
    }

    public static Fruit getFruit(Class c) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
