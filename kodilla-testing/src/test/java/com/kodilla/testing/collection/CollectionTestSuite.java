package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;



import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {


    @BeforeEach
    public void before(TestInfo testInfo) {

        String methodName = testInfo.getTestMethod().orElseThrow().getName();
        System.out.println("Test Case: begin "+methodName);

    }

    @AfterEach
    public void after(TestInfo testInfo) {


        String methodName = testInfo.getTestMethod().orElseThrow().getName();

        System.out.println("Test Case: end"+methodName);
    }


    @DisplayName("Test checks if class acts properly when list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> evenNumbers = new LinkedList<>();
        OddNumbersExterminator.exterminate(evenNumbers);
        List<Integer> result = OddNumbersExterminator.exterminate(evenNumbers);
        Assertions.assertEquals(0, result.size());

    }
    @DisplayName("Test checks if class acts properly when list contains even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {

        List<Integer> input = List.of(2, 5, 7);
        List<Integer> testResult = OddNumbersExterminator.exterminate(input);
        List<Integer> expectedNumbers = List.of(2);

        Assertions.assertEquals(expectedNumbers, testResult);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
