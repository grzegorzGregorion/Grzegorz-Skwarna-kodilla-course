package com.kodilla.good.patterns.challenges.food2door.Objects;

import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public class OrderRequest {
    Supplier supplier;
    OrderedProduct orderedProduct;

    public OrderRequest(Supplier supplier, OrderedProduct orderedProduct) {
        this.supplier = supplier;
        this.orderedProduct = orderedProduct;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public OrderedProduct getOrderedProduct() {
        return orderedProduct;
    }
}
