package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("NorthAmerica");

        Country poland = new Country("Poland");
        Country greece = new Country("Greece");
        Country china = new Country("China");
        Country japan = new Country("Japan");
        Country uae = new Country("uae");
        Country slovakia = new Country("Slovakia");
        Country usa = new Country("USA");
        Country canada = new Country("Canada");
        Country russia = new Country("Russia");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        europa.addCountry(poland);
        europa.addCountry(greece);
        europa.addCountry(slovakia);
        europa.addCountry(russia);

        asia.addCountry(japan);
        asia.addCountry(uae);
        asia.addCountry(china);
        asia.addCountry(russia);

        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("9000009");
        Assertions.assertEquals(totalPeopleExpected, totalPeople);
    }


    @Test
    public void testGetPeopleQuantityWithNoContinents() {
        //Given
        World world = new World();
        // When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPopulation = BigDecimal.ZERO;
        Assertions.assertEquals(expectedPopulation, totalPopulation);
    }

    @Test
    public void testGetPeopleQuantityWithNoCountries() {
        // Given
        World world = new World();
        Continent europe = new Continent("Europa");
        world.addContinent(europe);

        // When
        BigDecimal totalPopulation = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPopulation = BigDecimal.ZERO;
        Assertions.assertEquals(expectedPopulation, totalPopulation);
    }
}