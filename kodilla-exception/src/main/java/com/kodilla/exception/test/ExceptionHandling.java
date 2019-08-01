package com.kodilla.exception.test;

public class ExceptionHandling {
    String message;

    public ExceptionHandling(String message) {
        this.message = message;
    }

    public static void main (String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
//            secondChallenge.probablyWillThrowException(0.5, 1.5);
//            secondChallenge.probablyWillThrowException(1.8, 1.5);
            secondChallenge.probablyWillThrowException(1.4, 1.6);
            System.out.println("Program works without exceptions!");
        } catch (Exception e) {
            System.out.println("Exception happened: " + e);
        } finally {
            System.out.println("Program was done correctly through the whole code!");
        }
    }
}
