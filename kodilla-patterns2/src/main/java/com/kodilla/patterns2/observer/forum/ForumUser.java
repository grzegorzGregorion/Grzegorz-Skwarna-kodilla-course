package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String userName;
    private int updateCount;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + ": in the forum you've been subscribed " + forumTopic.getName()
                + "is a new message. \nTotal number of messages: " + forumTopic.getMessages().size());
        updateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
