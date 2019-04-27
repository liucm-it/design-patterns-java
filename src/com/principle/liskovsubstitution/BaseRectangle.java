package com.principle.liskovsubstitution;

public class BaseRectangle extends Base {
    void zoom(int width, int height) {
        setWidth(getWidth() + width);
        setHeight(getHeight() + height);
        System.out.println("Base Rectangle height:" + this.getHeight());
        System.out.println("Base Rectangle width:" + this.getWidth());
    }
}
