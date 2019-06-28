package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.shapeCollector.Circle;
import com.kodilla.testing.shapeCollector.Shape;
import com.kodilla.testing.shapeCollector.ShapeCollector;
import org.junit.*;

import java.awt.*;

public class ForumTestSuit {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle("circle", "5");
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.showFigures());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle("circle", "5");
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.showFigures());
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle("circle", "5");
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.getFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.showFigures());
    }
}