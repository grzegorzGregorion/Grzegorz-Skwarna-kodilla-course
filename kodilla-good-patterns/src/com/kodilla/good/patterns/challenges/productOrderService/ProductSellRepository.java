package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.SellRepository;

public class ProductSellRepository implements SellRepository {
    User user;
    String productName;
    double productPrice;

    public ProductSellRepository(User user, String productName, double productPrice) {
        this.user = user;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public boolean createSell(User user, String productName, double productPrice) {
        System.out.println("ProductSellRepository Class: Order was registered in the database");
        return true;
    }
}
