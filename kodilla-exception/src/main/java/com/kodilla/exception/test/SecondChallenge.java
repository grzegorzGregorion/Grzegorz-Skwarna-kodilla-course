package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyWillThrowException(double x, double y) throws ExceptionHandling {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new ExceptionHandling("Out of range!", "Review the code!");
        }
        return "Done!";
    }
}
