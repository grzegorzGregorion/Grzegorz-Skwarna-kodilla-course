package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    protected void displayValue(double val) {
        System.out.println("Result of the equation is: " + val);
    }
}
