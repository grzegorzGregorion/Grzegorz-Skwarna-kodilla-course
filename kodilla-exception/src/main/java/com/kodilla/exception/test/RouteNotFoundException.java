package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    String exceptionMessage;

    public RouteNotFoundException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
