package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    public static void main(String[] args) {

        List<Integer> lista1 = new LinkedList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);

        System.out.println(exterminate(lista1));

    }

    public static List<Integer> exterminate(List<Integer> numbers){

        List<Integer> evenNumbers = new LinkedList<>();

        for (int i=0; i<numbers.size(); i++){

            if(numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));


            }



        }



        return evenNumbers;
    }

}
