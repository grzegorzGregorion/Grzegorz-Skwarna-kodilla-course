package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator tester = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = tester.exterminate(emptyList);
        //then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        ArrayList<Integer> exampleList = new ArrayList<Integer>();
        exampleList.add(10);
        exampleList.add(111);
        exampleList.add(983);
        exampleList.add(34);
        exampleList.add(4);
        OddNumbersExterminator tester = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = tester.exterminate(exampleList);
        //then
        Assert.assertEquals(3, result.size());
    }
}