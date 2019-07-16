package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    private String shapeName;
    private int width;
    private int height;

    public Rectangle(String shapeName, int width, int height) {
        this.shapeName = shapeName;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "I'm " + shapeName;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
