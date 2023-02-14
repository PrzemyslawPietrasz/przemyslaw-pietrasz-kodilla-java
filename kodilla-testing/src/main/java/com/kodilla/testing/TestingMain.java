package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int result1 = calculator.add(5,10);
        int result2 = calculator.substract(5,10);

        if (result1==calculator.add(5,10)){
            System.out.println("OK!");
        }
        else {
            System.out.println("Error");
        }

        if (result2==calculator.substract(5,10)){
            System.out.println("OK!");
        }
        else {
            System.out.println("Error");
        }



    }
}