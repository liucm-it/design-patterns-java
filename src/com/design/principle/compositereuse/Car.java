package com.design.principle.compositereuse;

public class Car {

    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public void move() {
        System.out.println("汽车开始启动了....");
    }
}
