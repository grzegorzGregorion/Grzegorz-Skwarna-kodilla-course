package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        for (Shape shape : figures) {
            System.out.println(shape);
        }
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}