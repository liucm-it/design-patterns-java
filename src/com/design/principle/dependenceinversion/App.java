package com.design.principle.dependenceinversion;

public class App {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        ICar benz = new Benz();
        driver.drive(benz);
        driver.drive(new BMW());

        IDriver newDriver = new Driver(new Benz());
        newDriver.drive();

        IDriver setDriver = new Driver();
        setDriver.setCar(new BMW());
        setDriver.drive();
    }
}
