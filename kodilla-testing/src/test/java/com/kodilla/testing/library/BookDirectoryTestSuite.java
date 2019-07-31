package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList  = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            Book book = new Book("Title " + i, "Author " + i, 1900 + i);
            resultList.add(book);
        }
        return resultList ;
    }

    //Test 1
    @Test
    public void testListBooksWithConditionReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    //Test 2
    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books  = new ArrayList<>();
        List<Book> resultListOf15Books  = generateListOfNBooks(15);
        List<Book> resultListOf40Books  = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books );
        //When
        List<Book> theListOfBooks0  = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15  = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40  = bookLibrary.listBooksWithCondition("v");
        //Then
        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    //Test 3
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books  = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books );

        //When
        List<Book> theListOfBooks10  = bookLibrary.listBooksWithCondition("An");

        //Then
        Assert.assertEquals(0, theListOfBooks10 .size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //Test 4
    @Test
    public void testlistBooksInHandsOf0booksRent() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Quick", "90120554321");

        List<Book> inHandsOfNoBookList  = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(inHandsOfNoBookList);
        //When
        List<Book> theListOfRentBooksByuser1  = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(0, theListOfRentBooksByuser1.size());
    }

    //Test 5
    @Test
    public void testlistBooksInHandsOf1booksRent() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Quick", "90120554321");

        List<Book> inHandsOf1BookList  = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(inHandsOf1BookList);
        //When
        List<Book> theListOfRentBooksByuser1  = bookLibrary.listBooksInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(1, theListOfRentBooksByuser1.size());
    }

    //Test 6
    @Test
    public void testlistBooksInHandsOf5booksRent() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("John", "Quick", "90120554321");

        List<Book> inHandsOf5BookList  = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(inHandsOf5BookList);

        //When
        List<Book> theListOfRentBooksByuser1  = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        Assert.assertEquals(5, theListOfRentBooksByuser1.size());
    }

}
