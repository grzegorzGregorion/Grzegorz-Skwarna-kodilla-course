package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadLine;
    private final int id;

    public Task(String title, String description, User assignedUser, User creator, LocalDate created, LocalDate deadLine, final int id) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadLine = deadLine;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadLine=" + deadLine +
                '}';


    }
}
