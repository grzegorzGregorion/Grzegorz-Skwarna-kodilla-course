package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicOrderGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calulatedValue = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(5), calulatedValue);

    }

    @Test
    public void testBasicOrderGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String description = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkOrderDecoratorGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), calculatedCost);
    }

    @Test
    public void testTaxiNetworkOrderDecoratorGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //When
        String desc = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network", desc);
    }

    @Test
    public void testMyTaxiWithChildSeatDecoratorGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(37), calculatedCost);
    }

    @Test
    public void testMyTaxiWithChildSeatDecoratorGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        String desc = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by MyTaxi Network + child seat", desc);
    }

    @Test
    public void testUberWithTwoChildSeatsDecoratorGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(29), calculatedCost);
    }

    @Test
    public void testUberWithTwoChildSeatsDecoratorGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        String desc = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Uber Taxi + child seat + child seat", desc);
    }

    @Test
    public void testTaxiNetworkWithVipTaxiExpressChildSeatDecoratorGetCost() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();
        //Then
        assertEquals(new BigDecimal(57), calculatedCost);
    }

    @Test
    public void testTaxiNetworkWithVipTaxiExpressChildSeatDecoratorGetDescription() {
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipCarDecorator(taxiOrder);
        taxiOrder = new ExpressDecorator(taxiOrder);
        taxiOrder = new ChildSeatOrderDecorator(taxiOrder);
        //When
        String desc = taxiOrder.getDescription();
        //Then
        assertEquals("Drive a course by Taxi Network + VIP car + express service + child seat", desc);
    }
}