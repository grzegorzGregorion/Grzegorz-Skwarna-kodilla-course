package com.kodilla.good.patterns.challenges.productOrderService.Interfaces;

import com.kodilla.good.patterns.challenges.productOrderService.User;

public interface SellRepository {
    boolean createSell(User user, String productName, double productPrice);
}
