package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Wolf of the mountains", "Dylan Murphy", 2003, "0001"));
        theBookList.add(new Book("Slaves of dreams", "Phoebe Pearson", 2012, "0002"));
        theBookList.add(new Book("Obliteration of heaven", "Morgan Walsh", 2001, "0003"));
        theBookList.add(new Book("Rejecting the nigh", "Aimee Murphy", 2015, "0004"));
        theBookList.add(new Book("Gangsters and kings", "Ryan Talley", 2007, "0005"));
        theBookList.add(new Book("Unity without duty", "Madelynn Carson", 2007, "0006"));
        theBookList.add(new Book("Enemies of eternity", "Giancarlo Guerrero", 2009, "0007"));
    }

    public List<Book> getList() {
        return new ArrayList<Book>(theBookList);
    }
}
