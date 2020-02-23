package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalsicciaPizzaOrder extends AbstractPizzaOrderDecorator {
    public SalsicciaPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(22));
    }

    @Override
    public String getDescription() {
        return "Salsiccia: włoska kiełbasa pepperoni";
    }

    @Override
    public Boolean takeAway() {
        return super.takeAway();
    }
}
