package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.fromFinder("Oslo");
        flightFinder.whereFinder("Paris");
        flightFinder.viaFinder("Madrid", "Paris", "Barcelona");
    }
}
