package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testForumUserUpdate() {
        //Given
        ForumTopic javaHelpGroup = new JavaHelpForumTopic("Java Help");
        ForumTopic javaToolsGroup = new JavaToolsForumTopic("Java Tools");
        Observer johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpGroup.registerObserver(johnSmith);
        javaToolsGroup.registerObserver(ivoneEscobar);
        javaHelpGroup.registerObserver(ivoneEscobar);
        javaToolsGroup.registerObserver(jessiePinkman);
        //When
        javaHelpGroup.addPost("Hi Everyone! My name is Jessie");
        javaHelpGroup.addPost("I don't know either...");
        javaHelpGroup.addPost("Do you know how send object as args in AOP model?");
        javaToolsGroup.addPost("Are you familiar with observer pattern?");
        javaToolsGroup.addPost("Can anybody help me and answer my question?");

        //Then
        Assert.assertEquals(3, ((ForumUser)johnSmith).getUpdateCount());
        Assert.assertEquals(5, ivoneEscobar.getUpdateCount());
        Assert.assertEquals(2, jessiePinkman.getUpdateCount());
    }
}
