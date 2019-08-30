package com.kodilla.spring.intro.shape.drawingTrials;

public class DrawerModified {
    public void doDrawing() {
        Figure figure;

        figure = new Circle();
        figure.draw();

        figure = new Triangle();
        figure.draw();
    }
}
