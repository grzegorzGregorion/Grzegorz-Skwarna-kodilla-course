package com.kodilla.good.patterns.challenges.productOrderService.Interfaces;

import com.kodilla.good.patterns.challenges.productOrderService.User;

public interface SellService {
    boolean sell(User user, String productName, double productPrice);

}
