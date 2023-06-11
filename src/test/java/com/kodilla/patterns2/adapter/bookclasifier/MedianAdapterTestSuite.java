package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();
        bookA.add(new Book("J.R.R. Tolkien",
                "The Lord of the Rings",
                1954,
                "LOTR123456"));
        bookA.add(new Book("George Orwell",
                "1984",
                1949,
                "GO19840000"));
        bookA.add(new Book("Jane Austen",
                "Pride and Prejudice",
                1813,
                "PAP18130000"));
        bookA.add(new Book("F. Scott Fitzgerald",
                "The Great Gatsby",
                1925,
                "TGG19250000"));

        //When
        int median = medianAdapter.publicationYearMedian(bookA);

        //Then
        Assertions.assertEquals(1949, median);
    }
}