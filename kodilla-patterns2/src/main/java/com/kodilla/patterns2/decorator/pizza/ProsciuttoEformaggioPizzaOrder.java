package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ProsciuttoEformaggioPizzaOrder extends AbstractPizzaOrderDecorator {
    public ProsciuttoEformaggioPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(14));
    }

    @Override
    public String getDescription() {
        return "Prosciutto e Formaggio: szynka, ser, brokuły";
    }

    @Override
    public Boolean takeAway() {
        return super.takeAway();
    }
}
