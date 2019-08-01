package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling();
        }
        return "Done!";
    }

    public static void main (String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyWillThrowException(0.5, 1.5);
//            secondChallenge.probablyWillThrowException(1.8, 1.5);
//            secondChallenge.probablyWillThrowException(1.4, 1.6);
            System.out.println("Program works without exceptions!");
        } catch (ExceptionHandling k) {
            System.out.println("Exception happened: " + k);
        } finally {
            System.out.println("Program was done correctly through the whole code!");
        }
    }
}
