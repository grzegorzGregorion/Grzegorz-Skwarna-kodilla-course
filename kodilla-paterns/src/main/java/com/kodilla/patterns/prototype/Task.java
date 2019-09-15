package com.kodilla.patterns.prototype;

public final class Task {
    final private String taskName;

    public Task(final String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String toString() {
        return "         Task[" + taskName + "]";
    }
}
