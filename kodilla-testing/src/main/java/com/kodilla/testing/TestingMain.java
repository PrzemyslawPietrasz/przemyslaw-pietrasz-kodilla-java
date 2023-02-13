package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5,10);


        int result1 = calculator.add();
        int result2 = calculator.substract();

        if (result1==calculator.add()){
            System.out.println("OK!");
        }
        else {
            System.out.println("Error");
        }

        if (result2==calculator.substract()){
            System.out.println("OK!");
        }
        else {
            System.out.println("Error");
        }



    }
}