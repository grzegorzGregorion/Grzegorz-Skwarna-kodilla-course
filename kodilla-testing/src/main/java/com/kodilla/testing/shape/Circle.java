package com.kodilla.testing.shape;

public class Circle implements Shape{
    String shapeName;
    int fieldParameter;

    public Circle(String shapeName, int fieldParameter) {
        this.shapeName = shapeName;
        this.fieldParameter = fieldParameter;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return (3.14 * fieldParameter * fieldParameter);
    }
}
