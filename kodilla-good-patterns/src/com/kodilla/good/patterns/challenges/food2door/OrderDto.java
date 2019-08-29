package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.Objects.OrderedProduct;
import com.kodilla.good.patterns.challenges.food2door.Objects.Supplier;

public class OrderDto {
    Supplier supplier;
    String productName;
    double productPrice;

    public OrderDto(Supplier supplier, OrderedProduct orderedProduct) {
        this.supplier = supplier;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
