package com.kodilla.good.patterns.challenges.productOrderService;

public class SellRequest {
    private User user;
    private String productName;
    private double productPrice;

    public SellRequest(User user, String productName, double productPrice) {
        this.user = user;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
}