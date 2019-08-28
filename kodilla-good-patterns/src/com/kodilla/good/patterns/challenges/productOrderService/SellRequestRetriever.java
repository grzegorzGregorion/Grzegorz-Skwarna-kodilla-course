package com.kodilla.good.patterns.challenges.productOrderService;

public class SellRequestRetriever {
    public SellRequest retrieve() {
        User user = new User("Jan", "K");
        String productName = "Ordered_product_1";
        double productPrice = 22.5;

        return new SellRequest(user, productName, productPrice);
    }
}
