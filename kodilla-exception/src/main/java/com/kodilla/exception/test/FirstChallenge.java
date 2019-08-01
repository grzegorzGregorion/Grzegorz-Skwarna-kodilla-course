package com.kodilla.exception.test;

public class FirstChallenge {

    public String divide(double a, double b) throws ArithmeticException {
        double result = a / b;

        if (b == 0) {
            throw new ArithmeticException();
        }
        return ("Result of the operation is: " + result);
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            System.out.println(firstChallenge.divide(4,0));

        } catch (ArithmeticException k) {

            System.out.println("Dividing by zero is not allowed in this operation! The exception is: " + k);

        } finally {

            System.out.println("Operation done! The program was done correctly!");

        }
    }
}