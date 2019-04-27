package com.design.principle.compositereuse;

public class App {

    public static void main(String[] args) {
        Car electricCar = new ElectricCar(new Color());
        electricCar.move();

        Car gasolineCar = new GasolineCar(new Color());
        gasolineCar.move();
    }
}
