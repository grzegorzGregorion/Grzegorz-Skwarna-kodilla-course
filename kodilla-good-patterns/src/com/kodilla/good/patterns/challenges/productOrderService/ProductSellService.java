package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.SellService;

public class ProductSellService implements SellService {
    User user;
    String productName;
    double productPrice;

    public ProductSellService(User user, String productName, double productPrice) {
        this.user = user;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public boolean sell(User user, String productName, double productPrice) {
        System.out.println("ProductSellService class: Product can be sold to the " +  user);
        return true;
    }
}
