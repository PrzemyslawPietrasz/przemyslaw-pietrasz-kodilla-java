package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {5,5,2,1,8,9};
        double averageExpected = 5.0;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assertions.assertEquals(averageExpected, average, 0.0001);
    }
}