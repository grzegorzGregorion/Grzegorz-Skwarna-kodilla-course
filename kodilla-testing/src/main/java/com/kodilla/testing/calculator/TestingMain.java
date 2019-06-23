package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main (String[] args){
        Calculator calculatorTest = new Calculator();

        double addingTestResult = calculatorTest.addAtoB(4.5, 5.5);
        double subtractingTestResult = calculatorTest.subtractBfromA(15.3, 5.3);
        double testResult = 10.1;
        if (addingTestResult == testResult && subtractingTestResult == testResult){
            System.out.println("Test passed OK!");
        } else {
            System.out.println("Calculator class returns ERROR! Please check which method returns error: addAtoB or subtractBfromA.");
        }
    }
}
