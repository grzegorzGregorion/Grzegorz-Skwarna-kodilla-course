package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.time.LocalDate;
import java.util.Set;
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
        Boolean res = library.getBooks().remove(new Book("Book title " + 2, "Book author " + 2, LocalDate.of(2000 + 2, 1, 1)));
        System.out.println(res);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, cloneLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks().size(), cloneLibrary.getBooks().size());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
