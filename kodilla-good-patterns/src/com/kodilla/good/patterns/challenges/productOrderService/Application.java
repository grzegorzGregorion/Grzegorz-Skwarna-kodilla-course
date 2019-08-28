package com.kodilla.good.patterns.challenges.productOrderService;

public class Application {
    public static void main (String[] args) {
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();

        ProductOrderService productSellProcessor = new ProductOrderService(
                new MailService(sellRequest.getUser()),
                new ProductSellService(sellRequest.getUser(), sellRequest.getProductName(), sellRequest.getProductPrice()),
                new ProductSellRepository(sellRequest.getUser(), sellRequest.getProductName(), sellRequest.getProductPrice()));

        productSellProcessor.process(sellRequest);
    }
}
