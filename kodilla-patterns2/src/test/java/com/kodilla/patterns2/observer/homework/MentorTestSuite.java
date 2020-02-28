package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testMentorNotification() {
        //Given
        Task task1 = new Task("Create new package", "Creating new package dedicated for a task in IntelliJ", 1);
        Task task2 = new Task("Queues with tasks", "Training of Observer pattern", 2);
        Task task3 = new Task("Facade", "Build facade to read an write tasks", 3);
        StudentQueue studentQueue1 = new StudentQueue("John Smith task queue");
        StudentQueue studentQueue2 = new StudentQueue("Isabelle Lorane task queue");
        StudentQueue studentQueue3 = new StudentQueue("Nataly Dawn task queue");
        StudentQueue studentQueue4 = new StudentQueue("Chrisfoff Hide task queue");
        Mentor mentor1 = new Mentor("Larry Witch");
        Mentor mentor2 = new Mentor("Gary Holmes");
        studentQueue1.registerMentor(mentor1);
        studentQueue1.registerMentor(mentor2);
        studentQueue2.registerMentor(mentor1);
        studentQueue3.registerMentor(mentor1);
        studentQueue4.registerMentor(mentor1);
        studentQueue4.registerMentor(mentor2);
        //When
        studentQueue1.addTask(task1);
        studentQueue1.addTask(task2);
        studentQueue2.addTask(task2);
        studentQueue2.addTask(task3);
        studentQueue3.addTask(task1);
        studentQueue3.addTask(task2);
        studentQueue3.addTask(task3);
        studentQueue4.addTask(task1);
        //Then
        Assert.assertEquals(8, mentor1.getNotificationCount());
        Assert.assertEquals(3, mentor2.getNotificationCount());
    }
}
