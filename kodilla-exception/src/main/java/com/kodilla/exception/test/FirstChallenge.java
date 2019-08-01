package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            System.out.println(firstChallenge.divide(16,4));
        } catch (ArithmeticException k) {
            System.out.println("Dividing by zero is not allowed in this operation! The exception is: " + k);
        } finally {
            System.out.println("Operation done! The program was done correctly!");
        }
    }
}