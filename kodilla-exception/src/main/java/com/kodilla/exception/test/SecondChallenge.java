package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }

/*    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = secondChallenge.probablyWillThrowException(1.5, 4);
        System.out.println(result);
    }*/
}
