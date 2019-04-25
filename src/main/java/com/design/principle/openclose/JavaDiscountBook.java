package com.design.principle.openclose;

public class JavaDiscountBook extends JavaBook {
    public JavaDiscountBook(int id, String name, double price) {
        super(id, name, price);
    }

    public double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
