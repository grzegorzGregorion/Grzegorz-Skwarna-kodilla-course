package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {
    public void saveData() {
        System.out.println("Save data to the database");
    }

    public void loadData() {
        System.out.println("Load data from the database");
    }
}
