package com.design.principle.compositereuse;

public class GasolineCar extends Car {
    public GasolineCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("汽油汽车");
        super.move();
    }
}
