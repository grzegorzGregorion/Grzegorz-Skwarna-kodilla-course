package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    //    Test 1
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.assignExecuteTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("[Driving Task]", driving.getTaskType());
        Assert.assertEquals("Drive as fast as you can", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

    //    Test 2
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.assignExecuteTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("[Painting Task]", painting.getTaskType());
        Assert.assertEquals("Paint all the rooms in house", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    //    Test 3
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.assignExecuteTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("[Shopping task]", shopping.getTaskType());
        Assert.assertEquals("Make shopping", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
