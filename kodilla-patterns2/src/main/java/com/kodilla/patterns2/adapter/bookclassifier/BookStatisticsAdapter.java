package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookStatisticsAdapter extends BookStatisticsAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book set : bookSet) {
            books.put(new BookSignature(set.getSignature()), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(set.getAuthor(), set.getTitle(), set.getPublicationYear()));
        }
return medianPublicationYear(books);
    }
}
