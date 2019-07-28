package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 0; n < booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    //Test 1
    @Test
    public void testListtBooksWithConditionReturnList() {
        //Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbraight Michigan", 2012);
        Book book3 = new Book("Secret life of programmes", "Stephen Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    //Test 2
    @Test
    public void testListtBooksWithConditionMoreThan20() {
        //Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    //Test 3
    @Test
    public void testListtBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDataBaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
        //Then
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDataBaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //Test 4
    @Test
    public void testNoBooksRentByUser() {
        //Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        LibraryUser libraryUserTest = new LibraryUser("userJohn", "userSmith", 00010112345);
        List<Book> inHandsOfListBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbraight Michigan", 2012);
        Book book3 = new Book("Secret life of programmes", "Stephen Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        //inHandsOfListBooks.add(book1);
        //inHandsOfListBooks.add(book2);
        //inHandsOfListBooks.add(book3);
        //inHandsOfListBooks.add(book4);
        when(libraryDataBaseMock.listBooksInHandsOf(libraryUserTest)).thenReturn(inHandsOfListBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        Assert.assertEquals(0, theListOfBooks.size());
    }

    //Test 5
    @Test
    public void test1BookRentByUser() {

    }

    //Test 6
    @Test
    public void test5BookRentByUser() {

    }
}
