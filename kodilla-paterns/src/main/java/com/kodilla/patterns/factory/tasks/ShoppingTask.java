package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    final String unit;
    final String taskType = "[Shopping task]";
    static boolean isExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity, final String unit) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public void executeTask() {
        System.out.println(taskType);
        System.out.println(taskName + "\n" + whatToBuy + "\n" + quantity + " " + unit);
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
