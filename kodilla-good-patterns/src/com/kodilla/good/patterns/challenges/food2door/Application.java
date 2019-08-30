package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.Objects.OrderRequest;

public class Application {
    public static void main (String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        MakeOrderService makeOrderProcessor = new MakeOrderService(orderRequestRetriever.specificSupplierMakeOrder);
        makeOrderProcessor.process(orderRequest);
    }
}
