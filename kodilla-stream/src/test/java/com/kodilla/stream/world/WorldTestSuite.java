package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    //Test 1
    @Test
    public void testGetPeopleQuantity() {
        //When
        Country country1 = new Country("Kingdom of the Netherlands", "Dutch", "Semi-federal parliamentary constitutional monarchy", new BigDecimal("12345678901234567890"));
        Country country2 = new Country("Russia", "Russian", "Federal dominant-party semi-presidential constitutional republic", new BigDecimal("0"));
        Country country3 = new Country("B", "Dutch", "Semi-federal parliamentary constitutional monarchy", new BigDecimal("0"));

        Country country4 = new Country("C", "ab", "Semi-federal", new BigDecimal("98765432101234567890"));
        Country country5 = new Country("D", "bc", "Semi-federal", new BigDecimal("0"));
        Country country6 = new Country("E", "dg", "Semi-federal", new BigDecimal("0"));

        Country country7 = new Country("F", "uj", "Semi-federal", new BigDecimal("99999999901234567890"));
        Country country8 = new Country("G", "ik", "Semi-federal", new BigDecimal("0"));
        Country country9 = new Country("H", "lo", "Semi-federal", new BigDecimal("0"));

        Country country10 = new Country("Australia", "English", "Federal parliamentary constitutional monarchy", new BigDecimal("0"));

        Continent continent1 = new Continent("Australia", "Southern");
        Continent continent2 = new Continent("Europe", "Northern");
        Continent continent3 = new Continent("North America", "Northern");
        Continent continent4 = new Continent("Africa", "Southern");

        //When
        continent1.addCountry(country10);

        continent2.addCountry(country1);
        continent2.addCountry(country2);
        continent2.addCountry(country3);

        continent3.addCountry(country4);
        continent3.addCountry(country5);
        continent3.addCountry(country6);

        continent4.addCountry(country7);
        continent4.addCountry(country8);
        continent4.addCountry(country9);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);

        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedValue = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedValue, peopleQuantity);
    }
}
