package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(15), pizzaPrice);
        assertEquals("Margherita", pizzaDescription);
        assertEquals(false, takeAway);
    }

    @Test
    public void testCapricciosaPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapricciosaPizzaOrder(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(27), pizzaPrice);
        assertEquals("Capricciosa: szynka + pieczarki", pizzaDescription);
        assertEquals(false, takeAway);
    }

    @Test
    public void testSalsicciaPizzaWithDeliveryOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalsicciaPizzaOrder(pizzaOrder);
        pizzaOrder = new ToTakeAwayOrder(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(44), pizzaPrice);
        assertEquals("Salsiccia: włoska kiełbasa pepperoni + to take away", pizzaDescription);
        assertEquals(true, takeAway);
    }

    @Test
    public void testProsciutoEformaggioPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ProsciuttoEformaggioPizzaOrder(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(29), pizzaPrice);
        assertEquals("Prosciutto e Formaggio: szynka, ser, brokuły", pizzaDescription);
        assertEquals(false, takeAway);
    }

    @Test
    public void testTuttoQuantoBigPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new TuttoQuantoPizzaOrder(pizzaOrder);
        pizzaOrder = new BigPizzaOrder(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(34.50), pizzaPrice);
        assertEquals("Tutto Quanto: szynka, boczek, salami, pieczarki + big pizza order", pizzaDescription);
        assertEquals(false, takeAway);
    }

    @Test
    public void testOwnChoiceBigPizzaWithDeliveryOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new OwnChoiceOrder(pizzaOrder);
        pizzaOrder = new BigPizzaOrder(pizzaOrder);
        pizzaOrder = new ToTakeAwayOrder(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getPrice();
        String pizzaDescription = pizzaOrder.getDescription();
        Boolean takeAway = pizzaOrder.takeAway();
        //Then
        assertEquals(new BigDecimal(61.50), pizzaPrice);
        assertEquals("Own choice order + big pizza order + to take away", pizzaDescription);
        assertEquals(true, takeAway);
    }

}

