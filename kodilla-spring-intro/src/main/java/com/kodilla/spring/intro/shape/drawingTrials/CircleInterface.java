package com.kodilla.spring.intro.shape.drawingTrials;

public class CircleInterface implements Shape {
    @Override
    public String draw() {
        System.out.println("This is a circle");
        return "This is a circle";
    }
}
