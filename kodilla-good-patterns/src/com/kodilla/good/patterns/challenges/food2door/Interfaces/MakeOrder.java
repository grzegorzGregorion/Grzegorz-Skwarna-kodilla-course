package com.kodilla.good.patterns.challenges.food2door.Interfaces;

import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public interface MakeOrder {
    boolean getInfo(OrderedProduct orderedProduct, OrderedProduct product);
    boolean orderProcess(Supplier supplier);
    boolean checkOrderStatus(Supplier supplier, OrderedProduct orderedProduct);
}
