package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
        import java.util.List;

public final class FlightsRepository {
    private final List<Flight> flightList = new ArrayList<>();

    public FlightsRepository() {
        flightList.add(new Flight("Oslo", "New York"));
        flightList.add(new Flight("New York", "Paris"));
        flightList.add(new Flight("Paris", "Moscow"));
        flightList.add(new Flight("Oslo", "Zurich"));
        flightList.add(new Flight("Barcelona", "Tokio"));
        flightList.add(new Flight("Paris", "Barcelona"));
        flightList.add(new Flight("Madrid", "Paris"));
        flightList.add(new Flight("Roma", "Roma"));
        flightList.add(new Flight("Gdansk", "Paris"));
        flightList.add(new Flight("Barcelona", "Washington"));;
    }

    public List<Flight> getList() {
        return new ArrayList<>(flightList);
    }
}
