package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StudentQueue implements StudentQueueObservable {
    private final String studentQueueName;
    private final Queue<Task> tasksQueue;
    private final List<MentorObserver> mentorsObservers;

    public StudentQueue(String studentQueueName) {
        this.studentQueueName = studentQueueName;
        tasksQueue = new ArrayDeque<>();
        mentorsObservers = new ArrayList<MentorObserver>();
    }

    public void addTask(Task task) {
        tasksQueue.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(MentorObserver mentor) {
        mentorsObservers.add(mentor);
    }

    @Override
    public void removeMentor(MentorObserver mentor) {
        mentorsObservers.remove(mentor);
    }

    @Override
    public void notifyMentors() {
        for (MentorObserver mentorObserver : mentorsObservers) {
            mentorObserver.update(this);
        }
    }

    public String getStudentQueueName() {
        return studentQueueName;
    }

    public Queue<Task> getTasksQueue() {
        return tasksQueue;
    }
}
