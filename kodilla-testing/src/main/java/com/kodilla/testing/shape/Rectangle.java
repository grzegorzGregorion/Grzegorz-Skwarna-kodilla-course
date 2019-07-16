package com.kodilla.testing.shape;

public class Rectangle implements Shape {
    String shapeName;
    int fieldParam;

    public Rectangle(String shapeName, int fieldParam) {
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
