package com.kodilla.good.patterns.challenges.allegro;


public class Allegro {
    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(),new LaptopOrderService(),new LaptopOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}