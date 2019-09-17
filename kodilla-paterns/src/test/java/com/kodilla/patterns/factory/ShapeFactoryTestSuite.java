package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class ShapeFactoryTestSuite {
    //    Test 1
    @Test
    public void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assert.assertEquals(54.1060, circle.getArea(), 0.0001);
        Assert.assertEquals("The rounded circle", circle.getName());
    }

    //    Test2
    @Test
    public void testFactorySquare() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assert.assertEquals(50.41, square.getArea(), 0.0001);
        Assert.assertEquals("The angular square", square.getName());
    }

    //    Test 3
    @Test
    public void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assert.assertEquals(40.5752, rectangle.getArea(), 0.0001);
        Assert.assertEquals("The long rectangle", rectangle.getName());
        Assert.assertEquals(35.64, rectangle.getCircumference(), 0.01);
    }
}
