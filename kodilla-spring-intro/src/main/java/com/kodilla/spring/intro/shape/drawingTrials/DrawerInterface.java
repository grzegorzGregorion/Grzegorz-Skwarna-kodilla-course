package com.kodilla.spring.intro.shape.drawingTrials;

public class DrawerInterface {
    public void doDrawing() {
        Shape shape;

        shape = new CircleInterface();
        shape.draw();

        shape = new TriangleInterface();
        shape.draw();
    }
}
