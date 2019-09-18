package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesames")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("NO_bacon")
                .ingredient("Cucumber")
                .ingredient("Chilli peppers")
                .ingredient("NO_mushrooms")
                .ingredient("Shrimps")
                .ingredient("Tomatoes")
//                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains("Onion"));
    }
}
