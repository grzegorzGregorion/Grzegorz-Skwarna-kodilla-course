package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks = new ArrayList<>();

    public TaskList() {
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public String getTask(int i) {
        String result = tasks.get(i);
        return result;
    }
}