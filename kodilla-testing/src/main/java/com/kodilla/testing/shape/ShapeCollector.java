package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();
    Shape shape;

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        figures.remove(shape);
        return true;
    }

    public String toString(){
        return shape.getField() + shape.getShapeName();
    }

    public Shape getFigure (int n)
    {
        Shape shape = figures.get(n);
        return shape;
    }

    public Shape showFigures(){
        for(Shape shape: figures){
            return shape;
        }
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}