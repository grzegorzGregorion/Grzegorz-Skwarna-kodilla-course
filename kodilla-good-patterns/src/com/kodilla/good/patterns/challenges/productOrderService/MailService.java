package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.Interfaces.InformationService;

public class MailService implements InformationService {
    User user;

    public MailService(User user) {
        this.user = user;
    }

    public void inform(User user) {
        System.out.println("Information Service class: Mail was sent to: " + user + " with all orders details");
    }
}
