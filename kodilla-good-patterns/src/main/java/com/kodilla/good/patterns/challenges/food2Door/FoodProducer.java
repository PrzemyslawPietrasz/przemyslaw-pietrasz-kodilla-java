package com.kodilla.good.patterns.challenges.food2Door;


import java.util.Map;

public interface FoodProducer {
    boolean process(Customer customer, Map<Product, Integer> productsOrders);

}