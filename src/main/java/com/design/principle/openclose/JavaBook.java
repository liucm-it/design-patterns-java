package com.design.principle.openclose;

public class JavaBook implements IBook {
    private int id;
    private String name;
    private double price;

    public JavaBook(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
