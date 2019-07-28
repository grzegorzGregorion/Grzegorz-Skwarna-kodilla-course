package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private int postPublicated;

    public ForumUser(int idNumber, String userName, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postPublicated) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postPublicated = postPublicated;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostPublicated() {
        return postPublicated;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postPublicated=" + postPublicated +
                '}';
    }
}
