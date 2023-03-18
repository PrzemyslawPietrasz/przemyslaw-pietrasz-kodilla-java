package com.kodilla.good.patterns.challenges.allegro;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Przemyslaw666", "Przemyslaw", "Pietrasz");
        LocalDateTime orderDate = LocalDateTime.of(2023, 4, 15, 15, 23);
        Product product = new Laptop("Macbook",
                "Famous brand!",
                new BigDecimal("2000"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}