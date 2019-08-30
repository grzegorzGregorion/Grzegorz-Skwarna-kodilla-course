package com.kodilla.spring.intro;

public class Circle implements Shape {
    @Override
    public String draw() {
        System.out.println("This is a DI circle");
        return "This is a DI circle";
    }
}
