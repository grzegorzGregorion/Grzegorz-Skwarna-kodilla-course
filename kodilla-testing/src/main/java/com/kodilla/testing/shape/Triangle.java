package com.kodilla.testing.shape;

public class Triangle implements Shape{
    String shapeName;
    int fieldParameter;

    public Triangle(String shapeName, int fieldParameter) {
        this.shapeName = shapeName;
        this.fieldParameter = fieldParameter;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return ((fieldParameter * fieldParameter * Math.sqrt(3)) / 4);
    }
}
