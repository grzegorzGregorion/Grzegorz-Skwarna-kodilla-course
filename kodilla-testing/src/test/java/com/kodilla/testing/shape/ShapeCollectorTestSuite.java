package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest(){
        System.out.println("This is just the beginning of all tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished!");
    }

    @Before
    public void beforeEveryTest(){
        System.out.println("This is just the beginning of all tests.");
    }
    //test 1
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circleShape = new Circle("circleName", 3);
        //When
        shapeCollector.addFigure(circleShape);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }
    //test 2
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circleShape = new Circle("circleName", 3);
        //When
        shapeCollector.addFigure(circleShape);
        boolean result = shapeCollector.removeFigure(circleShape);
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }
    //test 3
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circleShape = new Circle("circleName", 3);
        shapeCollector.addFigure(circleShape);
        //When
        ShapeCollector retrievedShape = (ShapeCollector) shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circleShape, retrievedShape);
    }
    //test 4
    @Test
    public void testShowFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circleShape = new Circle("circleName", 3);
        shapeCollector.addFigure(circleShape);
        //When
        ShapeCollector showedFigures = (ShapeCollector) shapeCollector.showFigures();
        //Then
        Assert.assertEquals(showedFigures, circleShape);
    }
    //test 5
    @Test
    public void testRemoveNotExistingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circleShape = new Circle("circleName", 4);
        //When
        boolean result = shapeCollector.removeFigure(circleShape);
        //Then
        Assert.assertFalse(result);
    }
}