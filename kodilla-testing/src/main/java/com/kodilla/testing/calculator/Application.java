package com.kodilla.testing.calculator;

public class Application {
    public static void main (String[] args){
        Calculator calc = new Calculator();
        double result1 = calc.addAtoB(4, 6.8);
        double result2 = calc.subtractBfromA(8.61, 9.31);

        System.out.println(result1 + " " + result2);
    }
}
