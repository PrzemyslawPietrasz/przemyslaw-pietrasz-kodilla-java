package com.kodilla.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("Andrew");
        FoodProducer foodProducer = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from banana"), 2);
        productsList.put(new GlutenFreeProduct("rice", "white rice"), 5);
        productsList.put(new GlutenFreeProduct("cake", "rice cake"), 2);

        orderRequestList.add(new OrderRequest(customer, foodProducer, productsList));

        Customer customer1 = new Customer("Cris");
        FoodProducer foodProducer1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from banana"), 2);
        productsList.put(new GlutenFreeProduct("rice", "white rice"), 3);
        productsList.put(new GlutenFreeProduct("cake", "rice cake"), 1);

        orderRequestList.add(new OrderRequest(customer1, foodProducer1, productsList1));

        return orderRequestList;
    }
}