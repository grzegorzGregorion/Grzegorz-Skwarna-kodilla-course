package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int radius;

    public Circle(String shapeName, int radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", radius=" + radius +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public String getShapeName() {
        return "I'm " + shapeName;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
