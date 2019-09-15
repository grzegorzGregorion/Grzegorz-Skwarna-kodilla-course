package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategy() {
        //Given
        User marlena = new Millenials("Marlena Johnson");
        User naomie = new YGeneration("Kathryn Naomie");
        User tree = new ZGeneration("James Dend");

        //When
        String marlenaWillShare = marlena.share();
        System.out.println("Marlena share: " + marlenaWillShare);
        String naomieWillShare = naomie.share();
        System.out.println("Naomie share: " + naomieWillShare);
        String treeWillShare = tree.share();
        System.out.println("Tree will share: " + treeWillShare);

        //Then
        Assert.assertEquals("[Millennial] This post will be shared by Facebook", marlenaWillShare);
        Assert.assertEquals("[Generation Y] This post will be shared by Twitter", naomieWillShare);
        Assert.assertEquals("[Generation Z] This post will be shared by Snapchat", treeWillShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User wicky = new Millenials("Lisa Wick");

        //When
        String wickyWillShare = wicky.share();
        System.out.println("Wicky share: " + wickyWillShare);
        wicky.setSharingStrategy(new TwitterPublisher());
        wickyWillShare = wicky.share();
        System.out.println("Wicky share: " + wickyWillShare);

        //Then
        Assert.assertEquals("[Generation Y] This post will be shared by Twitter", wickyWillShare);
    }
}


