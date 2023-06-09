package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeworkTestSuite {
    @Test
    public void testUpdateHomeworks(){
        //Given
        Student przemysławPietrasz = new Student("Przemysław Pietrasz", KodillaCourses.Java_Developer);
        Student pabloEscobar  =new Student("Pablo Escobar", KodillaCourses.Java_Developer);
        Student zbigniewWaza = new Student("Zbigniew Waza", KodillaCourses.Web_Developer);

        Mentor mateuszLach = new Mentor("Mateusz Lach");
        Mentor marcinSzuppe = new Mentor("Marcin Szuppe");

        przemysławPietrasz.registerObserver(mateuszLach);
        pabloEscobar.registerObserver(mateuszLach);
        zbigniewWaza.registerObserver(marcinSzuppe);

        //When
        przemysławPietrasz.addHomework("3.4", "Pizza Builder");
        pabloEscobar.addHomework("10.5","Website");
        zbigniewWaza.addHomework("5.1","Junit and Mockito");
        przemysławPietrasz.addHomework("20.5", "Facade");

        //Then
        Assertions.assertEquals(3,mateuszLach.getUpdateCount());
        Assertions.assertEquals(1,marcinSzuppe.getUpdateCount());
    }
}