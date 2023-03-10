package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double avergeTemperature(){
        double avgTemp = 0;
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {


            resultMap.put(temperature.getKey(), temperature.getValue()); // [1]
        }
        avgTemp = resultMap.values().stream().mapToDouble(Double::doubleValue).sum()/resultMap.size();

        return avgTemp;

    }

    public Double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        double median;

        for (Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue()); // [1]
        }

        ArrayList<Double> sortedArray = new ArrayList<>();
        ArrayList<Double> list = new ArrayList<>();

        for (Entry<String, Double> entry : resultMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (double num : list) {
            for (Entry<String, Double> entry : resultMap.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedArray.add(num);
                }
            }
        }

        if (sortedArray.size() % 2 == 0) {
            median = sortedArray.get((sortedArray.size() - 1) / 2);
        } else {
            median = (sortedArray.get((sortedArray.size() - 1) / 2) + sortedArray.get(sortedArray.size() / 2)) / 2;
        }

        return median;

    }

}