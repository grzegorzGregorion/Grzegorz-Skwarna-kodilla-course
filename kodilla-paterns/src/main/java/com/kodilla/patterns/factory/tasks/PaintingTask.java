package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    final String taskType = "[Painting Task]";
    static boolean isExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println(taskType);
        System.out.println(taskName + "\n" + color + "\n" + whatToPaint);
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
