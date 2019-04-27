package com.principle.liskovsubstitution;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.zoom(new BaseRectangle(), 100, 130);
        app.zoom(new BaseSquare(), 100, 130);
    }

    private void zoom(Base base, int height, int width) {
        base.zoom(width, height);
    }
}
