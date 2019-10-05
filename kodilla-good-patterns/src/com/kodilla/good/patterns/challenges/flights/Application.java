package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println("From Madrid:" + flightFinder.fromFinder("Madrid"));
        System.out.println("To Paris:" + flightFinder.whereFinder("Paris"));
        System.out.println("Via Barcelona:" + flightFinder.viaFinder("Madrid", "Paris", "Barcelona"));
    }
}
