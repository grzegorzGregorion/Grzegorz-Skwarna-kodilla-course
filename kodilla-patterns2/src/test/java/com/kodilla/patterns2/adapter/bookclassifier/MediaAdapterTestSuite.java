package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MediaAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("autor1", "title1", 1950, "1234");
        Book book2 = new Book("autor1", "title1", 1960, "5678");
        Book book3 = new Book("autor1", "title1", 1976, "9876");
        Book book4 = new Book("autor1", "title1", 1980, "8765");
        Book book5 = new Book("autor1", "title1", 1990, "4567");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        BookStatisticsAdapter adapter = new BookStatisticsAdapter();
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        Assert.assertEquals(median, 1976, 0);
    }
}
