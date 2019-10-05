package com.kodilla.good.patterns.challenges.flights;

public final class Flight {
    private final String departureAirport;
    private final String ArrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        ArrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return ArrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", ArrivalAirport='" + ArrivalAirport + '\'' +
                '}';
    }
}
