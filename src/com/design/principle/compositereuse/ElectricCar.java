package com.design.principle.compositereuse;

public class ElectricCar extends Car {
    public ElectricCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("电动汽车");
        super.move();
    }
}
