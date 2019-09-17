package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING_TASK";
    public static final String PAINTING = "PAINTING_TASK";
    public static final String SHOPPING = "SHOPPING_TASK";

    public final Task assignExecuteTask(final String task) {
        switch (task) {
            case DRIVING:
                return new DrivingTask("Drive as fast as you can", "Drive to Barcelona", "Use pick-up car");
            case PAINTING:
                return new PaintingTask("Paint all the rooms in house", "red", "only walls");
            case SHOPPING:
                return new ShoppingTask("Make shopping", "Carrots", 2, "kg");

            default:
                return null;
        }
    }
}
