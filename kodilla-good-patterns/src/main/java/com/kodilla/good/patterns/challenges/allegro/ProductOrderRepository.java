package com.kodilla.good.patterns.challenges.allegro;


import java.time.LocalDateTime;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}