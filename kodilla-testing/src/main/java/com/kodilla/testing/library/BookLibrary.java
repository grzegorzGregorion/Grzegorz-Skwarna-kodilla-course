package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDataBase libraryDataBase;

    public BookLibrary(LibraryDataBase libraryDataBase) {
        this.libraryDataBase = libraryDataBase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDataBase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
}
