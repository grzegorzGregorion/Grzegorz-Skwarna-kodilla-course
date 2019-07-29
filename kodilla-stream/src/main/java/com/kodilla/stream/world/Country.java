package com.kodilla.stream.world;

        import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final String language;
    private final String government;
    private BigDecimal peopleQuantity;

    public Country(final String countryName, final String language, final String government, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.language = language;
        this.government = government;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLanguage() {
        return language;
    }

    public String getGovernment() {
        return government;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;
        if (language != null ? !language.equals(country.language) : country.language != null) return false;
        if (government != null ? !government.equals(country.government) : country.government != null) return false;
        return peopleQuantity != null ? peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = countryName != null ? countryName.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (government != null ? government.hashCode() : 0);
        result = 31 * result + (peopleQuantity != null ? peopleQuantity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", language='" + language + '\'' +
                ", government='" + government + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}