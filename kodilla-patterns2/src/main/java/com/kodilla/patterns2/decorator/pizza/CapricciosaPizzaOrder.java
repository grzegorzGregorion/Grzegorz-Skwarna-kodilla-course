package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CapricciosaPizzaOrder extends AbstractPizzaOrderDecorator {
    public CapricciosaPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return "Capricciosa: szynka + pieczarki";
    }

    @Override
    public Boolean takeAway() {
        return super.takeAway();
    }
}
