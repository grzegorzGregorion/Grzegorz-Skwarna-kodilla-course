package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public final class TasksList {
    final private String tasksListName;
    final private List<Task> tasks = new ArrayList<>();

    public TasksList(final String tasksListName) {
        this.tasksListName = tasksListName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getTaskListName() {
        return tasksListName;
    }

    @Override
    public String toString() {
        String s = "   List [" + tasksListName + "]";
        for(Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }
}
