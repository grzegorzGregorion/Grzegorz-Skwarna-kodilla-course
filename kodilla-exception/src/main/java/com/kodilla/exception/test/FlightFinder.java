package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightFinder {
    public boolean findTheFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Barcelona", true);
        airportsMap.put("Cracow", true);
        airportsMap.put("New York", true);
        airportsMap.put("Roma", false);
        airportsMap.put("Oslo", true);
        airportsMap.put("Tokio", true);
        airportsMap.put("Vienna", true);

        if (airportsMap.containsKey(flight.getArrivalAirport())) {
            return airportsMap.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Route not available due to airport being closed!");
        }
    }

    public static void main (String[] args) {
        Flight flight1 = new Flight("Barcelona", "Cracow");
        Flight flight2 = new Flight("Roma", "Vienna");
        Flight flight3 = new Flight("Oslo", "Barcelona");
        Flight flight4 = new Flight("New York", "Tokio");
        Flight flight5 = new Flight("New York", "Paris");
        Flight flight6 = new Flight("New York", "Roma");

        FlightFinder flightFinder = new FlightFinder();
        try {
            System.out.println(flightFinder.findTheFlight(flight6));
            System.out.println(flightFinder.findTheFlight(flight3));
            System.out.println(flightFinder.findTheFlight(flight5));
        } catch (RouteNotFoundException e) {
            System.out.println(e.exceptionMessage);
        } finally {
            System.out.println("Program finished work correctly!");
        }
    }
}
