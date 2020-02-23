package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TuttoQuantoPizzaOrder extends AbstractPizzaOrderDecorator {
    public TuttoQuantoPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return "Tutto Quanto: szynka, boczek, salami, pieczarki";
    }

    @Override
    public Boolean takeAway() {
        return super.takeAway();
    }
}
