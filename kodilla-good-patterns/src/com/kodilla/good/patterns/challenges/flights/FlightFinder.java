package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public List<Flight> fromFinder(String fromCity) {
        FlightsRepository flightsList = new FlightsRepository();
        List<Flight> fromList = new ArrayList<>();
        fromList = flightsList.getList().stream()
                .filter(flight -> flight.getDepartureAirport() == fromCity)
                .collect(Collectors.toList());

        System.out.println("From " + fromCity + " List:" + fromList);
        return fromList;

    }

    public List<Flight> whereFinder(String whereCity) {
        FlightsRepository flightsList = new FlightsRepository();
        List<Flight> whereList = new ArrayList<>();
        whereList = flightsList.getList().stream()
                .filter(flight -> flight.getArrivalAirport() == whereCity)
                .collect(Collectors.toList());

        System.out.println("To " + whereCity + " List:" + whereList);
        return whereList;
    }

    public List<Flight> viaFinder(String fromCity, String whereCity, String viaCity) {
        FlightsRepository flightsList = new FlightsRepository();
        List<Flight> viaList = new ArrayList<>();
        viaList = flightsList.getList().stream()
                .filter(flight -> flight.getArrivalAirport() == viaCity)
                .collect(Collectors.toList());

        viaList.addAll(flightsList.getList().stream()
                .filter(flight -> flight.getDepartureAirport() == viaCity)
                .collect(Collectors.toList()));

        System.out.println("Via " + viaCity + " List:" + viaList);
        return viaList;
    }
}
