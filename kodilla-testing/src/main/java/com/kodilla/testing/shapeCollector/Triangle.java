package com.kodilla.testing.shapeCollector;

public class Triangle implements Shape {
    String name;
    String fieldCharacteristic;

    public Triangle(String name, String fieldCharacteristic) {
        this.name = name;
        this.fieldCharacteristic = fieldCharacteristic;
    }

    @Override
    public String getShapeName(String name) {
        return null;
    }

    @Override
    public String getField(String name) {
        return null;
    }
}
