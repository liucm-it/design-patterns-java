package com.design.principle.dependenceinversion;

public interface IDriver {
    void drive(ICar car);
    void setCar(ICar car);
    void drive();
}
