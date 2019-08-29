package com.kodilla.good.patterns.challenges.food2door.Objects;

public class OrderedProduct {
    String productName;
    double productPrice;
    double productQuantity;
    String quantityUnit;

    public OrderedProduct(String productName, double productPrice, double productQuantity, String quantityUnit) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.quantityUnit = quantityUnit;
    }
}
