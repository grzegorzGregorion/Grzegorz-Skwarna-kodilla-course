package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    //Test1
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        // When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent:continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }
        // Then
        BigDecimal expectedSandQuantity = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSandQuantity, totalSand);
    }

    //Test2
    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //When
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());
        //Given
        BigDecimal totalSand = continents.stream()
//                .map(continent -> continent.getSandBeansQuantity())
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedValue = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedValue, totalSand);
    }
}
