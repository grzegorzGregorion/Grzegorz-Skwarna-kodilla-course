package com.kodilla.testing.library;

public class LibraryUser {
    String firstName;
    String lastName;
    int peselId;

    public LibraryUser(String firstName, String lastName, int peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (peselId != that.peselId) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + peselId;
        return result;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselId=" + peselId +
                '}';
    }
}

