package com.kodilla.good.patterns.challenges.food2door.Objects;

public class SupplierAddress {
    String city;
    int postalCode;
    String street;
    int number;

    public SupplierAddress(String city, int postalCode, String street, int number) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }
}
