package com.kodilla.patterns2.observer.homework;

public interface StudentQueueObservable {
    void registerMentor(MentorObserver mentorObserver);
    void removeMentor(MentorObserver mentorObserver);
    void notifyMentors();
}
