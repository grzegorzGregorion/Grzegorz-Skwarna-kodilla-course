package com.kodilla.testing.shape;

public class Square implements Shape{
    String shapeName;
    int fieldParameter;

    public Square(String shapeName, int fieldParameter) {
        this.shapeName = shapeName;
        this.fieldParameter = fieldParameter;
    }

    public String getShapeName() {
        return shapeName;
    }

    private double getField() {
        return fieldParameter * fieldParameter;
    }
}
