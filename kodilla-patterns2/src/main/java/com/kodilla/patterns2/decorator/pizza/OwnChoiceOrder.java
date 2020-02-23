package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OwnChoiceOrder extends AbstractPizzaOrderDecorator {
    public OwnChoiceOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    //hardcoded stub cost 50 PLN builder to be implemented
    public BigDecimal getPrice() {
        return new BigDecimal(50);
    }

    @Override
    public String getDescription() {
        return "Own choice order";
    }

    @Override
    public Boolean takeAway() {
        return super.takeAway();
    }
}
