package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final static String taskType = "[Driving Task]";
    static boolean isExecuted = false;


    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println(taskType);
        System.out.println(taskName + "\n" + where + "\n" + using);
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String getTaskType() {
        return taskType;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted == true) {
            return true;
        } else
            return false;
    }
}
