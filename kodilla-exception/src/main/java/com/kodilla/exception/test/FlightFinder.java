package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findTheFlight (Flight flight) {
        Map<String, Boolean> airportsMap = new HashMap<>();
        airportsMap.put("Barcelona", true);
        airportsMap.put("Cracow", true);
        airportsMap.put("New York", true);
        airportsMap.put("Roma", false);
        airportsMap.put("Oslo", true);
        airportsMap.put("Tokio", true);
        airportsMap.put("Vienna", true);

        for(Map.Entry<String, Boolean> entry :airportsMap.entrySet()){
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }
    }

    public static void main (String[] args) {
        Flight flight1 = new Flight("Barcelona", "Cracow");
        Flight flight2 = new Flight("Roma", "Vienna");
        Flight flight3 = new Flight("Oslo", "Barcelona");
        Flight flight4 = new Flight("New York", "Tokio");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findTheFlight(flight1);
    }
}
