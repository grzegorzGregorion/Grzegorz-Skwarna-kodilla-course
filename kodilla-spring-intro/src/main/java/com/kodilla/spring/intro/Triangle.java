package com.kodilla.spring.intro;

public class Triangle implements Shape {
    @Override
    public String draw() {
        System.out.println("This is a DI triangle");
        return "This is a DI triangle";
    }
}
