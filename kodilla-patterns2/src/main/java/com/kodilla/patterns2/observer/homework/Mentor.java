package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String mentorName;
    private int notificationCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        System.out.println(mentorName + " has new task to evaluate. New task added in: " + studentQueue.getStudentQueueName()
                + ". Total tasks waiting to be evaluated: " + studentQueue.getTasksQueue().size());
        notificationCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getNotificationCount() {
        return notificationCount;
    }
}
