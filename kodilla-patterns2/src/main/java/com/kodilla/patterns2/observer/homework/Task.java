package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String taskName;
    private final String taskDescription;
    private final int taskDifficultyLevel;

    public Task(String taskName, String taskDescription, int taskDifficultyLevel) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDifficultyLevel = taskDifficultyLevel;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getTaskDifficultyLevel() {
        return taskDifficultyLevel;
    }
}
