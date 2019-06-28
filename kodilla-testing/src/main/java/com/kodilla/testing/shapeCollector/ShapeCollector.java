package com.kodilla.testing.shapeCollector;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Shape
{

    String getShapeName(String name);

    String getField(String name);
}

public class ShapeCollector {
    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Shape addFigure(Shape shape){
        Shape shape = new Shape();
        shapes.add(shape);
    }

    public Shape removeFigure(Shape shape){
        Shape shape = new Shape();
        shapes.remove(shape);
    }

    public Shape getFigure(Circle n){

        return null;
    }

    public Shape showFigures(){
        return null;
    }
}