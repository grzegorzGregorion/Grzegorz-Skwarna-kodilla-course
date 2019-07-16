package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int fieldParam;

    public Circle(String shapeName, int fieldParam) {
        this.shapeName = shapeName;
        this.fieldParam = fieldParam;
    }

    public String getShapeName(){
        return "I'm " + shapeName;
    }
    public double getField(){
        return fieldParam;
    }
}
