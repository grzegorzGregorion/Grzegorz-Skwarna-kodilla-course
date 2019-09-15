package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library no 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book title " + n, "Book author " + n, LocalDate.of(2000 + n, 1, 1))));

        //making a shallow clone of object board
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library no 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library no 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        Boolean result = cloneLibrary.getBooks().remove(new Book("Book title " + 1, "Book author " + 1, LocalDate.of(2001, 1, 1)));

        System.out.println(result);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(9, cloneLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), cloneLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
