package com.design.principle.dependenceinversion;

public class Driver implements IDriver {
    private ICar car;

    public Driver() {

    }

    /**
     * 构造器注入
     * @param car
     */
    public Driver(ICar car) {
        this.car = car;
    }

    public void drive() {
        car.run();
    }

    public void drive(ICar car) {
        car.run();
    }

    /**
     * set方法注入
     * @param car
     */
    public void setCar(ICar car) {
        this.car = car;
    }
}
