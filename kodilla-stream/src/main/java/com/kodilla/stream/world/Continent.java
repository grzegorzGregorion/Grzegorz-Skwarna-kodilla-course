package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final String hemisphere;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(final String continentName, final String hemisphere) {
        this.continentName = continentName;
        this.hemisphere = hemisphere;
    }

    public void addCountry(Country country) {
        countriesList.add(country);
    }

    public boolean removeCountry(Country country) {
        return countriesList.remove(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public String getHemisphere() {
        return hemisphere;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (continentName != null ? !continentName.equals(continent.continentName) : continent.continentName != null)
            return false;
        if (hemisphere != null ? !hemisphere.equals(continent.hemisphere) : continent.hemisphere != null) return false;
        return countriesList != null ? countriesList.equals(continent.countriesList) : continent.countriesList == null;
    }

    @Override
    public int hashCode() {
        int result = continentName != null ? continentName.hashCode() : 0;
        result = 31 * result + (hemisphere != null ? hemisphere.hashCode() : 0);
        result = 31 * result + (countriesList != null ? countriesList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", hemisphere='" + hemisphere + '\'' +
                ", countriesList=" + countriesList +
                '}';
    }
}