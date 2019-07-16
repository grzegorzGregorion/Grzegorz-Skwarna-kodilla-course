package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();
    Shape shape;

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public String toString(){
        return shape.getField() + shape.getShapeName();
    }

    public Shape getFigure (int n)
    {
        Shape shape = figures.get(n);
        return shape;
    }

    public String showFigures(){
        String message = null;
        for(Shape shape: figures){
            message =  shape.getShapeName() + " " + shape.getField();
        }
        return message;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}