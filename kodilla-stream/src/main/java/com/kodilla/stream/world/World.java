package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentList = new ArrayList<>();

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continentList.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeopleQuantity = continentList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return totalPeopleQuantity;
    }
}