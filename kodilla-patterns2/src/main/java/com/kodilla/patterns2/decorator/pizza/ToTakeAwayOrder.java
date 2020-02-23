package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ToTakeAwayOrder extends AbstractPizzaOrderDecorator {
    public ToTakeAwayOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + to take away";
    }

    @Override
    public Boolean takeAway() {
        return true;
    }
}
