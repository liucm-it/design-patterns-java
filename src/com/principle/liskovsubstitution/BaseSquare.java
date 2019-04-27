package com.principle.liskovsubstitution;

public class BaseSquare extends Base {
    void zoom(int width, int height) {
        int length = (width + height) / 2;
        setHeight(getHeight() + length);
        setWidth(getWidth() + length);
        System.out.println("Base Square height:" + this.getHeight());
        System.out.println("Base Square width:" + this.getWidth());
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
